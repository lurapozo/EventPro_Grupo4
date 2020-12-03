/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.ArrayList;
import static trabajoconarchivos.ManejoArchivos.LeeFichero;

/**
 *
 * @author Pisco
 */
public class Usuario{
    protected String nombre;
    protected String apellido;
    protected String contrasenia;
    protected char tipo;
//constructor de sobrecarga con todos los atributos
    public Usuario(String nombre, String apellido, String contrasenia, char tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }
//getters y setters para poder usarlo en otras clases no hijas
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public char getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
    

}
