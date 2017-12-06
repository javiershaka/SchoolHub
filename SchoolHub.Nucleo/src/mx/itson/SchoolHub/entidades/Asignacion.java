/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.entidades;

import mx.itson.SchoolHub.enumeradores.TipoAsignacion;
import java.util.Date;

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
    private EntregaAsignacion engrega;
    private boolean close;

    public Asignacion() {
    }
    /**
     * 
     * @param nombre
     * @param asignacion
     * @param comentario
     * @param fechainicio
     * @param fechafinal
     * @param calificacion
     * @param engrega
     * @param close 
     */
    public Asignacion(String nombre, TipoAsignacion asignacion, String comentario, Date fechainicio, Date fechafinal, double calificacion, EntregaAsignacion engrega, boolean close) {
        this.nombre = nombre;
        this.asignacion = asignacion;
        this.comentario = comentario;
        this.fechainicio = fechainicio;
        this.fechafinal = fechafinal;
        this.calificacion = calificacion;
        this.engrega = engrega;
        this.close = close;
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
    public EntregaAsignacion getEngrega() {
        return engrega;
    }

    /**
     * @param engrega the engrega to set
     */
    public void setEngrega(EntregaAsignacion engrega) {
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
     
    
    
}
