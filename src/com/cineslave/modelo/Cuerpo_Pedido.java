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
public class Cuerpo_Pedido {
    
    private int idPedido;
private int codProducto;
private String descripProducto;
private int ctd;
private int precio;

    public Cuerpo_Pedido(int idPedido, int codProducto, String descripProducto, int ctd, int precio) {
        this.idPedido = idPedido;
        this.codProducto = codProducto;
        this.descripProducto = descripProducto;
        this.ctd = ctd;
        this.precio = precio;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripProducto() {
        return descripProducto;
    }

    public void setDescripProducto(String descripProducto) {
        this.descripProducto = descripProducto;
    }

    public int getCtd() {
        return ctd;
    }

    public void setCtd(int ctd) {
        this.ctd = ctd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



}
