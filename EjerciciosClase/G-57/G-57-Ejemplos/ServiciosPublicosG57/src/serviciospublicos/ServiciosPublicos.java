
package serviciospublicos;

import java.util.Scanner;

public class ServiciosPublicos {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);        
        //Definir variables
        String numDocumento;
        char estado;
        byte  estrato;        
        //Cagar datos
        System.out.println("Ingrese el número del documento: ");
        numDocumento=leer.next();
        System.out.println("Ingrese el estado (A o S): ");
        estado=leer.next().charAt(0);
        System.out.println("Ingrese el estrato(1,2,3,4,5): ");
        estrato=leer.nextByte();
        
        if(estado=='A'){
           switch(estrato){
               case 1:
                   System.out.println("Valor basico: $10.000");
               break;
               case 2:
                   System.out.println("Valor basico: $15.000");
               break;
               case 3:
                   System.out.println("Valor basico: $30.000");
               break;
               case 4:
                   System.out.println("Valor basico: $50.000");
               break;
               default :
                   System.out.println("Valor basico: $65.000");
               break;        
           
           }      
        }else{
          System.out.println("El cliente con documento: "+numDocumento+" tiene el servicio supendido, paga valor: $0"); 
        
        }
    }
    
}
