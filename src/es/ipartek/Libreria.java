package es.ipartek;

import java.util.Arrays;

public class Libreria {

    /**
     * Busca la primera posicion de un valor en el array
     * @param valores Array donde buscar el valor
     * @param buscado Valor buscado
     * @return posicion de la primera aparicion del valor en el array o -1 si no se encuentra
     */
    public static int buscar ( int[] valores, int buscado) {
        int indx = -1;

        for (int i = 0; (i < valores.length && indx == -1); i++) {
            if (buscado == valores[i]) {
                indx = i;
            }
        }

        return indx;
    }

    /**
     * Indica si el valor indicado está presente en el array
     * @param valores Array donde comprobar si el valor existe
     * @param buscado Valor buscado
     * @return True si el valor buscado existe en el array, False en caso contrario.
     */
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

    /**
     * Recuenta el n.º de apariciones del valor indicado en el array
     * @param valores Array donde contabilizar las apariciones del valor
     * @param buscado Valor a contabilizar
     * @return Cantidad de apariciones del valor buscado
     */
    public static int recuento ( int[] valores, int buscado) {
        int cont = 0;
        for (int i = 0; i < valores.length; i++) {
            if (buscado == valores[i])
                cont++;
        }
        return cont;
    }

    /**
     * Obtiene la posición del valor maximo presente en el array de enteros
     * @param valores Array de valores
     * @return Posicion del valor maximo
     */
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

    /**
     * Obtiene la posicion del valor minimo presente en el array de enteros
     * @param valores Array de valores
     * @return Posicion del valor minimo
     */
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

    /**
     * Invierte un Array de enteros
     * @param valores Array de valores
     * @return Un Array nuevo invertido
     */
    public static int[] invertir ( int[] valores ) {
        int[] valoresInvertir = new int[valores.length];
        int indx = 0;

        for (int i = valores.length-1; i >= 0; i--) {
            valoresInvertir[indx] = valores[i];
            indx++;
        }

        return valoresInvertir;
    }

    /**
     * Calcula sumatoria de un array de valores
     * @param valores Array de valores
     * @return sumatoria
     */
    public static int calculoSumatoria ( int[] valores ) {
        int sumatoria = 0;

        for (Integer valor : valores){
            sumatoria += valor;
        }

        return sumatoria;
    }

    /**
     * Recuenta cantidad de valores mayor o igual al valor indicado en el array
     * @param valores Array donde contabilizar las apariciones del valor
     * @param buscado Valor a contabilizar
     * @return Cantidad de apariciones del valor buscado
     */
    public static int recuentoMaxValor ( int[] valores, int valor) {
        int cont = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= valor)
                cont++;
        }
        return cont;
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
