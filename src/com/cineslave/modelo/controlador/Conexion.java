/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juanxxiii
 */
public class Conexion {
    
        public Connection conexion = null; //conexion

    public Connection conectar() throws Exception {
        try {
            //Carga del driver.
            String driver = "org.sqlite.JDBC()";
            Class.forName(driver);
            //Establecimiento de la conexión.
            String servidor = "xxxxxxxxxxxxxxx";
            String user = "";
            String pass = "";
            conexion = DriverManager.getConnection(servidor, user, pass);
        } catch (ClassNotFoundException ex) {
            throw new Exception("Driver no encontrado");
        } catch (SQLException ex) {
            throw new Exception("Error SQL");
        }
        
        return conexion;
    }
    
    
    
}
