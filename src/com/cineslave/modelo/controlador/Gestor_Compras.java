/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import com.cineslave.modelo.Butaca;
import com.cineslave.modelo.Cliente;
import com.cineslave.modelo.Entrada;
import com.cineslave.modelo.Pelicula;
import com.cineslave.modelo.Proveedor;
import com.cineslave.modelo.Sesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Erikthegod
 */
public class Gestor_Compras {
    
    private Conexion con = new Conexion();
    private Connection conexion;
    private Entrada entrada;
    private Cliente cliente;
    private Pelicula pelicula;
    private Sesion sesion;
    private int idCompra;

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
}
