/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.controller;
import java.io.IOException;
import mx.itson.SchoolHub.entidades.Curso;

import mx.itson.SchoolHub.entidades.Usuario;


/**
 *
 * @author javiershaka
 */
public class CursoController {
    
  
    /**
     * 
     * @param user recibe parametro de un objeto usuario
     * @throws IOException 
     */
    public void AddCursoAlumno(Usuario user) throws IOException{
      Curso curso = new GsonController().GsonToJava();   
      curso.getUsuario().add(user);
      new FileController().FileWritetxt(new GsonController().JavaToGson(curso));
      

        
    }
    
}
