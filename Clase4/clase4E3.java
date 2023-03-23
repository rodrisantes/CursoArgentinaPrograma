package Clase4;

import java.nio.file.Files;
import java.nio.file.Paths;

public class clase4E3 {

    public static String codificacion(String cadena, int cantidadDeDesplazamientos) {
        String palabraFinal = "";
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        String[] abcededarioSplit = abecedario.split("");
        String[] cadenaConEspacios = cadena.split(" ");
        String cadenaSinEspacios = "";
        for (int i = 0; i < cadenaConEspacios.length; i++) {
            cadenaSinEspacios += cadenaConEspacios[i];
        }
        String[] cadenaSinEspaciosSeparada = cadenaSinEspacios.split("");

        for (int i = 0; i < cadenaSinEspaciosSeparada.length; i++) {
            for (int j = 0; j < abcededarioSplit.length; j++) {
                if (cadenaSinEspaciosSeparada[i].toLowerCase().equals(abcededarioSplit[j])) {

                    palabraFinal += abcededarioSplit[j + cantidadDeDesplazamientos];
                }

            }

        }

        return palabraFinal;

    }

    public static void main(String[] args) {
        String operacion = args[0];
        int desplazamiento = Integer.parseInt(args[1]);
        String archivoEntrada = args[2];
        String archivoSalida = args[3];

        String ruta = "C:\\Users\\Valentina\\Desktop\\CursoArgentinaPrograma\\Clase4\\texto.txt";
        // String rutaLeida = Paths.get(ruta);
        // String ruta2 = Files.readAllLines(rutaLeida);

        String salida = codificacion(ruta, 3);

        System.out.println(salida);

    }

}
