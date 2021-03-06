/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.gui;

import com.cineslave.modelo.Pelicula;
import com.cineslave.modelo.Proveedor;
import com.cineslave.modelo.controlador.Gestor_Pelicula;
import com.cineslave.modelo.controlador.Gestor_Proveedor;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanxxiii
 */
public class JPanelPelicula extends javax.swing.JPanel {

    private JFPrincipal jfe;
    private Connection con;
    private Gestor_Pelicula gp;

    JPanelPelicula(JFPrincipal aThis, Connection conTotal) {
        initComponents();
        this.jfe = aThis;
        this.con = conTotal;
    }
    
    /**
     * Creates new form JPanelPelicula
     */
    public JPanelPelicula() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfDuracion = new javax.swing.JTextField();
        jsEdad = new javax.swing.JSpinner();
        jbAlta = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();

        jLabel1.setText("Nombre");

        jLabel2.setText("Duración");

        jLabel3.setText("Edad");

        jbAlta.setText("Crear película");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbBaja.setText("Borrar película");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar película");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbConsultar.setText("Consultar película");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombre)
                            .addComponent(jtfDuracion)
                            .addComponent(jsEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAlta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbBaja, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbConsultar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBaja)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jsEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbModificar))
                .addGap(18, 18, 18)
                .addComponent(jbConsultar)
                .addContainerGap(346, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        Pelicula _nuevaPeli = new Pelicula(jtfNombre.getText().toLowerCase(), 
                Integer.parseInt(jtfDuracion.getText()), 
                Integer.parseInt(jsEdad.getValue().toString()));
        try {
            gp = new Gestor_Pelicula(con);
            gp.crearPelicula(_nuevaPeli);
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
            gp = new Gestor_Pelicula(con);
            gp.borrarPelicula(jtfNombre.getText().toLowerCase());
        } catch (SQLException ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        Pelicula _nuevaPeli = new Pelicula(jtfNombre.getText().toLowerCase(), 
                Integer.parseInt(jtfDuracion.getText()), 
                Integer.parseInt(jsEdad.getValue().toString()));
        try {
            gp = new Gestor_Pelicula(con);
            gp.modificarPelicula(_nuevaPeli);
        } catch (SQLException ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
            //altaProveedor
        } catch (Exception ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
            //Gestor_proveedor(con)
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        try {
            gp = new Gestor_Pelicula(con);
            Pelicula peli = gp.consultarPelicula(jtfNombre.getText().toLowerCase());
            jtfNombre.setText(peli.getNombre());
            jtfDuracion.setText(String.valueOf(peli.getDuracion()));
            jsEdad.setValue(peli.getEdad());
        } catch (SQLException ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JPanelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JSpinner jsEdad;
    private javax.swing.JTextField jtfDuracion;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
