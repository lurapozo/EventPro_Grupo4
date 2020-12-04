/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;
import static Adicionales.AdicionalTipo.musica;
import Eventos.NumTypes;
/**
 *
 * @author luisr
 */
public class Musica extends Adicionales{

    private musica dato;
    public Musica() {
        tipoadicional= musica;
        dato=dato;
    }
//getters y setters
    public musica getDato() {
        return dato;
    }

    public void setDato(musica dato) {
        this.dato = dato;
    }
    
    @Override
    public double calculartotal(){
        this.cantidad=cantidad;
        switch(dato){
            case DJ:
                TotalAdicional=TotalAdicional+300;
                return TotalAdicional;
            case banda:
                TotalAdicional=TotalAdicional+2000;
                return TotalAdicional;      
        }
        return 0;
    }
    public enum musica{
        DJ, banda
    }
}   