package trabajoenclase;

import java.util.Scanner;

public class Vendedore12 {
    public static void main(String[] args){
      Scanner leer=new Scanner(System.in);
      
      //Variables
      int numVendedores;
      String cedula;
      byte tipoVendedor;
      float ventasMes;
      float comisiones;
      
      System.out.println("Ingrese el número de vendores a procesar: ");
      numVendedores=leer.nextInt();
      
      for(int i=0;i<numVendedores;i++){
       
          System.out.println("Ingrese la cedula: ");
          cedula=leer.next();
          System.out.println("Ingrese el tipo de vendedor(1 o 2): ");
          tipoVendedor=leer.nextByte();
          System.out.println("Ingrese las ventas del mes: ");
          ventasMes=leer.nextFloat();
          
          if(tipoVendedor==1){
            comisiones=ventasMes*0.2f;
          }else{
            comisiones=ventasMes*0.3f;
          }
          
          System.out.println("Vendedor: "+cedula+" comisión: "+comisiones);
      
      }
      
      
      
      
    
    
    }
}
