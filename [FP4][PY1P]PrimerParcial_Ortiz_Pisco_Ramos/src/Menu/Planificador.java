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
public class Planificador extends Usuario{
//constructor de sobrecarga con todos los atributos
    ArrayList<String> eventosdeplanificador = new ArrayList<String>();
    
    public Planificador(String nombre, String apellido, String contrasenia, char tipo) {
        super(nombre, apellido, contrasenia, tipo);
        tipo='P';
    }
    
    //COnsultar eventos pendientes
    public void consultPendientes(String nombrearchivo){
        ArrayList<String> lista = LeeFichero(nombrearchivo);
        int numero=1;
        for (int i=0; i<lista.size(); i++){
            String a1=lista.get(i);
            String[] a2=a1.split(",");
            if (a2[-1]=="pendiente"){
                System.out.println(numero+".- "+a2[0]+" - "+a2[4]);
            }
        }        
    }
}
