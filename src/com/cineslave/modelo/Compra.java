/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo;

/**
 *
 * @author Erikthegod
 */
public class Compra {
    String nombrePeli;
    String horaSesion;
    int numeroColum;
    int numeroFila;
    
    public Compra(String nombrePeli, String horaSesion, int numeroColum, int numeroFila ) {
        this.nombrePeli = nombrePeli;
        this.horaSesion = horaSesion;
        this.numeroColum = numeroColum;
        this.numeroFila = numeroFila;
    }
}

    
