/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo;

/**
 *
 * @author juanxxiii
 */
public class Sesion {
    
    private int idSesion;
    private int hora;

    public Sesion(int hora, boolean confirmacion) {
        if(confirmacion){//true cuando reciba la hora
            this.hora = hora;
        } else {//false cuando reciba la sesion
            this.idSesion = hora;
        }
    }
    
    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
    
}
