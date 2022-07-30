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

**Otra solución**
```Java
package trabajoenclase;

import java.util.Scanner;

public class VendoresWhile57 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("PROGRAMA DE VENDEDORES");
        int numVendores;
        String cedula;
        byte tipoVendedor;
        float ventas;
        float comisiones;

        cedula = "valor inicio";

        while (!cedula.equals("999")) {
            System.out.println("Ingrese número del documento: ");
            cedula = leer.next();
            if (!cedula.equals("999")) {
                System.out.println("Ingrese el tipo de vendedor: 1 o 2");
                tipoVendedor = leer.nextByte();
                System.out.println("Ingre las ventas del mes: ");
                ventas = leer.nextFloat();
                if (tipoVendedor == 1) {
                    comisiones = ventas * 0.2f;
                } else {
                    comisiones = ventas * 0.3f;
                }
                System.out.println("Vendedor: " + cedula + "comisiones: " + comisiones);
            } else {
                System.out.println("Fin de programa");
            }
        }

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
**Otra solución**
```Java
package trabajoenclase;

import java.util.Scanner;

public class ArregloNumeros57 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //instanciando
        System.out.println("Cuantos números va pedir:");
        int tamaño = leer.nextInt();
        int[] numeros = new int[tamaño]; //Arrays instanciado 

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
                pares++; // pares=pares+1
                sumPares+=numeros[i]; //sumPares=sumPares+numeros[i];
                System.out.println(numeros[i] + " es par");
            } else {
                impares++; // pares=pares+1
                sumImpares+=numeros[i];
                System.out.println(numeros[i] + " es impar");
            }
        }
        System.out.println("Total pares: "+pares);
        System.out.println("Total impares: "+impares);
        System.out.println("Suma pares: "+sumPares);
        System.out.println("Suma impares: "+sumImpares);

    }

}

```
# 4. Calcular valor a pagar de servicio de teléfono

![image](https://user-images.githubusercontent.com/31961588/180630091-1e89c72b-1cab-46dd-aedb-c575e9bc33b4.png)


```Java
package trabajoenclase;

import java.util.Scanner;

public class ServicioTelefonico {

    static Scanner leer = new Scanner(System.in);
    static final int VALOR_IMPULSO = 100;

    public static void main(String[] args) {
        System.out.println("PROGRAMA CALCULA EL VALOR A PAGAR DE ABONADOS");
        calcularValorPagarAbonado();
    }

    static void calcularValorPagarAbonado() {
        int numAbonados = 0;
        System.out.println("Ingrese el número de abonados: ");
        numAbonados = leer.nextInt();
        String codigo;
        byte estrato;
        int impulsos;
        int totalPagarAbonados = 0;
        int tarifaBasica;
        int totalPagar;

        for (int i = 0; i < numAbonados; i++) {
            System.out.println("Ingrese código: ");
            codigo = leer.next();
            System.out.println("Ingrese el estrato (1,2,3,4,5): ");
            estrato = leer.nextByte();
            System.out.println("Ingrese los impulsos del mes: ");
            impulsos = leer.nextInt();
            tarifaBasica = getTarifaBasica(estrato);
            totalPagar = (impulsos * VALOR_IMPULSO) + tarifaBasica;
            totalPagarAbonados += totalPagar;
            System.out.println("Abonado: " + codigo + " Total a pagar: " + totalPagar);
        }
        System.out.println("Total a pagar todos los abonados: " + totalPagarAbonados);

    }

    static int getTarifaBasica(byte estrato) {
        int tarifaBasica;
        switch (estrato) {
            case 1:
                tarifaBasica = 10000;
                break;
            case 2:
                tarifaBasica = 15000;
                break;
            case 3:
                tarifaBasica = 20000;
                break;
            case 4:
                tarifaBasica = 25000;
                break;
            default:
                tarifaBasica = 30000;
                break;
        }
        return tarifaBasica;
    }

}

```

# 5 POO. Cuenta Bancaria

**AppCuentaBancaria**

```Java
package appcuentabancaria;

public class AppCuentaBancaria {
    
    public static void main(String[] args) {
        System.out.println("PROGRAMA CUENTA BANCARIA");
        
        CuentaBancaria cuenta1=new CuentaBancaria("001",100000.0,1);
        CuentaBancaria cuenta2=new CuentaBancaria("002",500000.0,2);
        CuentaBancaria cuenta3=new CuentaBancaria("001",100000.0,1);
        CuentaBancaria cuenta4=new CuentaBancaria("003",800000.0,1);
        
        
        System.out.println("Numero cuenta: "+cuenta1.numeroCuenta+" saldo:" +cuenta1.saldo+" tipo:"+cuenta1.tipoCuenta);
        System.out.println("Numero cuenta: "+cuenta2.numeroCuenta+" saldo:" +cuenta2.saldo+" tipo:"+cuenta2.tipoCuenta);
        System.out.println("Numero cuenta: "+cuenta3.numeroCuenta+" saldo:" +cuenta3.saldo+" tipo:"+cuenta3.tipoCuenta);
        System.out.println("Numero cuenta: "+cuenta4.numeroCuenta+" saldo:" +cuenta4.saldo+" tipo:"+cuenta4.tipoCuenta);
        
        
        cuenta1.consignar(200000);
        cuenta3.retirar(50000);
        
        
        System.out.println("Numero cuenta: "+cuenta1.numeroCuenta+" saldo:" +cuenta1.saldo+" tipo:"+cuenta1.tipoCuenta);
        System.out.println("Numero cuenta: "+cuenta2.numeroCuenta+" saldo:" +cuenta2.saldo+" tipo:"+cuenta2.tipoCuenta);
        System.out.println("Numero cuenta: "+cuenta3.numeroCuenta+" saldo:" +cuenta3.saldo+" tipo:"+cuenta3.tipoCuenta);
        System.out.println("Numero cuenta: "+cuenta4.numeroCuenta+" saldo:" +cuenta4.saldo+" tipo:"+cuenta4.tipoCuenta);
        
    }
    
}

