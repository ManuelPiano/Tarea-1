
package Ejercicios_Guía_3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio2_herenciaEncapsulamiento_FacturaElectrica {
    private int n_cuenta, lectura_anterior_m, lectura_actual_m, multi;
    private double consumo_mensual, consumo_dia, valorFactura;
    
    NumberFormat formato = new DecimalFormat("#.##");

    public int getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(int n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public int getLectura_anterior_m() {
        return lectura_anterior_m;
    }

    public void setLectura_anterior_m(int lectura_anterior_m) {
        this.lectura_anterior_m = lectura_anterior_m;
    }

    public int getLectura_actual_m() {
        return lectura_actual_m;
    }

    public void setLectura_actual_m(int lectura_actual_m) {
        this.lectura_actual_m = lectura_actual_m;
    }

    public int getMulti() {
        return multi;
    }

    public double getConsumo_mensual() {
        this.consumo_mensual = this.Calculo_Consumo_Mes();
        return consumo_mensual;
    }

    public double getConsumo_dia() {
        this.consumo_dia = this.Calculo_Consumo_Diario();
        return consumo_dia;
    }

    public double getValorFactura() {
        this.valorFactura = this.ValorFactura();
        return valorFactura;
    }
    
    public double Calculo_Consumo_Mes(){
        double resultado;
        resultado = (this.getLectura_actual_m() - this.getLectura_anterior_m()) * this.getMulti();
        return resultado;
    }
    
    public double Calculo_Consumo_Diario(){
        double resultado;
        resultado = this.Calculo_Consumo_Mes() / 30;
        return resultado;
    }
    
    public double ValorFactura(){
        double resultado;
        resultado = this.Calculo_Consumo_Mes() * 0.20;
        return resultado;
    }
    
    public String info(){
        String resultado;
        resultado = "\nNumero de Cuenta: " + this.getN_cuenta();
        resultado += "\nLectura actual del medidor: " + this.getLectura_actual_m() + " kWh";
        resultado += "\nLectura anterior del medidor: " + this.getLectura_anterior_m() + " kWh";
        resultado += "\nValor del multiplicador: " + this.getMulti();
        resultado += "\nDias de facturacion: 30";
        resultado += "\nConsumo mensual: " + this.getConsumo_mensual() + " kWh";
        resultado += "\nConsumo diario: " + formato.format(this.getConsumo_dia()) + " kWh";
        resultado += "\nValor Factura: " + this.getValorFactura();
        return resultado;
    }
    
    public static void main(String[] args) {
        ejercicio2_herenciaEncapsulamiento_FacturaElectrica factura = new ejercicio2_herenciaEncapsulamiento_FacturaElectrica();
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#.##");
        
        System.out.println("Escriba el numero de cuenta:");
        factura.setN_cuenta(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba la lectura actual del medidor:");
        factura.setLectura_actual_m(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba la lectura anterior del medidor:");
        factura.setLectura_anterior_m(Integer.parseInt(leer.nextLine()));
        System.out.println("digite el  multiplicador:");
        factura.setMulti(Integer.parseInt(leer.nextLine()));
        
        System.out.println(factura.info());
        
    }

    public void setMulti(int multi) {
        this.multi = multi;
    }
}
