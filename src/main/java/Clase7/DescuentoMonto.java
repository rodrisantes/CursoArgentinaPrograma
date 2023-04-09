package Clase7;

public class DescuentoMonto extends Descuento {
    private int monto;

    public DescuentoMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int calcularDescuento(int total) {
        return total - monto;
    }
}
