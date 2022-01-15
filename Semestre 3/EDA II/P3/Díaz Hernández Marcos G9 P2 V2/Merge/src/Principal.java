import java.util.Scanner;
public class Principal {

    public static void main(String args[]) 
    { 
        System.out.println("Inserta el tamaño de tu arreglo:");
        Scanner valor = new Scanner(System.in);
        int a = valor.nextInt();
        double [] arr = new double [a]; 
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Inserta tu valor:"+(i+1));
            double deposito=Math.random()*1000+1;
            arr[i]=deposito;
	}
        
        System.out.println("El arrreglo original es:");
        MergeSort instancia = new MergeSort();
        instancia.printArray(arr,0);
        instancia.sort(arr,0,arr.length-1);
        System.out.println("El arrreglo en orden es:");
        instancia.printArray(arr,0);
        
    } 
} 
    
    

