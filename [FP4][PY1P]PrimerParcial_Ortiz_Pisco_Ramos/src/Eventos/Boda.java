/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Menu.Cliente;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Pisco
 */
public class Boda extends Evento {
    private Transporte transporte;
    private String TipoVehiculo;
//constructor
    public Boda(Transporte transporte, String TipoVehiculo, TipoEvento tipoevento, LocalDate fecha, LocalTime horaIni, LocalTime horaFini, String estadoevento, Cliente cliente, Cliente planificador, int id, int codigo, String lugar, float precio, int capacidad, int numinvitados, Adicionales elemeadi, int disfrazados, int idordendepago) {
        super(tipoevento, fecha, horaIni, horaFini, estadoevento, cliente, planificador, id, codigo, lugar, precio, capacidad, numinvitados, elemeadi, disfrazados, idordendepago);
        this.transporte = transporte;
        this.TipoVehiculo = TipoVehiculo;
    }  
//getters y setters
    public Transporte getTransporte() {
        return transporte;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }
    @Override
    public String MostrarMensaje(){
        return "Recuerde que los novios tendran un 25% de descuento si compran sus tickets de luna de miel en la aerolinea LATAM.";
    }
}
