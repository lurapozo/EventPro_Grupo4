/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.*;
import Eventos.NumTypes;
import Tramites.OrdenPago;
import Tramites.OrdenPago.EstadoP;
import static Tramites.OrdenPago.EstadoP.PagoPendiente;
import Tramites.Solicitud;
import static Tramites.Solicitud.EstadoEvento.pendiente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private EstadoP estado;
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
        System.out.println("************Bienvenido "+getNombre()+' '+getApellido()+"************");
        LocalDate fechaevento= ValidarTiempo();//Poner fecha en "modo alrevez"
        LocalDate hoy= LocalDate.now();//yyyy-mm-dd , en vez de dd-mm-yyyy
        Solicitud solicitud1= new Solicitud(getNombre()+' '+getApellido(), hoy, fechaevento);
        Scanner sc1= new Scanner(System.in);
        System.out.println("Quiere registrar la solicitud?  [S/N]");
        String opcion=sc1.nextLine();
        String respuesta = opcion.toUpperCase();
        ArrayList<String> lista= new ArrayList<String>();
        lista=LeeFichero("usuarios.txt");
        solicitud1.setPlanificador(asignarPlanificador(lista));
        if (respuesta.equals("S")){
            int tip=0;
            String tipoEvento="na";
            while(tip !=1 && tip !=2 && tip !=3){
                System.out.println("Confirme su tipo de evento: ");
                System.out.println("1 Boda");
                System.out.println("2 Fiesta Infantil");
                System.out.println("3 Fiesta Empresarial");
                tip =sc1.nextInt();
                if (tip==1){
                    tipoEvento="boda";
                }else if(tip==2){
                    tipoEvento="fiesta infantil";
                }else if(tip==3){
                    tipoEvento="fiesta empresarial";
                }else{
                    System.out.println("Ingreso invalido");
                }
            }
            sc1.nextLine();
            solicitud1.setNumsolicitud();
            solicitud1.setEstadoevento(pendiente);
            EscribirArchivo("solicitudes.txt",solicitud1.getNumsolicitud()+","+solicitud1.getCliente()+","+solicitud1.getPlanificador()+","+solicitud1.getFechasolicitud()+","+solicitud1.getFechaevento()+","+solicitud1.getEstadoevento()+","+tipoEvento);
        }else{
            System.out.println("Operacion cancelada");
        }
    }
    /*
    //Registrar Pago
    public void registrarPago(){
        ArrayList<String> lista = LeeFichero("solicitudes.txt");
        String nombrecliente = getNombre()+' '+getApellido();
        String codigoevento = idPagoPendiente(lista, nombrecliente);
        System.out.println("El codigo de su orden es: "+codigoevento);
        System.out.println("Desea registrar pago?   [S/N]");
        Scanner sc= new Scanner(System.in);
        String resp = sc.nextLine();
        if (resp.equals("S")){
            System.out.println("Ingrese codigo de transaccion: ");
            int codigotransaccion = sc.nextInt();
            sc.nextLine();
            LocalDate fecha1 = LocalDate.now();
            int codigoeventoINT = Integer.parseInt(codigoevento);
            estado=PagoPendiente;
            double prueba= 0.0; //Aun no tenemos .getTotalpagar, por el momento usamos como valor defecto 12.0
            OrdenPago orden= new OrdenPago(codigoeventoINT, codigotransaccion, prueba, estado, fecha1);
            System.out.println("Datos ingresados.");
        }
    }
    */
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
            sc.nextLine();
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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fecha =sc.nextLine();
            fechaevento = LocalDate.parse(fecha, formatter);
            if (fechaevento.isBefore(fechamin)){
                System.out.println("Intente denuevo, la fecha es muy pronto.");
            }else{
                System.out.println("Fecha correcta. :0");
                b=1;
            }
        }
        return fechaevento;
    }
    
    //asignar planificador
    public String asignarPlanificador(ArrayList<String> lista){
        ArrayList<String> planificadores = new ArrayList<String>();
        for (int i=0; i<lista.size(); i++){
            String a1=lista.get(i);
            String[] a2=a1.split(";");
            if (a2[4].equals("P")){
                planificadores.add(a2[0]+" "+a2[1]);
            }
        }
        Random rn = new Random();
        int answer = rn.nextInt(planificadores.size());
        String planificador=planificadores.get(answer);
        return planificador;
    }

    
    
    /*
    //VERIFICAR PAGO PENDIENTE
    public String idPagoPendiente(ArrayList<String> lista, String nombrecliente){
        String pagospendientes = null;
        for (int i=0; i<lista.size(); i++){
            String a1=lista.get(i);
            String[] a2=a1.split(",");
            if ((a2[5].equals("pendiente")) && (a2[1].equals(nombrecliente))){
                pagospendientes=a2[0];
            }
        }
        return pagospendientes;
    }*/
}
