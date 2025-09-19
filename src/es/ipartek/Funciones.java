package es.ipartek;

import java.util.Arrays;

public class Funciones {

    //Sintaxis de métodos en Java
    //Tipo retorno identificador (tipo parametro1, tipo parametro2, ...)
    public static void saludar(String nombre) {
        String saludo = "Hola"; //Solo es visible en el método
        System.out.printf("%s %s\n", saludo, nombre);
    }

    //Sobrecarga de método
    public static void saludar(String nombre, int edad) {
        //Una variable declarada dentro de un método Solo es visible en el método
        String saludo = "Hola";
        System.out.printf("%s %s tienes %d años\n", saludo, nombre, edad);
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static void fooEntero (int a) {
        System.out.println("a = " + a);
        a = 20;
        System.out.println("a = " + a);
    }

    public static void fooEntero (int[] a) {
        System.out.println("Dentro del método recibido = " + Arrays.toString(a));
        a[0] = 100;
        System.out.println("saliendo método = " + Arrays.toString(a));
    }

    public static void main(String[] args) {
        int edad = 9;
        //Métodos sin retorno
        String miNombre = "Lupe";
        saludar("Maria");
        saludar(miNombre, edad);
        //Métodos con retorno
        int suma = sumar(15, 23);
        System.out.println("suma = " + suma);

        //Los tipos de datos primitivos y String no persiste los cambios realizados en los métodos
        int a = 10;
        System.out.println("Antes del método foo " + a);
        fooEntero(a);
        System.out.println("Después del método foo " + a);

        int[] ar = {10, 20, 30};
        System.out.println("Antes del método foo " + Arrays.toString(ar));
        fooEntero(ar);
        System.out.println("Después del método foo " + Arrays.toString(ar));
    }
}
