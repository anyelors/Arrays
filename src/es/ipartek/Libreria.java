package es.ipartek;

import java.util.Arrays;

public class Libreria {

    //Retorna la primera posición del valor buscado
    //si no existe -1
    public static int buscar ( int[] valores, int buscado) {
        int indx = -1;

        for (int i = 0; (i < valores.length && indx == -1); i++) {
            if (buscado == valores[i]) {
                indx = i;
            }
        }

        return indx;
    }

    //Retorna true si el valor existe
    public static boolean existe ( int[] valores, int buscado) {
        /*
        boolean exist = false;
        int indx = 0;
        while ( indx < valores.length && !exist) {
            if (buscado == valores[indx])
                exist = true;
            indx++;
        }

        return exist;
        */

        return buscar(valores, buscado) >= 0;
    }

    //Retorna el número de apariciones
    public static int recuento ( int[] valores, int buscado) {
        int cont = 0;
        for (int i = 0; i < valores.length; i++) {
            if (buscado == valores[i])
                cont++;
        }
        return cont;
    }

    //Retorna la posición del valor más grande presente en el array
    public static int obtenerPosMaximo ( int [] valores ) {
        int max = valores[0];
        int indx = 0;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > max) {
                max = valores[i];
                indx = i;
            }
        }

        return indx;
    }

    //Retorna la posición del valor mínimo presente en el array
    public static int obtenerPosMinimo ( int [] valores) {
        int min = valores[0];
        int indx = 0;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < min) {
                min = valores[i];
                indx = i;
            }
        }

        return indx;
    }

    public static int[] invertir ( int[] valores ) {
        int[] valoresInvertir = new int[valores.length];
        int indx = 0;

        for (int i = valores.length-1; i >= 0; i--) {
            valoresInvertir[indx] = valores[i];
            indx++;
        }

        return valoresInvertir;
    }

    public static void main(String[] args) {
        int[] valores = {10, 1000, 20, 30, 40, 1, 50, 60, 70, 50};
        System.out.println("Array Original " + Arrays.toString(valores));
        System.out.println("Método buscar() " + buscar(valores, 50));
        System.out.println("Método existe() " + existe(valores, 5));
        System.out.println("Método recuento() " + recuento(valores, 50));
        System.out.println("Método obtenerPosMaximo() " + obtenerPosMaximo(valores));
        System.out.println("Método obtenerPosMinimo() " + obtenerPosMinimo(valores));
        System.out.println("Método invertir() " + Arrays.toString(invertir(valores)));
    }
}
