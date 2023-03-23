package ClaseN5.Descuento;

public class DescuentoNavidad extends Descuento {

   
    @Override
    public double calcularDescuento(double precio) {
        return precio * (getPorcentajeDescuento() / 100.0);
    }
}