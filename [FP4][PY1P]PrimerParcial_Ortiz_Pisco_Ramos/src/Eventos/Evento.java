/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Adicionales.Adicionales;
import Menu.Cliente;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

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
    protected String estadoevento;
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
    //orden de pago
    //.
    //Constructor
    public Evento(TipoEvento tipoevento, LocalDate fecha, LocalTime horaIni, LocalTime horaFini, String estadoevento, Cliente cliente, Cliente planificador, int id, int codigo, String lugar, float precio, int capacidad, int numinvitados, int idordendepago){
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

    public String getEstadoevento() {
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

    public void setEstadoevento(String estadoevento) {
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
}