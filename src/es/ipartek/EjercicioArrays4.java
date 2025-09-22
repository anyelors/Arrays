package es.ipartek;

import java.util.Arrays;
import java.util.Scanner;

import static es.ipartek.Libreria.*;

public class EjercicioArrays4 {

    /**
     * 1.- Crea una aplicación que solicite al usuario los nombres y calificaciones de 10 alumnos mediante valores decimales comprendidos entre 0 y 10. Si alguna calificación no está en el rango válido debe emitirse un mensaje de error y volver a solicitarla.
     * Una vez introducidas todas las calificaciones la aplicación debe mostrar:
     *
     * El nombre del alumno con la calificación más alta y su calificación
     * El nombre del alumno con la calificación más baja y su calificación
     * La calificación media de todo el alumnado.
     * Un recuento con el número de alumnos que han aprobado
     * @return
     */

    public static int solicitarCalificacion(String nom) {
        int nota = -1;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.printf("Introduzca la calificación entre 0 y 10 de %s: ", nom);
            nota = Integer.parseInt(scan.nextLine());
        } while (nota < 0 || nota > 10);

        return nota;
    }

    public static void main(String[] args) {
        final int LIMIT = 5;
        final int NOTA_APRUEBA = 5;
        String[] nombres = new String[LIMIT];
        int[] calificaciones = new int[LIMIT];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < LIMIT; i++) {
            //Solicitar nombre del alumno
            System.out.print("Introduzca nombre de alumno: ");
            nombres[i] = scan.nextLine();

            //Solicitar calificación del alumno
            calificaciones[i] = solicitarCalificacion(nombres[i]);

        }
        scan.close();

        System.out.println(Arrays.toString(nombres).indent(2));
        System.out.println(Arrays.toString(calificaciones).indent(2));

        int notaMaxima = obtenerPosMaximo(calificaciones);
        System.out.printf("Calificación más alta: [%s] - [%d]", nombres[notaMaxima], calificaciones[notaMaxima]);

        int notaBaja = obtenerPosMinimo(calificaciones);
        System.out.printf("\nCalificación más baja: [%s] - [%d]", nombres[notaBaja], calificaciones[notaBaja]);

        float media = (float) calculoSumatoria(calificaciones) / LIMIT;
        System.out.printf("\nMedia de todo el alumnado : [%.2f]", media);

        int alumnosAprobados = recuentoMaxValor(calificaciones, NOTA_APRUEBA);
        System.out.printf("\nCantidad alumnados aprobados : [%d]", alumnosAprobados);
    }

}
