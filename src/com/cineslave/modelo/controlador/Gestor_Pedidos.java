/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Cabecera_Pedido;
import com.cineslave.modelo.Cuerpo_Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Gestor_Pedidos {

    Conexion con = new Conexion();
    Connection conexion;

    public Gestor_Pedidos(Connection _con) throws Exception {
        this.conexion = _con;
    }

    public void realizarPedido(Cabecera_Pedido _cabecera_pedido, Cuerpo_Pedido _cuerpo_pedido) throws SQLException {
        PreparedStatement ps;
        //CABECERA
        //primero la cabecera por la FK del Cuerpo_Pedido
        String sql_cabecera = "INSERT INTO Cabecera_Pedido (fecha, importeTotalsiniva, importeTotalconiva, iva) VALUES (?,?,?,?)";
        ps = conexion.prepareStatement(sql_cabecera);
        ps.setString(1, _cabecera_pedido.getFecha());
        ps.setInt(2, _cabecera_pedido.getImporteTotalsinIva());
        ps.setFloat(3, _cabecera_pedido.getIVA());
        ps.setInt(4, _cabecera_pedido.getImporteTotalConIva());
        ps.executeUpdate();
        
        //CUERPO
        String sql_cuerpo = "INSERT INTO Cuerpo_Pedido (codProducto, descripProducto, ctd, precio) VALUES (?,?,?,?)";
        ps = conexion.prepareStatement(sql_cuerpo);
        ps.setInt(1, _cuerpo_pedido.getCodProducto());
        ps.setString(2, _cuerpo_pedido.getDescripProducto());
        ps.setInt(3, _cuerpo_pedido.getCtd());
        ps.setInt(4, _cuerpo_pedido.getPrecio());
        ps.executeUpdate();
        //los id deberian insertarse automaticamente
    }

    public void eliminarPedido(String _fecha) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "DELETE FROM Cuerpo_Pedido WHERE fecha = " + _fecha + "";
        ps = conexion.prepareStatement(sql);
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores borrados: " + modificaciones);
    }

    public void modificarPedido(int _cif, Cuerpo_Pedido _cuerpo_pedido) throws SQLException {
        PreparedStatement ps;
        int modificaciones = 0;
        String sql = "UPDATE PROVEEDORES SET codProducto=?, descripProducto=?, ctd=?, precio=? WHERE CIF = " + _cif + "";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, _cuerpo_pedido.getCodProducto());
        ps.setString(2, _cuerpo_pedido.getDescripProducto());
        ps.setInt(3, _cuerpo_pedido.getCtd());
        ps.setInt(4, _cuerpo_pedido.getPrecio());
        modificaciones = ps.executeUpdate();
        System.out.println("Proveedores modificacdos: " + modificaciones);
    }

    public Cabecera_Pedido consultaPedido(int _cif) throws SQLException {
        PreparedStatement ps;
        ResultSet rs = null;
        Cuerpo_Pedido nuevoPedido = null;
        String sql = "SELECT * FROM PROVEEDORES WHERE CIF = " + _cif + "";
        ps = conexion.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            //1 idProveedor//2 cif//3 nombre//4 telefono//5 poblacion//6 cp
            nuevoProveedor = new Proveedor(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6));
        }
        return nuevoProveedor;
    }
}
