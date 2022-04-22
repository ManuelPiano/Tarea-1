
package Ejercicios_Guía_3;

import java.util.Scanner;

public class ejercicio1_herenciaEncapsulamiento_Principal {
    public static void main(String[] args) {
        ejercicio1_herenciaEncapsulamiento_Empleado emp = new ejercicio1_herenciaEncapsulamiento_Empleado();
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Escriba los nombres del contribuyente:");
        emp.setNombres(leer.nextLine());
        System.out.println("Escriba los apellidos del contribuyente:");
        emp.setApellidos(leer.nextLine());
        System.out.println("Escriba el numero de NIT del contribuyente:");
        emp.setNit(leer.nextLine());
        System.out.println("Escriba la direccion:");
        emp.setDireccion(leer.nextLine());
        System.out.println("Escriba el salario:");
        System.out.print("$");
        emp.setSalario_devengado(Double.parseDouble(leer.nextLine()));
        System.out.println("Bandera de Empleado:");
        System.out.println("1. Activo \t2.Inactivo");
        System.out.print("digite su seleccion: ");
        opcion = Integer.parseInt(leer.nextLine());
        while((opcion != 1) && (opcion != 2)){
            System.out.println("\nOpción inválida\n");
            System.out.println("Bandera de Empleado:");
            System.out.println("1. Activo \t2.Inactivo");
            System.out.print("Su opción: ");
            opcion = Integer.parseInt(leer.nextLine());
        }
        if(opcion == 1){
            emp.setEstado("Activo");
        }else if(opcion == 2){
            emp.setEstado("Inactivo");
        }
        
        System.out.println(emp.informacionContribuyente());
        
        
    }
}
