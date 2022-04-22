
package Ejercicios_Guia2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        double precio_pc;
        
        System.out.println("Digite el precio de la computadora?");
        precio_pc = leer.nextDouble();
        
        calculoIVA(precio_pc);
        double preciofinal = descuento(precio_pc);
        System.out.println("El precio final con IVA agregado y el %15 de descuento es $" + formato.format(preciofinal));
        
    }
    public static double calculoIVA(double precio_pc){
        double resultado;
        resultado = precio_pc + (precio_pc * 0.13);
        return resultado;
    }
    public static double descuento(double precio_pc){
        double resultado;
        resultado = ejercicio1.calculoIVA(precio_pc) - (ejercicio1.calculoIVA(precio_pc) * 0.15);
        return resultado;
    }
}
