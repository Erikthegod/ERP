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
        this.conexion = con.conectar();
    }

    public void altaProveedor(Proveedor _proveedor) throws SQLException {
        PreparedStatement ps;
        String sql = "INSERT INTO PROVEEDORES (cif, nombre, telefono,poblacion,cp) VALUES (?,?,?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _proveedor.getCif());
        ps.setString(2, _proveedor.getNombre());
        ps.setInt(3, _proveedor.getTelefono());
        ps.setString(4, _proveedor.getPoblacion());
        ps.setInt(5, _proveedor.getCp());
        ps.executeUpdate();
    }

    public void borrarProveedor(String _cif) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM PROVEEDORES WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _cif);
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores borrados: " + modificaciones);
    }

    /**
     *
     * @param _cif cif del proveedor para acceder a dicho proveedor
     * @param _proveedor objeto para devolver valores
     * @throws SQLException
     */
    public void modificarProveedor(Proveedor _proveedor) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "UPDATE PROVEEDORES SET cif=?, nombre=?, telefono=?, poblacion=?, cp=? WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(6, _proveedor.getCif());
        ps.setString(1, _proveedor.getCif());
        ps.setString(2, _proveedor.getNombre());
        ps.setInt(3, _proveedor.getTelefono());
        ps.setString(4, _proveedor.getPoblacion());
        ps.setInt(5, _proveedor.getCp());
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores modificacdos: " + modificaciones);
    }

    public Proveedor consultaProveedor(String _cif) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        Proveedor _nuevoProveedor = null;
        String sql = "SELECT * FROM PROVEEDORES WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _cif);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            //1 id//2 cif//3 nombre//4 telefono//5 poblacion// 6 cp
            _nuevoProveedor = new Proveedor(rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
        }
        return _nuevoProveedor;
    }
}
