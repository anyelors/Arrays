package es.ipartek;

import java.util.Arrays;

public class ArraysDeclaracion {
    public static void main(String[] args) {
        //Declaración de Array con tamaño
        //Declara un array con capacidad para 10 valores
        int [] numeros = new int[10];
        //Asignar un valor a la primera posición
        numeros[0] = 10;
        //Asignar un valor a la ultima posición
        numeros[numeros.length-1] = 100;
        System.out.println(Arrays.toString(numeros));

        boolean[] comprobaciones = new boolean[5];
        comprobaciones[2] = true;
        System.out.println(Arrays.toString(comprobaciones));

        //Instanciando un arrys de 10 cadenas
        String[] nombres = new String[10];
        //Asignación de valores a cada posición
        nombres[0] = "Maria";
        nombres[1] = "Lupe";
        System.out.println(Arrays.toString(nombres));

        //Declaración explicita de Arrys
        int[] ganadora = new int[6];
        ganadora[0] = 2;
        ganadora[1] = 20;
        ganadora[2] = 23;
        ganadora[3] = 30;
        ganadora[4] = 32;
        ganadora[5] = 43;
        System.out.println(Arrays.toString(ganadora));

        //Instancia un array de 6 enteros Explicita
        int[] ganadora1 = new int[] {2,20,23,30,32,43};
        System.out.println(Arrays.toString(ganadora1));

        //String[] alumnos = new  String[] {"Lupe", "Paco", "Pepa"};
        String[] alumnos = {"Lupe", "Paco", "Pepa"};
        System.out.println(Arrays.toString(alumnos));
    }
}
