package Clase4;

import java.util.Arrays;
import java.util.Scanner;

public class clase4{

    public static int[] ejercicio1A(int numero1, int numero2, int numero3, String orden) {
        int[] numeros = { numero1, numero2, numero3 };

        if (orden.equals("a")) {
            Arrays.sort(numeros);
        } else if (orden.equals("b")) {
            Arrays.sort(numeros);
            int numeroFinal = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = numeroFinal;
        } else {
            System.out.println("la letra es invalida");
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
        int[] ordenados = ejercicio1A(num1, num2, num3, letra);
        return ordenados;
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        String orden;
        Scanner scanner = new Scanner(System.in);
        if (args.length == 4) {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            num3 = Integer.parseInt(args[2]);
            orden = args[3];
        } else {
            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextInt();
            System.out.print("Ingrese el tercer número: ");
            num3 = scanner.nextInt();
            System.out.print("Ingrese 'a' o 'd': ");
            orden = scanner.next();
        }

        int[] numeros = { num1, num2, num3 };

        if (orden.equals("a")) {
            Arrays.sort(numeros);
        } else if (orden.equals("d")) {
            Arrays.sort(numeros);
            int temp = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = temp;
        } else {
            System.out.println("La letra es invalida");
            return;
        }

        System.out.println(Arrays.toString(numeros));
    }

}
