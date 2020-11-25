/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author giana
 */
public class archivos {
    
    public String leerTxt(String direccion){
        
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ // se ejecuta el clico mientras tiene datos
                
                temp = temp + bfRead;
            }
            texto = temp;
        }catch(Exception e){ 
            System.out.println("No se encontro archivo");
        }
        return texto;
    }
}
