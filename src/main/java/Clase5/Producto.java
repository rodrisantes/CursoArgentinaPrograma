package Clase5;

public class Producto {
    private String item;
    private int itemPrecio;

    public Producto(String item, int itemPrecio) {
        this.item = item;
        this.itemPrecio = itemPrecio;
    }

    public String getItem() {
        return this.item;
    }

    public int getPrecio() {
        return this.itemPrecio;
    }

}
