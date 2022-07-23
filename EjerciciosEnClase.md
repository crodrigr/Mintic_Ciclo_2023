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

## 2. Vendedores

![image](https://user-images.githubusercontent.com/31961588/180587863-e0e29ba7-2db8-47dd-958b-b0ae4fa0f400.png)

```Java
package trabajoenclase;

import java.util.Scanner;

public class Vendedores {
    
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("PROGRAMA DE VENDEDORES");
        
        int numVendores;
        String cedula;
        byte tipoVendedor;
        float ventas;
        float comisiones;
        
        System.out.println("Ingrese el número de vendendores: ");
        numVendores=leer.nextInt();
        
        for(int i=0 ;i<numVendores;i++){            
            System.out.println("Ingrese número del documento: ");
            cedula=leer.next();
            System.out.println("Ingrese el tipo de vendedor: 1 o 2");
            tipoVendedor=leer.nextByte();
            System.out.println("Ingre las ventas del mes: ");
            ventas=leer.nextFloat();
            
            if(tipoVendedor==1){
               comisiones=ventas*0.2f;
            }else{
               comisiones=ventas*0.3f;
            }            
            System.out.println("Vendedor: "+cedula+"comisiones: "+comisiones);            
        }
    }    
}

```
