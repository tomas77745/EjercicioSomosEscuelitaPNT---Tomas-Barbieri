package Productos;

public class Fruta extends Producto{

    private String unidadDeVenta;

    public Fruta (String nombre, Double precio, String unidadDeVenta)
    {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;

    }

    @Override
    public String toString()
    {
        return super.toString() + " /// Unidad de venta: " + this.unidadDeVenta;

    }
}
