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
    public Fotografia() {
        tipoadicional= fotografia;
    }

    @Override
    public double calculartotal(){
        this.cantidad=1;
        TotalAdicional=TotalAdicional+500;
        return TotalAdicional;
    }   
}
