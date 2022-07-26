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
