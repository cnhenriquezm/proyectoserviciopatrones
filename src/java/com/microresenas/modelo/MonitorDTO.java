/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microresenas.modelo;

/**
 *
 * @author Unimagdalena
 */
public class MonitorDTO {
    private int monitorId;
    private String nombre;
    private String email;
    private double calificacionPromedio;

    // Constructor
    public MonitorDTO(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.calificacionPromedio = 0.0;  // Calificación inicial
    }

    public MonitorDTO() {
    }

    // Getters y Setters
    public int getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCalificacionPromedio() {
        return calificacionPromedio;
    }

    public void setCalificacionPromedio(double calificacionPromedio) {
        this.calificacionPromedio = calificacionPromedio;
    }
}
