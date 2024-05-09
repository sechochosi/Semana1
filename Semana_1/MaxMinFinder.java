// Sebastián Alejandro Chocho Silva

public class MaxMinFinder {
    public static void MaxMin(int[] arr) {
        if (arr.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("El numero mayor es: " + max);
        System.out.println("El numero menor es: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 2, 18, 39, -1, -5, 3, 9, 1, 7};
        MaxMin(arr);
    }
}
