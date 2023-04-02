package Clase5;

public class itemCarrito {
   private Producto producto;
   private int cantidad;

   public itemCarrito(Producto producto, int cantidad){
    this.producto = producto;
    this.cantidad = cantidad;    
   }
   public int precioTotal(){
    return producto.getPrecio() * this.cantidad;

   }

}
