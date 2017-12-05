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
 * @author usiario}
 */
public class UsuariosRegistrados {
    public static List<Usuario> UsuariosRegistrados = new ArrayList<>();

    public List<Usuario> getUsuariosRegistrados() {
        return UsuariosRegistrados;
    }

    public void setUsuariosRegistrados(List<Usuario> UsuariosRegistrados) {
        this.UsuariosRegistrados = UsuariosRegistrados;
    }

    public UsuariosRegistrados() {
    }
}
