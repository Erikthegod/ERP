/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Butaca;
import com.cineslave.modelo.Cliente;
import com.cineslave.modelo.Compra;
import com.cineslave.modelo.Entrada;
import com.cineslave.modelo.Pelicula;
import com.cineslave.modelo.Proveedor;
import com.cineslave.modelo.Sesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Erikthegod
 */
public class Gestor_Compras {
    Conexion con = new Conexion();
    Compra compr;
    Connection conexion;
    Entrada entrada;
    Cliente cliente;
    Pelicula pelicula;
    Sesion sesion;
    int idCompra;

    public Gestor_Compras() throws Exception {
        this.conexion = con.conectar();
    }

    public void generarCompra(Cliente cli,Pelicula pel,Entrada entr,Sesion ses,int idCom) throws SQLException {
        PreparedStatement ps;
        String sql = "INSERT INTO Res_Entr_Cli VALUES (?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, entr.getIdEntrada());
        ps.setInt(2, cli.getIdCliente());
        ps.setInt(3, idCompra);
        ps.executeUpdate();
        sql="INSERT INTO Reserva VALUES (?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1,idCompra);
        ps.executeUpdate();
        sql = "INSERT INTO Entrada VALUES (?,?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, entr.getIdEntrada());
        ps.setInt(2, entr.getButaca().getIdButaca());
        ps.setInt(3, entr.getButaca().getNumFila());
        ps.setInt(4, entr.getButaca().getNumColumna());
        ps.executeUpdate();
        sql = "INSERT INTO Entra_Peli_Ses VALUES (?,?,?)";
        ps = conexion.prepareStatement(sql);
        ps.setInt(1, entr.getIdEntrada());
        ps.setInt(2, pel.getIdPelicula());
        ps.setInt(3, ses.getIdSesion());
        ps.executeUpdate();
    }
    
    public Compra consultarCompra(String nombreCli) throws SQLException{
        PreparedStatement ps;
        ResultSet rs = null;
        String sql = "select peliculas.nombre , sesion.hora , entrada.numColumna , entrada.numFila from peliculas , entrada ,sesion ,Res_Entr_Cli, Entra_Peli_Ses , cliente where cliente.nombre = '"+nombreCli+"' and cliente.idCliente= Res_Entr_Cli.idCliente and Res_Entr_Cli.idEntrada = Entra_Peli_Ses.idEntrada and Entra_Peli_Ses.idPelicula = peliculas.idPelicula and Entra_Peli_Ses.idSesion = Sesion.idSesion";
        ps = conexion.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next() == true) {
            //1 idProveedor//2 cif//3 nombre//4 telefono//5 poblacion//6 cp
            compr = new Compra(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
        }
        return compr;
    }
}
