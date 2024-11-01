/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaminitores.persistencia;

/**
 *
 * @author Unimagdalena
 */
public class Monitor {
    private String nombre;
    private String email;
    private int calificacionPromedio;

    public Monitor(String nombre, String email, int calificacionPromedio) {
        this.nombre = nombre;
        this.email = email;
        this.calificacionPromedio = calificacionPromedio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "nombre=" + nombre + ", email=" + email + ", calificacionPromedio=" + calificacionPromedio + '}';
    }
    

    // Getters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public int getCalificacionPromedio() { return calificacionPromedio; }

}
