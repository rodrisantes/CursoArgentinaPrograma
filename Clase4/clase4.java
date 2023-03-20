package Clase4;

import java.util.Arrays;
import java.util.Scanner;

public class clase4 {

    public static int[] ejercicio1A(int numero1, int numero2, int numero3, char orden) {
        int[] numeros = { numero1, numero2, numero3 };

        if (orden == 'a') {
            Arrays.sort(numeros);
        } else if (orden == 'b') {
            Arrays.sort(numeros);
            int numeroFinal = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = numeroFinal;
        }
        
        return numeros;
    }

    public static int[] ejercicio1B() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus tres numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Ingrese 'a' para ordenar ascendentemente o 'd' para ordenar descendentemente:");
        String letra = sc.next();

        int[] numeros = { num1, num2, num3 };

        if (letra.equals("a")) {
            Arrays.sort(numeros);
        } else if (letra.equals("d")) {
            Arrays.sort(numeros);
            int numeroFinal = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = numeroFinal;
        } else {
            System.out.println("letra invalida");
        }
        return numeros;
    }



    public static void main(String[] args) {
        int[] ordenado = ejercicio1A(162, 323, 54, 'd');
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println(ordenado[i]);
        }
        int[] numerosOrdenados = ejercicio1B();
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println(numerosOrdenados[i]);
        }
            if(args.length == 0 ){
            ejercicio1B();}

    }
      

}
