/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.SchoolHub.controller;

import mx.itson.SchoolHub.controller.GsonController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author javiershaka
 */
public class FileController {
    /**
     * 
     * @return Retorna un objeto file 
     */
    public File Filetxt() {
        File archivo = new File("Usuarios.txt");

        return archivo;
    }
    /**
     * 
     * @return retorna un objeto File del valor del archivo txt leido
     * @throws FileNotFoundException 
     */
    public BufferedReader FileReadertxt() throws FileNotFoundException {

        if (Filetxt().exists()) {
            BufferedReader rb = new BufferedReader(new FileReader(Filetxt()));

            return rb;
        } else {
            System.out.println("paso valor nulo del bufferreader");
            return null;

        }

    }
    /**
     * 
     * @param textoUsuario Recibe parametro en String de texto suario 
     * @throws IOException 
     */
    public void FileWritetxt(String textoUsuario) throws IOException {

        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(Filetxt()));
        bw.write("" + textoUsuario);
        bw.close();

    }

}
