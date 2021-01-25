/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sergio Cruz
 */
public class VentanaRegistrarCarta extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaRegistrarCarta
     */
    public VentanaRegistrarCarta() {
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

        pndFondoRegCarta = new javax.swing.JPanel();
        pndImagen = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblDano = new javax.swing.JLabel();
        lblCalidad = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        spr1 = new javax.swing.JSeparator();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbCalidad = new javax.swing.JComboBox<>();
        lblRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnSubirImagen = new javax.swing.JButton();
        btnRegistrarCarta = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtDano = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        pndEstructuras = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        btnMas = new javax.swing.JButton();
        pndHechizo = new javax.swing.JPanel();
        lblDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        pndTropa = new javax.swing.JPanel();
        lblVelocidad = new javax.swing.JLabel();
        cmbVelocidad = new javax.swing.JComboBox<>();
        pndHechizo2 = new javax.swing.JPanel();
        lblObjs = new javax.swing.JLabel();
        cmbObjs = new javax.swing.JComboBox<>();
        lblAlcance = new javax.swing.JLabel();
        cmbAlcance = new javax.swing.JComboBox<>();
        lblVida = new javax.swing.JLabel();
        txtVida = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        pndImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pndImagenLayout = new javax.swing.GroupLayout(pndImagen);
        pndImagen.setLayout(pndImagenLayout);
        pndImagenLayout.setHorizontalGroup(
            pndImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        pndImagenLayout.setVerticalGroup(
            pndImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        lblNombre.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblNombre.setText("Nombre");

        lblTipo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTipo.setText("Tipo");

        lblDano.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblDano.setText("Daño");

        lblCalidad.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblCalidad.setText("Calidad");

        lblCosto.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblCosto.setText("Costo");

        spr1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estructura", "Hechizo", "Tropa" }));

        cmbCalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Común", "Especial", "Épica", "Legendaria" }));

        lblRuta.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblRuta.setText("Ruta de Imagen");

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        btnSubirImagen.setText("Subir Imagen");

        btnRegistrarCarta.setText("Registrar Carta");

        lblTitulo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        lblTitulo.setText("Registro de Cartas");

        lblTiempo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblTiempo.setText("Tiempo en Arena (s)");

        txtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTiempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pndEstructurasLayout = new javax.swing.GroupLayout(pndEstructuras);
        pndEstructuras.setLayout(pndEstructurasLayout);
        pndEstructurasLayout.setHorizontalGroup(
            pndEstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndEstructurasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTiempo)
                .addGap(39, 39, 39)
                .addComponent(txtTiempo))
        );
        pndEstructurasLayout.setVerticalGroup(
            pndEstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndEstructurasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pndEstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiempo)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMas.setText("*Más Opciones*");

        lblDuracion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblDuracion.setText("Duración (s)");

        lblRadio.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblRadio.setText("Radio (▀)");

        javax.swing.GroupLayout pndHechizoLayout = new javax.swing.GroupLayout(pndHechizo);
        pndHechizo.setLayout(pndHechizoLayout);
        pndHechizoLayout.setHorizontalGroup(
            pndHechizoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndHechizoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pndHechizoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDuracion)
                    .addComponent(lblRadio))
                .addGap(38, 38, 38)
                .addGroup(pndHechizoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRadio)
                    .addComponent(txtDuracion)))
        );
        pndHechizoLayout.setVerticalGroup(
            pndHechizoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndHechizoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pndHechizoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuracion)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pndHechizoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadio)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblVelocidad.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblVelocidad.setText("Velocidad de Movimiento");

        cmbVelocidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta", "Muy Alta" }));

        javax.swing.GroupLayout pndTropaLayout = new javax.swing.GroupLayout(pndTropa);
        pndTropa.setLayout(pndTropaLayout);
        pndTropaLayout.setHorizontalGroup(
            pndTropaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndTropaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cmbVelocidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pndTropaLayout.setVerticalGroup(
            pndTropaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndTropaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pndTropaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidad)
                    .addComponent(cmbVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblObjs.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblObjs.setText("Objetivos");

        cmbObjs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aire", "Estructuras", "Tierra", "Tierra y Aire", "Torre de Coronas" }));
        cmbObjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbObjsActionPerformed(evt);
            }
        });

        lblAlcance.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblAlcance.setText("Alcance");

        cmbAlcance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuerpo a Cuerpo", "Corto", "Medio", "Largo", "Muy Largo", " ", " ", " " }));

        lblVida.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblVida.setText("Vida");

        javax.swing.GroupLayout pndHechizo2Layout = new javax.swing.GroupLayout(pndHechizo2);
        pndHechizo2.setLayout(pndHechizo2Layout);
        pndHechizo2Layout.setHorizontalGroup(
            pndHechizo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndHechizo2Layout.createSequentialGroup()
                .addGroup(pndHechizo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlcance)
                    .addComponent(lblObjs)
                    .addComponent(lblVida))
                .addGap(36, 36, 36)
                .addGroup(pndHechizo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbObjs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAlcance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVida)))
        );
        pndHechizo2Layout.setVerticalGroup(
            pndHechizo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndHechizo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pndHechizo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObjs)
                    .addComponent(cmbObjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pndHechizo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlcance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pndHechizo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pndFondoRegCartaLayout = new javax.swing.GroupLayout(pndFondoRegCarta);
        pndFondoRegCarta.setLayout(pndFondoRegCartaLayout);
        pndFondoRegCartaLayout.setHorizontalGroup(
            pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(btnRegistrarCarta, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pndFondoRegCartaLayout.createSequentialGroup()
                        .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pndHechizo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pndEstructuras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblTitulo))
                                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                        .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblNombre)
                                                    .addComponent(lblDano)
                                                    .addComponent(lblCalidad)
                                                    .addComponent(lblCosto))
                                                .addGap(44, 44, 44)
                                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombre)
                                                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cmbCalidad, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtDano, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtCosto)))
                                            .addComponent(pndHechizo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnMas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spr1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pndImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pndTropa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pndFondoRegCartaLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnSubirImagen)
                        .addGap(18, 18, 18)
                        .addComponent(lblRuta)
                        .addGap(37, 37, 37)
                        .addComponent(txtRuta)
                        .addGap(18, 18, 18))))
        );
        pndFondoRegCartaLayout.setVerticalGroup(
            pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(pndImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipo)
                                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDano)
                                    .addComponent(txtDano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCalidad)
                                    .addComponent(cmbCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCosto)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pndHechizo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spr1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(pndEstructuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pndHechizo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pndTropa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubirImagen)
                    .addComponent(lblRuta)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarCarta)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pndFondoRegCarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pndFondoRegCarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void cmbObjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbObjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbObjsActionPerformed

    private void txtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTiempoActionPerformed

    public JButton getBtnRegistrarCarta() {
        return btnRegistrarCarta;
    }

    public void setBtnRegistrarCarta(JButton btnRegistrarCarta) {
        this.btnRegistrarCarta = btnRegistrarCarta;
    }

    public JButton getBtnSubirImagen() {
        return btnSubirImagen;
    }

    public void setBtnSubirImagen(JButton btnSubirImagen) {
        this.btnSubirImagen = btnSubirImagen;
    }

    public JComboBox<String> getCmbAlcance() {
        return cmbAlcance;
    }

    public void setCmbAlcance(JComboBox<String> cmbAlcance) {
        this.cmbAlcance = cmbAlcance;
    }

    public JComboBox<String> getCmbCalidad() {
        return cmbCalidad;
    }

    public void setCmbCalidad(JComboBox<String> cmbCalidad) {
        this.cmbCalidad = cmbCalidad;
    }

    public JComboBox<String> getCmbObjs() {
        return cmbObjs;
    }

    public void setCmbObjs(JComboBox<String> cmbObjs) {
        this.cmbObjs = cmbObjs;
    }

    public JComboBox<String> getCmbTipo() {
        return cmbTipo;
    }

    public void setCmbTipo(JComboBox<String> cmbTipo) {
        this.cmbTipo = cmbTipo;
    }

    public JLabel getLblAlcance() {
        return lblAlcance;
    }

    public void setLblAlcance(JLabel lblAlcance) {
        this.lblAlcance = lblAlcance;
    }

    public JLabel getLblCalidad() {
        return lblCalidad;
    }

    public void setLblCalidad(JLabel lblCalidad) {
        this.lblCalidad = lblCalidad;
    }

    public JLabel getLblCosto() {
        return lblCosto;
    }

    public void setLblCosto(JLabel lblCosto) {
        this.lblCosto = lblCosto;
    }

    public JLabel getLblDano() {
        return lblDano;
    }

    public void setLblDano(JLabel lblDano) {
        this.lblDano = lblDano;
    }

    public JLabel getLblDuracion() {
        return lblDuracion;
    }

    public void setLblDuracion(JLabel lblDuracion) {
        this.lblDuracion = lblDuracion;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblObjs() {
        return lblObjs;
    }

    public void setLblObjs(JLabel lblObjs) {
        this.lblObjs = lblObjs;
    }

    public JLabel getLblRadio() {
        return lblRadio;
    }

    public void setLblRadio(JLabel lblRadio) {
        this.lblRadio = lblRadio;
    }

    public JLabel getLblRuta() {
        return lblRuta;
    }

    public void setLblRuta(JLabel lblRuta) {
        this.lblRuta = lblRuta;
    }

    public JLabel getLblTiempo() {
        return lblTiempo;
    }

    public void setLblTiempo(JLabel lblTiempo) {
        this.lblTiempo = lblTiempo;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblVelocidad() {
        return lblVelocidad;
    }

    public void setLblVelocidad(JLabel lblVelocidad) {
        this.lblVelocidad = lblVelocidad;
    }

    public JLabel getLblVida() {
        return lblVida;
    }

    public void setLblVida(JLabel lblVida) {
        this.lblVida = lblVida;
    }

    public JPanel getPndFondoRegCarta() {
        return pndFondoRegCarta;
    }

    public void setPndFondoRegCarta(JPanel pndFondoRegCarta) {
        this.pndFondoRegCarta = pndFondoRegCarta;
    }

    public JPanel getPndImagen() {
        return pndImagen;
    }

    public void setPndImagen(JPanel pndImagen) {
        this.pndImagen = pndImagen;
    }

    public JSeparator getSpr1() {
        return spr1;
    }

    public void setSpr1(JSeparator spr1) {
        this.spr1 = spr1;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtRuta() {
        return txtRuta;
    }

    public void setTxtRuta(JTextField txtRuta) {
        this.txtRuta = txtRuta;
    }

    public JTextField getTxtCosto() {
        return txtCosto;
    }

    public void setTxtCosto(JTextField txtCosto) {
        this.txtCosto = txtCosto;
    }

    public JTextField getTxtDano() {
        return txtDano;
    }

    public void setTxtDano(JTextField txtDano) {
        this.txtDano = txtDano;
    }

    public JTextField getTxtDuracion() {
        return txtDuracion;
    }

    public void setTxtDuracion(JTextField txtDuracion) {
        this.txtDuracion = txtDuracion;
    }

    public JTextField getTxtRadio() {
        return txtRadio;
    }

    public void setTxtRadio(JTextField txtRadio) {
        this.txtRadio = txtRadio;
    }

    public JTextField getTxtTiempo() {
        return txtTiempo;
    }

    public void setTxtTiempo(JTextField txtTiempo) {
        this.txtTiempo = txtTiempo;
    }

    public JComboBox<String> getCmbVelocidad() {
        return cmbVelocidad;
    }

    public void setCmbVelocidad(JComboBox<String> cmbVelocidad) {
        this.cmbVelocidad = cmbVelocidad;
    }

    public JTextField getTxtVida() {
        return txtVida;
    }

    public void setTxtVida(JTextField txtVida) {
        this.txtVida = txtVida;
    }

    public JButton getBtnMas() {
        return btnMas;
    }

    public void setBtnMas(JButton btnMas) {
        this.btnMas = btnMas;
    }

    public JPanel getPndEstructuras() {
        return pndEstructuras;
    }

    public void setPndEstructuras(JPanel pndEstructuras) {
        this.pndEstructuras = pndEstructuras;
    }

    public JPanel getPndHechizo() {
        return pndHechizo;
    }

    public void setPndHechizo(JPanel pndHechizo) {
        this.pndHechizo = pndHechizo;
    }

    public JPanel getPndTropa() {
        return pndTropa;
    }

    public void setPndTropa(JPanel pndTropa) {
        this.pndTropa = pndTropa;
    }

    public JPanel getPndHechizo2() {
        return pndHechizo2;
    }

    public void setPndHechizo2(JPanel pndHechizo2) {
        this.pndHechizo2 = pndHechizo2;
    }

    

    public JLabel getLblIcon() {
        return lblIcon;
    }

    public void setLblIcon(JLabel lblIcon) {
        this.lblIcon = lblIcon;
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnRegistrarCarta;
    private javax.swing.JButton btnSubirImagen;
    private javax.swing.JComboBox<String> cmbAlcance;
    private javax.swing.JComboBox<String> cmbCalidad;
    private javax.swing.JComboBox<String> cmbObjs;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbVelocidad;
    private javax.swing.JLabel lblAlcance;
    private javax.swing.JLabel lblCalidad;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDano;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObjs;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JLabel lblVida;
    private javax.swing.JPanel pndEstructuras;
    private javax.swing.JPanel pndFondoRegCarta;
    private javax.swing.JPanel pndHechizo;
    private javax.swing.JPanel pndHechizo2;
    private javax.swing.JPanel pndImagen;
    private javax.swing.JPanel pndTropa;
    private javax.swing.JSeparator spr1;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDano;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
