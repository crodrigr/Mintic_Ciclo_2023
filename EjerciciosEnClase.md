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

**Solución con doWhile y while**
```Java
package trabajoenclase;

import java.util.Scanner;

public class VendedoresWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Variables
        int numVendedores;
        String cedula;
        byte tipoVendedor;
        float ventasMes;
        float comisiones;

        do {
            System.out.println("Ingrese la cedula: ");
            cedula = leer.next();
            if(!cedula.equals("999")){
            System.out.println("Ingrese el tipo de vendedor(1 o 2): ");
            tipoVendedor = leer.nextByte();
            System.out.println("Ingrese las ventas del mes: ");
            ventasMes = leer.nextFloat();

            if (tipoVendedor == 1) {
                comisiones = ventasMes * 0.2f;
            } else {
                comisiones = ventasMes * 0.3f;
            }
            System.out.println("Vendedor: " + cedula + " comisión: " + comisiones);
            }else{
            System.out.println("Cedula no valida fin del programa!");                
            }
           } while (!cedula.equals("999"));

        /*while(!cedula.equals("999")){
        System.out.println("Ingrese el tipo de vendedor(1 o 2): ");
        tipoVendedor = leer.nextByte();
        System.out.println("Ingrese las ventas del mes: ");
        ventasMes = leer.nextFloat();

        if (tipoVendedor == 1) {
            comisiones = ventasMes * 0.2f;
        } else {
            comisiones = ventasMes * 0.3f;
        }
        System.out.println("Vendedor: " + cedula + " comisión: " + comisiones);
        System.out.println("Ingrese la cedula: ");
        cedula = leer.next();
        }*/
    }
}

```
# 3.Arreglo de una dimesión. Numeros pares e impares

![image](https://user-images.githubusercontent.com/31961588/180627901-27ec2d6d-ac99-4f1a-90a9-c442f76db772.png)

```Java
package trabajoenclase;

import java.util.Scanner;

public class ArregloNumeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[6];//instanciando el array
        //int[] listaNumeros={2,3,35,2};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el número: ");
            numeros[i] = leer.nextInt();
        }

        int pares = 0;
        int impares = 0;
        int sumPares = 0;
        int sumImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " es par");
                pares++; //pares=pares+1
                sumPares += numeros[i]; //sumPares=sumPares+numeros[i]
            } else {
                System.out.println(numeros[i] + " es impar");
                impares++;
                sumImpares += numeros[i];
            }
        }

        System.out.println("Total de pares: " + pares);
        System.out.println("Total de impares: " + impares);
        System.out.println("Suma de pares: " + sumPares);
        System.out.println("Suma de pares: " + sumImpares);

    }

}

```
