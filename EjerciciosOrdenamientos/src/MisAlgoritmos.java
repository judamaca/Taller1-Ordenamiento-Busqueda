import java.util.Arrays;

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
    public int[] bubbleSort(int[] myArray) {
        int n = myArray.length;
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
        return myArray;
    }

    @Override
    public int[] selectionSort(int[] myArray) {
        int n = myArray.length;

        for (int i = 0; i < n-1; i++) {
            int minimo = i;

            for (int j = i + 1; j < n; j++) {
                if (myArray[j] < myArray[minimo]) {
                    minimo = j;
                }
            }

        if (minimo != i) {
            int temporal = myArray[minimo];
            myArray[minimo] = myArray[i];
            myArray [i] = temporal;
        }
        }
        return myArray;
    }

    @Override
    public int[] insertionSort(int[] myArray) {
        int n = myArray.length;

        for (int i = 1; i < n; i++) {
            int temporal = myArray[i];
            int j = i - 1;

                    for (j = i-1; j>=0 && myArray[j] > temporal; j--) {
                        myArray[j + 1] = myArray[j];

                    }
                    myArray[j + 1] = temporal;
            }
        return myArray;
    }


    @Override
    public int[] mergeSort(int[] myArray) {

        if (myArray.length <= 1) {
            return myArray;
        }
    int medio = myArray.length / 2;

    int[] izquierda = Arrays.copyOfRange(myArray, 0, medio);
    int[] derecha = Arrays.copyOfRange(myArray, medio, myArray.length);

    int[] ordenado = new int[myArray.length];
    int i = 0,j = 0,k = 0;

    while (i < izquierda.length && j < derecha.length) {
        if (izquierda[i] < derecha[j]) {
            ordenado[k] = izquierda[i];
            i = i + 1;
        } else {
            ordenado[k] = derecha[j];
            j = j + 1;
        }
        k = k + 1;
    }

    while (j < izquierda.length) {
        ordenado[k] = izquierda[i];
        i = i + 1;
        k = k + 1;
    }

    while (i < derecha.length) {
        ordenado[k] = derecha[j];
        j = j + 1;
        k = k + 1;
    }
    return ordenado;

    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
