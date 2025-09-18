package es.ipartek;

import java.util.Arrays;

public class ArraysMetodos {
    public static void main(String[] args) {

        //Instancia array de 10 valores enteros en 0
        //Método Fill() inicializa el array con un valor indicado
        System.out.println("fill()");
        int [] valores = new int[10];
        System.out.println(Arrays.toString(valores));
        Arrays.fill(valores, 1);
        System.out.println(Arrays.toString(valores));

        String[] palabras = new String[10];
        System.out.println(Arrays.toString(palabras));
        Arrays.fill(palabras, "-");
        System.out.println(Arrays.toString(palabras));

        //No crea copia del array (Dos referencias al mismo array)
        int[] valores1 = {1,2,3,4,5,6,7,8,9};
        int[] valores2 = valores1;
        valores1[0] = 1000;
        System.out.println(Arrays.toString(valores1));
        System.out.println(Arrays.toString(valores2));

        System.out.println();

        //Copiar un array
        //Clone() Copia en un segundo array todos los valores del primero
        System.out.println("clone()");
        valores2 = valores1.clone();
        valores1[1] = 1200;
        System.out.println(Arrays.toString(valores1));
        System.out.println(Arrays.toString(valores2));

        System.out.println("Arrays.copyOf()");
        valores2 = Arrays.copyOf(valores1, 3);
        System.out.println(Arrays.toString(valores1));
        System.out.println(Arrays.toString(valores2));

        System.out.println("Arrays.copyOfRange()");
        //Copia el array valores1 al valores2 desde la posición 0 a la 3 (último número es excluyente)
        valores2 = Arrays.copyOfRange(valores1, 0, 4);
        System.out.println(Arrays.toString(valores1));
        System.out.println(Arrays.toString(valores2));

        //Comparar Arrays
        System.out.println("Comparar Arrays");
        int[] a = new int[] {1,2,3,4,5}; //  (new int) crea una nueva referencia en STACK
        int[] b = new int[] {1,2,3,4,5};

        //Compara las referencias NO los valores
        if (a == b)
            System.out.println("Son Iguales");
        else
            System.out.println("No Son Iguales");

        //Compara los valores NO las referencias
        if (Arrays.equals(a, b)){
            System.out.println("Son Iguales");
        } else {
            System.out.println("No Son Iguales");
        }

        //Ordenamiento
        System.out.println("Ordenamiento Arrays");
        String[] nom = {"Lupe", "Pepa", "Ana"};
        System.out.println(Arrays.toString(nom));

        Arrays.sort(nom);
        System.out.println(Arrays.toString(nom));

        int[] number = {12, 35, 1};
        System.out.println(Arrays.toString(number));

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        //Método de búsqueda
        int[] c = {10, 24, 12, 15, 3, 9};
        System.out.println("No Ordenado: " + Arrays.toString(c));
        //Para usar el método Arrays.binarySearch() El array debe de estar ordenado para su buen funcionamiento
        int indice = Arrays.binarySearch(c, 15);
        System.out.println("indice = " + indice);

        Arrays.sort(c);
        System.out.println("Ordenado: " + Arrays.toString(c));
        indice = Arrays.binarySearch(c, 15);
        System.out.println("indice = " + indice);

    }
}
