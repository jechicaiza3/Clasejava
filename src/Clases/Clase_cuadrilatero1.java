
package Clases;


public class Clase_cuadrilatero1 {
    
    private float lado1;
    private float lado2;

    public Clase_cuadrilatero1(float lado1, float lado2) { 
    
    this.lado1 = lado1;
    this.lado2 = lado2;
    
    
    
        System.out.println("Insertar valores del cuadrilatero ");
}

    public Clase_cuadrilatero1(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }
    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }
   
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
}
