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
    private int telefono;
    private String poblacion;
    private int cp;

    public Proveedor(int idProveedor, int cif, String nombre, int teléfono, String población, int cp) {
        this.idProveedor = idProveedor;
        this.cif = cif;
        this.nombre = nombre;
        this.telefono = teléfono;
        this.poblacion = población;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int teléfono) {
        this.telefono = teléfono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String población) {
        this.poblacion = población;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

}
