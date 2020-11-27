/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.ArrayList;

/**
 *
 * @author Pisco
 */
public class Planificador extends Usuario{
//constructor de sobrecarga con todos los atributos
    ArrayList<String> eventosdeplanificador = new ArrayList<String>();
    
    public Planificador(String nombre, String apellido, String contrasenia, char tipo) {
        super(nombre, apellido, contrasenia, tipo);
        tipo='P';
    }
    
}
