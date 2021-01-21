/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;
/**
 *
 * @author Sergio Cruz
 */
public class Controlador implements ActionListener{
    VentanaPrincipal frmP;
    VentanaRegistrarCarta frmRC;
    SubirImagen buscador;
    ConsultarCarta frmCC;
    CrearMazo frmCM;
    ConsultarMazo frmConultaM;
    Cartas objC;
    String ruta;
    Conexion con;

    public Controlador() throws IOException {
        this.frmP = new VentanaPrincipal();
        this.frmRC = new VentanaRegistrarCarta();
        this.buscador = new SubirImagen();
        this.frmCC = new ConsultarCarta();
        this.objC = new Cartas();
        this.frmCM = new CrearMazo();
        this.frmConultaM = new ConsultarMazo();
        frmP.getPndEscritorio().add(frmRC);
        frmP.getPndEscritorio().add(buscador);
        frmP.getPndEscritorio().add(frmCC);
        frmP.getPndEscritorio().add(frmCM);
        frmP.getPndEscritorio().add(frmConultaM);
        this.frmP.getOpcmConsultarCarta().addActionListener(this);
        this.frmP.getOpcmRegistrarCarta().addActionListener(this);
        this.frmP.getOpcmConsultarMazos().addActionListener(this);
        this.frmP.getOpcmCrearMazo().addActionListener(this);
        this.frmP.getOpcmSalir().addActionListener(this);
        //el cmb no se inicializa
        this.frmRC.getBtnSubirImagen().addActionListener(this);
        this.frmRC.getBtnRegistrarCarta().addActionListener(this);
        this.frmRC.getBtnMas().addActionListener(this);
        this.frmCM.getBtnGuardarMazo().addActionListener(this);
        this.frmConultaM.getjButton1().addActionListener(this);
        this.ruta = "";
        this.con = new Conexion();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == frmP.getOpcmRegistrarCarta())
        {
           abrirVentana(frmRC); 
        }
        if(ae.getSource() == frmP.getOpcmConsultarCarta())
        {
            abrirVentana(frmCC);
            try {
                agregarDatosPersistencia(frmCC.getTablaCatas());
                //convertir en tabla??
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frmP, "Error al abrir el archivo");
            }
        }
        if(ae.getSource() == frmRC.getBtnMas())
        {
            frmRC.getPndEstructuras().setVisible(false);
            frmRC.getPndHechizo().setVisible(false);
            frmRC.getPndTropa().setVisible(false);
            switch(frmRC.getCmbTipo().getSelectedIndex())
            {
                case 0:
                {
                    frmRC.getPndHechizo2().setVisible(true);
                    frmRC.getPndEstructuras().setVisible(true);
                    break;
                }
                case 1:
                {
                    frmRC.getPndHechizo().setVisible(true);
                    frmRC.getPndHechizo2().setVisible(false);
                    break;
                }
                case 2:
                {
                    frmRC.getPndHechizo2().setVisible(true);
                    frmRC.getPndTropa().setVisible(true);
                    break;
                }
            }
        }
        if(ae.getSource() == frmRC.getBtnRegistrarCarta())
        {
            boolean flag = false;
            Carta carta = null;
            switch(frmRC.getCmbTipo().getSelectedIndex())
            {
                case 0:
                {
                    Estructura est = new Estructura();
                    
                    try
                    {
                        est.setNombre(frmRC.getTxtNombre().getText());
                    } 
                    catch(FormatoEntradaExcepcion ex) {
                        JOptionPane.showMessageDialog(frmP, ex.toString() + "(nombre)");
                        flag = true;
                    }
                    
                    est.setObjetivos(String.valueOf(frmRC.getCmbObjs().getSelectedItem()));
                    est.setAlcance(String.valueOf(frmRC.getCmbAlcance().getSelectedItem()));
                    est.setCalidad(String.valueOf(frmRC.getCmbCalidad().getSelectedItem()));
                    
                    try
                    {
                        est.setDano(Integer.parseInt(frmRC.getTxtDano().getText()));
                        est.setVida(Integer.parseInt(frmRC.getTxtVida().getText()));
                        est.setCosto(Integer.parseInt(frmRC.getTxtCosto().getText()));
                        est.setTiempoEnBatalla(Integer.parseInt(frmRC.getTxtTiempo().getText()));
                    }
                    catch(NumberFormatException ex)
                    {
                        String mensaje[] = ex.getMessage().split(":");
                        JOptionPane.showMessageDialog(frmP, "Error, se han introducido valores NO númericos " + mensaje[1]);
                        flag = true;
                    }
                    
                    carta = est;
                    break;
                }
                case 1:
                {
                    Hechizo hez = new Hechizo();
                    
                    try 
                    {
                        hez.setNombre(frmRC.getTxtNombre().getText());
                    }
                    catch(FormatoEntradaExcepcion ex) {
                        JOptionPane.showMessageDialog(frmP, ex.toString());
                        flag = true;
                    }
                    
                    hez.setCalidad(String.valueOf(frmRC.getCmbCalidad().getSelectedItem()));
                    
                    try
                    {
                        hez.setDano(Integer.parseInt(frmRC.getTxtDano().getText()));
                        hez.setCosto(Integer.parseInt(frmRC.getTxtCosto().getText()));
                        hez.setRadio(Integer.parseInt(frmRC.getTxtRadio().getText()));
                        hez.setDuracion(Integer.parseInt(frmRC.getTxtDuracion().getText()));
                    }
                    catch(NumberFormatException ex)
                    {
                        String mensaje[] = ex.toString().split(":");
                        JOptionPane.showMessageDialog(frmP, "Error, se han introducido valores NO númericos " + mensaje[1]);
                        flag = true;
                    }
                    
                    carta = hez;
                    break;
                }
                case 2:
                {
                    Tropa tro = new Tropa();
                    
                    try
                    {
                        tro.setNombre(frmRC.getTxtNombre().getText());
                    }
                    catch(FormatoEntradaExcepcion ex) {
                        JOptionPane.showMessageDialog(frmP, ex.toString());
                        flag = true;
                    }
                    
                    tro.setObjetivos(String.valueOf(frmRC.getCmbObjs().getSelectedItem()));
                    tro.setAlcance(String.valueOf(frmRC.getCmbAlcance().getSelectedItem()));
                    tro.setCalidad(String.valueOf(frmRC.getCmbCalidad().getSelectedItem()));
                    tro.setVelocidadMovimineto(String.valueOf(frmRC.getCmbVelocidad().getSelectedItem()));
                    
                    try
                    {
                        tro.setDano(Integer.parseInt(frmRC.getTxtDano().getText()));
                        tro.setVida(Integer.parseInt(frmRC.getTxtVida().getText()));
                        tro.setCosto(Integer.parseInt(frmRC.getTxtCosto().getText()));
                    }
                    catch(NumberFormatException ex)
                    {
                        String mensaje[] = ex.toString().split(":");
                        JOptionPane.showMessageDialog(frmP, "Error, se han introducido valores NO númericos " + mensaje[1]);
                        flag = true;
                    }
                    carta = tro;
                    break;
                }
            }
            
            //if(flag == false)
            if(ruta != null)
            {
                try {
                    carta.setRuta(ruta);
                } catch (FormatoEntradaExcepcion ex) {
                    JOptionPane.showMessageDialog(frmP, ex.toString());
                }
                ruta = null;
            }
            else
            {
                JOptionPane.showMessageDialog(frmP, "No se ha seleccionado una imagen");
            }
            
            if(flag == false)
            {
                JOptionPane.showMessageDialog(frmP, "Carta Registrada");
                objC.getListaC().add(carta);
                String msj = datos(objC.getListaC().size()-1);
                try {
                    con.EscribeDatos(msj, "Cartas.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frmCC, "Error al abrir el archivo");
                }
                //limpieza
                frmRC.getTxtCosto().setText("");
                frmRC.getTxtDano().setText("");
                frmRC.getTxtDuracion().setText("");
                frmRC.getTxtNombre().setText("");
                frmRC.getTxtRadio().setText("");
                frmRC.getTxtRuta().setText("");
                frmRC.getTxtTiempo().setText("");
                frmRC.getTxtVida().setText("");
                frmRC.getTxtaDescripcion().setText("");
                frmRC.getLblIcon().setIcon(null);
                objC = null;
            }
            if(flag == true)
            {
                JOptionPane.showMessageDialog(frmP, "Carta NO registrada");
                flag = false;
            }
            
        }
        if(ae.getSource() == frmRC.getBtnSubirImagen())
        {
            File archivo; //imagen a mostrar
            int resultado;//se eligio o no imagen, 0 no, 1 sí
            FileNameExtensionFilter formato = new FileNameExtensionFilter("JPG, PNG y GIF", "jpg", "png", "gif");//tipo de archivos
            SubirImagen.JfcImagen.setFileFilter(formato);//aplicar el formato
            resultado = SubirImagen.JfcImagen.showOpenDialog(frmP);//null?
            if(JFileChooser.APPROVE_OPTION == resultado)//se eligio una imagen?
            {
                archivo = SubirImagen.JfcImagen.getSelectedFile();//se asigna el archivo seleccionado a la var "archivo"
                frmRC.getTxtRuta().setText(archivo.getAbsolutePath());//ruta en el campo ruta
                try
                {
                    ImageIcon ImgIcon = new ImageIcon(archivo.toString());//archivo en forma de texto
                    //JOptionPane.showMessageDialog(frmP, archivo.toString());//ruta igual a la guardada
                    //JOptionPane.showMessageDialog(frmP, archivo.getAbsolutePath()); las dos
                    Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(frmRC.getPndImagen().getWidth(),frmRC.getPndImagen().getHeight() , Image.SCALE_DEFAULT));//como se va a abriri la imagen
                    frmRC.getLblIcon().setIcon(icono);//se establece la imagen en el label
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(frmP,"Error al abrir" + e);
                }
                
            }
            //aignar ruta de la imagen a la cartacarta.setRuta(frmRC.getTxtRuta().getText());
            ruta = frmRC.getTxtRuta().getText();
            //objC.getListaC().get(objC.getListaC().size()-1).setRuta(frmRC.getTxtRuta().getText());
        }
        if(ae.getSource() == frmP.getOpcmCrearMazo())
        {
            abrirVentana(frmCM);
            try {
                String datos = con.leerDatos("Cartas.txt");
                String lista[] = datos.split("\n");
                for (int i = 0; i < lista.length; i++) {
                    String info[] = lista[i].split(";");
                    frmCM.getCmbCarta1().addItem(info[1]);
                    frmCM.getCmbCarta2().addItem(info[1]);
                    frmCM.getCmbCarta3().addItem(info[1]);
                    frmCM.getCmbCarta4().addItem(info[1]);
                    frmCM.getCmbCarta5().addItem(info[1]);
                    frmCM.getCmbCarta6().addItem(info[1]);
                    frmCM.getCmbCarta7().addItem(info[1]);
                    frmCM.getCmbCarta8().addItem(info[1]);
                }
                //frmCM.getCmbCarta1().setModel(new DefaultComboBoxModel(nombres));
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frmP,"Error al abrir" + ex);
            }
        }
        if(ae.getSource() == frmCM.getBtnGuardarMazo())
        {
            String msj = "";
            //cojo los nombres de los comboBox miro si no hay alguno repetido y si esta bien extraigo la info del archivo
            String mazo[] = {String.valueOf(frmCM.getCmbCarta1().getSelectedItem()),
                            String.valueOf(frmCM.getCmbCarta2().getSelectedItem()),
                            String.valueOf(frmCM.getCmbCarta3().getSelectedItem()),
                            String.valueOf(frmCM.getCmbCarta4().getSelectedItem()),
                            String.valueOf(frmCM.getCmbCarta5().getSelectedItem()),
                            String.valueOf(frmCM.getCmbCarta6().getSelectedItem()),
                            String.valueOf(frmCM.getCmbCarta7().getSelectedItem()),
                            String.valueOf(frmCM.getCmbCarta8().getSelectedItem())};
            if(repetido(mazo) == true)
            {
                JOptionPane.showMessageDialog(frmCM, "Hay cartas repetidas, mazo NO guardado");
            }
            else
            {
                String data;
                try {
                    data = con.leerDatos("Cartas.txt");
                    String lineas[] = data.split("\n");
                    for (int i = 0; i < lineas.length ; i++) 
                    {
                        String info[] = lineas[i].split(";");
                        if(info[1].equals(mazo[0]))
                        {
                            msj += lineas[i] + "\n";
                        }
                        if(info[1].equals(mazo[1]))
                        {
                            msj += lineas[i] + "\n";
                        }
                        if(info[1].equals(mazo[2]))
                        {
                            msj += lineas[i] + "\n";
                        }
                        if(info[1].equals(mazo[3]))
                        {
                            msj += lineas[i] + "\n";
                        }
                        if(info[1].equals(mazo[4]))
                        {
                            msj += lineas[i] + "\n";
                        }
                        if(info[1].equals(mazo[5]))
                        {
                            msj += lineas[i] + "\n";
                        }
                        if(info[1].equals(mazo[6]))
                        {
                            msj += lineas[i] + "\n";
                        }
                        if(info[1].equals(mazo[7]))
                        {
                            msj += lineas[i] + "\n";
                        }
                    }
                } 
                catch(IOException ex) 
                {
                    //estrucutura que pedo en .txt
                    JOptionPane.showMessageDialog(frmCM, "Error al abrir el archivo");
                }
                if(!msj.equals(""))
                {
                    try {
                        String dato = con.leerDatos("Mazos.txt");
                        String n[] = dato.split("\n");
                        try 
                        {
                            con.EscribeDatos(msj, "Mazo" + String.valueOf(n.length) + ".txt");
                            con.EscribeDatos(String.valueOf(n.length), "Mazos.txt");
                        }
                        catch(IOException ex)
                        {
                            JOptionPane.showMessageDialog(frmCM, "Error al abrir el archivo");
                        }
                    } catch (IOException ex) {
                        try {
                            con.EscribeDatos("0", "Mazos.txt");
                            con.EscribeDatos(msj, "Mazo0.txt");
                        } catch (IOException ex1) {
                            JOptionPane.showMessageDialog(frmCM, "Error al abrir el archivo");
                        }
                    }
                    
                }
                
            }
            /*
            try {
                String data = con.leerDatos("Cartas.txt");
                String lineas[] = data.split("\n");
                String msj[] = null;
                for (int i = 0; i < lineas.length ; i++) {
                    String info[] = lineas[i].split(";");

                    if(info[1].equals(String.valueOf(frmCM.getCmbCarta1().getSelectedItem())))
                    {
                        msj[0] = lineas[i];
                    }
                    
                    if((!msj[0].equals(msj[1])) && objC.getListaC().get(i).getNombre().equals(String.valueOf(frmCM.getCmbCarta2().getSelectedItem())))
                    {
                        msj[1] = lineas[i];
                    }
                    /*
                    if(objC.getListaC().get(i).getNombre().equals(String.valueOf(frmCM.getCmbCarta3().getSelectedItem())))
                    {
                        msj = datos(i);
                    }
                    if(objC.getListaC().get(i).getNombre().equals(String.valueOf(frmCM.getCmbCarta4().getSelectedItem())))
                    {
                        msj = datos(i);
                    }
                    if(objC.getListaC().get(i).getNombre().equals(String.valueOf(frmCM.getCmbCarta5().getSelectedItem())))
                    {
                        msj = datos(i);
                    }
                    if(objC.getListaC().get(i).getNombre().equals(String.valueOf(frmCM.getCmbCarta6().getSelectedItem())))
                    {
                        msj = datos(i);
                    }
                    if(objC.getListaC().get(i).getNombre().equals(String.valueOf(frmCM.getCmbCarta7().getSelectedItem())))
                    {
                        msj = datos(i);
                    }
                    if(objC.getListaC().get(i).getNombre().equals(String.valueOf(frmCM.getCmbCarta8().getSelectedItem())))
                    {
                        msj = datos(i);
                    }

                        try {
                            con.EscribeDatos(msj[i], "Mazo1.txt");
                            break;
                        } catch (IOException ex) {
                            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        }


                }
                
                
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            */
            
        }
        if(ae.getSource() == frmP.getOpcmConsultarMazos())
        {
            abrirVentana(frmConultaM);
            String data;
            try {
                data = con.leerDatos("Cartas.txt");
                String lineas[] = data.split("\n");
                String msj[] = null;
                String info[] = lineas[0].split(";");
                //frmConultaM.getjTextArea1().append(info[0] + info[1]);
                try
                {
                    ImageIcon ImgIcon = new ImageIcon(info[11]);//archivo en forma de texto
                    //JOptionPane.showMessageDialog(frmP, archivo.toString());//ruta igual a la guardada
                    //JOptionPane.showMessageDialog(frmP, archivo.getAbsolutePath()); las dos
                    //Icon icono = new ImageIcon(ImgIcon.getImage().getScaledInstance(frmConultaM.getjPanel1().getWidth(),frmConultaM.getjPanel1().getHeight() , Image.SCALE_DEFAULT));//como se va a abriri la imagen
                    //frmConultaM.getjLabel1().setIcon(icono);//se establece la imagen en el label
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(frmP,"Error al abrir" + e);
                }
                /*
                for (int i = 0; i < lineas.length ; i++) {
                    String info[] = lineas[i].split(";");
                    
                }*/
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frmCM, "Error al abrir el archivo");
            }
                
        }
    }
    
    public void abrirVentana(JInternalFrame frm)
    {
        if(frm.isVisible())
        {
            frm.toFront();
            frm.getFocusOwner();
            try{
                frm.setSelected(true); 
            } 
            catch(PropertyVetoException ex)
            {
                JOptionPane.showMessageDialog(frm, "Error al abrir Ventana " + ex.toString());
            }         
        }
        else if(!frmP.getPndEscritorio().isAncestorOf(frm))
        {
            frmP.getPndEscritorio().add(frm);
            frm.setVisible(true);
        }
        else
        {
            frmP.getPndEscritorio().setSelectedFrame(frm);
            frm.setVisible(true);
        }
            
    }

    public void iniciar() {
        frmP.setTitle("CR");
        frmP.setVisible(true);
        frmRC.getPndEstructuras().setVisible(false);
        frmRC.getPndHechizo().setVisible(false);
        frmRC.getPndTropa().setVisible(false);
    }
    
    
    public String datos(int i)
    {
        String msj = "";
        if(objC.getListaC().get(i) instanceof Estructura)
        {
            Estructura es = (Estructura) objC.getListaC().get(i);
            msj = "Estructura;" + objC.getListaC().get(i).getNombre() + ";" +
              objC.getListaC().get(i).getObjetivos() + ";" +
              objC.getListaC().get(i).getAlcance() + ";" +
              String.valueOf(objC.getListaC().get(i).getDano()) + ";" +
              String.valueOf(objC.getListaC().get(i).getVida()) + ";" +
              objC.getListaC().get(i).getCalidad() + ";" +
              String.valueOf(objC.getListaC().get(i).getCosto()) + ";" +
              String.valueOf(es.getTiempoEnBatalla()) + ";N/A;N/A;" +
                    objC.getListaC().get(i).getRuta();
        }
        if(objC.getListaC().get(i) instanceof Hechizo)
        {
            Hechizo he = (Hechizo) objC.getListaC().get(i);
            msj = "Hechizo;" + objC.getListaC().get(i).getNombre() + ";N/A;N/A;" +
              String.valueOf(objC.getListaC().get(i).getDano()) + ";N/A;" +
              objC.getListaC().get(i).getCalidad() + ";" +
              String.valueOf(objC.getListaC().get(i).getCosto()) + ";N/A;" +
              String.valueOf(he.getDuracion()) + ";N/A;" +
                    objC.getListaC().get(i).getRuta();
        }
        if(objC.getListaC().get(i) instanceof Tropa)
        {
            Tropa tr = (Tropa) objC.getListaC().get(i);
            msj = "Tropa;" + objC.getListaC().get(i).getNombre() + ";" +
              objC.getListaC().get(i).getObjetivos() + ";" +
              objC.getListaC().get(i).getAlcance() + ";" +
              String.valueOf(objC.getListaC().get(i).getDano()) + ";" +
              String.valueOf(objC.getListaC().get(i).getVida()) + ";" +
              objC.getListaC().get(i).getCalidad() + ";" +
              String.valueOf(objC.getListaC().get(i).getCosto()) + ";N/A;N/A;" +
              String.valueOf(tr.getVelocidadMovimineto()) + ";" +
                    objC.getListaC().get(i).getRuta();
        }
        return msj;
    }
    
    public void agregarDatosPersistencia(JTable tabla) throws IOException
    {
        DefaultTableModel plantilla = (DefaultTableModel) tabla.getModel();
        plantilla.setRowCount(0);
        String datos = con.leerDatos("Cartas.txt");
        archivoTabla(datos,frmCC.getTablaCatas());
    }

    public void archivoTabla(String datos, JTable tabla) {
        DefaultTableModel plantilla = (DefaultTableModel) tabla.getModel();
        String lista[] = datos.split("\n");
        for (int i = 0; i < lista.length; i++) {
            String info[] = lista[i].split(";");
            Object fila[] = {info[0], info[1], info[2] , info[3], info[4],
            info[5], info[6], info[7], info[8], info[9], info[10], info[11]};
            plantilla.addRow(fila);
        }
    }
    
    public boolean repetido(String lineas[])
    {
        boolean flag = false;
        for (int i = 0; i < 7; i++) 
        {
            for (int j = i+1; j < 8 ; j++) 
            {
                if(lineas[j].equals(lineas[i]))
                {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
