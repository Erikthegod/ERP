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

    public Gestor_Proveedor(Connection _con) throws Exception {
        this.conexion = _con;
    }

    public void altaProveedor(Proveedor _proveedor) throws SQLException {
        PreparedStatement ps;
        String sql = "INSERT INTO PROVEEDORES (cif, nombre, telefono, poblacion, cp) VALUES (?,?,?,?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _proveedor.getCif());
        ps.setString(2, _proveedor.getNombre());
        ps.setInt(3, _proveedor.getTelefono());
        ps.setString(4, _proveedor.getPoblacion());
        ps.setInt(5, _proveedor.getCp());
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
        String sql = "UPDATE PROVEEDORES SET cif=?, nombre=?, telefono=?, poblacion=?, cp=? WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setInt(6, _cif);//dato del where
        //ps.setInt(1, _proveedor.getIdProveedor());
        ps.setInt(1, _proveedor.getCif());
        ps.setString(2, _proveedor.getNombre());
        ps.setInt(3, _proveedor.getTelefono());
        ps.setString(4, _proveedor.getPoblacion());
        ps.setInt(5, _proveedor.getCp());
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
        int id;
        int cfi;
        String nombre;
        int telefono;
        String poblacion;
        int cp;
        while (rs.next() == true) {
            id = rs.getInt(1);//idProveedor
            cfi = rs.getInt(2);//cif
            nombre = rs.getString(3);//nombre
            telefono = rs.getInt(4);//telefono
            poblacion = rs.getString(5);//poblacion
            cp = rs.getInt(6);//cp
            nuevoProveedor = new Proveedor(id, cfi, nombre, telefono, poblacion, cp);
        }
        return nuevoProveedor;
    }
}
