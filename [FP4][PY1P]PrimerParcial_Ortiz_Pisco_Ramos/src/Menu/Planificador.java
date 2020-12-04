/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.ArrayList;
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
        System.out.println(lista4);
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
                    System.out.println("Precio base: $3500 ");
                }else if(a2[6].equals("fiesta infantil")){
                    System.out.println("Precio base: $300 ");
                }else if(a2[6].equals("fiesta empresarial")){
                    System.out.println("Precio base: $2000 ");
                }
            }
        }
    }
}
