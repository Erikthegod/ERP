/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Cliente;
import com.cineslave.modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Gestor_Empleado {

    Conexion con = new Conexion();
    Connection conexion;

    public Gestor_Empleado() throws Exception {
        this.conexion = con.conectar();
    }

    public void altaCliente(Empleado _empleado) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "INSERT INTO CLIENTES VALUES (?,?,?,?,?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _empleado.getIdEmpleado());
        ps.setInt(2, _empleado.getDni());
        ps.setString(3, _empleado.getNombre());
        ps.setString(4, _empleado.getApellidos());
        ps.setInt(5, _empleado.getTeléfono());
        ps.setString(6, _empleado.getFechaInicio());
        ps.setString(7, _empleado.getCargo());
        ps.executeUpdate();
    }

    public void borrarCliente(String _dni) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM EMPLEADOS WHERE DNI = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _dni);
        modificaciones = ps.executeUpdate();
        System.out.println("Empleados borrados: " + modificaciones);
    }
}
