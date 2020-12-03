/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;
import static Adicionales.AdicionalTipo.bebida;
/**
 *
 * @author luisr
 */
public class Bebida extends Adicionales{
    private AdicionalTipo tipoadicional= bebida;
    
    public Bebida(int cantidad, double TotalAdicional) {
        super(cantidad, TotalAdicional);
    }
    //crear enum de bebidas y trata de ver la forma de leer varios tipos de bebidas con su respectiva cantidad. Pienso en crear una lista para ello

    @Override
    public double calculartotal(int cantidad){
        this.cantidad=cantidad;
        return TotalAdicional;
    } 
}
