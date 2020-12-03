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

    private AdicionalTipo tipoadicional= musica;
    private musica dato;
    public Musica(int cantidad, double TotalAdicional) {
        super(cantidad, TotalAdicional);
    }
//getters y setters
    public musica getDato() {
        return dato;
    }

    public void setDato(musica dato) {
        this.dato = dato;
    }
    
    @Override
    public double calculartotal(int cantidad){
        this.cantidad=cantidad;
        if(cantidad==2){
            TotalAdicional=2300;
            return TotalAdicional;
        }else {
            switch(dato){
                case DJ:
                    TotalAdicional=300;
                    return TotalAdicional;
                case banda:
                    TotalAdicional=2000;
                    return TotalAdicional;      
            }
        }
        return 0;
    }
    public enum musica{
        DJ, banda
    }
}   