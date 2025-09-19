package es.ipartek;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays3 {
    /*
    * 3.- Crea una aplicación que solicite al usuario 10 nombres, y después muestre:

        Una lista con los nombres de más de 5 letras
        Una lista con los nombres que empiezan por "A"
    * */

    public static void main(String[] args) {
        final int LIMIT = 10;
        String[] nombres = new String[LIMIT];
        int cont = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Favor digite Nombre [%d]: ", i+1);
            nombres[i] = scan.nextLine();
        }
        scan.close();

        //#####################################################################
        //Nombres con más de 5 letras

        for (int n = 0; n < nombres.length ; n++) {
            if (nombres[n].length() >= 5)
                cont++;
        }

        String[] nombresMas5 = new String[cont];

        int indx = 0;
        for (int n = 0; n < nombres.length ; n++) {
            if (nombres[n].length() >= 5) {
                nombresMas5[indx] = nombres[n];
                indx += 1;
            }
        }

        //#####################################################################
        //Lista con los nombres que empiezan por A
        cont = 0;
        for (int n = 0; n < nombres.length ; n++) {
            if (nombres[n].substring(0,1).equalsIgnoreCase("A"))
                cont++;
        }

        String[] nombresA = new String[cont];

        int indxA = 0;
        for (int n = 0; n < nombres.length ; n++) {
            if (nombres[n].substring(0,1).equalsIgnoreCase("A")) {
                nombresA[indxA] = nombres[n];
                indxA += 1;

            }
        }

        //Impresión
        System.out.println();
        System.out.println("*** Array Original ***");
        System.out.println(Arrays.toString(nombres));

        System.out.println("*** Array con nombres mayor de 5 letras ***");
        System.out.println(Arrays.toString(nombresMas5));

        System.out.println("*** Array con nombres que empiezan con la letra A ***");
        System.out.println(Arrays.toString(nombresA));

    }
}
