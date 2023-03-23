package ClaseN5.Descuento;

public abstract class Descuento {
    private String nombre;
    private double porcentajeDescuento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public abstract double calcularDescuento(double precio);
}

