
package Ejercicios_Guia2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;



public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        String nombre;
        double salario_mensual, desc_llegadas_tardias, desc_renta;
        int minutos_tarde;
        
        System.out.println("Ingrese el nombre del empleado:");
        nombre = leer.nextLine();
        System.out.println("Ingrese el salario mensual de " + nombre);
        salario_mensual = leer.nextDouble();
        System.out.println("Cuantos minutos llego tarde durante el mes  " + nombre);
        minutos_tarde = leer.nextInt();
        
        desc_llegadas_tardias = ejercicio5.descuento_llegadas_tardias(salario_mensual, minutos_tarde);
        double n_salario = salario_mensual - desc_llegadas_tardias;
        desc_renta = ejercicio5.calculoRenta(n_salario);
        
        System.out.println("------------------------------------------");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("De los $" + formato.format(salario_mensual) + " se le realizara un descuento de $" + formato.format(desc_llegadas_tardias) + " por los " + minutos_tarde + " minutos tarde.");
        System.out.println("Salario con descuento por  llegada tarde en el mes: $" + formato.format(n_salario));
        System.out.println("Salario final con los descuentos de llegada tarde y de la renta: $" + formato.format(desc_renta));
        System.out.println("Se responsable y llega siempre temprano :D");
    }
    
    public static double descuento_llegadas_tardias(double salario_mensual, int minutos_tarde){
        double resultado;
        resultado = ((((salario_mensual/30)/8)/60)*minutos_tarde);
        return resultado;
    }
    
    public static double calculoRenta(double n_salario){
        double resultado;
        resultado = n_salario - (n_salario * 0.1);
        return resultado;
    }
}
