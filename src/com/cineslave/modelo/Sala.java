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
public class Sala {

    private int idSala;
    private String nombreSala;
    private int numButacas;

    public Sala(int idSala, String nombreSala, int numButacas) {
        this.idSala = idSala;
        this.nombreSala = nombreSala;
        this.numButacas = numButacas;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getNumButacas() {
        return numButacas;
    }

    public void setNumButacas(int numButacas) {
        this.numButacas = numButacas;
    }

}
