/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Gestor_Proveedor {

    Conexion con = new Conexion();
    Connection conexion;

    public Gestor_Proveedor() throws Exception {
        this.conexion = con.conectar();
    }

    public void altaProveedor(Proveedor _proveedor) throws SQLException {
        PreparedStatement ps;
        String sql = "INSERT INTO PROVEEDORES VALUES (?,?,?,?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _proveedor.getIdProveedor());
        ps.setInt(2, _proveedor.getCif());
        ps.setString(3, _proveedor.getNombre());
        ps.setInt(4, _proveedor.getTeléfono());
        ps.setString(5, _proveedor.getPoblación());
        ps.setInt(6, _proveedor.getCp());
        ps.executeUpdate();
    }

    public void borrarProveedor(int _cif) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM PROVEEDORES WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _cif);
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores borrados: " + modificaciones);
    }

    /**
     * 
     * @param _cif cif del proveedor para acceder a dicho proveedor
     * @param _proveedor objeto para devolver valores
     * @throws SQLException
     */
    public void modificarProveedor(int _cif, Proveedor _proveedor) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "UPDATE PROVEEDORES SET (?,?,?,?,?,?) WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setInt(7, _cif);//dato del where
        ps.setInt(1, _proveedor.getIdProveedor());
        ps.setInt(2, _proveedor.getCif());
        ps.setString(3, _proveedor.getNombre());
        ps.setInt(4, _proveedor.getTeléfono());
        ps.setString(5, _proveedor.getPoblación());
        ps.setInt(6, _proveedor.getCp());
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores modificacdos: " + modificaciones);
    }

    public Proveedor consultaProveedor(int _cif) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        Proveedor nuevoProveedor = null;
        String sql = "SELECT * FROM PROVEEDORES WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _cif);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            int id = rs.getInt("id");
            int cfi = rs.getInt("cif");
            String nombre = rs.getString("nombre");
            int telefono = rs.getInt("telefono");
            String poblacion = rs.getString("poblacion");
            int cp = rs.getInt("cp");
            nuevoProveedor = new Proveedor(id, cfi, nombre, telefono, poblacion, cp);
        }
        return nuevoProveedor;
    }
}
