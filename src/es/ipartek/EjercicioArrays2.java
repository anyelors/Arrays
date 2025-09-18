package es.ipartek;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays2 {
    /*
    * 2.- Crea una aplicación que dado un array de cadenas con nombres de personas, muestre:

        Los nombres de las personas ordenadas alfabéticamente de la A a la Z
        Los nombres de las personas ordenadas de la Z a la A
    * */

    public static void main(String[] args) {
        String[] nombres = new String[5];
        String[] nombresAZ = new String[5];
        String[] nombresZA = new String[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Favor digite Nombre [%d]: ", i+1);
            nombres[i] = scan.nextLine();
        }
        scan.close();

        System.out.println("Array Original");
        for (String nom : nombres) {
            System.out.printf("[%s] ", nom);
        }

        nombresAZ = nombres.clone();

        Arrays.sort(nombresAZ);
        System.out.println("\nordenadas de la A a la Z");
        for (String nom : nombresAZ) {
            System.out.printf("[%s] ", nom);
        }

        System.out.println("\nordenadas de la Z a la A");
        int indx = 0;
        for (int n = nombresAZ.length-1; n >= 0 ; n--) {
            nombresZA[indx] = nombresAZ[n];
            indx++;
        }

        for (String nom : nombresZA) {
            System.out.printf("[%s] ", nom);
        }

    }
}
