package Productos;

public class Gaseosa extends Producto {

    public Double litros;

    public Gaseosa (String nombre, Double precio, Double litros)
    {
        super(nombre, precio);
        this.litros = litros;

    }

    @Override
    public String toString()
    {
        return super.toString() + " /// Litros: " + this.litros;

    }

}
