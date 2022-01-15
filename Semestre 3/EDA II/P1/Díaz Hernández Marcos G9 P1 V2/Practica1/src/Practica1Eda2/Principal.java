package Practica1Eda2;

public class Principal {
    
    //En si es muy similar a los elementos de C, pero hay una división similar a las funciones,
    //que son las clases, pero estas tienen un funcionamiento mejor en cuanto a procesos aplicados
    //porque cuando hay un error este se aisla y solo afecta a esa clase, lo que no sucede en las 
    // estructuras de datos donde un error afecta todo.
    
    public static void main(String args[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22}; 
        int[] arr2 = {10,15,4,3,44,12,59,23}; 

        System.out.println("Arreglos Originales");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
        
        Insercion.insertionSort(arr1);
        
        Seleccion seleccion = new Seleccion();   
        seleccion.selectionSort(arr2);  
       
             
        System.out.println("Arreglos ordenados");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
        
    }  
    
   
}
