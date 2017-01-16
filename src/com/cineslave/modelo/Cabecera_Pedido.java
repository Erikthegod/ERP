/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cineslave.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author juanxxiii
 */
public class Cabecera_Pedido {

    private int idPedido;
    private String fecha;
    private int importeTotalsinIva;
    private final float IVA;
    private int importeTotalConIva;
    private Cuerpo_Pedido cp;
    private final Date myDate;

    public Cabecera_Pedido(String fecha, int importeTotalsinIva, int iva, int importeTotalConIva) {
        this.fecha = new SimpleDateFormat("dd-MM-yyyy").format(myDate = new Date());
        this.importeTotalsinIva = cp.getImporteSinIva();
        this.IVA = 0.21f;
        this.importeTotalConIva = (int) (cp.getImporteSinIva()*IVA);
    }

    public float getIVA() {
        return IVA;
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

    public int getImporteTotalConIva() {
        return importeTotalConIva;
    }

    public void setImporteTotalConIva(int importeTotalConIva) {
        this.importeTotalConIva = importeTotalConIva;
    }

}
