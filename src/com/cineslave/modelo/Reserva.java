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
public class Reserva {

    private int idReserva;
    private int idPelícula;
    private int idSesión;
    private int idButaca;

    public Reserva(int idReserva, int idPelícula, int idSesión, int idButaca) {
        this.idReserva = idReserva;
        this.idPelícula = idPelícula;
        this.idSesión = idSesión;
        this.idButaca = idButaca;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdPelícula() {
        return idPelícula;
    }

    public void setIdPelícula(int idPelícula) {
        this.idPelícula = idPelícula;
    }

    public int getIdSesión() {
        return idSesión;
    }

    public void setIdSesión(int idSesión) {
        this.idSesión = idSesión;
    }

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

}
