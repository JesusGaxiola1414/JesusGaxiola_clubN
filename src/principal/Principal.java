package principal;

import Tablas.Barco;
import Tablas.Salidas;
import Tablas.Socio;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * @author Rayo
 */
public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        setTitle("Registro");
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        Toolkit a = Toolkit.getDefaultToolkit();
        Image icono = a.getImage("jar/bd.JPG");
        setIconImage(icono);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonBarcos = new javax.swing.JButton();
        botonSalidas = new javax.swing.JButton();
        botonSocios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        jLabel1.setText("Registros...");

        botonBarcos.setText("BARCOS");
        botonBarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBarcosActionPerformed(evt);
            }
        });

        botonSalidas.setText("SALIDAS");
        botonSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalidasActionPerformed(evt);
            }
        });

        botonSocios.setText("SOCIOS");
        botonSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSociosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(botonSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(botonSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSocios)
                    .addComponent(botonBarcos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(botonSalidas)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Boton para abrir la ventana de socios.
     *
     * @param evt Evento al que escucha.
     */
    private void botonSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSociosActionPerformed
        Socio socio = new Socio();
        socio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonSociosActionPerformed

    /**
     *Abrir la ventana de barcos.
     */
    private void botonBarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBarcosActionPerformed
        Barco barco = new Barco();
        barco.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_botonBarcosActionPerformed

    /**
     *Abrir la ventana de Salidas.
     */
    private void botonSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalidasActionPerformed
        Salidas salidas = new Salidas();
        salidas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonSalidasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBarcos;
    private javax.swing.JButton botonSalidas;
    private javax.swing.JButton botonSocios;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
