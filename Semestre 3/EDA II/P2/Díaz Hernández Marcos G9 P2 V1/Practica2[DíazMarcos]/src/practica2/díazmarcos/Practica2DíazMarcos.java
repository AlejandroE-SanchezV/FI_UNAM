package practica2.díazmarcos;

/**
*En este caso se crea una clase publica unicamente y dentro de esta se encuentra el metodo principal,
* por lo que este puede crear objetos de otras clases y editar sus valores.
*/
public class Practica2DíazMarcos {
    
    public static void main(String[] args){
        int[] arr={87,4,32,15,8,12,10,30,22};
        int[] arr1={1,345,657,234,678,23};
        Quicksort quicksort = new Quicksort(); //Se crea el objeto de tipo Quicksort
        quicksort.sort(arr,0,arr.length-1);    //Se realiza el metodo sort, y se envian los datos.
        Utilidades.printArray(arr); 
        Quicksort.sort(arr1, 0,arr1.length-1); 
        Utilidades.printArray(arr1); 
    }
    /**
     * Cuando se coloca la palabra static se puede acceder almetodo sin la necesidad de crear un objeto
     * solo es necesario invocar a la clase y por medio de esta se puede utilizar
     */
}
