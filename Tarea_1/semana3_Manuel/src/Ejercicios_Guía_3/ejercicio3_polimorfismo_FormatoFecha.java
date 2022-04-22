
package Ejercicios_Guía_3;

import java.util.Scanner;

public class ejercicio3_polimorfismo_FormatoFecha {
    
    public void FormatoFecha(int dia, int mes, int año){
        String resultado = String.valueOf(dia + "/" +mes + "/" + año);
        System.out.println(resultado);
        
    }
    public String FormatoFecha(String dia, String mes, String año){
        
        String resultado = String.valueOf(dia + "-" + mes + "-" + año);
        return resultado;
    }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ejercicio3_polimorfismo_FormatoFecha formatoFecha = new ejercicio3_polimorfismo_FormatoFecha();
        
        System.out.println("digite el numero a convertir a fecha");
        formatoFecha.FormatoFecha(10,06,2012);
        System.out.println(formatoFecha.FormatoFecha("10", "06", "2012"));
    }
}

//3-. Crear la clase FormatoFecha para probar el POLIMORFISMO. La clase deberá de tener definidos dos métodos que
//reciban una fecha sin guiones ni plecas en formato String. Ejemplo 10062012.
//a) El primer método deberá de imprimir la fecha con guiones. Ejemplo: 10-06-2012.
//b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo: 10/06/2012