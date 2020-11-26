/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tramites;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Pisco
 */
public class Solicitud {
    private int numsolicitud;
    private String cliente;
    private String planificador;
    private String estadoevento;
    private LocalDate fechasolicitud;
    private LocalDate fechaevento;

    public Solicitud(String cliente, String planificador, String estadoevento, LocalDate fechasolicitud, LocalDate fechaevento) {
        this.cliente = cliente;
        this.planificador = planificador;
        this.estadoevento = estadoevento;
        this.fechasolicitud = fechasolicitud;
        this.fechaevento = fechaevento;
    }
    
    //Getters
    public int getNumsolicitud() {
        Random r = new Random();
        return r.nextInt(1500);
    }

    public String getCliente() {
        return cliente;
    }

    public String getPlanificador() {
        return planificador;
    }

    public String getEstadoevento() {
        return estadoevento;
    }

    public LocalDate getFechasolicitud() {
        return fechasolicitud;
    }

    public LocalDate getFechaevento() {
        return fechaevento;
    }
    
    //Setters
    public void setNumsolicitud(int numsolicitud) {
        this.numsolicitud = numsolicitud;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setPlanificador(String planificador) {
        this.planificador = planificador;
    }

    public void setEstadoevento(String estadoevento) {
        this.estadoevento = estadoevento;
    }

    public void setFechasolicitud(LocalDate fechasolicitud) {
        this.fechasolicitud = fechasolicitud;
    }

    public void setFechaevento(LocalDate fechaevento) {
        this.fechaevento = fechaevento;
    }
    
    
    
    
}
