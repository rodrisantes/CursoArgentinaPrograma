package Clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Valentina\\Desktop\\CursoArgentinaPrograma\\src\\main\\java\\Clase7\\productos.txt";
        Carrito carrito = new Carrito();
        carrito.descuento = new DescuentoPorcentajeConTope(10, 22);
        //carrito.descuento = new DescuentoPorcentaje(32)
        //carrito.descuento = new DescuentoMonto(10);

        for (String line : Files.readAllLines(Paths.get(path))) {
            String[] array = line.split(",");
            for (int i = 0; i < array.length; i += 3) {
                String precio = array[i + 1].trim();
                int precioANumero = Integer.parseInt(precio);
                String nombre = array[i + 2];
                Producto producto = new Producto(nombre, precioANumero);
                String cantidad = array[i].trim();
                int cantidadAInteger = Integer.parseInt(cantidad);

                itemCarrito items = new itemCarrito(producto, cantidadAInteger);
                carrito.agregarItem(items);

            }
        }
        System.out.println(carrito.precio());

    }
}