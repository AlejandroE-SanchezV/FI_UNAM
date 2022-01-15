
public class MergeSort {
    
    static void printArray(double arr[],int a) 
    { 
        int n = arr.length; 
        for (int i=a; i<n; i++) 
            System.out.println("Arreglo["+i+"]:"+arr[i]);
        System.out.println(); 
    } 
    
    
    static void merge(double arr[], int l, int m, int r) 
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        double L[] = new double [n1]; //Divide las listas en sublistas donde se repartiran los valores
        double R[] = new double [n2]; // del arreglo original
  
        for (int i=0; i<n1; ++i) //Se llenan los arreglos a partir del inicio y despues a la mitad
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        
        System.out.println("Division");
        printArray(L,0);
        System.out.println("Division");
        printArray(R,0);
        
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) //Compara las listas que almacenaron los valores del arreglo original
        {                        //de esta manera se ordenan los valores en el arreglo orginal, de acuerdo
            if (L[i] <= R[j])    // a la posicion que se tienen en la sublistas.
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) {  //Se rellena el arreglo original con los terminos que no cumpluieron con la 
            arr[k] = L[i]; //condicion anterior, para posteriormente ser divididos otra vez
            i++; 
            k++; 
        } 
  
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    static void sort(double arr[], int l, int r) { 
        if (l < r) { 
            int m = (l+r)/2; 
  
            sort(arr, l, m); //Primero se ejecutan las lineas de sort, lo que divide el arreglo principal
                             //en listas de un elemento y al final lo integra en el merge
            sort(arr , m+1, r);

            merge(arr, l, m, r); 
        } 
    }

    
    
}
