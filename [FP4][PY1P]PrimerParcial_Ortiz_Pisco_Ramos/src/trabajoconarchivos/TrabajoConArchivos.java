/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoconarchivos;

/**
 *
 * @author Verónica
 */
public class TrabajoConArchivos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] arg) {
         
        ManejoArchivos.EscribirArchivo("archivosalida.txt","Hola!");
        ManejoArchivos.EscribirArchivo("archivosalida.txt","Adios!");
        ManejoArchivos.LeeFichero("usuarios.txt");
        ManejoArchivos obj = new ManejoArchivos();
    }
    
}
