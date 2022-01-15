
package practica2.díazmarcos;

/**
 * En esta clase se tienen dos metodos que esta relacionados, esto por que uno ayuda a la division de
 * la lista/arreglo y  el otro realiza los cambios de las posiciones.
 * 
 * Esta clase al igual que la principal, es publica y es algo bueno ya que aplica la modularidad,
 * también permite que la clase principal pueda acceder alos metodos por se publica y estos igual ser
 * publicos.
*/
public class Quicksort { //Las clases se definen  publicas para que la clase principal pueda tener acceso
    
    public static int partition(int[] arr,int low, int high){ //La definí publica sin el estatic porque este permite
       int pivot = arr[high];                          //que los valores se modifiquen por los objetos de la clase
        int i=(low-1);                                 //y en caso de tener dos el programa genera problemas
        for(int j=low; j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return (i+1);
    }
    
    public static void sort(int[] arr,int low, int high){
        if(low<high){
            int pi = partition(arr,low,high); 
            sort(arr,low,pi-1);  //La recurisividad me resulto algo extraña porque pense que se realizaría de 
            sort(arr,pi+1,high); //forma diferente pero este no es caso ya que se parece a C
        }
    }
}


