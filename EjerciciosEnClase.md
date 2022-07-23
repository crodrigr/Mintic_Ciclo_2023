# Ejercicios realizados en clase.

## 1. Servicio de Agua

![image](https://user-images.githubusercontent.com/31961588/180584003-c6073df8-2b64-4bb8-b204-3aac2a836208.png)

```Java
package trabajoenclase;
import java.util.Scanner;

public class ServicioAgua {   
    
    public static void main(String[] args){
         Scanner leer=new Scanner(System.in);
        //Definir variables;
        String numDocumento;
        String   estado;
        byte   estrato;
        
        //capturar datos de entrada
        System.out.println("Ingrese el número de documento: ");
        numDocumento=leer.next();
        System.out.println("Ingrese estado: A o S: ");
        estado=leer.next();
        System.out.println("Ingrese el estrato (1,2,3,4,5): ");
        estrato=leer.nextByte();
        
        if(estado.equals("A")){
           switch(estrato){
               case 1 :
                 System.out.println("El cliente identificado: "+numDocumento+" es $10.000 pesos");         
               break;
               case 2 :
                 System.out.println("El cliente identificado: "+numDocumento+" es $15.000 pesos");         
               break;
                case 3 :
                 System.out.println("El cliente identificado: "+numDocumento+" es $30.000 pesos");         
               break;
                case 4 :
                 System.out.println("El cliente identificado: "+numDocumento+" es $50.000 pesos");         
               break;
               default :
                 System.out.println("El cliente identificado: "+numDocumento+" es $65.000 pesos");         
               break;
           }
        }else{
          System.out.println("El cliente identificado: "+numDocumento+" es cero pesos");
        }
    }  
}

```
