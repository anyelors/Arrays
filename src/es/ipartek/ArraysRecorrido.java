package es.ipartek;

import java.util.Scanner;

public class ArraysRecorrido {
    public static void main(String[] args) {
        //Declaración
        String[] nombres; // Variable en {STACK} ambito método main
        //Instancia
        nombres = new String[5]; //Se crea Array {HEAP} y se asigna a la variable

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Digite Nombre[%d]:",i);
            nombres[i] = scan.nextLine();
        }

        System.out.println();

        //Bucle de visualización
        for (String nom : nombres) {
            System.out.println(nom);
        }


    }
}
