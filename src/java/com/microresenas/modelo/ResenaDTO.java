/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microresenas.modelo;

/**
 *
 * @author Unimagdalena
 */
public class ResenaDTO implements Cloneable{
    private int monitorid;
    private int estudianteid;
    private String comentario;
    private int calificacion;
    private String fecha;

    public ResenaDTO(ResenaDTO x) {
        //manualmente
    }
    
    
     @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    public ResenaDTO(int monitorid, int estudianteid, String comentario, int calificacion, String fecha) {
        this.monitorid = monitorid;
        this.estudianteid = estudianteid;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "ResenaDTO{" + "monitorid=" + monitorid + ", estudianteid=" + estudianteid + ", comentario=" + comentario + ", calificacion=" + calificacion + ", fecha=" + fecha + '}';
    }
    

    /**
     * @return the monitorid
     */
    public int getMonitorid() {
        return monitorid;
    }

    /**
     * @param monitorid the monitorid to set
     */
    public void setMonitorid(int monitorid) {
        this.monitorid = monitorid;
    }

    /**
     * @return the estudianteid
     */
    public int getEstudianteid() {
        return estudianteid;
    }

    /**
     * @param estudianteid the estudianteid to set
     */
    public void setEstudianteid(int estudianteid) {
        this.estudianteid = estudianteid;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
/*
int monitorId = (int) request.getAttribute("monitorId");
        int estudianteId = (int) request.getAttribute("estudianteId");
        String comentario = (String) request.getAttribute("comentario");
        int calificacion = (int) request.getAttribute("calificacion");
        String fechaStr = (String) request.getAttribute("fecha")
*/