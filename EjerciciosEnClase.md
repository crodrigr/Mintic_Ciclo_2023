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

# 7. Calificaciones de un curso. 

![image](https://user-images.githubusercontent.com/31961588/182004529-7cf43b18-3269-47f9-b9a5-dedf92c36492.png)

**AppCalificaciones.java**
```Java

package appcalificaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCalificaciones {

    static Scanner leer=new Scanner(System.in);
    static ArrayList<Estudiante> listEstudiantes=new ArrayList<Estudiante>();    
    
    public static void main(String[] args) {
        
        System.out.println("PROGRAMA DE CALCULO DE LA NOTA FINAL DE UN CURSO")        ;
        cargarDatosEstudiantes();
        calcularNotaFinalEstudiantes();
        mostrarListadoEstudiantes();
        mostraEstadisticas();
        
     
    }
    
    static void mostraEstadisticas(){
        float sumaNotasFinales=0f;
        float promedioNotas;
        int   aprobados=0;
        int   reprobados=0;
        for(int i=0;i<listEstudiantes.size();i++){
          float notaFinal=listEstudiantes.get(i).getNotaFinal();
           sumaNotasFinales+=notaFinal;
           if(notaFinal<3){
             reprobados++;
           }else{
             aprobados++;
           }          
        }
        promedioNotas=sumaNotasFinales/listEstudiantes.size();
        System.out.println("ESTADISTICAS DEL CURSO");
        System.out.println("El promedio del curos es: "+promedioNotas);
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Reprobaos: "+reprobados);
        
    
    
    }    
    
    static void cargarDatosEstudiantes(){
       listEstudiantes.add(new Estudiante("001","Camilo Rodriguez",4.5f,4.8f,3.5f));
       listEstudiantes.add(new Estudiante("002","Celina Torres",3.5f,3.8f,4.5f));
       listEstudiantes.add(new Estudiante("003","Juan   Villamizar",3.5f,3.8f,2.5f));
       listEstudiantes.add(new Estudiante("004","Carlos  Camargo",2.5f,1.0f,4.5f));
       listEstudiantes.add(new Estudiante("005","Diego   Rangel",2.5f,1.0f,3.5f));
       String codigo;
       System.out.println("Ingrese el código del estudiantes: ");
       codigo=leer.next();
       String nombre;
       float  nota1;
       float  nota2;
       float  nota3;       
       while(!codigo.equals("999")){         
          System.out.println("Ingrese el nombre del estudiante: ");
          nombre=leer.next();         
          System.out.println("Ingrese la nota 1: ");
          nota1=leer.nextFloat();          
          System.out.println("Ingrese la nota 2: ");
          nota2=leer.nextFloat();
          System.out.println("Ingrese la nota 3: ");
          nota3=leer.nextFloat();
          listEstudiantes.add(new Estudiante(codigo,nombre,nota1,nota2,nota3));
          System.out.println("Ingrese el código del estudiantes: ");
          codigo=leer.next();
       }
    }
    
    static void calcularNotaFinalEstudiantes(){
        System.out.println("Calculando notas finales del curso...!");
        for(int i=0;i<listEstudiantes.size();i++){
          listEstudiantes.get(i).calcularNotaFinal();                 
        }
    
    }
    
    static void mostrarListadoEstudiantes(){
      
        for(int i=0;i<listEstudiantes.size();i++){
          Estudiante item=listEstudiantes.get(i);
          System.out.println("Código: "+item.getCodigo()+
                             " Nombre: "+item.getNombre()+
                             " Nota 1: "+item.getNota1()+
                             " Nota 2: "+item.getNota2()+
                             " Nota 3: "+item.getNota3()+
                             " Nota final : "+item.getNotaFinal());
        
        }
    
    }
    
}

```
**Estudiante.java**
```Java

package appcalificaciones;

public class Estudiante {
    //Atributos
    private String codigo;
    private String nombre;
    private float  nota1;
    private float  nota2;
    private float  nota3;
    private float  notaFinal;
        
    //Métodos

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, float nota1, float nota2, float nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
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

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public void calcularNotaFinal(){
       
      this.notaFinal=Math.round((this.nota1+this.nota2+this.nota3)/3);     
    }
    
    
    
}

```

# 8. Publicaciones con Herencia

![image](https://user-images.githubusercontent.com/31961588/182984854-beb38591-68e1-42f6-935d-77330447ed02.png)

**AppPubliaciones.java**
```Java

package apppublicacion57;

import java.util.Scanner;

public class AppPublicacion57 {
    
    //Variable global 
    static Scanner leer=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        Ventas ventas=new Ventas();
        
        System.out.println("PROGRAMA DE PUBLICACIONES CON HERENCIA \n");
        
        Publicacion p1=newPublicacion();
        Publicacion p2=newPublicacion();
        Publicacion p3=newPublicacion();
        
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        
        System.out.println("\nLISTADO DE PUBLICACIONES VENDIDAS \n");
        ventas.newVenta(p1);
        ventas.newVenta(p3);
        ventas.listadoVentas();
        
        
    }
    
    public static Publicacion newPublicacion(){
        
        Publicacion publicacion;
        System.out.println("Ingrese el titulo: ");
        String titulo=leer.nextLine();
        System.out.println("Ingrese el precio: ");
        float precio=leer.nextFloat();
        System.out.println("Tipo de publicacion: 0. Publicacion, 1. Libro y 2.Disco: ");
        int tipo=leer.nextInt();
        switch (tipo) {
            case 1 -> {
                System.out.println("Ingrese número de paginas: ");
                int paginas=leer.nextInt();
                System.out.println("Ingrese el año de publicación: ");
                int año=leer.nextInt();
                publicacion=new Libro(paginas,año,titulo,precio);
            }
            case 2 -> {
                System.out.println("Ingrese la duración:  ");
                float duracion=leer.nextFloat();
                publicacion=new Disco(duracion,titulo,precio);
            }
            default -> publicacion=new Publicacion(titulo,precio);
        }
                   
      return publicacion;
    }
    
}

```
**Publicacion.java**
```Java

package apppublicacion57;


public class Publicacion {
    
    private String titulo;
    private float  precio;

    public Publicacion() {
    }

    public Publicacion(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrar(){
      System.out.println("INFORMACIÓN DE UNA PUBLICACIÓN");
      System.out.println("Titulo: "+this.titulo);
      System.out.println("Precion: "+this.precio);
    
    }
    
    
    
    
}

```
**Libro.java**
```Java

package apppublicacion57;


public class Libro extends Publicacion {
    
    private int numeroPaginas;
    private int añoPublicacion;

    public Libro() {
    }

    public Libro(int numeroPaginas, int añoPublicacion, String titulo, float precio) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public void mostrar() {
        System.out.println("INFORMACIÓN DE UN LIBRO");
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Precion: " + super.getPrecio());
        System.out.println("Número de paginas: " + this.numeroPaginas);
        System.out.println("Año de publicación: " + this.añoPublicacion);
    }
    
    
    
    
    
}

```
**Disco.java**
```Java
package apppublicacion57;

public class Disco extends Publicacion {

    private float duracion;

    public Disco() {
    }

    public Disco(float duracion, String titulo, float precio) {
        super(titulo, precio);
        this.duracion = duracion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public void mostrar() {
        System.out.println("INFORMACIÓN DE UN DISCO");
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Precion: " + super.getPrecio());
        System.out.println("Duración: " + this.duracion);

    }

}

```

**Venta.java**
```Java

package apppublicacion57;

import java.util.ArrayList;


public class Ventas {
    
    private ArrayList<Publicacion> listVentas;

    public Ventas() {
       listVentas=new ArrayList<Publicacion>();        
    }

    public ArrayList<Publicacion> getListVentas() {
        return listVentas;
    }

    public void setListVentas(ArrayList<Publicacion> listVentas) {
        this.listVentas = listVentas;
    }
    
    public void newVenta(Publicacion publicacion){
       this.listVentas.add(publicacion);
    }
    
    public void listadoVentas(){
       for(int i=0;i<this.listVentas.size();i++){
          this.listVentas.get(i).mostrar();
       }
    }
    
    
}

```
# 9 Figuras aplicando herencia y polimorfismo. 

![image](https://user-images.githubusercontent.com/31961588/183270157-19f2d746-d185-444f-941d-83e146a07156.png)


**AppFigura.java**
```JAva

package appfigura;


public class AppFigura {

    
    public static void main(String[] args) {
        
        Figura f1=new Cuadrado(5);
        Figura f2=new Rectangulo(3,9);
        Figura f3=new Circulo(9);
        
        f1.calcularArea();
        f1.calcularPerimetro();
        f1.mostrar();
        
        f2.calcularArea();
        f2.calcularPerimetro();
        f2.mostrar();
        
        f3.calcularArea();
        f3.calcularPerimetro();
        f3.mostrar();
        
       
    }
    
}

```
**Figura.java**
```JAva

package appfigura;


public abstract class Figura {
    
    private float area;
    private float perimetro;

    public Figura() {
    }
    
    public Figura(float area, float perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();
    
    public abstract void mostrar();
          
    
}


```
**Cuadrado.java**
```JAva

package appfigura;


public class Cuadrado extends Figura {
    
    private float lado;
    

    public Cuadrado(float lado) {
        this.lado = lado;
    }  
    

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
       

    @Override
    public void calcularArea() {
        float area=this.lado*this.lado;
        super.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro=this.lado*4;
        super.setPerimetro(perimetro);
    }

    @Override
    public void mostrar(){
       System.out.println("DATOS DEL CUADRADO");
       System.out.println("Lado: "+this.lado);
       System.out.println("Area:" +super.getArea());
       System.out.println("Perimetro: "+super.getPerimetro());
    }
    
}

```

**Rectangulo.java**
```JAva

package appfigura;

public class Rectangulo extends Figura {
    
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        float area=this.base*this.altura;
        super.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
        float perimetro=2*this.base+2*this.altura;
        super.setPerimetro(perimetro);
    }

    @Override
    public void mostrar() {
       System.out.println("DATOS DEL RECTANGULO");
       System.out.println("Base: "+this.base);
       System.out.println("Altura: "+this.altura);
       System.out.println("Area:" +super.getArea());
       System.out.println("Perimetro: "+super.getPerimetro());
    }
    
}

```
**Circulo.java**
```JAva

package appfigura;


public class Circulo extends Figura {
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
    @Override
    public void calcularArea() {
       float area=(float) (2*Math.PI*(this.radio*this.radio));
       super.setArea(area);
    }

    @Override
    public void calcularPerimetro() {
       float perimetro=(float) (2*Math.PI*this.radio);
       super.setPerimetro(perimetro);
    }

    @Override
    public void mostrar() {
       System.out.println("DATOS DEL CIRCULO");
       System.out.println("Radio: "+this.radio);       
       System.out.println("Area:" +super.getArea());
       System.out.println("Perimetro: "+super.getPerimetro());
    }
    
    
    
}

```
