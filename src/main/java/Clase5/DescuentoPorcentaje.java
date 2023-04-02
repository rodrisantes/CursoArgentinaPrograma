package Clase5;

public class DescuentoPorcentaje extends Descuento {
    private int porcentaje;

    public DescuentoPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int calcularDescuento(int total) {
        return total * porcentaje / 100;
    }
}
