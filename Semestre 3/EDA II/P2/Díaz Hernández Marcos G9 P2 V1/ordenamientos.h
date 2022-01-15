//#ifndef _ORDENAMIENTOS_H_
//#define _ORDENAMIENTOS_H_

/*Como en la situacción anterior al querer las buenas practicas pues no me funciona el programa, intente definir las bibliotecas,
no funciono, despues busque la forma correcta de definir las librerias propias y tampoco, no se si se deba a la version de mi Dev,
pero no me pertmitia realizar las funciones y en el reporte se muestra la evidencia o la salida que se repitia al igual que en la 
practica 1, por ello recurri a definir las funciones junto a los prototipos.
*/

#include <stdio.h>
#include "utilidades.h"
void insertionSort(int a[], int n);
void selectionSort(int arreglo[], int n);
int partition(int arr[],int low, int high);
void quickSort(int arr[],int low, int high);
void bubbleSort(int a[],int size);
void Heapify(int* A, int i, int size);
void BuildHeap(int* A, int size);
void HeapSort(int* A, int size);

//#endif

int heapSize;

void Heapify(int* A, int i, int size)
{
	int l = 2 * i + 1; //Verifica para el hijo impar
	int r = 2 * i + 2;  //Verifica par el hijo par
	int largest;

	if(l <= heapSize && A[l] > A[i])
    	largest = l;
  	else
    	largest = i;
  	if(r <= heapSize && A[r] > A[largest]) //Comprueba el valor de los hijos con el de los padres
    	largest = r;
  	if(largest != i){ //Busca el posible caso que los hijos sean mayores al padre y comprueba que el largest no cambie de la posicion del padre
    	swap(&A[i],&A[largest]);
    	printf("Intercambio:\n");
    	printArray(A,size);
    	Heapify(A, largest,size); //En caso de que un hijo sea mayor al padre se debe verificar que el orden se cumpla y no haya otro hijo mayor
     }
      
}

void BuildHeap(int* A, int size){
	heapSize = size - 1;
  	int i;
  	for(i = (size - 1) / 2; i >= 0; i--){ //Busca los nodos finales, es decir los ultimos nodos que tuvieron hijos -Bottom Up
		Heapify(A, i,size);
  	}
	printf("\nTermin%c de construir el HEAP \n",162);
}

void HeapSort(int* A, int size){
	BuildHeap(A,size);
  	int i;
  	for(i = size - 1; i > 0; i--){
    	swap(&A[0],&A[heapSize]);  //Realiza el intercambio del padre con el ultimo hijo
      	heapSize--;
      	printf("Iteracion, de intercambio del heap, para eliminar raíz: \n");
  	printArray(A,size);
	Heapify(A, 0,size);
   }
}


int partition(int arr[],int low, int high){
	int pivot=arr[high]; //el pivote es el ultimo elemento del arreglo,
	int j,i=(low-1);
	for(j=low;j<=(high-1);j++){
		if(arr[j]<=pivot){
			i++;
			swap(&arr[i],&arr[j]); //busca el acomodo de los valores de la izquierda los menores y la derecha los mayores
			printf("Cambio en el arreglo:\n");
			printArray(arr,high);
		}
	}
	swap(&arr[i+1],&arr[high]); //en caso de no haber mayores o menores lo deja en su posicion
	printf("Cambio en el arreglo:\n");
	printArray(arr,high);
	return (i+1);
}

void quickSort(int arr[],int low, int high){
	if(low<high){
		int pi=partition(arr,low,high);
		quickSort(arr,low,pi-1); /* Estas funciones dividen el arreglo en funcion del pivote */
		quickSort(arr,pi+1,high);
	}
}

void bubbleSort(int a[],int size){
	int i,j,n,verifica=0,iteracion=0;
	n=size;
	for(i=n-1;i>0;i--){
		iteracion+=1; 
		verifica=1;				//En caso de que el valor cambie significa que se realizaron cambios en el ordenamiento
		for(j=0;j<i;j++){
			if(a[j]>a[j+1]){
				swap(&a[j],&a[j+1]);
				verifica=0; 	//Cuando cambia se tiene que se hicieron intercambios y por lo tanto todavía no se ordeno bien
			}
	 	}
		printf("Iteracion:%d\n",iteracion);
		printArray(a,size);
		if(verifica==(1)){
			i=0;
		}
	}
}


void selectionSort(int arreglo[], int n){
	int indiceMenor, i, j;
	for (i=0; i<n-1; i++){
		indiceMenor=i;
		for(j = i+1; j<n; j++){
			if(arreglo[j]<arreglo[indiceMenor]){
				indiceMenor=j;
			}
		}
		if (i!=indiceMenor){
			swap(&arreglo[i],&arreglo[indiceMenor]);
		}

		printf("\nIteracion numero %d \n",i+1);
		printArray(arreglo,n);
	}
}


void insertionSort(int a[], int n){
	int i,j,k;
	int aux;

	for(i=1; i<n; i++){
		j=i;
		aux=a[i];
		while (j>0 && aux < a[j-1]){
			a[j] = a[j-1];
			j--;
		}
		a[j]=aux;
		printf("\nIteracion numero %d \n",i);
		printArray(a,n);
	}
} 


