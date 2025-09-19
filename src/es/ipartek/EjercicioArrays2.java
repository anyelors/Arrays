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

        final int LIMIT = 5;

        String[] nombres = new String[LIMIT];
        String[] nombresAZ = new String[LIMIT];
        String[] nombresZA = new String[LIMIT];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Favor digite Nombre [%d]: ", i+1);
            nombres[i] = scan.nextLine();
        }
        scan.close();

        //Orden de la A a la Z
        nombresAZ = nombres.clone();
        Arrays.sort(nombresAZ);

        //Orden de la Z a la A
        int indx = 0;
        for (int n = nombresAZ.length-1; n >= 0 ; n--) {
            nombresZA[indx] = nombresAZ[n];
            indx++;
        }

        System.out.println();
        System.out.println("Array Original");
        System.out.println(Arrays.toString(nombres));

        System.out.println("Array Ordenado de la A a la Z");
        System.out.println(Arrays.toString(nombresAZ));

        System.out.println("Array Ordenado de la Z a la A");
        System.out.println(Arrays.toString(nombresZA));

    }
}
