package edu.uoc.ds.adt;

public class PR0Array {

    // Se define el array y la capacidad maxima del mismo (50)
    int[] array = new int[50];

    public PR0Array() {
        fillArray();
    }

    /*
        Metodo que inicializa el array con los primeros 50 pares
     */
    public void fillArray() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                array[i / 2] = i;
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getIndexOf(int indexOf) {
        int index = -1;
        int flag = 0; // Variable para almacenar el numero de iteraciones del bucle en caso de que no encuentre el valor
        for (int i = 0; i < array.length; i++) {
            flag++;
            if (array[i] == indexOf) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int binarySearch(int key) {
        int low = 0;
        int high = array.length - 1;

        int flag = 0; // Variable que almacena el numero de iteraciones del bucle
        while (low <= high) {
            flag++;
            int mid = (low + high) >>> 1;
            int midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -1;

        /*
            Pese a que la solucion que se pide (deduciendo el enunciado) es implementando un bucle para contar la iteraciones,
             es posible realizar busquedas binarias a traves de la propia libreria de Arrays.
             Para este fin, sería necesario (y debido a que la implementacion devuelve el valor negativo de la siguiente posicion), se almacena en una variable
             y, en caso de que la operacion de un valor inferior a 0, se devolvera -1 a fin de ser coherente con el test definido en la practica
         */
        //        int index = Arrays.binarySearch(array, key);
        //        return index < 0 ? -1 : index;
    }
}
