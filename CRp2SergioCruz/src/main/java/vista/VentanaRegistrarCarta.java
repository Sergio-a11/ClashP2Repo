/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

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
        lblNombre = new javax.swing.JLabel();
        lblObjs = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblAlcance = new javax.swing.JLabel();
        lblRadio = new javax.swing.JLabel();
        lblDano = new javax.swing.JLabel();
        lblVida = new javax.swing.JLabel();
        lblCalidad = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        spr1 = new javax.swing.JSeparator();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbAlcance = new javax.swing.JComboBox<>();
        cmbObjs = new javax.swing.JComboBox<>();
        txtsDano = new javax.swing.JSpinner();
        txtsVida = new javax.swing.JSpinner();
        cmbCalidad = new javax.swing.JComboBox<>();
        txtsCosto = new javax.swing.JSpinner();
        lblRuta = new javax.swing.JLabel();
        txtsDuracion = new javax.swing.JSpinner();
        txtsTiempo = new javax.swing.JSpinner();
        lblVelocidad = new javax.swing.JLabel();
        txtsVelocidad = new javax.swing.JSpinner();
        lblDuracion = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        txtsRadio = new javax.swing.JSpinner();
        lblDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        btnSubirImagen = new javax.swing.JButton();
        btnRegistrarCarta = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        pndImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pndImagenLayout = new javax.swing.GroupLayout(pndImagen);
        pndImagen.setLayout(pndImagenLayout);
        pndImagenLayout.setHorizontalGroup(
            pndImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pndImagenLayout.setVerticalGroup(
            pndImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        lblNombre.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblNombre.setText("Nombre");

        lblObjs.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblObjs.setText("Objetivos");

        lblTipo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTipo.setText("Tipo");

        lblAlcance.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblAlcance.setText("Alcance");

        lblRadio.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblRadio.setText("Radio");

        lblDano.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblDano.setText("Daño");

        lblVida.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblVida.setText("Vida");

        lblCalidad.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblCalidad.setText("Calidad");

        lblCosto.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblCosto.setText("Costo");

        lblTiempo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblTiempo.setText("Tiempo en Arena");

        spr1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estructura", "Hechizo", "Tropa" }));

        cmbAlcance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuerpo a Cuerpo", "Corto", "Medio", "Largo", "Muy Largo", " ", " ", " " }));

        cmbObjs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aire", "Estructuras", "Tierra", "Tierra y Aire", "Torre de Coronas" }));

        cmbCalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Común", "Especial", "Épica", "Legendaria" }));

        lblRuta.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblRuta.setText("Ruta de Imagen");

        lblVelocidad.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblVelocidad.setText("Velocidad de Movimiento");

        lblDuracion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblDuracion.setText("Duración");

        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        lblDesc.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblDesc.setText("Descripción");

        txtaDescripcion.setColumns(20);
        txtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtaDescripcion);

        btnSubirImagen.setText("Subir Imagen");

        btnRegistrarCarta.setText("Registrar Carta");

        lblTitulo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        lblTitulo.setText("Registro de Cartas");

        javax.swing.GroupLayout pndFondoRegCartaLayout = new javax.swing.GroupLayout(pndFondoRegCarta);
        pndFondoRegCarta.setLayout(pndFondoRegCartaLayout);
        pndFondoRegCartaLayout.setHorizontalGroup(
            pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                        .addComponent(btnSubirImagen)
                        .addGap(18, 18, 18)
                        .addComponent(lblRuta)
                        .addGap(52, 52, 52)
                        .addComponent(txtRuta))
                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                        .addComponent(lblDesc)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pndFondoRegCartaLayout.createSequentialGroup()
                        .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitulo))
                            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                        .addComponent(lblVelocidad)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtsVelocidad))
                                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                        .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblObjs)
                                            .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNombre)
                                            .addComponent(lblAlcance)
                                            .addComponent(lblRadio)
                                            .addComponent(lblDano)
                                            .addComponent(lblVida)
                                            .addComponent(lblCalidad)
                                            .addComponent(lblCosto))
                                        .addGap(36, 36, 36)
                                        .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre)
                                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbAlcance, javax.swing.GroupLayout.Alignment.TRAILING, 0, 339, Short.MAX_VALUE)
                                            .addComponent(cmbObjs, javax.swing.GroupLayout.Alignment.TRAILING, 0, 339, Short.MAX_VALUE)
                                            .addComponent(txtsDano)
                                            .addComponent(txtsVida, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbCalidad, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtsCosto, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtsRadio, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                        .addComponent(lblTiempo)
                                        .addGap(50, 50, 50)
                                        .addComponent(txtsTiempo))
                                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                                        .addComponent(lblDuracion)
                                        .addGap(42, 42, 42)
                                        .addComponent(txtsDuracion)))
                                .addGap(18, 18, 18)
                                .addComponent(spr1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(pndImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnRegistrarCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pndFondoRegCartaLayout.setVerticalGroup(
            pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spr1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pndFondoRegCartaLayout.createSequentialGroup()
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipo)
                                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblObjs)
                                    .addComponent(cmbObjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAlcance)
                                    .addComponent(cmbAlcance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblRadio)
                                    .addComponent(txtsRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDano)
                                    .addComponent(txtsDano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVida)
                                    .addComponent(txtsVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCalidad)
                                    .addComponent(cmbCalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCosto)
                                    .addComponent(txtsCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTiempo)
                                    .addComponent(txtsTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtsDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDuracion))
                                .addGap(18, 18, 18)
                                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVelocidad)
                                    .addComponent(txtsVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pndFondoRegCartaLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pndImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pndFondoRegCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubirImagen)
                    .addComponent(lblRuta)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarCarta)
                .addGap(15, 15, 15))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCarta;
    private javax.swing.JButton btnSubirImagen;
    private javax.swing.JComboBox<String> cmbAlcance;
    private javax.swing.JComboBox<String> cmbCalidad;
    private javax.swing.JComboBox<String> cmbObjs;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlcance;
    private javax.swing.JLabel lblCalidad;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDano;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblObjs;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JLabel lblVida;
    private javax.swing.JPanel pndFondoRegCarta;
    private javax.swing.JPanel pndImagen;
    private javax.swing.JSeparator spr1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextArea txtaDescripcion;
    private javax.swing.JSpinner txtsCosto;
    private javax.swing.JSpinner txtsDano;
    private javax.swing.JSpinner txtsDuracion;
    private javax.swing.JSpinner txtsRadio;
    private javax.swing.JSpinner txtsTiempo;
    private javax.swing.JSpinner txtsVelocidad;
    private javax.swing.JSpinner txtsVida;
    // End of variables declaration//GEN-END:variables
}