/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.controller;
import mx.itson.SchoolHub.enumeradores.TipoUsuario;
import mx.itson.SchoolHub.entidades.Usuario;

/**
 *
 * @author javiershaka
 */
public class UsuarioController {
    
    /**
     * posiblemente cambie la relacion de clases
     * @param nombre recibe parametro nombre
     * @param tipousuario recibe parametro tipo usuario enumerador
     * @param correo recibe parametro correo
     * @param contrasenaUsuario recibe parametro Usario contraseña
     * @param calificacion recibe parametro calificacion
     * @return retorna un usuario
     */
    public Usuario CrearUsuario(String nombre, TipoUsuario tipousuario, String correo, String contrasenaUsuario, double calificacion){
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setCorreo(correo);
        user.setTipoUsuario(tipousuario);
        user.setCalificaciones(calificacion);
        user.setContraseñaUsuario(contrasenaUsuario);
        
        
        return user;
    }
    
}
