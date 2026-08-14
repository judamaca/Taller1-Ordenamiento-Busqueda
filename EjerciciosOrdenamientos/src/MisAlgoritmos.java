public class MisAlgoritmos implements Ordenamientos, Busquedas {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        return 0;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        return 0;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        int [] num = miArray.lenght();
        // 1. Bucle externo (cuenta las pasadas)
        for (int i = 0 ; i < n-1; i++) {

            // 2. Bucle interno (compara los vecinos)
            // Usamos (n - 1 - i) porque
            // en cada pasada el final ya está ordenado y nos ahorramos pasos.
            for (int j = 0; j < n-1; j++) {
                // comparaciones o intercambios
                if (myArray[j] > myArray[j+1]) {
                    int temporal = myArray[j+1];
                    myArray[j+1] = myArray [j];
                    myArray[j] = temporal;
                }

            }
        }
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
