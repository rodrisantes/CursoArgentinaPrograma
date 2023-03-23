package ClaseN5;

public class Carrito {

    public static int precio(int[]args) {
        int resultado = 0;
        for (int i = 0; i < args.length; i++) {
            resultado += args[i];
        }
        return resultado;

    }

}