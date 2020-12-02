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
    private double totalpagar;
    private EstadoP estadopago;
    private LocalDate fecha1;
    private LocalDate fecha2;
    
    //Constructor
    public OrdenPago(int codigoevento, int codigotransaccion, double totalpagar, EstadoP estadopago, LocalDate fecha1){    
        this.codigoevento = codigoevento;
        this.codigopago = codigopago;
        this.totalpagar = totalpagar;
        this.estadopago = estadopago;
        this.fecha1 = fecha1;
    }
//FALTA METODO PARA CREAR FECHA 2!!!!!!!!!!!!!
    //generadores de codigos
    private int generarcodigopago() {
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
    public enum EstadoP{
        PagoPendiente, Pagado
    }
}
