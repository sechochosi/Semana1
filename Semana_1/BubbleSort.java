// Sebastián Alejandro Chocho Silva

public class BubbleSort {
    public static void bubbleSort(int[] arreglo) {
        //Se obtiene la longitud del arreglo.        
        int n = arreglo.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arreglo[j] > arreglo[j+1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Arreglo ordenado mediante Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
