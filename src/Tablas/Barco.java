package Tablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Principal;

/**
 * @author Rayo
 */
public class Barco extends javax.swing.JFrame {

    
    public Barco() {

        setTitle("Registro Barcos");

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        generadorTabla();
        modelo = new DefaultComboBoxModel();
        modelo2 = new DefaultComboBoxModel();
        comboBoxID.setVisible(false);
        llena_combo();

    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoTextoNumAmarre = new javax.swing.JTextField();
        campoTextoCuota = new javax.swing.JTextField();
        campoTextoNombre = new javax.swing.JTextField();
        campoTextoID = new javax.swing.JTextField();
        campoTextoMatricula = new javax.swing.JTextField();
        campoTextoBusqueda = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBarco = new javax.swing.JTable();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        comboBoxSocio = new javax.swing.JComboBox<>();
        botonEditar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        comboBoxBusqueda = new javax.swing.JComboBox<>();
        botonMenu = new javax.swing.JButton();
        comboBoxID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        jLabel2.setText("Matricula");

        jLabel3.setText("Nombre");

        jLabel4.setText("No.Amarre");

        jLabel5.setText("Cuota");

        jLabel6.setText("Socio");

        campoTextoID.setEnabled(false);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaBarco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Matricula", "Nombre", "No.Amarre", "Cuota", "Socio", "Id Socio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBarco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBarcoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBarco);
        if (tablaBarco.getColumnModel().getColumnCount() > 0) {
            tablaBarco.getColumnModel().getColumn(0).setResizable(false);
            tablaBarco.getColumnModel().getColumn(1).setResizable(false);
            tablaBarco.getColumnModel().getColumn(2).setResizable(false);
            tablaBarco.getColumnModel().getColumn(3).setResizable(false);
            tablaBarco.getColumnModel().getColumn(4).setResizable(false);
            tablaBarco.getColumnModel().getColumn(5).setResizable(false);
            tablaBarco.getColumnModel().getColumn(6).setResizable(false);
        }

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        comboBoxSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        comboBoxSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSocioActionPerformed(evt);
            }
        });

        botonEditar.setText("Actualizar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        comboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccion", "ID", "Matricula", "Nombre", "No.Amarre", "Cuota", "Todos" }));

        botonMenu.setText("Menu");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        comboBoxID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA" }));
        comboBoxID.setEnabled(false);
        comboBoxID.setFocusable(false);
        comboBoxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoTextoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoTextoNumAmarre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBoxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoTextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(comboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(botonBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(botonMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoTextoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoTextoNumAmarre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoTextoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboBoxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardar)
                            .addComponent(botonCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Buscar en barcos mediante combo box
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();
            String cadena = ("SELECT * FROM barcos WHERE " + comboBoxBusqueda.getSelectedItem() + " = '" + campoTextoBusqueda.getText() + "' ");
            if (cadena.equals("SELECT * FROM barcos WHERE TODOS = '" + campoTextoBusqueda.getText() + "' ")) {
                cadena = "SELECT * FROM barcos;";
            }
            ps = conexion.prepareStatement(cadena);

            rs = ps.executeQuery();
            if (rs.next()) {
                generadorTabla();

            } else {
                JOptionPane.showMessageDialog(rootPane, "No encontramos coincidencias con el registro a buscar. ");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de buscar los datos. ");

        }


    }//GEN-LAST:event_botonBuscarActionPerformed
    /**
     * Cancelar los campos de texto
     */
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiarCampoTexto();

    }//GEN-LAST:event_botonCancelarActionPerformed
    /**
     * Guardar los registros
     */
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();


            if (comboBoxSocio.getSelectedItem().toString().equals("SELECCIONA")) {
                JOptionPane.showMessageDialog(rootPane, "Selecciona un socio. ");
            }
            ps = conexion.prepareStatement("INSERT INTO barcos (matricula, nombre, num_amarre, cuota, nombre_socio, id_socio) VALUES(?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(campoTextoMatricula.getText()));
            ps.setString(2, campoTextoNombre.getText());
            ps.setInt(3, Integer.parseInt(campoTextoNumAmarre.getText()));
            ps.setString(4, campoTextoCuota.getText());
            ps.setString(5, comboBoxSocio.getSelectedItem().toString());
            int pos = comboBoxSocio.getSelectedIndex();
            comboBoxID.setSelectedIndex(pos);
            ps.setInt(6, Integer.parseInt(comboBoxID.getSelectedItem().toString()));

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(rootPane, "Registro exitoso. ");
                limpiarCampoTexto();
                generadorTabla();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al completar el registro. ");
                limpiarCampoTexto();

            }
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de guardar los datos. ");

        }


    }//GEN-LAST:event_botonGuardarActionPerformed
    /**
     *Actualizar los registros de barcos
     */
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();

            String campoID = campoTextoID.getText();

            if (!"".equals(campoID)) {
                ps = conexion.prepareStatement("UPDATE barcos SET matricula = ?, nombre = ?, num_amarre = ?, cuota = ?, nombre_socio = ?, id_socio = ? WHERE id = '" + campoID + "'");
                ps.setInt(1, Integer.parseInt(campoTextoMatricula.getText()));
                ps.setString(2, campoTextoNombre.getText());
                ps.setInt(3, Integer.parseInt(campoTextoNumAmarre.getText()));
                ps.setString(4, campoTextoCuota.getText());
                ps.setString(5, comboBoxSocio.getSelectedItem().toString());
                int pos = comboBoxSocio.getSelectedIndex();
                comboBoxID.setSelectedIndex(pos);
                ps.setInt(6, Integer.parseInt(comboBoxID.getSelectedItem().toString()));

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Actualización exitosa. ");
                    limpiarCampoTexto();
                    generadorTabla();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error al completar el registro. ");
                    limpiarCampoTexto();

                }
                conexion.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de actualizar los datos. ");

        }

    }//GEN-LAST:event_botonEditarActionPerformed
    /**
     *Borrar registros de barcos
     */
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        ps = null;
        try {
            Connection conexion = null;
            conexion = getConnection();

            int fila = tablaBarco.getSelectedRow();
            String codigo = tablaBarco.getValueAt(fila, 0).toString();

            ps = conexion.prepareStatement("DELETE FROM barcos WHERE id = ?");
            ps.setInt(1, Integer.parseInt(codigo));
            ps.execute();

            limpiarCampoTexto();

            generadorTabla();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de eliminar los datos. ");

        }

    }//GEN-LAST:event_botonBorrarActionPerformed
    /**
     * Abrir menu principal
     */
    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        Principal p1 = new Principal();
        p1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonMenuActionPerformed
    /**
     * Para que la tabla pueda pasar los datos a campos de texto
     */
    private void tablaBarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBarcoMouseClicked
        ps = null;
        rs = null;

        try {
            Connection con = null;
            con = getConnection();

            tablaBarco.setColumnSelectionAllowed(false);

            int fila = tablaBarco.getSelectedRow();

            String id = (String) tablaBarco.getValueAt(fila, 0).toString();
            ps = con.prepareStatement("SELECT id, matricula, nombre, num_amarre, cuota, nombre_socio FROM barcos WHERE id = ? ");
            ps.setInt(1, Integer.parseInt(id));

            rs = ps.executeQuery();

            while (rs.next()) {
                campoTextoID.setText(rs.getString("id"));
                campoTextoMatricula.setText(rs.getString("matricula"));
                campoTextoNombre.setText(rs.getString("nombre"));
                campoTextoNumAmarre.setText(rs.getString("num_amarre"));
                campoTextoCuota.setText(rs.getString("cuota"));
                comboBoxSocio.setSelectedItem(rs.getString("nombre_socio"));

            }

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de desplgar los datos. ");

        }


    }//GEN-LAST:event_tablaBarcoMouseClicked
    /**
     * Tiene registros de los nombres de los socios.
     */
    private void comboBoxSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSocioActionPerformed
    /**
     * Tiene registro del ID de los socios.
     */
    private void comboBoxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField campoTextoBusqueda;
    private javax.swing.JTextField campoTextoCuota;
    private javax.swing.JTextField campoTextoID;
    private javax.swing.JTextField campoTextoMatricula;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JTextField campoTextoNumAmarre;
    private javax.swing.JComboBox<String> comboBoxBusqueda;
    private javax.swing.JComboBox<String> comboBoxID;
    private javax.swing.JComboBox<String> comboBoxSocio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBarco;
    // End of variables declaration//GEN-END:variables
 public static String URL = "jdbc:mysql://localhost:3306/club_nau";
    public static String USERNAME = "root";
    public static String PASSOWRD = "1234";
    PreparedStatement ps;
    ResultSet rs;
    Statement st;

    DefaultComboBoxModel modelo;
    DefaultComboBoxModel modelo2;

    /**
     * Método para establecer conexión
     */
    public static Connection getConnection() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USERNAME, PASSOWRD);
