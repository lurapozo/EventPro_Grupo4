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
public class FiestaInfantil extends Evento{
    private int CantDisfr;
    private int CantSorp;
    private boolean juegos;
//constructor
    public FiestaInfantil(int CantDisfr, int CantSorp, boolean juegos, TipoEvento tipoevento, LocalDate fecha, LocalTime horaIni, LocalTime horaFini, String estadoevento, Cliente cliente, Cliente planificador, int id, int codigo, String lugar, float precio, int capacidad, int numinvitados, Adicionales elemeadi, int disfrazados, int idordendepago) {
        super(tipoevento, fecha, horaIni, horaFini, estadoevento, cliente, planificador, id, codigo, lugar, precio, capacidad, numinvitados, elemeadi, disfrazados, idordendepago);
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
    public String MostrarMensaje(){
        return "Si realizan un próximo evento en las mismas instalaciones en un plazo de 6 meses se les otorgará en servicio de música gratuito.";
    }
}
