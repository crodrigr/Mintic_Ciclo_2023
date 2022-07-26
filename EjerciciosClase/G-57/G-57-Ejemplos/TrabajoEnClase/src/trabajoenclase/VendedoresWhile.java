package trabajoenclase;

import java.util.Scanner;

public class VendedoresWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Variables
        int numVendedores;
        String cedula;
        byte tipoVendedor;
        float ventasMes=0.0f;
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
