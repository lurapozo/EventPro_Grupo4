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
    
    public Bocaditos() {
        tipoadicional= bocaditos;
    }

    @Override
    public double calculartotal(){
        if(cantidad<=150){
            TotalAdicional= TotalAdicional + 0.25*cantidad;
            return TotalAdicional;
        }else{
            TotalAdicional=TotalAdicional+0.1*cantidad;
            return TotalAdicional;
        }
    }    
}
