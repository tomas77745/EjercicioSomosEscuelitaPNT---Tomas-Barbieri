package Productos;

public class Shampoo extends Producto {

    private String contenido;

    public Shampoo (String nombre, Double precio, String contenido)
    {
        super(nombre, precio);
        this.contenido = contenido;

    }

    @Override
    public String toString()
    {
       return super.toString() + " /// Contenido: " + contenido;

    }


}
