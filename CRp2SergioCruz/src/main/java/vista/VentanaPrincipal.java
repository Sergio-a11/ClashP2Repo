/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Sergio Cruz
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pndEscritorio = new javax.swing.JDesktopPane();
        lblDiseno = new javax.swing.JLabel();
        mnBarra = new javax.swing.JMenuBar();
        MainMenuCartas = new javax.swing.JMenu();
        opcmRegistrarCarta = new javax.swing.JMenuItem();
        opcmConsultarCarta = new javax.swing.JMenuItem();
        MainMenuMazo = new javax.swing.JMenu();
        opcmCrearMazo = new javax.swing.JMenuItem();
        opcmConsultarMazos = new javax.swing.JMenuItem();
        MainMenuSalir = new javax.swing.JMenu();
        opcmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDiseno.setText("Diseñado Por: Sergio Cruz");
        pndEscritorio.add(lblDiseno);
        lblDiseno.setBounds(450, 490, 150, 16);

        MainMenuCartas.setText("Cartas");

        opcmRegistrarCarta.setText("Registrar Carta");
        MainMenuCartas.add(opcmRegistrarCarta);

        opcmConsultarCarta.setText("Consultar Carta");
        MainMenuCartas.add(opcmConsultarCarta);

        mnBarra.add(MainMenuCartas);

        MainMenuMazo.setText("Mazos");

        opcmCrearMazo.setText("Crear Mazo");
        MainMenuMazo.add(opcmCrearMazo);

        opcmConsultarMazos.setText("Consultar Mazos");
        MainMenuMazo.add(opcmConsultarMazos);

        mnBarra.add(MainMenuMazo);

        MainMenuSalir.setText("Salir");

        opcmSalir.setText("Salir");
        MainMenuSalir.add(opcmSalir);

        mnBarra.add(MainMenuSalir);

        setJMenuBar(mnBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pndEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pndEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JMenu getMainMenuCartas() {
        return MainMenuCartas;
    }

    public void setMainMenuCartas(JMenu MainMenuCartas) {
        this.MainMenuCartas = MainMenuCartas;
    }

    public JMenu getMainMenuMazo() {
        return MainMenuMazo;
    }

    public void setMainMenuMazo(JMenu MainMenuMazo) {
        this.MainMenuMazo = MainMenuMazo;
    }

    public JMenu getMainMenuSalir() {
        return MainMenuSalir;
    }

    public void setMainMenuSalir(JMenu MainMenuSalir) {
        this.MainMenuSalir = MainMenuSalir;
    }

    public JLabel getLblDiseno() {
        return lblDiseno;
    }

    public void setLblDiseno(JLabel lblDiseno) {
        this.lblDiseno = lblDiseno;
    }

    public JMenuBar getMnBarra() {
        return mnBarra;
    }

    public void setMnBarra(JMenuBar mnBarra) {
        this.mnBarra = mnBarra;
    }

    public JMenuItem getOpcmConsultarCarta() {
        return opcmConsultarCarta;
    }

    public void setOpcmConsultarCarta(JMenuItem opcmConsultarCarta) {
        this.opcmConsultarCarta = opcmConsultarCarta;
    }

    public JMenuItem getOpcmConsultarMazos() {
        return opcmConsultarMazos;
    }

    public void setOpcmConsultarMazos(JMenuItem opcmConsultarMazos) {
        this.opcmConsultarMazos = opcmConsultarMazos;
    }

    public JMenuItem getOpcmCrearMazo() {
        return opcmCrearMazo;
    }

    public void setOpcmCrearMazo(JMenuItem opcmCrearMazo) {
        this.opcmCrearMazo = opcmCrearMazo;
    }

    public JMenuItem getOpcmRegistrarCarta() {
        return opcmRegistrarCarta;
    }

    public void setOpcmRegistrarCarta(JMenuItem opcmRegistrarCarta) {
        this.opcmRegistrarCarta = opcmRegistrarCarta;
    }

    public JMenuItem getOpcmSalir() {
        return opcmSalir;
    }

    public void setOpcmSalir(JMenuItem opcmSalir) {
        this.opcmSalir = opcmSalir;
    }

    public JDesktopPane getPndEscritorio() {
        return pndEscritorio;
    }

    public void setPndEscritorio(JDesktopPane pndEscritorio) {
        this.pndEscritorio = pndEscritorio;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MainMenuCartas;
    private javax.swing.JMenu MainMenuMazo;
    private javax.swing.JMenu MainMenuSalir;
    private javax.swing.JLabel lblDiseno;
    private javax.swing.JMenuBar mnBarra;
    private javax.swing.JMenuItem opcmConsultarCarta;
    private javax.swing.JMenuItem opcmConsultarMazos;
    private javax.swing.JMenuItem opcmCrearMazo;
    private javax.swing.JMenuItem opcmRegistrarCarta;
    private javax.swing.JMenuItem opcmSalir;
    private javax.swing.JDesktopPane pndEscritorio;
    // End of variables declaration//GEN-END:variables

}
