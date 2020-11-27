/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventos;

/**
 *
 * @author Pisco
 */
class Adicionales {
    private AdicionalTipo tipoadicional;
    private int cantidad;
    private double TotalAdicional;
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
    
    public double calculartotal(int cantidad){
        this.cantidad=cantidad;
        return TotalAdicional;
    }
}
