/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Adicionales.*;
import static Adicionales.Musica.musica.*;
import Menu.Cliente;
import Tramites.Solicitud.EstadoEvento;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pisco
 */
public class Evento {
    protected TipoEvento tipoevento;
    //protected Solicitud solicitud;
    protected LocalDate fecha;
    protected LocalTime horaIni;
    protected LocalTime horaFini;
    protected EstadoEvento estadoevento;
    protected Cliente cliente;
    protected Cliente planificador;
    protected int id;
    protected int codigo;
    protected String lugar;
    protected float precio;
    protected int capacidad;
    protected int numinvitados;
    protected int idordendepago;
    protected int ValorDeEvento;
    protected double ValorPagar;
    protected int validador;
    //orden de pago
    //.
    //Constructor
    public Evento(TipoEvento tipoevento, LocalDate fecha, LocalTime horaIni, LocalTime horaFini, EstadoEvento estadoevento, Cliente cliente, Cliente planificador, int id, int codigo, String lugar, float precio, int capacidad, int numinvitados, int idordendepago){
        this.tipoevento = tipoevento;
        this.fecha = fecha;
        this.horaIni = horaIni;
        this.horaFini = horaFini;
        this.estadoevento = estadoevento;
        this.cliente = cliente;
        this.planificador = planificador;
        this.id = id;
        this.codigo = codigo;
        this.lugar = lugar;
        this.precio = precio;
        this.capacidad = capacidad;
        this.numinvitados = numinvitados;
        this.idordendepago = idordendepago;
        this.ValorDeEvento=0;
        this.ValorPagar=0;
        this.validador=0;
    }
    public Evento(){
        this.tipoevento = tipoevento;
        this.fecha = fecha;
        this.horaIni = horaIni;
        this.horaFini = horaFini;
        this.estadoevento = estadoevento;
        this.cliente = cliente;
        this.planificador = planificador;
        this.id = id;
        this.codigo = codigo;
        this.lugar = lugar;
        this.precio = precio;
        this.capacidad = capacidad;
        this.numinvitados = numinvitados;
        this.idordendepago = idordendepago;
        this.ValorDeEvento=0;
        this.ValorPagar=0;
        this.validador=0;
    }
    
    // getters

