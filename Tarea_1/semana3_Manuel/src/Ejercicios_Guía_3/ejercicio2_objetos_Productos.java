
package Ejercicios_Guía_3;

import java.util.Scanner;

public class ejercicio2_objetos_Productos {
    public static void main(String[] args) {
        ejercicio2_objetos_CalculoIVA IVA = new ejercicio2_objetos_CalculoIVA();
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese el costo del articulo: $");
        double precio = Double.parseDouble(leer.nextLine());
        
        System.out.println("\n\nEl IVA es del 13%");
        System.out.println("\nEl precio final del producto con IVA es de: $" + IVA.precioConIVA(precio));
        System.out.println("El precio final del articulo sin IVA es de: $ " + IVA.precioSinIVA(precio));
    }
}
