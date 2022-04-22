
package Ejercicios_Guia2;


import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double salario_base, comision, renta;
        int cant_pc;
        String nombrevendedor = "Manuel Alvarado";
        
        Scanner leer = new Scanner(System.in);
        salario_base = 300;
        comision = 50;
        renta = 0.1;
        
        System.out.println("Cuantas pc ha vendido");
        cant_pc = leer.nextInt();
        System.out.println("--------------------------------------------");
        System.out.println("Nombre del vendedor: " + nombrevendedor);
        double salarioDevengado = ejercicio4.calculoSalarioDevengado(salario_base, cant_pc, comision);
        System.out.println("Salario : $" + salarioDevengado);
        calculoRenta(renta, salario_base, cant_pc, comision);
        
        
        
    }
    
    public static void calculoRenta( double renta, double salario_base, int cant_comp, double comision){
        double resultado;
        resultado = ejercicio4.calculoSalarioDevengado(salario_base, cant_comp, comision) * renta;
        System.out.println("La retención de la renta es de: $" + resultado);
    }
    
    public static double calculoSalarioDevengado(double salario_base, int cant_comp, double comision){
        double resultado;
        resultado = salario_base + (comision * cant_comp);
        return resultado;
    }
}
