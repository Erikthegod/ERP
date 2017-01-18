/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Gestor_Pelicula {
    Conexion con = new Conexion();
    Connection conexion;

    public Gestor_Pelicula(Connection _con) throws Exception {
        this.conexion = con.conectar();
    }

    public void crearPelicula(Pelicula _nuevaPeli) throws SQLException {
        PreparedStatement ps;
        String sql = "INSERT INTO PELICULAS (nombre, duracion, edad) VALUES (?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _nuevaPeli.getNombre());
        ps.setInt(2, _nuevaPeli.getDuracion());
        ps.setInt(3, _nuevaPeli.getEdad());
        ps.executeUpdate();
    }

    public void borrarPelicula(String _nombre) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM PELICULAS WHERE NOMBRE = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _nombre);
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores borrados: " + modificaciones);
    }

    /**
     *
     * @param _cif cif del proveedor para acceder a dicho proveedor
     * @param _proveedor objeto para devolver valores
     * @throws SQLException
     */
    public void modificarPelicula(Pelicula _peli) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "UPDATE PELICULAS SET nombre=?, duracion=?, edad=? WHERE NOMBRE = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(4, _peli.getNombre());
        ps.setString(1, _peli.getNombre());
        ps.setInt(2, _peli.getDuracion());
        ps.setInt(3, _peli.getEdad());
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores modificacdos: " + modificaciones);
    }

    public Pelicula consultarPelicula(String _nombre) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        Pelicula _nuevoProveedor = null;
        String sql = "SELECT * FROM PELICULAS WHERE NOMBRE = ?";
        ps = conexion.prepareStatement(sql);
        ps.setString(1, _nombre);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            //1 id//2 cif//3 nombre//4 telefono//5 poblacion// 6 cp
            _nuevoProveedor = new Pelicula(rs.getString(2), rs.getInt(3), rs.getInt(4));
        }
        return _nuevoProveedor;
    }
}
