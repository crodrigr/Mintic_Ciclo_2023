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
