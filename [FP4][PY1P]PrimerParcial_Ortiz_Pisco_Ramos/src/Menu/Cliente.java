/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Tramites.Solicitud;
import java.time.LocalDate;

/**
 *
 * @author Pisco
 */
public class Cliente extends Usuario{
    private String telefono;
    private String correo;
//constructor de sobrecarga con todos los atributos
    public Cliente(String telefono, String correo, String nombre, String apellido, String contrasenia, Boolean tipo) {
        super(nombre, apellido, contrasenia, tipo);
        this.telefono = telefono;
        this.correo = correo;
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
    
    
    //public void Solicitud(cliente, String planificador, String estadoevento, LocalDate fechasolicitud, LocalDate fechaevento){
      //  Solicitud solicitud1 = new Solicitud;
        
    //}
    
    
}
