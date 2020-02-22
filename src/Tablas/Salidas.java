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
public class Salidas extends javax.swing.JFrame {

    
    public Salidas() {
        setTitle("Registro Salidas");

        initComponents();
        generadorTabla();
        modelo = new DefaultComboBoxModel();
        llena_combo();
        setLocationRelativeTo(null);
        setResizable(false);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTextoDestino = new javax.swing.JTextField();
        campoTextoHora = new javax.swing.JTextField();
        campoTextoFecha = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();
        campoTextoBusqueda = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        comboBoxBusqueda = new javax.swing.JComboBox<>();
        comboBoxID = new javax.swing.JComboBox<>();
        botonMenu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Barco");

        jLabel2.setText("Destino");

        jLabel3.setText("Hora Salida");

        jLabel4.setText("Fecha");

        campoTextoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoDestinoActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEditar.setText("Actualizar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destino", "Hora Salida", "Fecha", "Id Barco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSalidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSalidas);
        if (tablaSalidas.getColumnModel().getColumnCount() > 0) {
            tablaSalidas.getColumnModel().getColumn(0).setResizable(false);
            tablaSalidas.getColumnModel().getColumn(1).setResizable(false);
            tablaSalidas.getColumnModel().getColumn(2).setResizable(false);
            tablaSalidas.getColumnModel().getColumn(3).setResizable(false);
        }

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        comboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Destino", "Hora_Salida", "Fecha", "Id_Barco", "Todas" }));

        comboBoxID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));

