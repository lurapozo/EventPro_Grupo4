 package trabajoconarchivos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Verónica
 */
/*
public class ManejoArchivos {
    ArrayList<String> lineas;
    ArrayList<String> nombres;
    ArrayList<String> apellidos;
    ArrayList<String> usuarios;
    ArrayList<String> contrasenias;
    ArrayList<String> tipo;
    
    public static ArrayList<String> LeeFichero(String nombrearchivo) {
        ArrayList<String> lineas = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();
        ArrayList<String> usuarios = new ArrayList<>();
        ArrayList<String> contrasenias = new ArrayList<>();
        ArrayList<String> tipo = new ArrayList<>();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(nombrearchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                
                // agregamos los nombres a la lista nombres
                String[] partes = linea.split(";");
                for(int i=0; i<partes.length; i++){
                    if (i==0) {
                        System.out.println(partes[i]);
                        nombres.add(partes[i]);
                    }
                    else if (i==1) {
                        System.out.println(partes[i]);
                        apellidos.add(partes[i]);
                    }
                    else if (i==2) {
                        System.out.println(partes[i]);
                        usuarios.add(partes[i]);

                    }
                    else if (i==3) {
                        System.out.println(partes[i]);
                        contrasenias.add(partes[i]);
                        
                    }
                    else if (i==4) {
                        System.out.println(partes[i]);
                        tipo.add(partes[i]);
                        
                    }
                    
                }
                
                // agregamos los apellidos
                System.out.println(linea);
                lineas.add(linea);
                
            }
            System.out.println(nombres);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lineas;
    }
    
    
 
        //verificar si existen los datos dentro de las listas
            

    public static void EscribirArchivo(String nombreArchivo, String linea) {

        FileWriter fichero = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(nombreArchivo,true);
            bw = new BufferedWriter(fichero);
            bw.write(linea+"\n");
            System.out.println("ksdsdlsd");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    //fichero.close();
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public ManejoArchivos(String usuario,String contrasenia){
        int indiceusario = usuarios.indexOf(usuario);
        if (indiceusario != -1) {
            System.out.println("Usuario correcto");
        }
        else{
            System.out.println("Usuario incorrecto");
        }
        int indicecontrasenia = contrasenias.indexOf(contrasenia);
        if (indicecontrasenia != -1) {
            System.out.println("Contraseña correcta");
        }
        else{
            System.out.println("Contraseña incorrecta");
        }
    }
   
}
*/

public class ManejoArchivos {

    public static ArrayList<String> LeeFichero(String nombrearchivo) {
        ArrayList<String> lineas = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(nombrearchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                lineas.add(linea);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lineas;
    }

    public static void EscribirArchivo(String nombreArchivo, String linea) {

        FileWriter fichero = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(nombreArchivo,true);
            bw = new BufferedWriter(fichero);
            bw.write(linea+"\n");
            System.out.println("ksdsdlsd");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    //fichero.close();
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
