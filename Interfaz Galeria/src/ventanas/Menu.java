/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import conexion.ConexionOracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nacho
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    private Connection connection;
    public Menu() {
        initComponents();
        
        try {
            connection = ConexionOracle.getConnection();
            // Realiza operaciones de base de datos utilizando la conexión
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSuperior = new javax.swing.JPanel();
        jLNombreGaleria = new javax.swing.JLabel();
        jLNombreGaleria1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelCostado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BExposiciones = new javax.swing.JButton();
        BArtisas = new javax.swing.JButton();
        BServicios = new javax.swing.JButton();
        BObras = new javax.swing.JButton();
        BServicios1 = new javax.swing.JButton();
        BServicios2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSuperior.setBackground(new java.awt.Color(102, 204, 255));

        jLNombreGaleria.setBackground(new java.awt.Color(255, 255, 255));
        jLNombreGaleria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLNombreGaleria.setForeground(new java.awt.Color(255, 255, 255));
        jLNombreGaleria.setText("Galeria de Arte");

        jLNombreGaleria1.setBackground(new java.awt.Color(255, 255, 255));
        jLNombreGaleria1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLNombreGaleria1.setForeground(new java.awt.Color(255, 255, 255));
        jLNombreGaleria1.setText("Menú");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLNombreGaleria)
                .addGap(187, 187, 187)
                .addComponent(jLNombreGaleria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreGaleria)
                    .addComponent(jLNombreGaleria1))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(PanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        PanelCostado.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout PanelCostadoLayout = new javax.swing.GroupLayout(PanelCostado);
        PanelCostado.setLayout(PanelCostadoLayout);
        PanelCostadoLayout.setHorizontalGroup(
            PanelCostadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        PanelCostadoLayout.setVerticalGroup(
            PanelCostadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        add(PanelCostado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 460));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione la accion que desea realizar");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        BExposiciones.setBackground(new java.awt.Color(153, 204, 255));
        BExposiciones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        BExposiciones.setForeground(new java.awt.Color(255, 255, 255));
        BExposiciones.setText("Exposiciones");
        BExposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExposicionesActionPerformed(evt);
            }
        });
        add(BExposiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 140, 50));

        BArtisas.setBackground(new java.awt.Color(153, 204, 255));
        BArtisas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        BArtisas.setForeground(new java.awt.Color(255, 255, 255));
        BArtisas.setText("Artistas");
        add(BArtisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 140, 50));

        BServicios.setBackground(new java.awt.Color(153, 204, 255));
        BServicios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        BServicios.setForeground(new java.awt.Color(255, 255, 255));
        BServicios.setText("Sobre nosotros");
        BServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BServiciosActionPerformed(evt);
            }
        });
        add(BServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 140, 50));

        BObras.setBackground(new java.awt.Color(153, 204, 255));
        BObras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        BObras.setForeground(new java.awt.Color(255, 255, 255));
        BObras.setText("Obras");
        BObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BObrasActionPerformed(evt);
            }
        });
        add(BObras, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 140, 50));

        BServicios1.setBackground(new java.awt.Color(153, 204, 255));
        BServicios1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        BServicios1.setForeground(new java.awt.Color(255, 255, 255));
        BServicios1.setText("Servicios");
        BServicios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BServicios1ActionPerformed(evt);
            }
        });
        add(BServicios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 140, 50));

        BServicios2.setBackground(new java.awt.Color(153, 204, 255));
        BServicios2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        BServicios2.setForeground(new java.awt.Color(255, 255, 255));
        BServicios2.setText("Contacto");
        BServicios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BServicios2ActionPerformed(evt);
            }
        });
        add(BServicios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 140, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void BServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BServiciosActionPerformed

    private void BExposicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExposicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BExposicionesActionPerformed

    private void BObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BObrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BObrasActionPerformed

    private void BServicios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BServicios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BServicios1ActionPerformed

    private void BServicios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BServicios2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BServicios2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BArtisas;
    private javax.swing.JButton BExposiciones;
    private javax.swing.JButton BObras;
    private javax.swing.JButton BServicios;
    private javax.swing.JButton BServicios1;
    private javax.swing.JButton BServicios2;
    private javax.swing.JPanel PanelCostado;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JLabel jLNombreGaleria;
    private javax.swing.JLabel jLNombreGaleria1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
