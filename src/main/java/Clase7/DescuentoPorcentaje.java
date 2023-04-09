package Clase7;
public class DescuentoPorcentaje extends Descuento {
    private int porcentaje;

    public DescuentoPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int calcularDescuento(int total) {
        return total - total * porcentaje / 100;
    }
}
