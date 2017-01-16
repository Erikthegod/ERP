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
public class Pelicula {

    private int idPelicula;
    private String nombre;
    private int duracion;
    private int edad;

    public Pelicula(int idPelicula, String nombre, int duracion, int edad) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.duracion = duracion;
        this.edad = edad;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
