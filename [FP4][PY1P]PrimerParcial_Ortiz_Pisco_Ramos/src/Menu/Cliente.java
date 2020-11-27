/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Eventos.NumTypes;
import Tramites.Solicitud;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Pisco
 */
public class Cliente extends Usuario{
    private String telefono;
    private String correo;
//constructor de sobrecarga con todos los atributos
    public Cliente(String telefono, String correo, String nombre, String apellido, String contrasenia, char tipo) {
        super(nombre, apellido, contrasenia, tipo);
        this.telefono = telefono;
        this.correo = correo;
        tipo='C';
    }
//getters y setters para poder usarlo en otras clases
    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }  
    

    //Registrar solicitud
    public void ingresaSolicitud() {
        Scanner sc= new Scanner(System.in);
        int a=0;
        LocalDate hoy=LocalDate.now();
        while(a == 0){
            System.out.println("Ingrese el tipo de evento:  [boda/infantil/empresarial]");
            String tip =sc.nextLine();
            if (tip.equals("boda")){
                LocalDate fechamin=hoy.plusMonths(10);
                a=1;
            }else if(tip.equals("infantil")){
                LocalDate fechamin=hoy.plusDays(21);
                a=1;
            }else if(tip.equals("empresarial")){
                LocalDate fechamin=hoy.plusMonths(2);
                a=1;
            }else{
                System.out.println("Ingreso invalido");
            }
        }
        //Usuario ingresa fecha
        
    }
}
