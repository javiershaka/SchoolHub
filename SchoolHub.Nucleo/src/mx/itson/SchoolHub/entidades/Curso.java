/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javiershaka
 */
public class Curso {
    private String nombre;
    private String cicloCurso; 
    private List<Usuario> usuario = new ArrayList<Usuario>();
    private List<Asignacion> asignacion = new ArrayList<Asignacion>();
    

    public Curso() {
    }

    public Curso(String nombre, String cicloCurso) {
        this.nombre = nombre;
        this.cicloCurso = cicloCurso;
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
     * @return the cicloCurso
     */
    public String getCicloCurso() {
        return cicloCurso;
    }

    /**
     * @param cicloCurso the cicloCurso to set
     */
    public void setCicloCurso(String cicloCurso) {
        this.cicloCurso = cicloCurso;
    }

    /**
     * @return the usuario
     */
    public List<Usuario> getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the asignacion
     */
    public List<Asignacion> getAsignacion() {
        return asignacion;
    }

    /**
     * @param asignacion the asignacion to set
     */
    public void setAsignacion(List<Asignacion> asignacion) {
        this.asignacion = asignacion;
    }
            /**
     * 
     * @param nombre
     * @param cicloCurso 
     */
    
    
   
    
    
}
