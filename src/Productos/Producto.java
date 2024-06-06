package Productos;

public abstract class Producto implements Comparable<Producto>{
    private String nombre;
    private Double precio;

    public String getNombre()
    {
        return this.nombre;
    }

    public double getPrecio()
    {
        return this.precio;
    }

    public Producto(String nombre, Double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        return "Nombre: " + this.nombre + " /// Precio: $" + this.precio;
    }

    @Override
    public int compareTo(Producto productoAComparar)
    {
        return Double.compare(this.precio, productoAComparar.getPrecio());
    }

}
