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
public class FiestasEmpresariales extends Evento{
    private boolean transporte;
    private int CantPers;
//costructor
    public FiestasEmpresariales(){
        this.transporte = transporte;
        this.CantPers = CantPers;
    } 
//getters y setters
    public boolean isTransporte() {
        return transporte;
    }

    public int getCantPers() {
        return CantPers;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

    public void setCantPers(int CantPers) {
        this.CantPers = CantPers;
    }
    @Override
    public int ValorDelEvento(){
        this.ValorDeEvento=2000;
        return ValorDeEvento;
    }
    @Override
    public String MostrarMensaje(){
        return "el transporte al lugar del evento es gratuito en un próximo evento, si lo organizan con el mismo planificador.";
    }
}
