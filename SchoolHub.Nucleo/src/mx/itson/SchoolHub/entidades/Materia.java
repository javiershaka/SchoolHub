/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.entidades;

/**
 *
 * @author javiershaka
 */
public class Materia {
    private String nombre;
    private String cicloCurso; 
    /**
     * 
     * @param nombre
     * @param cicloCurso 
     */
    public Materia(String nombre, String cicloCurso) {
        this.nombre = nombre;
        this.cicloCurso = cicloCurso;
    }

    public Materia() {
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
    
    
}
