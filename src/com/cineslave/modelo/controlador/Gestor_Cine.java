/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Cine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Gestor_Cine {

    Conexion con = new Conexion();
    Connection conexion;

    public Gestor_Cine(Connection _con) throws Exception {
        this.conexion = con.conectar();
    }

    public void crearCine(Cine _nuevoCine) throws SQLException {
        PreparedStatement ps;
        String sql = "INSERT INTO CINE (nombre, cif, direccion, poblacion, cp) "
                + "VALUES (?,?,?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _nuevoCine.getNombre());
        ps.setString(2, _nuevoCine.getCif());
        ps.setString(3, _nuevoCine.getDireccion());
        ps.setString(4, _nuevoCine.getPoblacion());
        ps.setInt(5, _nuevoCine.getCp());
        ps.executeUpdate();
    }

    public void borrarCine(String _cif) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM CINE WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _cif);
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores borrados: " + modificaciones);
    }

    /**
     *
     * @param _Cine
     * @throws SQLException
     */
    public void modificarCine(Cine _Cine) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "UPDATE CINE SET nombre=?, cif=?, direccion=?, "
                + "poblacion=?, cp=? WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(6, _Cine.getCif());
        ps.setString(1, _Cine.getNombre());
        ps.setString(2, _Cine.getCif());
        ps.setString(3, _Cine.getDireccion());
        ps.setString(4, _Cine.getPoblacion());
        ps.setInt(5, _Cine.getCp());
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores modificacdos: " + modificaciones);
    }
    
    public Cine consultarCine(String _cif) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        Cine _nuevoCine = null;
        String sql = "SELECT * FROM CINE WHERE CIF = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _cif);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            //1 cif//2 nombre//3 direccion//4 poblacion//5 cp
            _nuevoCine = new Cine(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
        }
        return _nuevoCine;
    }
}
