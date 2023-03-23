package ClaseN5;

public class Producto {
    private String item;
    private int precio_item;
    private int cantidad_item;

    public void setItems(int cantidad_item, int precio_item, String item){
        this.item = item;
        this.precio_item = precio_item;
        this.cantidad_item = cantidad_item;
        }
    public String getItem() {
        return this.item;
    }
    public int getPrecioItem(){
        return this.precio_item;
    }
    public int getCantidadItem(){
        return this.cantidad_item;
    }
  

}
