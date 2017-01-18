/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.gui;

import com.cineslave.modelo.Cine;
import com.cineslave.modelo.controlador.Gestor_Cine;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erikthegod
 */
public class JPanelCine extends javax.swing.JPanel {

    private JFPrincipal jfe;
    private Connection con;
    private Gestor_Cine gc;
    
    JPanelCine(JFPrincipal aThis, Connection conTotal) {
        initComponents();
        this.jfe = aThis;
        this.con = conTotal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfCif = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfPoblacion = new javax.swing.JTextField();
        jtfCp = new javax.swing.JTextField();
        jbAlta = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbModificacion = new javax.swing.JButton();
        jbConsulta = new javax.swing.JButton();

        jLabel1.setText("Nombre");

        jLabel2.setText("CIF");

        jLabel3.setText("Dirección");

        jLabel4.setText("Población");

        jLabel5.setText("CP");

        jbAlta.setText("Crear cine");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbBaja.setText("Borrar cine");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jbModificacion.setText("Modificar cine");
        jbModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificacionActionPerformed(evt);
            }
        });

        jbConsulta.setText("Consultar cine");
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNombre)
                    .addComponent(jtfCif)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCp)
                                .addGap(85, 85, 85))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtfPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtfPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlta)
                    .addComponent(jbModificacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBaja)
                    .addComponent(jbConsulta))
                .addContainerGap(297, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        Cine _nuevoCine = new Cine(jtfNombre.getText(),jtfCif.getText().toLowerCase(), 
                jtfDireccion.getText(), jtfPoblacion.getText(), 
                Integer.parseInt(jtfCp.getText()));
        try {
            gc = new Gestor_Cine(con);
            gc.crearCine(_nuevoCine);
        } catch (SQLException ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
            //altaProveedor
        } catch (Exception ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
            //Gestor_proveedor(con)
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        try {
            gc = new Gestor_Cine(con);
            gc.borrarCine(jtfCif.getText().toLowerCase());
        } catch (SQLException ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jbModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificacionActionPerformed
        Cine _nuevoCine = new Cine(jtfNombre.getText(),jtfCif.getText().toLowerCase(), 
                jtfDireccion.getText(), jtfPoblacion.getText(), 
                Integer.parseInt(jtfCp.getText()));
        try {
            gc = new Gestor_Cine(con);
            gc.modificarCine(_nuevoCine);
        } catch (SQLException ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbModificacionActionPerformed

    private void jbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaActionPerformed
        try {
            gc = new Gestor_Cine(con);
            Cine _nuevoCine = gc.consultarCine(jtfCif.getText().toLowerCase());
            jtfNombre.setText(_nuevoCine.getNombre());
            jtfCif.setText(_nuevoCine.getCif());
            jtfDireccion.setText(String.valueOf(_nuevoCine.getDireccion()));
            jtfPoblacion.setText(_nuevoCine.getPoblacion());
            jtfCp.setText(String.valueOf(_nuevoCine.getCp()));
        } catch (SQLException ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbModificacion;
    private javax.swing.JTextField jtfCif;
    private javax.swing.JTextField jtfCp;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPoblacion;
    // End of variables declaration//GEN-END:variables
}
