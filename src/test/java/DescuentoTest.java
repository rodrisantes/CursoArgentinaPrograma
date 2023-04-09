import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import Clase7.Descuento;
import Clase7.DescuentoMonto;
import Clase7.DescuentoPorcentaje;
import Clase7.DescuentoPorcentajeConTope;
import Clase7.Producto;
import Clase7.itemCarrito;
import Clase7.Carrito;


public class DescuentoTest {
    private Producto producto1;
    private Producto producto2;
    private itemCarrito itemCarrito;
    private itemCarrito itemCarrito2;
    private Carrito carrito;


    @BeforeEach
    public void setUp() {
        producto1 = new Producto("Producto 1", 100);
        producto2 = new Producto("Producto 2", 200);
        itemCarrito = new itemCarrito(producto1, 1);
        itemCarrito2 = new itemCarrito(producto2, 1);
        carrito = new Carrito();
        carrito.agregarItem(itemCarrito);
        carrito.agregarItem(itemCarrito2);
    }

    @Test
    public void testDescuentoMonto() {
        carrito.descuento =  new DescuentoMonto(50);
        assertEquals(250, carrito.precio(), 0);
    }

    @Test
    public void testDescuentoPorcentaje() {
        carrito.descuento = new DescuentoPorcentaje(20);
        assertEquals(240, carrito.precio(), 0);
    }

    @Test
    public void testDescuentoPorcentajeConTope() {
        carrito.descuento = new DescuentoPorcentajeConTope(10, 20);
        assertEquals(270, carrito.precio(), 0);
    }
}
