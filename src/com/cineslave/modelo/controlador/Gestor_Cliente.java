/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Gestor_Cliente {

    Conexion con = new Conexion();
    Connection conexion;

    public Gestor_Cliente(Connection _con) throws Exception {
        this.conexion = _con;
    }

    public void altaCliente(Cliente _cliente) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "INSERT INTO CLIENTE (dni, nombre, apellido,telefono,cp,puntos,usuario,pass) VALUES (?,?,?,?,?,?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _cliente.getDni());
        ps.setString(2, _cliente.getNombre());
        ps.setString(3, _cliente.getApellidos());
        ps.setInt(4, _cliente.getTeléfono());
        ps.setInt(5, _cliente.getCp());
        ps.setInt(6, _cliente.getPuntos());
        ps.setString(7, _cliente.getUsuario());
        ps.setString(8, _cliente.getContraseña());
        ps.executeUpdate();
    }

    public void borrarCliente(String _dni) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM CLIENTE WHERE DNI = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _dni);
        modificaciones = ps.executeUpdate();
        System.out.println("Clientes borrados: " + modificaciones);
    }

    public void modificarCliente(Cliente _cliente) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "UPDATE CLIENTE SET (?,?,?,?,?,?,?) WHERE IDCLIENTE = ?";
        ps = conexion.prepareStatement(sql);
        //ps.setInt(1, _cliente.getIdCliente());
        ps.setString(1, _cliente.getDni());
        ps.setString(2, _cliente.getNombre());
        ps.setString(3, _cliente.getApellidos());
        ps.setInt(4, _cliente.getTeléfono());
        ps.setInt(5, _cliente.getCp());
        ps.setInt(6, _cliente.getPuntos());
        ps.setString(7, _cliente.getUsuario());
        ps.setString(8, _cliente.getContraseña());
        modificaciones = ps.executeUpdate();
        System.out.println("Clientes modificacdos= " + modificaciones);
    }

    public Cliente consultacliente(String _dni) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        Cliente nuevoCliente = null;
        String sql = "SELECT * FROM PROPIETARIOS";
        ps = conexion.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            int id = rs.getInt("id");
            int dni = rs.getInt("dni");
            String nombre = rs.getString("nombre");
            String apellidos = rs.getString("apellido");
            int telefono = rs.getInt("telefono");
            int cp = rs.getInt("cp");
            int punto = rs.getInt("puntos");
            String usuario = rs.getString("usuario");
            String contraseña = rs.getString("contraseña");
            //nuevoCliente = new Cliente(id,dni,nombre,apellidos,telefono,cp,punto,usuario,contraseña);
        }
        return nuevoCliente;
    }
}
