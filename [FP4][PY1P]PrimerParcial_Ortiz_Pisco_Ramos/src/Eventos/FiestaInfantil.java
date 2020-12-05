/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

import Adicionales.*;
import Menu.Cliente;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Pisco
 */
public class FiestaInfantil extends Evento{
    private int CantDisfr;
    private int CantSorp;
    private boolean juegos;
//constructor
    public FiestaInfantil(){
        this.CantDisfr = CantDisfr;
        this.CantSorp = CantSorp;
        this.juegos = juegos;
    }
//getters y setters
    public int getCantDisfr() {
        return CantDisfr;
    }

    public int getCantSorp() {
        return CantSorp;
    }

    public boolean isJuegos() {
        return juegos;
    }

    public void setCantDisfr(int CantDisfr) {
        this.CantDisfr = CantDisfr;
    }

    public void setCantSorp(int CantSorp) {
        this.CantSorp = CantSorp;
    }

    public void setJuegos(boolean juegos) {
        this.juegos = juegos;
    }
    @Override
    public int ValorDelEvento(){
        this.ValorDeEvento=300;
        return ValorDeEvento;
    }
    @Override
    public String MostrarMensaje(){
        return "Si realizan un próximo evento en las mismas instalaciones en un plazo de 6 meses se les otorgará en servicio de música gratuito.";
    }
}
