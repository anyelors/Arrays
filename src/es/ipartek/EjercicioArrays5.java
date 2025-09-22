package es.ipartek;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static es.ipartek.Libreria.buscar;
import static es.ipartek.Libreria.existe;

public class EjercicioArrays5 {

    /**
     * 2.- Crea una aplicación que solicite al usuario 6 valores con la combinación ganadora de la lotería primitiva,
     * y otros 6 valores con la combinación jugada.
     * Debe controlarse que los valores indicados estén entre 1 y 49, y que no se repitan.
     * La aplicación debe mostrar al final el número de aciertos y los valores acertados.
     * Para ayudarte y hacer el código más estructurado puedes implementar los siguientes métodos ayudantes:
     *
     * Un método solicitarValor() que solicite al usuario un valor numérico comprendido entre 1 y 49 incluidos.
     * Un método contarAciertos() que recibe dos arrays de enteros y retorna el número de valores coincidentes entre ambos.
     * Un método obtenerAciertos() que recibe dos arrays de enteros y retorna un array con los valores existentes en ambos.
     * @param args
     */

    public static int generarValor(int[] valores) {
        int valor;
        boolean valorExiste = false;

        do {
            Random generadorAleatorios = new Random();
            valor = 1+generadorAleatorios.nextInt(50);

            if (valores.length > 0) {
                valorExiste = existe(valores, valor);
            }
        } while (valorExiste);

        return valor;
    }

    public static int solicitarValor(int[] valores, int indx) {
        int valor = -1;
        boolean valorError = false;
        boolean valorExiste = false;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.printf("Introduzca valor entre 1 y 49 [%d]: ", indx+1);

            while (!scan.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entre el 1 y el 49.");
                scan.next();
            }

            valor = scan.nextInt();
            scan.nextLine();
            valorError = (valor < 1 || valor > 49);
            if (valores.length > 0) {
                valorExiste = existe(valores, valor);
            }
            if (valorExiste) System.out.println("Error. Valor ya ingresado");

            if (valorError) System.out.println("Error. Valor debe de ser entre 1 y 49");

        } while (valorError || valorExiste);

        return valor;
    }

    public static int contarAciertos(int[] ganador, int[] jugado) {
        int aciertos = 0;
        for (int i = 0; i < ganador.length; i++) {
            if (existe(jugado,ganador[i])) {
                aciertos++;
            }
        }

        return aciertos;
    }

    public static int[] obtenerAciertos(int[] ganador, int[] jugado, int indx) {
        int[] aciertos = new int[indx];
        int cont = 0;
        for (int i = 0; i < ganador.length; i++) {
            if (buscar(jugado,ganador[i]) >= 0) {
                aciertos[cont] = ganador[i];
                cont++;
            }
        }

        return aciertos;
    }

    public static void main(String[] args) {
        final int LIMIT = 6;
        int[] conbinacionGanadora = new int[LIMIT];
        int[] conbinacionJugada = new int[LIMIT];

        //System.out.println("*** Introduzca combinación ganadora ***");
        System.out.println("*** Combinación Ganadora Generada ***");
        for (int i = 0; i < LIMIT; i++) {
            //conbinacionGanadora[i] = solicitarValor(conbinacionGanadora);
            conbinacionGanadora[i] = generarValor(conbinacionGanadora);
        }

        Arrays.sort(conbinacionGanadora);

        System.out.println("*** Introduzca Combinación Jugada ***");
        for (int i = 0; i < LIMIT; i++) {
            conbinacionJugada[i] = solicitarValor(conbinacionJugada, i);
        }

        Arrays.sort(conbinacionJugada);

        System.out.println(Arrays.toString(conbinacionGanadora).indent(2));
        System.out.println(Arrays.toString(conbinacionJugada).indent(2));

        int aciertos = contarAciertos(conbinacionGanadora, conbinacionJugada);
        System.out.printf("Cantidad de aciertos: [%d]", aciertos);

        System.out.printf("\nvalores existentes: ");
        System.out.println(Arrays.toString(obtenerAciertos(conbinacionGanadora, conbinacionJugada, aciertos)));

    }
}
