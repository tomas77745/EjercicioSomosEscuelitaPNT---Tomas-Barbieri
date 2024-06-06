package Compra;

import java.util.ArrayList;
import java.util.Collections;

import Productos.Producto;

public class Compra
{
    ArrayList<Producto> productos;

    public Compra()
    {
        this.productos =  new ArrayList<Producto>();
    }

    public void agregarProducto(Producto nuevoProducto)
    {
        this.productos.add(nuevoProducto);
    }

    public Integer tamanioDeLaCompra()
    {
        return productos.size();
    }

    public void imprimirProductoMasCaroYMasBarato()
    {
        Collections.sort(this.productos);

        Producto masCaro = this.productos.get(this.tamanioDeLaCompra() -1);
        Producto masBarato = this.productos.getFirst();

        System.out.println("Producto mas caro: " + masCaro.getNombre());
        System.out.println("Producto mas barato: " + masBarato.getNombre());
    }

    public void imprimirDetalles ()
    {
        for(Producto producto : this.productos)
        {
            System.out.println(producto);
        }

        System.out.println("==============================");

        this.imprimirProductoMasCaroYMasBarato();

    }



}
