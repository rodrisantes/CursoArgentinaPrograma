
package ClaseN5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static int precioTotal(String Path) {

        List<Producto> productos = new ArrayList<>();
        try {
            String[] lines = Files.readAllLines(Paths.get(Path)).toArray(new String[0]);
            for (String line : lines) {
                String[] array = line.split(",");
                for (int i = 0; i < array.length; i += 3) {
                    Producto producto = new Producto();
                    producto.setItems(Integer.parseInt(array[i]), Integer.parseInt(array[i + 1]), array[i + 2]);
                    productos.add(producto);
                }
            }

        } catch (IOException e) {
            System.out.println("No se puede leer el archivo" );
        }

        int[] Precios = new int[3];
        for (Producto producto : productos) {
            int precio = producto.getPrecioItem();
            for (int i = 0; i < Precios.length; i++) {
                Precios[i] = precio;
            }

        }
        return Carrito.precio(Precios);
    }
  

    public static void main(String[] args) {
        String path = "C:\\Users\\Valentina\\Desktop\\CursoArgentinaPrograma\\ClaseN5\\lista.txt";
        System.out.println(precioTotal(path));
}

}