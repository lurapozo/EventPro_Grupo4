/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventPro;
import java.util.Scanner;
/**
 *
 * @author luisr
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("            BIENVENIDO AL SISTEMA");
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("USUARIO: ");
        String Usuario = entrada.nextLine();
        System.out.println("CONTRASEÑA: ");
        String Contraseña = entrada.nextLine();
    }
}
    
