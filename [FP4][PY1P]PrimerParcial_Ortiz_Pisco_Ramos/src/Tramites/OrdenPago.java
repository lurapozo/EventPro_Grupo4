/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tramites;
import Eventos.NumTypes;
import java.time.LocalDate;
import java.util.Random;
/**
 *
 * @author Pisco
 */
public class OrdenPago {
    private int codigoevento;
    private int codigopago;
    private int codigotransaccion;
    private float totalpagar;
    // Revisar uso de numtypes para inicalizar como tipo de var
    //private EstadoP estadopago;
    private LocalDate fecha1;
    private LocalDate fecha2;
    //generadores de codigos
    private int generarcodigopago(){
    Random r = new Random();
    int randomNumber = r.nextInt(1001);
    return randomNumber;
    }
    private int generarcodigotransaccion(){
    Random r = new Random();
    int randomNumber = r.nextInt(1000000000);
    return randomNumber;
    }
    //getters y setters
    public void setcodigopago(){
        codigopago=generarcodigopago();
    }
    public void setcodigotransaccion(){
        codigotransaccion=generarcodigotransaccion();
    }
    public int getcodigopago(){
        return codigopago;
    }
    public int getcodigotransaccion(){
        return codigotransaccion;
    }
}
