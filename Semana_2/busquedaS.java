// Sebastián Alejandro Chocho Silva

package Semana_2;

import java.util.Scanner;
import java.util.Arrays;

public class busquedaS {


    // Función para realizar la búsqueda secuencial
    public static void busquedaSecuencial(int[] arr, int clave) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == clave) {
                System.out.println("Clave detectada en la posición: " + i);
                return;
            }
        }
        System.out.println("Clave no detectada");
    }

    // Función para realizar el ordenamiento del arr
    public static void ordenararr(int[] arr) {
        Arrays.sort(arr);
    }

    // Función para realizar la búsqueda binaria
    public static void busquedaBinaria(int[] arr, int clave) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (arr[medio] == clave) {
                System.out.println("clave detectada en la posición: " + medio);
                return;
            } else if (arr[medio] < clave) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        System.out.println("Clave no detectada");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar 20 elementos numéricos
        int[] arr = new int[20];
        System.out.println("Ingrese 20 elementos #:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Pide al usuario la clave
        System.out.print("Ingrese la clave a buscar: ");
        int clave = scanner.nextInt();

        // Búsqueda Secuencial
        System.out.println("Búsqueda Secuencial");
        busquedaSecuencial(arr, clave);

        // Arreglo
        System.out.println("Ordenando el arreglo");
        ordenararr(arr);

        // Búsqueda Binaria
        System.out.println("Búsqueda Binaria");
        busquedaBinaria(arr, clave);

        scanner.close();
    }
}
