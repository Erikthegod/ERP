/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Proveedor;
import com.cineslave.modelo.Sesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author juanxxiii
 */
public class Gestor_Sesion {
    Conexion con = new Conexion();
    Connection conexion;

    public Gestor_Sesion(Connection _con) throws Exception {
        this.conexion = con.conectar();
    }

    public ArrayList cargarSesiones() throws SQLException{
        ArrayList alSesiones = new ArrayList();
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "SELECT IDSESION FROM SESION";
        ps = conexion.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            //1 id//2 cif//3 nombre//4 telefono//5 poblacion// 6 cp
            alSesiones.add(rs.getString("idSesion"));
            System.out.println("idSesion");
        }
        for(int i=0; i<3; i++){
            System.out.println(alSesiones.get(i));
        }
        return alSesiones;
    }
    
    public void crearSesion(Sesion _nuevaSesion) throws SQLException {
        PreparedStatement ps;
        String sql = "INSERT INTO SESION (hora) VALUES (?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _nuevaSesion.getHora());
        ps.executeUpdate();
    }

    public void borrarSesion(int _idSesion) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM SESION WHERE IDSESION = ?";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _idSesion);
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
