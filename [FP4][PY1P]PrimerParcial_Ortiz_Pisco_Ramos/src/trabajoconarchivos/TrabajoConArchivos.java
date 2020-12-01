/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoconarchivos;

import java.util.ArrayList;

/**
 *
 * @author Verónica
 */
public class TrabajoConArchivos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] arg) {
         
        ArrayList<String> lineas;
        ArrayList<String> nombres;
        ArrayList<String> apellidos;
        ArrayList<String> usuarios;
        ArrayList<String> contrasenias;
        ArrayList<String> tipo;
         
        ManejoArchivos.EscribirArchivo("archivosalida.txt","Prueba");
        ManejoArchivos.EscribirArchivo("archivosalida.txt","Afios!");
        ManejoArchivos.LeeFichero("archivo.txt");
        ManejoArchivos.LeeFichero("usuarios.txt");
        //ManejoArchivos A1= new ManejoArchivos("asd","asdasdasd");ivosalida.txt","Prueba");
        ManejoArchivos.EscribirArchivo("archivosalida.txt","Afios!");
        ManejoArchivos.LeeFichero("archivo.txt");
        ManejoArchivos.LeeFichero("usuarios.txt");
    }
    
}
