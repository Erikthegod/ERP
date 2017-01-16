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
public class Entrada {
    private int idEntrada;
    private Butaca butaca; 

    public Entrada(int idEntrada, Butaca butaca) {
        this.idEntrada = idEntrada;
        this.butaca = butaca;
    }



    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }

    
            
}
