/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.controller;

import mx.itson.SchoolHub.entidades.Curso;
import mx.itson.SchoolHub.controller.CursoController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import mx.itson.SchoolHub.entidades.Usuario;


/**
 * 
 * @author javiershaka
 */
public class GsonController {
    /**
     * 
     * @return
     * @throws FileNotFoundException 
     */
    public Curso GsonToJava() throws FileNotFoundException {
        
            Curso curso;
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println("entro a gson to java"+new FileController().FileReadertxt().toString());
            curso = gson.fromJson(new FileController().FileReadertxt(), Curso.class);
            
            return curso;
       
        

    }
    /**
     * 
     * @param curso recibe un objeto curso
     * @return retorna un string del objeto en formato json
     * @throws FileNotFoundException 
     */

    public String JavaToGson(Curso curso) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        String texto = gson.toJson(curso);
        return texto;

    }

}
