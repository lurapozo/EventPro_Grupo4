/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventPro;
import Eventos.*;
import Menu.Cliente;
import Menu.Planificador;
import java.util.ArrayList;
import java.util.Scanner;
import static trabajoconarchivos.ManejoArchivos.LeeFichero;
import static trabajoconarchivos.ManejoArchivos.EscribirArchivo;

/**
 *
 * @author luisr
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Interfaz del usuario
        Scanner entrada = new Scanner(System.in);
        String verificador = "No disponible";
        String usuario="asdasd";
        while(verificador.equals("No disponible")){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println();
            System.out.println("            BIENVENIDO AL SISTEMA");
            System.out.println();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
            //Se pide que ingrese usuario y contrasenia
            System.out.println("USUARIO: ");
            usuario = entrada.nextLine();
            System.out.println("CONTRASEÑA: ");
            String contraseña = entrada.nextLine();
            //El siguiente metodo verifica si el usuario y la contrasenia son o
            //no correctos, si no lo son, se da la oportunidad de registrar.
            //tambien ve si el usuario es cliente o planificador
            verificador = validarUsuario(usuario, contraseña);
        }
        int seleccion=0;
        if (verificador.equals("Planificador")){
            while (seleccion!=5){
                Scanner scann= new Scanner(System.in);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("                  Planificador");
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                //las opciones del usuario planificador
                System.out.println("Escoja una opcion:  [1/2/3/4/5]");
                System.out.println("1.- Consultar solicitudes pendientes");
                System.out.println("2.- Registrar evento");
                System.out.println("3.- Confirmar evento");
                System.out.println("4.- Consultar evento");
                System.out.println("5.- Salir");
                seleccion=scann.nextInt(); 
                Planificador pl1= DatosDelPlanificador(usuario);
                if(seleccion==1){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("           Consultar solicitud solicitud");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    pl1.consultPendientes("solicitudes.txt");
                    
                }else if(seleccion==2){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("                  Registrar Evento");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    pl1.registEventos();
                    
                }else if(seleccion==3){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("                  Confirmar Evento");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    
                    pl1.aprobarOrdenDePAgo();
                    pl1.aprobarEvento();
                    
                }else if(seleccion==4){
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("                  Consultar Evento");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    ArrayList<String> lista1= LeeFichero("usuarios.txt");
                    String nombreDelPlanificador = " ";
                    for (int i=0; i<lista1.size(); i++){
                        String a1=lista1.get(i);
                        String[] a2=a1.split(";");
                        if (a2[2].equals(usuario)){
                            nombreDelPlanificador=a2[0]+" "+a2[1];
                        }
                    }
                    consultarEventos(nombreDelPlanificador);
                }                
            }
        }else {
            while (seleccion!=3){
                Scanner scann= new Scanner(System.in);
                //las opciones del usuario planificador
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
                    
                    cl1.registrarPago();
                }                
            }            
        }
        entrada.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Verificar usuario y contrasenia
    //El siguiente metodo verifica si el usuario y la contrasenia son o
    //no correctos, si no lo son, se da la oportunidad de registrar.
    //tambien ve si el usuario es cliente o planificador
    public static String validarUsuario(String usuario, String contrasenia){
        Scanner entrada = new Scanner(System.in);
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
            System.out.println("Quieres registrarte? (S/N)");
            String opcion = entrada.nextLine();
            String respuesta = opcion.toUpperCase();
            if (respuesta.equals("S")){
            System.out.println("Ingrese su nombre: ");;
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido: ");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese su usuario: ");
            String crearusuarios = entrada.nextLine();
            String Tipo = "x";
            int situacion = 0;
            String contrasenias = null;
            int telefono = 0;
            String correo = null;
            while (situacion==0){
                System.out.println("Ingrese su Tipo de usuario: (C/P)");
                String tipousuario = entrada.nextLine();
                Tipo = tipousuario.toUpperCase();
                if(Tipo.equals("C")){
                    situacion=1;
                    System.out.println("Ingrese su contraseña: ");
                    contrasenias = entrada.nextLine();
                    System.out.println("Ingrese su número de telefono: ");
                    telefono = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Ingrese su correo electronico: ");
                    correo = entrada.nextLine();
                }
                else if(Tipo.equals("P")){
                    situacion=1;
                    System.out.println("Ingrese su contraseña: ");
                    contrasenias = entrada.nextLine();
                }
                else{
                    System.out.println("valir invalido");
                }
                    
            }
 
            
            EscribirArchivo("clientes.txt",crearusuarios+";"+ telefono +";"+ correo);
            EscribirArchivo("usuarios.txt",nombre+";"+apellido+";"+ crearusuarios +";"+ contrasenias +";"+Tipo);
            
        }
            System.out.println("intente denuevo, usuario invalido.");
        }
        return devolver;
    }
    
    //clientes
    //Metodo para crear clientes
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
    //Metodo para crear planificadores
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
    
    //Consultar Eventos
    //penultima opcion del planificador
    //muestra en pantalla las promociones
    public static void consultarEventos(String nombreDelPlanificador){
        Scanner scanner40=new Scanner(System.in);
        int a=0;
        int resp = 0;
        String tipo="";
        while (a==0){
            System.out.println("Elija el tipo de evento que desea consultar [1/2/3]");
            System.out.println("1.-Boda");
            System.out.println("2.-Fiesta Infantil");
            System.out.println("3.-Fiesta Empresarial");
            resp=scanner40.nextInt();
            if(resp==1){
                tipo="boda";
                a=1;
            }else if(resp==2){
                tipo="fiesta infantil";
                a=1;
            }else if(resp==3){
                tipo="fiesta empresarial";
                a=1;
            }
        }
        int contador = 0;
        ArrayList<String> lista2= LeeFichero("eventos.txt");
        for (int o=0; o<lista2.size(); o++){
            String a3=lista2.get(o);
            String[] a4=a3.split(",");
            if (a4[7].equals(nombreDelPlanificador)&&a4[2].equals(tipo)){
               contador++; 
            }    
        }
        System.out.println("Tiene "+contador+" "+tipo+" asignadas");
            if(resp==1){
                Boda bod1=new Boda();
                bod1.MostrarMensaje();
            }else if(resp==2){
                FiestaInfantil fiestaI=new FiestaInfantil();
                fiestaI.MostrarMensaje();
            }else if(resp==3){
                FiestasEmpresariales fiestaE=new FiestasEmpresariales();
                fiestaE.MostrarMensaje();
            }
    }
}
    
