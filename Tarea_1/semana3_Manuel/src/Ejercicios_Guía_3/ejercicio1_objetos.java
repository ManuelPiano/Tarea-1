
package Ejercicios_Guía_3;

import java.util.Scanner;

public class ejercicio1_objetos {
    String numeroCasa;
    int numeroPasaje;
    String nombreCalle;

    public ejercicio1_objetos() {
        
    }
    
    public String info(){
        String resultado = "";
        resultado  = "Casa Nueva\n";
        resultado += "Número de casa: " + this.getNumeroCasa() + "\n";
        resultado += "Número del pasaje: " + this.getNumeroPasaje() + "\n";
        resultado += "Nombre de la calle: " + this.getNombreCalle() + "\n";
        
        return resultado;
    }

    public ejercicio1_objetos(String numeroCasa, int numeroPasaje, String nombreCalle) {
        this.numeroCasa = numeroCasa;
        this.numeroPasaje = numeroPasaje;
        this.nombreCalle = nombreCalle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getNumeroPasaje() {
        return numeroPasaje;
    }

    public void setNumeroPasaje(int numeroPasaje) {
        this.numeroPasaje = numeroPasaje;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }
    
    
    
    public static void main(String[] args) {
        ejercicio1_objetos casa = new ejercicio1_objetos();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de casa:");
        casa.setNumeroCasa(leer.nextLine().toUpperCase());
        System.out.println("Ingree el numero de pasaje:");
        casa.setNumeroPasaje(Integer.parseInt(leer.nextLine()));
        System.out.println("Ingrese el nombre de la calle:");
        casa.setNombreCalle(leer.nextLine());
        
        String datos = casa.info();
        
        System.out.println(datos);
    }
}
