package Clase5;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
    
    private List<itemCarrito> items;
        
    public Carrito() {
        items = new ArrayList<>();
    }
    
    public void agregarItem(itemCarrito item) {
        items.add(item);
    }

    public int precio(){
        int total = items.stream().mapToInt(itemCarrito::precioTotal).sum();
        return total;

    }
}