//            JOptionPane.showMessageDialog(null, "Conexión exitosa.");
        } catch (SQLException e) {
            System.err.println(e);
        }
        return conexion;
    }

    /**
     * Metodo para vaciar campos de texto.
     */
    private void limpiarCampoTexto() {
        campoTextoID.setText(null);
        campoTextoMatricula.setText(null);
        campoTextoNombre.setText(null);
        campoTextoNumAmarre.setText(null);
        comboBoxSocio.setSelectedIndex(0);
        comboBoxBusqueda.setSelectedIndex(0);
        campoTextoCuota.setText(null);
        campoTextoBusqueda.setText(null);
        comboBoxID.setSelectedIndex(0);

    }

    /**
     * Metodo para tabla de datos.
     */
    public void generadorTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tablaBarco.setModel(modelo);
            ps = null;
            rs = null;

            Connection con = null;
            con = getConnection();

            String campo = campoTextoBusqueda.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = ("WHERE " + comboBoxBusqueda.getSelectedItem() + " = '" + campo + "'");
            }
            String sql = ("SELECT * FROM barcos " + where);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("MATRICULA");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("NUM-AMARRE");
            modelo.addColumn("CUOTA");
            modelo.addColumn("SOCIO");
            modelo.addColumn("ID SOCIO");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al generar tabla");

        }
    }

    /**
     * Método para llenar los combo boxes de información.
     */
    public void llena_combo() {

        try {
            Connection con = null;
            con = getConnection();

            modelo.removeAllElements();
            modelo2.removeAllElements();
            modelo.addElement("SELECCIONA");
            modelo2.addElement("SELECCIONA");

            comboBoxSocio.setSelectedIndex(0);
            comboBoxID.setSelectedIndex(0);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre FROM socio;");
            while (rs.next()) {
                modelo.addElement(rs.getString("nombre"));
            }
            st = null;
            rs = null;
            st = con.createStatement();
            rs = st.executeQuery("SELECT id FROM socio;");
            while (rs.next()) {
                modelo2.addElement(rs.getString("id"));
            }

            comboBoxSocio.setModel(modelo);
            comboBoxID.setModel(modelo2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al llenar combo box");
        }

    }
}
