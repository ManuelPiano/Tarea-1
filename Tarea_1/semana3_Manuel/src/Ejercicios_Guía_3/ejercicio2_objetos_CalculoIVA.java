
package Ejercicios_Guía_3;

public class ejercicio2_objetos_CalculoIVA {
    double precio, desc_IVA = 0.13, agreg_IVA = 0.13;
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDesc_IVA() {
        return desc_IVA;
    }

    public double getAgreg_IVA() {
        return agreg_IVA;
    }
    
    public double precioConIVA(double precio){
        double resultado;
        resultado = precio + (precio * this.getAgreg_IVA());
        return resultado;
    }
    
    public double precioSinIVA(double precio){
        double resultado;
        resultado = precio - (precio * this.getAgreg_IVA());
        return resultado;
    }
    
}