        botonMenu.setText("Menú");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        jLabel5.setText("Formato yyyy-mm-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoTextoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(28, 28, 28)
                            .addComponent(campoTextoDestino)))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoTextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEditar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(comboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoTextoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoTextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEditar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Guardar los datos de salidas.
     */
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();
            if (comboBoxID.getSelectedItem().toString().equals("SELECCIONA")) {
                JOptionPane.showMessageDialog(rootPane, "Selecciona una id de barco. ");
            }
            ps = conexion.prepareStatement("INSERT INTO salidas(destino, hora_salida, fecha, id_barco) VALUES(?,?,?,?); ");
            ps.setString(1, campoTextoDestino.getText());
            ps.setString(2, campoTextoHora.getText());
            ps.setString(3, campoTextoFecha.getText());
            ps.setInt(4, Integer.parseInt(comboBoxID.getSelectedItem().toString()));

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
     * Editar los registros de salidas
     */
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();

            int fila = tablaSalidas.getSelectedRow();
            String id = (String) tablaSalidas.getValueAt(fila, 3).toString();

            ps = conexion.prepareStatement("UPDATE salidas SET destino = ?, hora_salida = ?, fecha = ?, id_barco = ? WHERE id_barco = '" + id + "' ");
            ps.setString(1, campoTextoDestino.getText());
            ps.setString(2, campoTextoHora.getText());
            ps.setString(3, campoTextoFecha.getText());
            ps.setInt(4, Integer.parseInt(comboBoxID.getSelectedItem().toString()));

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

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de actualizar los datos. ");

        }

    }//GEN-LAST:event_botonEditarActionPerformed

    /**
     *Eliminar registros de salidas
     */
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        ps = null;
        try {
            Connection conexion = null;
            conexion = getConnection();

            int fila = tablaSalidas.getSelectedRow();

            String destino = tablaSalidas.getValueAt(fila, 0).toString();
            String fecha = tablaSalidas.getValueAt(fila, 2).toString();
            String id = tablaSalidas.getValueAt(fila, 3).toString();

            ps = conexion.prepareStatement("DELETE FROM salidas WHERE destino = ? AND fecha = ? AND id_barco = ?");
            ps.setString(1, destino);
            ps.setString(2, fecha);
            ps.setInt(3, Integer.parseInt(id));

            ps.execute();

            limpiarCampoTexto();
            generadorTabla();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de eliminar los datos. ");

        }

    }//GEN-LAST:event_botonEliminarActionPerformed

    /**
     *buscar registros por combo box
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();
            String cadena = ("SELECT * FROM salidas WHERE " + comboBoxBusqueda.getSelectedItem() + " = '" + campoTextoBusqueda.getText() + "' ");
            if (cadena.equals("SELECT * FROM salidas WHERE TODAS = '" + campoTextoBusqueda.getText() + "' ")) {
                cadena = "SELECT * FROM salidas;";
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
     * mMostrar información mediante un click en tabla
     */
    private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked

        ps = null;
        rs = null;

        try {
            Connection con = null;
            con = getConnection();

            tablaSalidas.setColumnSelectionAllowed(false);

            int fila = tablaSalidas.getSelectedRow();

            String id = (String) tablaSalidas.getValueAt(fila, 3).toString();
            ps = con.prepareStatement("SELECT destino, hora_salida, fecha, id_barco FROM salidas WHERE id_barco = ? ");
            ps.setInt(1, Integer.parseInt(id));

            rs = ps.executeQuery();

            while (rs.next()) {
                campoTextoDestino.setText(rs.getString("destino"));
                campoTextoFecha.setText(rs.getString("fecha"));
                campoTextoHora.setText(rs.getString("hora_salida"));
                comboBoxID.setSelectedItem(rs.getString("id_barco"));

            }

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de desplegar los datos. ");

        }
    }//GEN-LAST:event_tablaSalidasMouseClicked

    /**
     * Escribir en destino
     */
    private void campoTextoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoDestinoActionPerformed

    /**
     *Cancelar funcion de vaciar los campo de texto
     */
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiarCampoTexto();

    }//GEN-LAST:event_botonCancelarActionPerformed

    /**
     * Abrir el menu de registro principal
     */
    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        Principal p1 = new Principal();
        p1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField campoTextoBusqueda;
    private javax.swing.JTextField campoTextoDestino;
    private javax.swing.JTextField campoTextoFecha;
    private javax.swing.JTextField campoTextoHora;
    private javax.swing.JComboBox<String> comboBoxBusqueda;
    private javax.swing.JComboBox<String> comboBoxID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSalidas;
    // End of variables declaration//GEN-END:variables

    public static String URL = "jdbc:mysql://localhost:3306/club_nau";
    public static String USERNAME = "root";
    public static String PASSOWRD = "1234";
    PreparedStatement ps;
    ResultSet rs;
    DefaultComboBoxModel modelo;

    /**
     * Establecer una conexión
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
     * Limpiar las cajas de texto
     */
    private void limpiarCampoTexto() {
        campoTextoDestino.setText(null);
        campoTextoFecha.setText(null);
        campoTextoHora.setText(null);
        comboBoxID.setSelectedIndex(0);
        campoTextoBusqueda.setText(null);
        comboBoxBusqueda.setSelectedIndex(0);

    }

    /**
     * Genera la tabla con los datosde busqueda dados.
     */
    public void generadorTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tablaSalidas.setModel(modelo);
            ps = null;
            rs = null;

            Connection con = null;
            con = getConnection();

            String campo = campoTextoBusqueda.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = ("WHERE " + comboBoxBusqueda.getSelectedItem() + " = '" + campo + "'");
            }
            String sql = ("SELECT * FROM salidas " + where);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("DESTINO");
            modelo.addColumn("HORA SALIDA");
            modelo.addColumn("FECHA");
            modelo.addColumn("ID BARCO");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de desplegar los datos de la tabla. ");

        }
    }

    /**
     * Llena los combo box de información.
     */
    public void llena_combo() {
        try {
            Connection con = null;
            con = getConnection();

            modelo.removeAllElements();
            modelo.addElement("SELECCIONA");

            comboBoxID.setSelectedIndex(0);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id FROM barcos;");
            while (rs.next()) {
                modelo.addElement(rs.getString("id"));
            }
            comboBoxID.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al llenar combo box");
        }

    }
}