```

**CuentaBancaria**

```Java
package appcuentabancaria;

public class CuentaBancaria {
    
    //Atributos
    public String numeroCuenta;
    public double saldo;
    public int   tipoCuenta;  
    
    //Métodos
    public CuentaBancaria(){
    
    }
    
    public CuentaBancaria(String numeroCuenta,double saldo,int tipoCuenta){
       this.numeroCuenta=numeroCuenta;
       this.saldo=saldo;
       this.tipoCuenta=tipoCuenta;  
    }
    
    public void retirar(double valor){
        if(valor<this.saldo){
          this.saldo-=valor;
        }else{
         System.out.println("Saldo insuficiente!");
        }
    
    }
    
    public void consignar(double valor){
       this.saldo+=valor;    
    }
}

```
# 6. Suscriptores servicio de agua con Arraylists

![image](https://user-images.githubusercontent.com/31961588/181862853-9c6a66b4-3884-421f-a465-bc5bd4e5dbf2.png)

**AppServicioAgua.java**
```Java
package appservicioagua;

import java.util.ArrayList;
import java.util.Scanner;

public class AppServicioAgua {
    
    //Variables globales
    static Scanner leer=new Scanner(System.in);
    static ArrayList<Suscriptor> listSuscriptores=new ArrayList<Suscriptor>();
    static final float VALOR_MTO3=100f;
    static float TotalPagarSuscriptores;
    
    
    public static void main(String[] args) {
        System.out.println("PROGRAMA DE SERVICIO DE AGUA");
        cargarDatosSuscriptores();
        calcularValoresPagar();
        mostrarSuscriptores();
        System.out.println("El total a pagar de los suscriptores es: "+TotalPagarSuscriptores);
                
        
    }
        
    static void calcularValoresPagar(){
       System.out.println("PROCESANDO CALCULO DE VALORES A PAGAR DE CADA SUSCRIPTOR");
       float tarifaBasica;
       for(int i=0;i<listSuscriptores.size();i++){
          Suscriptor elemento=listSuscriptores.get(i);
          switch(elemento.getEstrato()){
              case 1:
                  tarifaBasica=10000f;
              break;
              case 2:
                  tarifaBasica=15000f;
              break;
              case 3:
                  tarifaBasica=20000f;
              break;
              case 4:
                  tarifaBasica=25000f;
              break;
              default:
                  tarifaBasica=30000f;
              break;          
           }
          elemento.calcularValorPagar(tarifaBasica,VALOR_MTO3);
          TotalPagarSuscriptores+=elemento.getValorPagar();
      }  
    
    }
    
    
    static void cargarDatosSuscriptores(){
      System.out.println("CARGA DE DATOS");
      int numeroSuscriptores;
      System.out.println("Ingrese el número de suscriptores a procesar: ");
      numeroSuscriptores=leer.nextInt();
      String codigo;
      String nombre;
      int    estrato;
      float  consumo;
      for(int i=0;i<numeroSuscriptores;i++){
          
          System.out.println("Ingrese el código del suscriptor: ");
          codigo=leer.next();
          System.out.println("Ingrese el nombre del suscriptor: ");
          nombre=leer.next();
          System.out.println("Ingrese el estrato (1,2,3,4,5) ");
          estrato=leer.nextInt();
          System.out.println("Ingrese el consumo del mes: ");
          consumo=leer.nextFloat();
          listSuscriptores.add(new Suscriptor(codigo,nombre,estrato,consumo));                  
      }         
    }
    
    static void mostrarSuscriptores(){
       System.out.println("LISTADO DE SUSCRIPTORES ");
       for(int i=0;i<listSuscriptores.size();i++){
          Suscriptor elemento=listSuscriptores.get(i);
          System.out.println("Código: "+elemento.getCodigo()+" Nombre:" 
                             +elemento.getNombre()+ " Estrato: "+elemento.getEstrato()
                             +" Consumo: "+elemento.getConsumo()+" Valor a pagar: "+elemento.getValorPagar());                          
      }     
    
    }
    
}

```
**Suscriptor.java**
```Java
package appservicioagua;

public class Suscriptor {
    //Atributos
    private String codigo;
    private String nombre;
    private int    estrato;
    private float  consumo;
    private float  valorPagar;

    public Suscriptor() {
    }

    public Suscriptor(String codigo, String nombre, int estrato, float consumo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estrato = estrato;
        this.consumo = consumo;
    }   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    public void calcularValorPagar(float tarifaBasica,float valorMto3Agua){
       
        this.valorPagar=tarifaBasica+(this.consumo*valorMto3Agua);
    
    }
    
    
    
    
}

```

