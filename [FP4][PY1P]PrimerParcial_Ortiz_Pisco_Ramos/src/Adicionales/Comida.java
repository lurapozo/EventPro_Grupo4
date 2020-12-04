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
    
    public Comida() {
        tipoadicional= comida;
    }

    @Override
    public double calculartotal(){
        TotalAdicional=TotalAdicional+cantidad*15;
        return TotalAdicional;
    }    
}
