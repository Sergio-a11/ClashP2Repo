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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    Cartas objC;
    String ruta;

    public Controlador() {
        this.frmP = new VentanaPrincipal();
        this.frmRC = new VentanaRegistrarCarta();
        this.buscador = new SubirImagen();
        this.frmCC = new ConsultarCarta();
        this.objC = new Cartas();
        frmP.getPndEscritorio().add(frmRC);
        frmP.getPndEscritorio().add(buscador);
        frmP.getPndEscritorio().add(frmCC);
        this.frmP.getOpcmConsultarCarta().addActionListener(this);
        this.frmP.getOpcmRegistrarCarta().addActionListener(this);
        this.frmP.getOpcmConsultarMazos().addActionListener(this);
        this.frmP.getOpcmCrearMazo().addActionListener(this);
        this.frmP.getOpcmSalir().addActionListener(this);
        //el cmb no se inicializa
        this.frmRC.getBtnSubirImagen().addActionListener(this);
        this.frmRC.getBtnRegistrarCarta().addActionListener(this);
        this.frmCC.getBtnConsultar().addActionListener(this);
        this.frmRC.getBtnMas().addActionListener(this);
        this.ruta = "";
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
            //convertir en tabla??
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
                    est.setNombre(frmRC.getTxtNombre().getText());
                    est.setObjetivos(frmRC.getCmbObjs().getName());
                    est.setAlcance(frmRC.getCmbAlcance().getName());
                    est.setDano(Integer.parseInt(frmRC.getTxtDano().getText()));
                    est.setVida(Integer.parseInt(frmRC.getTxtVida().getText()));
                    est.setCosto(Integer.parseInt(frmRC.getTxtCosto().getText()));
                    est.setCalidad(frmRC.getCmbCalidad().getName());
                    est.setTiempoEnBatalla(Integer.parseInt(frmRC.getTxtTiempo().getText()));
                    carta = est;
                    break;
                }
                case 1:
                {
                    Hechizo hez = new Hechizo();
                    hez.setNombre(frmRC.getTxtNombre().getText());
                    hez.setDano(Integer.parseInt(frmRC.getTxtDano().getText()));
                    hez.setCosto(Integer.parseInt(frmRC.getTxtCosto().getText()));
                    hez.setCalidad(frmRC.getCmbCalidad().getName());
                    hez.setRadio(Integer.parseInt(frmRC.getTxtRadio().getText()));
                    hez.setDuracion(Integer.parseInt(frmRC.getTxtDuracion().getText()));
                    carta = hez;
                    break;
                }
                case 2:
                {
                    Tropa tro = new Tropa();
                    tro.setNombre(frmRC.getTxtNombre().getText());
                    tro.setObjetivos(frmRC.getCmbObjs().getName());
                    tro.setAlcance(frmRC.getCmbAlcance().getName());
                    tro.setDano(Integer.parseInt(frmRC.getTxtDano().getText()));
                    tro.setVida(Integer.parseInt(frmRC.getTxtVida().getText()));
                    tro.setCosto(Integer.parseInt(frmRC.getTxtCosto().getText()));
                    tro.setCalidad(frmRC.getCmbCalidad().getName());
                    tro.setVelocidadMovimineto(frmRC.getTxtVelocidad().getText());
                }
            }
            
            //if(flag == false)
            if(ruta != null)
            {
                carta.setRuta(ruta);
                ruta = null;
            }
            else
            {
                JOptionPane.showMessageDialog(frmP, "No se ha seleccionado una imagen");
            }
                
                objC.getListaC().add(carta);
            
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
        if(ae.getSource() == frmCC.getBtnConsultar())
        {
            for (int i = 0; i < objC.getListaC().size(); i++) {
                frmCC.getTxtaBetaConsulta().append(objC.getListaC().get(i).toString());
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
}
