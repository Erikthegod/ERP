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
public class Proveedor {

    private int idProveedor;
    private int cif;
    private String nombre;
    private int teléfono;
    private String población;
    private int cp;

    public Proveedor(int idProveedor, int cif, String nombre, int teléfono, String población, int cp) {
        this.idProveedor = idProveedor;
        this.cif = cif;
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.población = población;
        this.cp = cp;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public String getPoblación() {
        return población;
    }

    public void setPoblación(String población) {
        this.población = población;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

}
