package es.ipartek;

import java.util.Scanner;

public class EjercicioArrays1 {
    /*
    * 1.- Crea una aplicación que dado un array de valores enteros, muestre:

        Los valores en posiciones pares del array
        Los valores pares presentes en el array
    * */

    public static void main(String[] args) {

        final int LIMIT = 10;
        int[] numeros = new int[LIMIT];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < LIMIT; i++) {
            System.out.printf("Digite Numero %d: ", i+1);
            numeros[i] = Integer.parseInt(scan.nextLine());
        }
        scan.close();
        System.out.println();

        //Valores en posición pares
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0){
                System.out.printf("Posición [%d]: Valor [%d]\n", i, numeros[i]);
            }
        }

        System.out.println();

        //Valores pares
        for (Integer num : numeros) {
            if (num % 2 == 0) {
                System.out.printf("Valor Par [%d]\n", num);
            }
        }
    }
}
