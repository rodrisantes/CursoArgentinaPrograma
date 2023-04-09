package Clase7;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
    
    private List<itemCarrito> items;
    public Descuento descuento;

    public Carrito() {
        items = new ArrayList<>();
    }
    
    public void agregarItem(itemCarrito item) {
        items.add(item);
    }

    public int precio(){
        int total = items.stream().mapToInt(itemCarrito::precioTotal).sum();
            if (descuento != null) {
        total = descuento.calcularDescuento(total);
    }
        return total;

    }

    public void agregarProducto(Producto producto1) {
    }
}
