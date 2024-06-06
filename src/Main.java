
import Compra.Compra;
import Productos.Gaseosa;
import Productos.Producto;
import Productos.Shampoo;
import Productos.Fruta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Compra compra = new Compra();

        Gaseosa cocaColaZero = new Gaseosa("Coca-Cola Zero", 20.0 , 1.5);
        Shampoo shampooSedal = new Shampoo("Shampoo Sedal", 19.0 , "500ml");
        Fruta frutillas = new Fruta("Frutillas", 64.0 , "kilo");

        compra.agregarProducto(cocaColaZero);
        compra.agregarProducto(shampooSedal);
        compra.agregarProducto(frutillas);

        compra.imprimirDetalles();

    }
}