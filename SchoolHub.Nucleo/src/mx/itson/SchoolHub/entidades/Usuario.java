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
public class Usuario {
    private String nombre;
    private TipoUsuario tipoUsuario;
    private Materia materia;
    private String correo;
    private String contraseñaUsuario;
    private double calificaciones;

    public Usuario() {
    }
    /**
     * 
     * @param nombre
     * @param tipoUsuario
     * @param materia
     * @param correo
     * @param contraseñaUsuario
     * @param calificaciones 
     */
    public Usuario(String nombre, TipoUsuario tipoUsuario, Materia materia, String correo, String contraseñaUsuario, double calificaciones) {
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.materia = materia;
        this.correo = correo;
        this.contraseñaUsuario = contraseñaUsuario;
        this.calificaciones = calificaciones;
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
     * @return the tipoUsuario
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the contraseñaUsuario
     */
    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    /**
     * @param contraseñaUsuario the contraseñaUsuario to set
     */
    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    /**
     * @return the calificaciones
     */
    public double getCalificaciones() {
        return calificaciones;
    }

    /**
     * @param calificaciones the calificaciones to set
     */
    public void setCalificaciones(double calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    
    
}
