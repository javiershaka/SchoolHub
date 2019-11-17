/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.entidades;

import mx.itson.SchoolHub.enumeradores.TipoAsignacion;
import java.util.Date;
import mx.itson.SchoolHub.enumeradores.TiempoEngrega;

/**
 *
 * @author javiershaka
 */
public class Asignacion {
    private String nombre;
    private TipoAsignacion asignacion;
    private String comentario;
    private Date fechainicio;
    private Date fechafinal;
    private double calificacion;
    private TiempoEngrega engrega;
    private boolean close;
    private int maxima;

    public Asignacion() {
    }

    public Asignacion(String nombre, TipoAsignacion asignacion, String comentario, Date fechainicio, Date fechafinal, double calificacion, TiempoEngrega engrega, boolean close, int maxima) {
        this.nombre = nombre;
        this.asignacion = asignacion;
        this.comentario = comentario;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
        this.calificacion = calificacion;
        this.engrega = engrega;
        this.close = close;
        this.maxima = maxima;
    }

    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the asignacion
     */
    public TipoAsignacion getAsignacion() {
        return asignacion;
    }

    /**
     * @param asignacion the asignacion to set
     */
    public void setAsignacion(TipoAsignacion asignacion) {
        this.asignacion = asignacion;
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
     * @return the fechainicio
     */
    public Date getFechainicio() {
        return fechainicio;
    }

    /**
     * @param fechainicio the fechainicio to set
     */
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    /**
     * @return the fechafinal
     */
    public Date getFechafinal() {
        return fechafinal;
    }

    /**
     * @param fechafinal the fechafinal to set
     */
    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    /**
     * @return the calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the engrega
     */
    public TiempoEngrega getEngrega() {
        return engrega;
    }

    /**
     * @param engrega the engrega to set
     */
    public void setEngrega(TiempoEngrega engrega) {
        this.engrega = engrega;
    }

    /**
     * @return the close
     */
    public boolean isClose() {
        return close;
    }

    /**
     * @param close the close to set
     */
    public void setClose(boolean close) {
        this.close = close;
    }

 
    /**
     * @return the maxima
     */
    public int getMaxima() {
        return maxima;
    }
    
    


    
    
}
