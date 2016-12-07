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
public class Cabecera_Pedido {

    private int idPedido;
    private String fecha;
    private int importeTotalsinIva;
    private int iva;
    private int importeTotalConIva;

    public Cabecera_Pedido(int idPedido, String fecha, int importeTotalsinIva, int iva, int importeTotalConIva) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.importeTotalsinIva = importeTotalsinIva;
        this.iva = iva;
        this.importeTotalConIva = importeTotalConIva;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getImporteTotalsinIva() {
        return importeTotalsinIva;
    }

    public void setImporteTotalsinIva(int importeTotalsinIva) {
        this.importeTotalsinIva = importeTotalsinIva;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getImporteTotalConIva() {
        return importeTotalConIva;
    }

    public void setImporteTotalConIva(int importeTotalConIva) {
        this.importeTotalConIva = importeTotalConIva;
    }

}
