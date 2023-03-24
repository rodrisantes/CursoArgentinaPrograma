package Clase4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class clase4E3 {

    public static void codificacion(String ArchivoEntrada, String ArchivoSalida, int cantidadDeDesplazamientos, boolean codificacion) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        try (BufferedReader br = new BufferedReader(new FileReader(ArchivoEntrada));
                BufferedWriter bw = new BufferedWriter(new FileWriter(ArchivoSalida))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String resultado = "";
                for (char c : linea.toLowerCase().toCharArray()) {
                    // System.out.println(c);
                    int posicion = abecedario.indexOf(c);
                    System.out.println(posicion);
                        int nuevaPosicion = posicion
                                + (codificacion ? cantidadDeDesplazamientos : -cantidadDeDesplazamientos);
                        resultado += abecedario.charAt(nuevaPosicion);
                  
                }
                bw.write(resultado);
            }
            System.out.println("Terminado correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {

        // String ruta = "C:\\Users\\Valentina\\Desktop\\CursoArgentinaPrograma\\Clase4\\textoCodOrDecod.txt";
        // String salida = "C:\\Users\\Valentina\\Desktop\\CursoArgentinaPrograma\\Clase4\\textoSalida.txt";
       
        // codificacion(ruta, salida, 3, true);

    }

}
