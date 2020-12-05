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

/**
 *
 * @author Pisco
 */
public class Boda extends Evento {
    private Transporte transporte;
    private String TipoVehiculo;
//constructor
    public Boda() {
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
    public int ValorDelEvento(){
        this.ValorDeEvento=3500;
        return ValorDeEvento;
    }
    @Override
    public String MostrarMensaje(){
        return "Recuerde que los novios tendran un 25% de descuento si compran sus tickets de luna de miel en la aerolinea LATAM.";
    }
    
    public enum Transporte{
    Aplica, NoAplica
    }
}
