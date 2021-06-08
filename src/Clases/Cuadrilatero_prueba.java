
package Clases;

import java.util.Scanner;

public class Cuadrilatero_prueba {
    
    public static void main(String[] args){
        Clase_cuadrilatero1 c1;
        Scanner entrada = new Scanner(System.in);
        
        int lado1,lado2;
        
        System.out.println("Insertar valor del primer lado: ");
        lado1 = entrada.nextInt();
        
        
        System.out.println("Insertar valor del segundo lado: ");
        lado2 = entrada.nextInt();
        
        
        if(lado1 == lado2){
            c1 = new Clase_cuadrilatero1(lado1);
        }
        else{
            c1 = new Clase_cuadrilatero1(lado1, lado2);
        }
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
}