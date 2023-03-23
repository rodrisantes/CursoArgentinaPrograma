package Clase4;

import java.nio.file.Files;
import java.nio.file.Paths;

public class clase4E2 {

    public static void archivoSumarMultiplicar(String Path, String operacion) {

        int Suma = 0;
        int Multiplicacion = 1;

        String array[] = new String[0];

        try {
            for (String linea : Files.readAllLines(Paths.get(Path))) {
                array = linea.split(" ");

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        for (int i = 0; i < array.length; i++) {
            if (operacion.equals("Suma")) {
                Suma = Suma + Integer.parseInt(array[i]);
            } else if (operacion.equals("Multiplicar")) {
                Multiplicacion *= Integer.parseInt(array[i]);

            }
        }
        if (operacion.equals("Suma")) {
            System.out.println(Suma);
        } else {
            System.out.println(Multiplicacion);
        }

    }

    public static void main(String[] args) {
         archivoSumarMultiplicar(args[0], args[1]);
    }
}
