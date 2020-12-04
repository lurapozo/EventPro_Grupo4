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
    Integer[] CantBebidas = new Integer[] {0, 0, 0, 0};//Posicion 0 es whisky, 1 es Vodka, 2 es Cerveza, 3 Refrescos
    public Bebida() {
        tipoadicional= bebida;
        Integer[] CantBebidas={0,0,0,0};
    }
    public void setWhisky(int cant) {
        this.CantBebidas[0] = cant;
    }
    public void setVodka(int cant) {
        this.CantBebidas[1] = cant;
    }
    public void setCerveza(int cant) {
        this.CantBebidas[2] = cant;
    }
    public void setRefrescos(int cant) {
        this.CantBebidas[3] = cant;
    }
    
    @Override
    public double calculartotal(){
        TotalAdicional=TotalAdicional+(CantBebidas[0]*50)+(CantBebidas[1]*25)+(CantBebidas[2]*3)+(CantBebidas[3]*1);
        return TotalAdicional;
    } 
}
