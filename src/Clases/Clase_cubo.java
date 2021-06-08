
package Clases;
      

public class Clase_cubo {
    
     int alto;
     int ancho;
     int profundo;
     
    public Clase_cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
      
    }  
    
    public Clase_cubo() {
    
        System.out.println("Insertar valoes del Cubo ");
        
    }

    public int resultado(){
        int resul = this.ancho *this.alto * this.profundo;
        return resul;
        
        }   
    }
     
