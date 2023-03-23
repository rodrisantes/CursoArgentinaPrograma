package ClaseN5.Descuento;

public class DescuentoInvierno extends Descuento {
  

    @Override
    public double calcularDescuento(double precio) {
        double descuento = 0.0;

        if (precio >= 100) {
            descuento = precio * (getPorcentajeDescuento() / 100.0);
        }

        return descuento;
    }
}