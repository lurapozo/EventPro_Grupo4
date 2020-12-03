/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;
import static Adicionales.AdicionalTipo.fotografia;
/**
 *
 * @author luisr
 */
public class Fotografia extends Adicionales{
    private AdicionalTipo tipoadicional= fotografia;
    
    public Fotografia( int cantidad, double TotalAdicional) {
        super(cantidad, TotalAdicional);
    }

    @Override
    public double calculartotal(int cantidad){
        this.cantidad=1;
        TotalAdicional=500;
        return TotalAdicional;
    }   
}
