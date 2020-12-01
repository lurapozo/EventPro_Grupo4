/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.*;
import Eventos.NumTypes;
import Tramites.Solicitud;
import static Tramites.Solicitud.EstadoEvento.pendiente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import trabajoconarchivos.ManejoArchivos;
import static trabajoconarchivos.ManejoArchivos.EscribirArchivo;
import static trabajoconarchivos.ManejoArchivos.LeeFichero;

/**
 *
 * @author Pisco
 */
public class Cliente extends Usuario{
    private String telefono;
    private String correo;
//constructor de sobrecarga con todos los atributos
    public Cliente(String telefono, String correo, String nombre, String apellido, String contrasenia, char tipo) {
        super(nombre, apellido, contrasenia, tipo);
        this.telefono = telefono;
        this.correo = correo;
        tipo='C';
    }
//getters y setters para poder usarlo en otras clases
    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }  
    

    //Registrar solicitud
    public void ingresaSolicitud() {
        Scanner sc= new Scanner(System.in);
        System.out.println('*'*20+"Nueva Solicitud"+'*'*20);
        System.out.println("Bienvenido "+getNombre()+' '+getApellido());
        LocalDate fechaevento= ValidarTiempo();
        LocalDate hoy= LocalDate.now();
        Solicitud solicitud1= new Solicitud(getNombre()+' '+getApellido(), hoy, fechaevento);
        System.out.println("Datos correctos, desea registrar su solicitud?    [S/N}]");
        ArrayList<String> lista= new ArrayList<String>();
        lista=LeeFichero("usuarios.txt");
        asignarPlanificador(lista);
        String respuesta=sc.nextLine();
        if (respuesta.equals("S")){
            solicitud1.setNumsolicitud();
            solicitud1.setEstadoevento(pendiente);
            EscribirArchivo("solicitudes.txt",solicitud1.getNumsolicitud()+','+solicitud1.getCliente()+','+solicitud1.getPlanificador()+','+solicitud1.getFechasolicitud()+','+solicitud1.getFechaevento()+','+solicitud1.getEstadoevento());
        }else{
            System.out.println("Operacion cancelada");
        }
    }
    
    //validar tiempo
    public LocalDate ValidarTiempo() {
        Scanner sc= new Scanner(System.in);
        int a=0;
        LocalDate hoy=LocalDate.now();
        LocalDate fechamin=hoy;
        while(a == 0){
            System.out.println("Elija un tipo de evento: ");
            System.out.println("1 Boda");
            System.out.println("2 Fiesta Infantil");
            System.out.println("3 Fiesta Empresarial");
            int tip =sc.nextInt();
            String tipo;
            if (tip==1){
                fechamin=fechamin.plusMonths(10);
                tipo="Boda";
                a=1;
            }else if(tip==2){
                fechamin=fechamin.plusDays(21);
                tipo="Fiesta Infantil";
                a=1;
            }else if(tip==3){
                fechamin=fechamin.plusMonths(2);
                tipo="Fiesta Empresarial";
                a=1;
            }else{
                System.out.println("Ingreso invalido");
            }
        }
        System.out.println('*'*20+tipo+'*'*20); //para mostrar el nombre del evento
        int b=0;
        LocalDate fechaevento=hoy;
        while (b==0){
            System.out.println("Ingrese fecha para el evento:  [dd-MM-yyyy]");
            String fecha =sc.nextLine();
            fechaevento = LocalDate.parse(fecha);
            if (fechaevento.isBefore(fechamin)){
                System.out.println("Intente denuevo, la fecha es muy pronto.");
            }else{
                System.out.println("Fecha correcta. :0");
                b=1;
            }
        }
        sc.close();
        return fechaevento;
    }
    
    //asignar planificador
    public String asignarPlanificador(ArrayList<String> lista){
        ArrayList<String> planificadores = new ArrayList<String>();
        for (int i=0; i<lista.size(); i++){
            String a1=lista.get(i);
            String[] a2=a1.split(";");
            if (a2[-1]=="P"){
                planificadores.add(a2[0]+" "+a2[1]);
            }
        }
        Random rn = new Random();
        int answer = rn.nextInt(planificadores.size());
        String planificador=planificadores.get(answer);
        return planificador;
    }
}
