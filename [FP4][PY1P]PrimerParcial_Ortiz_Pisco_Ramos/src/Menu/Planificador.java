/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Eventos.Boda;
import static Eventos.Boda.Transporte.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static trabajoconarchivos.ManejoArchivos.LeeFichero;

/**
 *
 * @author Pisco
 */
public class Planificador extends Usuario{
//constructor de sobrecarga con todos los atributos
    ArrayList<String> eventosdeplanificador = new ArrayList<String>();
    
    public Planificador(String nombre, String apellido, String contrasenia, char tipo) {
        super(nombre, apellido, contrasenia, tipo);
        tipo='P';
    }
    
    //Consultar eventos pendientes
    public void consultPendientes(String nombrearchivo){
        ArrayList<String> lista = LeeFichero(nombrearchivo);
        int numero=1;
        for (int i=0; i<lista.size(); i++){
            String a1=lista.get(i);
            String[] a2=a1.split(",");
            if (a2[5].equals("pendiente")){
                System.out.println(numero+".- "+a2[0]+" - "+a2[4]);
            }
        }        
    }
    
    //Registrar eventos
    public void registEventos(){
        Scanner entrar=new Scanner(System.in);
        System.out.println("Ingrese el id de solicitud a ingresar: ");
        String id=entrar.nextLine();
        ArrayList<String> lista4= LeeFichero("solicitudes.txt");
        int precio=0;
        for (int i=0; i<lista4.size(); i++){
            String a1=lista4.get(i);
            String[] a2=a1.split(",");
            if (a2[0].equals(id)){
                System.out.println("Datos: ");
                System.out.println("Cliente: "+a2[1]);
                System.out.println("Planificador Asignado: "+a2[2]);
                System.out.println("Fecha Registro: "+a2[3]);
                System.out.println("Tipo Evento: "+a2[6]);
                System.out.println("Fecha Evento: "+a2[4]);
                if(a2[6].equals("boda")){
                    Boda boda= new Boda();
                    System.out.println("Precio base: $3500 ");
                    boda.ValorDelEvento();
                    System.out.println("Quiere transporte?  [S/N]");
                    String opcion=entrar.nextLine();
                    if(opcion.equals("S")){
                        boda.setTransporte(Aplica);
                    }else{
                        boda.setTransporte(NoAplica);
                    }
                }else if(a2[6].equals("fiesta infantil")){
                    System.out.println("Precio base: $300 ");
                    precio=300;
                    System.out.println("Cuantos personajes disfrazados?  [Si no quiere escriba 0]");
                    int opcion=entrar.nextInt();
                    if(opcion!=0){
                        //Si
                    }else{
                        //0
                    }
                }else if(a2[6].equals("fiesta empresarial")){
                    System.out.println("Precio base: $2000 ");
                    precio=2000;
                    System.out.println("Quiere transporte?  [S/N]");
                    String opcion=entrar.nextLine();
                    if(opcion.equals("S")){
                        System.out.println("Cuantos personas?  ");
                        int opcion2=entrar.nextInt();
                    }
                }
            }
            int codigo= generarCode();
            String nombrePlan=getNombre()+" "+getApellido();
            String estado="PENDIENTE";
        }
    }
    
    //codigo aleatorio de 4 digitios
    public int generarCode(){
        ArrayList<String> lista5= LeeFichero("eventos.txt");
        Random rand = new Random(System.currentTimeMillis());
        int intAletorio = rand.nextInt(9999);
        int comprobante=0;
        while(comprobante==0){
            for (int i=0; i<lista5.size(); i++){
                String a1=lista5.get(i);
                String[] a2=a1.split(",");
                if (a2[0].equals(intAletorio)){
                    intAletorio = rand.nextInt(9999);
                    comprobante=0;
                    break;
                }else{
                    comprobante=1;
                }
            }
        }
        return intAletorio;
    }
}
