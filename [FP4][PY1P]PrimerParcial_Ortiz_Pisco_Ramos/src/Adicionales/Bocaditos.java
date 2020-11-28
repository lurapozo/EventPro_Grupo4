/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;
import static Adicionales.AdicionalTipo.bocaditos;
/**
 *
 * @author luisr
 */
public class Bocaditos extends Adicionales{
    private AdicionalTipo tipoadicional= bocaditos;
    
    public Bocaditos(int cantidad, double TotalAdicional) {
        super(cantidad, TotalAdicional);
    }
    @Override
    public double calculartotal(int cantidad){
        this.cantidad=cantidad;
        if(cantidad<=150){
            TotalAdicional= 0.25*cantidad;
            return TotalAdicional;
        }else{
            TotalAdicional=0.1*cantidad;
            return TotalAdicional;
        }
    }    
}
