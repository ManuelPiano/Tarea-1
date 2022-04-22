
package Ejercicios_Guia2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        double Vehiculo_USA, flete, seguro;
        System.out.println("Ingrese el valor del vehiculo en USA:");
        Vehiculo_USA = leer.nextDouble();
        System.out.println("Ingrese el valor del flete:");
        flete = leer.nextDouble();
        System.out.println("Ingrese el valor del seguro:");
        seguro = leer.nextDouble();
        
        double montoDAI = ejercicio2.DAI(Vehiculo_USA, flete, seguro);
        
        System.out.println("------------------------------------------");
        System.out.println("Valor del vehiculo en USA es: $" + formato.format(Vehiculo_USA));
        System.out.println("Depreciacion: 10%.");
        System.out.println("Valor del flete: " + formato.format(flete));
        System.out.println("Valor del seguro: " + formato.format(seguro));
        System.out.println("costo del DAI: $" + formato.format(montoDAI));
        
    }
    
    public static double depreciacion(double Vehiculo_USA){
        double resultado;
        resultado = Vehiculo_USA * 0.1;
        return resultado;
    }
    
    public static double DAI(double Vehiculo_USA, double flete, double seguro){
        double resultado;
        resultado = (Vehiculo_USA - ejercicio2.depreciacion(Vehiculo_USA - flete - seguro) * 0.25);
        return resultado;
    }
}
