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
//buscar alternativa de inicializar dato antes para crear el metodo calculartota solo con cantidad para asi realizar el override
    public double calculartotal(int cantidad, musica dato){
        this.cantidad=cantidad;
        this.dato=dato;
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