    public TipoEvento getTipoevento() {
        return tipoevento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraIni() {
        return horaIni;
    }

    public LocalTime getHoraFini() {
        return horaFini;
    }

    public EstadoEvento getEstadoevento() {
        return estadoevento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Cliente getPlanificador() {
        return planificador;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getLugar() {
        return lugar;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNuminvitados() {
        return numinvitados;
    }

    public int getIdordendepago() {
        return idordendepago;
    }
    
    //setters

    public void setTipoevento(TipoEvento tipoevento) {
        this.tipoevento = tipoevento;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHoraIni(LocalTime horaIni) {
        this.horaIni = horaIni;
    }

    public void setHoraFini(LocalTime horaFini) {
        this.horaFini = horaFini;
    }

    public void setEstadoevento(EstadoEvento estadoevento) {
        this.estadoevento = estadoevento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPlanificador(Cliente planificador) {
        this.planificador = planificador;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNuminvitados(int numinvitados) {
        this.numinvitados = numinvitados;
    }

    public void setIdordendepago(int idordendepago) {
        this.idordendepago = idordendepago;
    }
    
    //Obtener id
    private int obtieneId() {
        Random r = new Random();
        return r.nextInt(999999);
    }
    public int getId(){
        return id;
    }
    public void setId(){
        id=obtieneId();
    }
    public String MostrarMensaje(){
        return "";
    }
    //El valor del Evento se generara dependiendo del tipo de evento que es (Herencia)
    public int ValorDelEvento(){
        return ValorDeEvento;
    }    
    public double ValorFinal(double adicional){
        this.ValorPagar=ValorPagar+ValorDeEvento + adicional;
        return ValorPagar;
    }
    
    
    public void CalcularTotal() {
        Scanner entrada= new Scanner(System.in);
        int nose1=0;
        while(nose1 == 0){
            System.out.println("Las opciones son: ");
            System.out.println("1. Comida");
            System.out.println("2. Bocaditos");
            System.out.println("3. Musica");
            System.out.println("4. Fotografia");
            System.out.println("5. Bebida");
            System.out.println("6. Regresar al menu anterior");
            System.out.print("Elija elemento a adicionar: ");
            int tip =entrada.nextInt();
            entrada.nextLine();//el scanner se cierra cuando se regresa al menu anterior (opcion 6)
            String tipo;
            if(tip==1){
                entrada.nextLine();
                Comida com= new Comida();
                System.out.print("Cantidad de platos: ");
                int cantidad = entrada.nextInt();
                entrada.nextLine();
                com.setCantidad(cantidad);
                double t=com.calculartotal();
                System.out.println("Total: "+ t);
                System.out.println("Agragar (S/N)");
                String opcion= entrada.nextLine();
                if (opcion.equals("S")){
                    double f=ValorFinal(t);
                    System.out.println("Se ha agragado su seleccion");
                    System.out.print("Total a pagar: "+ f);
                }
            }else if(tip==2){
                entrada.nextLine();
                Bocaditos boca=new Bocaditos();
                System.out.print("Cantidad de bocaditos: ");
                int cantidad1 = entrada.nextInt();
                entrada.nextLine();
                boca.setCantidad(cantidad1);
                double t1=boca.calculartotal();
                System.out.println("Total: "+ t1);
                System.out.println("Agragar (S/N)");
                String opcion1= entrada.nextLine();
                if (opcion1.equals("S")){
                    double f1=ValorFinal(t1);
                    System.out.println("Se ha agragado su seleccion");
                    System.out.print("Total a pagar: "+ f1);
                }
            }else if(tip==3){//Se usa el validador aqui
                Musica mus=new Musica();
                System.out.println("Las opciones son: ");
                System.out.println("1. DJ ($300)");
                System.out.println("2. Banda musical ($2000)");     
                int var2=entrada.nextInt();
                int nose2=0;
                while(nose2==0){
                    if (var2==1 || var2==2){
                        switch (validador) {
                            case 0://Si el usuario no ha escojido ni DJ ni Banda antes
                                switch(var2){
                                    case 1:
                                        mus.setDato(DJ);
                                        validador=1;
                                        double t21=mus.calculartotal();
                                        System.out.println("Total: "+ t21);
                                        System.out.println("Agragar (S/N)");
                                        String opcion2= entrada.nextLine();
                                        if (opcion2.equals("S")){
                                            double f2=ValorFinal(t21);
                                            System.out.println("Se ha agragado su seleccion");
                                            System.out.print("Total a pagar: "+ f2);
                                        }
                                        break;
                                    case 2:
                                        mus.setDato(banda);
                                        validador=2;
                                        double t22=mus.calculartotal();
                                        System.out.println("Total: "+ t22);
                                        System.out.println("Agragar (S/N)");
                                        String opcion22= entrada.nextLine();
                                        if (opcion22.equals("S")){
                                            double f2=ValorFinal(t22);
                                            System.out.println("Se ha agragado su seleccion");
                                            System.out.print("Total a pagar: "+ f2);
                                        }
                                        break;
                                }   
                                nose2=1;
                                break;
                            case 1:// Si el usuario ya ha escojido DJ anteriormente
                                switch(var2){
                                    case 1:
                                        System.out.println("YA HA AGREGADO ESTE ELEMENTO A SU LISTA, ELIJA OTRO!!!!!!!!!!!!!!!!");
                                        break;
                                    case 2:
                                        mus.setDato(banda);
                                        validador=3;
                                        double t22=mus.calculartotal();
                                        System.out.println("Total: "+ t22);
                                        System.out.println("Agragar (S/N)");
                                        String opcion22= entrada.nextLine();
                                        if (opcion22.equals("S")){
                                            double f2=ValorFinal(t22);
                                            System.out.println("Se ha agragado su seleccion");
                                            System.out.print("Total a pagar: "+ f2);
                                        }
                                        break;
                                }   
                                nose2=1;
                                break;
                            case 2:// Si el usuario ha escojido Banda Musical anteriormente
                                switch(var2){
                                    case 1:
                                        mus.setDato(DJ);
                                        validador=3;
                                        double t21=mus.calculartotal();
                                        System.out.println("Total: "+ t21);
                                        System.out.println("Agragar (S/N)");
                                        String opcion2= entrada.nextLine();
                                        if (opcion2.equals("S")){
                                            double f2=ValorFinal(t21);
                                            System.out.println("Se ha agragado su seleccion");
                                            System.out.print("Total a pagar: "+ f2);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("YA HA AGREGADO ESTE ELEMENTO A SU LISTA, ELIJA OTRO!!!!!!!!!!!!!!!!");
                                        break;
                                }   
                                nose2=1;
                                break;
                            case 3:// Si el usuario ha escojido ambas opciones anteriormente
                                System.out.println("Ya ha agregado todos los elementos posibles en esta opcion");
                                nose2=1;
                                break;
                        }
                    }else{
                        System.out.println("Parece que se ha cometido un error. El valor que ingreso no aplica en esta situacion");
                        System.out.println("Le pedimos de favor que escoja un nuevo valor que se encuentre dentro del rango establecido");
                        System.out.println("Gracias ^_^");
                    }
                }
                
            }else if(tip==4){
                entrada.nextLine();
                Fotografia foto=new Fotografia();
                double t3=foto.calculartotal();//no se ingresa datos porque fotografia solo tiene valor fijo
                System.out.println("Total: "+ t3);
                System.out.println("Agragar (S/N)");
                String opcion3= entrada.nextLine();
                if (opcion3.equals("S")){
                    double f3=ValorFinal(t3);
                    System.out.println("Se ha agragado su seleccion");
                    System.out.print("Total a pagar: "+ f3);
                }
            }else if (tip==5){
                entrada.nextLine();
                Bebida bebi=new Bebida();
                int nose3=0;
                while (nose3==0){//dejar al usuario escojer varias bebidas
                    System.out.println("Las opciones son: ");
                    System.out.println("1. Whisky");
                    System.out.println("2. Vodka");
                    System.out.println("3. Cerveza");
                    System.out.println("4. Refrescos");
                    System.out.println("5. Regresar al menu anterior");
                    int var4 = entrada.nextInt();
                    entrada.nextLine();
                    if (var4==1){
                        System.out.print("Cantidad de Whisky: ");
                        int whisk=entrada.nextInt();
                        entrada.nextLine();
                        bebi.setWhisky(whisk);
                    }else if(var4==2){
                        System.out.print("Cantidad de Vodka: ");
                        int vod=entrada.nextInt();
                        entrada.nextLine();
                        bebi.setVodka(vod);                        
                    }else if(var4==3){
                        System.out.print("Cantidad de Cerveza: ");
                        int cer=entrada.nextInt();
                        entrada.nextLine();
                        bebi.setCerveza(cer);                        
                    }else if(var4==4){
                        System.out.print("Cantidad de Refrescos: ");
                        int ref=entrada.nextInt();
                        entrada.nextLine();
                        bebi.setRefrescos(ref);                        
                    }else if(var4==5){//aqui se calcula el total
                        double t4=bebi.calculartotal();
                        double f4=ValorFinal(t4);
                        System.out.println("El total a pagar actuslmente es: "+ f4);
                        System.out.println("¿Desea Salir de este menu? (S/N)");
                        String opcion5= entrada.nextLine();
                        if (opcion5.equals("S")){
                            nose3=1;
                        }
                    }else{
                        System.out.println("El valor ingresado no es uno valido, por favor recapacite e ingrese uno correcto");
                    }
                }
            } else if(tip==6){
                System.out.println("¿Desea Salir de este menu? (S/N)");
                String opcion5= entrada.nextLine();
                if (opcion5.equals("S")){
                    System.out.println("Gracias por su tiempo");
                    entrada.close();
                    nose1=1;
                }                
            } else{
                System.out.println("Dato invalido, pruebe de nuevo");
            }                
        }           
    }
}