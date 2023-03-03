package clase3;

public class clase3 {

    public static class Ejercicio1 {

        public static int contarLetra(String cadena, char letra) {

            int contador = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == letra) {
                    contador++;
                }
            }
            return contador;
        }

        // public static void main(String[] args) {
        // int numero = Ejercicio1.contarLetra("perro", 'e');
        // System.out.println(numero);

        // }
    }

    public static class Ejercicio2 {
        public static int[] ordenar(int numero1, int numero2, int numero3) {
            int[] numeros = { numero1, numero2, numero3 };

            return numeros;

        }

        public static void main(String[] args) {
            int[] numero = Ejercicio2.ordenar(1, 3, 4);

            for (int i = 0; i < numero.length; i++) {
                System.out.print(numero[i] + " ");
            }
            System.out.println();
        }

    }

}
