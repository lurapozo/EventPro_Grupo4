/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

import static Adicionales.AdicionalTipo.comida;
/**
 *
 * @author luisr
 */
public class Comida extends Adicionales{
    private AdicionalTipo tipoadicional= comida;
    
    public Comida(int cantidad, double TotalAdicional) {
        super(cantidad, TotalAdicional);
    }
    @Override
    public double calculartotal(int cantidad){
        this.cantidad=cantidad;
        TotalAdicional=cantidad*15;
        return TotalAdicional;
    }    
}
