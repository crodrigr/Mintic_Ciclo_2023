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
