/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;
import static Adicionales.AdicionalTipo.bebida;
import java.util.List;
/**
 *
 * @author luisr
 */
public class Bebida extends Adicionales{
    private AdicionalTipo tipoadicional= bebida;
    Integer[] CantBebidas = new Integer[] {0, 0, 0, 0};//Posicion 0 es whisky, 1 es Vodka, 2 es Cerveza, 3 Refrescos
    public Bebida(int cantidad, double TotalAdicional) {
        super(cantidad, TotalAdicional);
    }
    //crear enum de bebidas y trata de ver la forma de leer varios tipos de bebidas con su respectiva cantidad. Pienso en crear una lista para ello

    @Override
    public double calculartotal(){
        this.cantidad=(CantBebidas[0]*50)+(CantBebidas[1]*25)+(CantBebidas[2]*3)+(CantBebidas[3]*1);
        return TotalAdicional;
    } 
}
