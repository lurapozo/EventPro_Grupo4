/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventPro;
import Menu.Cliente;
import Menu.Planificador;
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
        String usuario="asdasd";
        while(verificador.equals("No disponible")){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("            BIENVENIDO AL SISTEMA");
            System.out.println();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("USUARIO: ");
            usuario = entrada.nextLine();
            System.out.println("CONTRASEÑA: ");
            String contraseña = entrada.nextLine();
            verificador = validarUsuario(usuario, contraseña);
        }
        int seleccion=0;
        if (verificador.equals("Planificador")){
            //cosas informaticas aqui
            while (seleccion!=5){
                Scanner scann= new Scanner(System.in);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("                  Planificador");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Escoja una opcion:  [1/2/3/4/5]");
                System.out.println("1.- Solicitar evento");
                System.out.println("2.- Registrar pago");
                System.out.println("3.- Confirmar evento");
                System.out.println("4.- Consultar evento");
                System.out.println("5.- Salir");
                seleccion=scann.nextInt(); 
                Planificador pl1= DatosDelPlanificador(usuario);
                if(seleccion==1){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("           Consultar solicitud solicitud");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    // dfasdf
                }else if(seleccion==2){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("                  Registrar Evento");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    //asda
                }else if(seleccion==3){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("                  Confirmar Evento");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    //asd
                }else if(seleccion==4){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("                  Consultar Evento");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    //sad
                }                
            }
        }else {
            while (seleccion!=3){
                Scanner scann= new Scanner(System.in);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("                  CLIENTE");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Escoja una opcion:  [1/2/3]");
                System.out.println("1.- Solicitar evento");
                System.out.println("2.- Registrar pago");
                System.out.println("3.- Salir");
                seleccion=scann.nextInt(); 
                Cliente cl1= DatosDelCliente(usuario);
                if(seleccion==1){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("             Nueva solicitud");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    cl1.ingresaSolicitud();  
                }else if(seleccion==2){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("                    Pago");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    //cl1.registrarPago();
                }                
            }            
        }
        entrada.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Verificar usuario y contrasenia
    public static String validarUsuario(String usuario, String contrasenia){
        ArrayList<String> lista= LeeFichero("usuarios.txt");
        int contador=0;
        String devolver = "No disponible";
        for (int i=0; i<lista.size(); i++){
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
    
    //clientes
    public static Cliente DatosDelCliente(String usuario){
        ArrayList<String> lista1= LeeFichero("clientes.txt");
        String telefono=null;
        String correo=null;
        String nombre=null;
        String apellido=null;
        String contrasenia=null;
        char tipo= 'C';
        for (int i=0; i<lista1.size(); i++){
            String a1=lista1.get(i);
            String[] a2=a1.split(";");
            if (a2[0].equals(usuario)){
                telefono=a2[1];
                correo=a2[2];
            }
        }
        ArrayList<String> lista2= LeeFichero("usuarios.txt");
        for (int o=0; o<lista2.size(); o++){
            String a3=lista2.get(o);
            String[] a4=a3.split(";");
            if (a4[2].equals(usuario)){
                nombre=a4[0];
                apellido=a4[1];
                contrasenia=a4[3];
            }    
        }
        Cliente cl1= new Cliente(telefono, correo, nombre, apellido, contrasenia, tipo);
        return cl1;
    }
        
    //planificadores
    public static Planificador DatosDelPlanificador(String usuario){
        String nombre=null;
        String apellido=null;
        String contrasenia=null;
        char tipo= 'P';
        ArrayList<String> lista2= LeeFichero("usuarios.txt");
        for (int o=0; o<lista2.size(); o++){
            String a3=lista2.get(o);
            String[] a4=a3.split(";");
            if (a4[2].equals(usuario)){
                nombre=a4[0];
                apellido=a4[1];
                contrasenia=a4[3];
            }    
        }
        Planificador pl1= new Planificador(nombre, apellido, contrasenia, tipo);
        return pl1;
    }
}
    
