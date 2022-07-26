
package trabajoenclase;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class TrabajoEnClase {
    
    public static void main(String[] args) {
                      
       //keywords 
        Scanner   leer=new Scanner(System.in);
        byte valor=1;        
        int new1=10; 
        char caracter='h';
        int  numero=10;
        String cadena="Hola mundo";              
        Carro auto=new Carro(2022,"Mazada","Color");
        
        System.out.println(cadena);
        System.out.println(cadena.toUpperCase());        
        System.out.println(cadena.replace('o', 'i'));
        
        System.out.println("Modelo: "+auto.getModelo()+" Marca: "+auto.getMarca()+" Color:"+auto.getColor());
        
        //estructura de control - condicionales
        
        if(5<3){
            //cumple
        }else{
          //cumple
        }
        
        if(5<3){
            //cumple
        }else if(2>10){
          //cumple
        }
        
        
        
        
        
        
        
        
    }
    
}
