
package practica2.díazmarcos;
/**
 * Esta ultima clase de ayuda, pues funciona de igual forma que la clase, Quicksort pero en este
 * caso solo se realiza la impresion de los miembros.
 * A veces me resulta confuso pero poco a poco le estoy a agarrando la onda
 */

public class Utilidades {
    public static void printArray(int[] arr){
        int n;
        n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
