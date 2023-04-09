package Clase7;

public class DescuentoPorcentajeConTope extends Descuento {
    public int porcentaje;
    public int tope;

    public DescuentoPorcentajeConTope(int porcentaje, int tope) {
        this.porcentaje = porcentaje;
        this.tope = tope;
    }

    @Override
    public int calcularDescuento(int total) {
        if (porcentaje > tope) {
            return total - total * tope / 100;
        } else {
            return total - (total * porcentaje) / 100;
        }
    }
}
