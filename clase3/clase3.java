package Clase3;

import java.util.Arrays;

public class clase3 {

    public static class Ejercicio1A {

        public static int contarLetra(String cadena, char letra) {

            int contador = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == letra) {
                    contador++;
                }
            }
            return contador;
        }
    }

    public static class Ejercicio1B {
        public static int[] ordenar(int numero1, int numero2, int numero3, String orden) {
            int[] numeros = { numero1, numero2, numero3 };

            if (orden.equals("ascendente")) {
                Arrays.sort(numeros);
            } else if (orden.equals("descendente")) {
                Arrays.sort(numeros);
                int numeroFinal = numeros[0];
                numeros[0] = numeros[2];
                numeros[2] = numeroFinal;
            }
            return numeros;

        }
    }

    public static class Ejercicio1C {

        public static int sumar(int[] array, int numero) {
            int numerosSumados = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > numero) {
                    numerosSumados += array[i];
                }
            }
            return numerosSumados;
        }
    }

    public static class Ejercicio2 {

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

    }

    public static void main(String[] args) {
        System.out.println(Ejercicio2.codificacion("asd asddasd",5));
        // int[] numerosOrdenados = Ejercicio1B.ordenar(9, 4, 5, "ascendente");
        // System.out.println(Arrays.toString(numerosOrdenados));

        // int[] numeros = { 1, 2, 3, 4, 5 };
        // int x = 2;
        // int resultado = Ejercicio1C.sumar(numeros, x);
        // System.out.println(resultado);

        // String cadenaSinEspacios2 = Ejercicio2.codificacion("Los ratones mas bellos
        // del universo", 1);
        // System.out.println(cadenaSinEspacios2);

    }

}
