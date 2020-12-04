package Adicionales;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Eventos.NumTypes;
/**
 *
 * @author Pisco
 */
public class Adicionales {
    protected AdicionalTipo tipoadicional;
    protected int cantidad;
    protected double TotalAdicional;

    public Adicionales(int cantidad, double TotalAdicional) {
        this.tipoadicional = tipoadicional;
        this.cantidad = cantidad;
        this.TotalAdicional = TotalAdicional;
    }
    
//getters y setters
    public AdicionalTipo getTipoadicional() {
        return tipoadicional;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public double getTotalAdicional() {
        return TotalAdicional;
    }

    public void setTipoadicional(AdicionalTipo tipoadicional) {
        this.tipoadicional = tipoadicional;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotalAdicional(double TotalAdicional) {
        this.TotalAdicional = TotalAdicional;
    }
    
    public double calculartotal(){
        return TotalAdicional;
    }
    
}
    enum AdicionalTipo{
        comida, bocaditos, bebida, musica, fotografia
}