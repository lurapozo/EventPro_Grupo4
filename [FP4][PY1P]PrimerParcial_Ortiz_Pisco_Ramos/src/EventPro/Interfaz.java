/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventPro;
import java.util.ArrayList;
import java.util.Scanner;
import static trabajoconarchivos.ManejoArchivos.LeeFichero;
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
        String verificador = "No disponible";
        while(verificador.equals("No disponible")){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("            BIENVENIDO AL SISTEMA");
            System.out.println();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("USUARIO: ");
            String usuario = entrada.nextLine();
            System.out.println("CONTRASEÑA: ");
            String contraseña = entrada.nextLine();
            verificador = validarUsuario(usuario, contraseña);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Verificar usuario y contrasenia
    public static String validarUsuario(String usuario, String contrasenia){
        ArrayList<String> lista= LeeFichero("usuarios.txt");
        int contador=0;
        String devolver = "No disponible";
        for (int i=0; i<lista.size()-1; i++){
            String a1=lista.get(i);
            String[] a2=a1.split(";");
            if (a2[2].equals(usuario)){
                contador=1;
                if (a2[3].equals(contrasenia)){
                    if (a2[4].equals("C")){
                        devolver= "Cliente";
                        System.out.println("Ingresando como cliente...");
                    }else{
                        devolver= "Planificador";
                        System.out.println("Ingresando como planificador...");
                    }
                }else{
                    System.out.println("intente denuevo, contrasenia invalida.");
                }
            }
            
        }
        if(contador==0){
            System.out.println("intente denuevo, usuario invalido.");
        }
        return devolver;
    }
}
    
