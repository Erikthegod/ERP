/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.gui;

import com.cineslave.modelo.Cliente;
import com.cineslave.modelo.controlador.Gestor_Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Erikthegod
 */
public class JPanelCliente extends javax.swing.JPanel {

    private JFPrincipal jfe;
    Gestor_Cliente gc;
    Connection con;

    JPanelCliente(JFPrincipal aThis, Connection conTotal) {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfDNI = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jtfCP = new javax.swing.JTextField();
        jtfUsuario = new javax.swing.JTextField();
        jtfPass = new javax.swing.JTextField();
        jbAlta = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbModificar = new javax.swing.JButton();
        jbConsulta = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jsPuntos = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Telefono");

        jLabel6.setText("CP");

        jLabel7.setText("Usuario");

        jLabel8.setText("password");

        jbAlta.setText("Alta Cliente");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbConsulta.setText("Consulta");
        jbConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");

        jLabel1.setText("Puntos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfDNI)
                    .addComponent(jtfApellido)
                    .addComponent(jtfNombre)
                    .addComponent(jtfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(31, 31, 31)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(59, 59, 59)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsulta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jtfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbModificar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jsPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBorrar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
        String dni = jtfDNI.getText();
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        int telefono = Integer.parseInt(jtfTelefono.getText());
        int cp = Integer.parseInt(jtfCP.getText());
        int puntos = (int) jsPuntos.getValue();
        String usuario = jtfUsuario.getText();
        String pass = jtfPass.getText();
        Cliente nuevoCliente = new Cliente(dni, nombre, apellido, telefono, cp, puntos, usuario, pass);
        try {
            gc = new Gestor_Cliente(con);
            gc.altaCliente(nuevoCliente);
            JOptionPane.showMessageDialog(null, "Cliente Creado");
        } catch (SQLException ex) {
            Logger.getLogger(JPanelCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JPanelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        String dni = jtfDNI.getText();
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        int telefono = Integer.parseInt(jtfTelefono.getText());
        int cp = Integer.parseInt(jtfCP.getText());
        int puntos = 0;
        String usuario = jtfUsuario.getText();
        String pass = jtfPass.getText();
        Cliente nuevoCliente = new Cliente(dni, nombre, apellido, telefono, cp, puntos, usuario, pass);
        try {
            gc = new Gestor_Cliente(con);
            gc.modificarCliente(nuevoCliente);
            JOptionPane.showMessageDialog(null, "Cliente Modificado");
        } catch (Exception ex) {
            Logger.getLogger(JPanelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        borrarCampos();
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaActionPerformed
        String dni = jtfDNI.getText();
        Cliente consultaCliente=null;
        if(dni==""){
            JOptionPane.showMessageDialog(null, "Rellena el campo DNI para realizar la consulta");
        }
        try {
            gc = new Gestor_Cliente(con);
            consultaCliente = gc.consultacliente(dni);
        } catch (Exception ex) {
            Logger.getLogger(JPanelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtfDNI.setText(consultaCliente.getDni());
        jtfNombre.setText(consultaCliente.getNombre());
        jtfApellido.setText(consultaCliente.getApellidos());
        jtfTelefono.setText(String.valueOf(consultaCliente.getTeléfono()));
        jtfCP.setText(String.valueOf(consultaCliente.getCp()));
        jtfUsuario.setText(consultaCliente.getUsuario());
        jtfPass.setText(consultaCliente.getContraseña());
    }//GEN-LAST:event_jbConsultaActionPerformed

    private void borrarCampos(){
        jtfDNI.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfTelefono.setText("");
        jtfCP.setText("");
        jtfUsuario.setText("");
        jtfPass.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAlta;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbConsulta;
    private javax.swing.JButton jbModificar;
    private javax.swing.JSpinner jsPuntos;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfCP;
    private javax.swing.JTextField jtfDNI;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPass;
    private javax.swing.JTextField jtfTelefono;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
