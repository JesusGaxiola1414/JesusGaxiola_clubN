package Tablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.Principal;

/**
 * @author Rayo
 */
public class Socio extends javax.swing.JFrame {

    public Socio() {

        setTitle("Registro Socios");

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        generadorTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        campoTextoID = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoTextoDNI = new javax.swing.JTextField();
        campoTextoNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSocio = new javax.swing.JTable();
        campoTextoBusqueda = new javax.swing.JTextField();
        comboBoxBusqueda = new javax.swing.JComboBox<>();
        botonEliminar = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id");

        campoTextoID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoTextoID.setEnabled(false);
        campoTextoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoIDActionPerformed(evt);
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

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Dni");

        jLabel5.setText("Nombre");

        campoTextoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoDNIActionPerformed(evt);
            }
        });

        campoTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNombreActionPerformed(evt);
            }
        });

        tablaSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Dni", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSocioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaSocio);
        if (tablaSocio.getColumnModel().getColumnCount() > 0) {
            tablaSocio.getColumnModel().getColumn(0).setResizable(false);
        }

        campoTextoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoBusquedaActionPerformed(evt);
            }
        });

        comboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Id", "Dni", "Nombre", "Todos" }));
        comboBoxBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBusquedaActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonMenu.setText("Menu");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        botonEditar.setText("Actualizar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoDNI))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonEliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonCancelar)
                        .addComponent(botonGuardar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoTextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonBuscar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEditar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(botonEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(botonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCancelar))
                            .addComponent(botonMenu))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void campoTextoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoIDActionPerformed


    }//GEN-LAST:event_campoTextoIDActionPerformed

    /**
     * Se guardaran los datos de los socios 
     */
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();


            ps = conexion.prepareStatement("INSERT INTO socio(dni, nombre) VALUES(?,?)");
            ps.setString(1, campoTextoDNI.getText());
            ps.setString(2, campoTextoNombre.getText());

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
     * Boton cancelar para reiniciar los datos.
     *
     * @param evt Evento al que escuchara
     */
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiarCampoTexto();
    }//GEN-LAST:event_botonCancelarActionPerformed

    /**
     * Busqueda por medio de los datos y un combo box
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();
            String cadena = ("SELECT * FROM socio WHERE " + comboBoxBusqueda.getSelectedItem() + " = '" + campoTextoBusqueda.getText() + "' ");
            if (cadena.equals("SELECT * FROM socio WHERE TODOS = '" + campoTextoBusqueda.getText() + "' ")) {
                cadena = "SELECT * FROM socio;";
            }
            ps = conexion.prepareStatement(cadena);

            rs = ps.executeQuery();
            if (rs.next()) {
                generadorTabla();

            } else {
                JOptionPane.showMessageDialog(rootPane, "No encontramos coincidencias con el registro a buscar. ");
            }
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de buscar los datos. ");

        }

    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     *Capturar la Ddni del socio
     */
    private void campoTextoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDNIActionPerformed

    }//GEN-LAST:event_campoTextoDNIActionPerformed

    /**
     * Campo de texto para capturar el nombre del socio
     *
     * @param evt Evento al que escuchara
     */
    private void campoTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNombreActionPerformed

    }//GEN-LAST:event_campoTextoNombreActionPerformed
    /**
     * Capturar una busqueda
     */
    private void campoTextoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoBusquedaActionPerformed

    }//GEN-LAST:event_campoTextoBusquedaActionPerformed
    /**
     * Busqueda mediante ciertos criterios
     */
    private void comboBoxBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBusquedaActionPerformed

    }//GEN-LAST:event_comboBoxBusquedaActionPerformed

    /**
     * Eliminar registros de la base de datos.
     */
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        ps = null;
        try {
            Connection conexion = null;
            conexion = getConnection();

            int fila = tablaSocio.getSelectedRow();
            String codigo = tablaSocio.getValueAt(fila, 0).toString();

            ps = conexion.prepareStatement("DELETE FROM socio WHERE id = ?");
            ps.setInt(1, Integer.parseInt(codigo));
            ps.execute();

            limpiarCampoTexto();
            generadorTabla();
            conexion.close();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de eliminar los datos. ");

        }


    }//GEN-LAST:event_botonEliminarActionPerformed

    /**
     * Mostrara los resultados en los campos de texto
     */
    private void tablaSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSocioMouseClicked
        ps = null;
        rs = null;

        try {
            Connection con = null;
            con = getConnection();

            tablaSocio.setColumnSelectionAllowed(false);

            int fila = tablaSocio.getSelectedRow();

            String id = (String) tablaSocio.getValueAt(fila, 0).toString();
            ps = con.prepareStatement("SELECT id, dni, nombre FROM socio WHERE id = ? ");
            ps.setInt(1, Integer.parseInt(id));
            rs = ps.executeQuery();

            while (rs.next()) {
                campoTextoID.setText(rs.getString("id"));
                campoTextoDNI.setText(rs.getString("dni"));
                campoTextoNombre.setText(rs.getString("nombre"));
            }
            con.close();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de desplgar los datos. ");

        }


    }//GEN-LAST:event_tablaSocioMouseClicked
    /**
     * Abrir ventana de menu principal
     */
    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        Principal p1 = new Principal();
        p1.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonMenuActionPerformed

    /**
     * Editar o actualizar los socios.
     */
    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        Connection conexion = null;
        try {
            conexion = getConnection();

            String campoID = campoTextoID.getText();

            if (!"".equals(campoID)) {
                ps = conexion.prepareStatement("UPDATE socio SET nombre = ?, dni = ? WHERE id = '" + campoID + "'");
                ps.setString(1, campoTextoNombre.getText());
                ps.setString(2, campoTextoDNI.getText());

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField campoTextoBusqueda;
    private javax.swing.JTextField campoTextoDNI;
    private javax.swing.JTextField campoTextoID;
    private javax.swing.JTextField campoTextoNombre;
    private javax.swing.JComboBox<String> comboBoxBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaSocio;
    // End of variables declaration//GEN-END:variables

   
    public static String URL = "jdbc:mysql://localhost:3306/club_nau";
    public static String USERNAME = "root";
    public static String PASSOWRD = "1234";
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Establecer una conexión
     */
    public static Connection getConnection() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USERNAME, PASSOWRD);
        } catch (SQLException e) {
            System.err.println(e);
        }
        return conexion;
    }

    /**
     * Limpiar las cajas de texto
     */
    private void limpiarCampoTexto() {
        campoTextoDNI.setText(null);
        campoTextoID.setText(null);
        campoTextoNombre.setText(null);
        campoTextoBusqueda.setText(null);
        comboBoxBusqueda.setSelectedIndex(0);

    }

    /**
     * Tabla con busqueda especifica
     */
    public void generadorTabla() {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tablaSocio.setModel(modelo);
            ps = null;
            rs = null;

            Connection con = null;
            con = getConnection();

            String campo = campoTextoBusqueda.getText();
            String where = "";

            if (!"".equals(campo)) {
                where = ("WHERE " + comboBoxBusqueda.getSelectedItem() + " = '" + campo + "'");
            }
            String sql = ("SELECT * FROM socio " + where);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("DNI");
            modelo.addColumn("NOMBRE");

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrió un error al momento de desplgar la tabla. ");
        }
    }
}
