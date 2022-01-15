#include <stdio.h>
#include "utilidades.h"


int partition(int arr[],int low, int high);
void quickSort(int arr[],int low, int high);
void bubbleSort(int a[],int size);
void Heapify(int* A, int i, int size);
void BuildHeap(int* A, int size);
void HeapSort(int* A, int size);


int heapSize;
int ContadorHComparaciones=0;
int ContadorHIntercambios=0;
int ContadorHFor=0;

void Heapify(int* A, int i, int size)
{
	int l = 2 * i + 1;
	int r = 2 * i + 2;
	int largest;
	ContadorHComparaciones+=1;
	if(l <= heapSize && A[l] > A[i])
    	largest = l;
  	else
    	largest = i;
    ContadorHComparaciones+=1;
  	if(r <= heapSize && A[r] > A[largest])
    	largest = r;
    ContadorHComparaciones+=1;
  	if(largest != i){
    	swap(&A[i],&A[largest]);
    	ContadorHIntercambios+=1;
    	printArray(A,size);
    	Heapify(A, largest,size);
     }
      
}

void BuildHeap(int* A, int size){
	heapSize = size - 1;
  	int i;
  	for(i = (size - 1) / 2; i >= 0; i--){
		Heapify(A, i,size);
		ContadorHFor+=1;
  	}
	printf("Termin%c de construir el HEAP \n",162);
}

void HeapSort(int* A, int size){
	BuildHeap(A,size);
  	int i;
  	for(i = size - 1; i > 0; i--){
    	swap(&A[0],&A[heapSize]);
		ContadorHIntercambios+=1;      
      	heapSize--;
      	printf("Iteracion HS: \n");
      	ContadorHFor+=1;
  	printArray(A,size);
	Heapify(A, 0,size);
   }
   printf("Numero de comparaciones:%d\n Numero de Intercambios:%d\n Numero de entradas al for:%d\n",ContadorHComparaciones, ContadorHIntercambios, ContadorHFor);
}

int ContadorQComparaciones=0;
int ContadorQIntercambios=0;
int ContadorQFor=0;

int partition(int arr[],int low, int high){
	int pivot=arr[high];
	int j,i=(low-1);
	for(j=low;j<=(high-1);j++){
		ContadorQFor+=1;
		ContadorQComparaciones+=1;
		if(arr[j]<=pivot){
			i++;
			swap(&arr[i],&arr[j]);
			ContadorQIntercambios+=1;
		}
	}
	swap(&arr[i+1],&arr[high]);
	ContadorQIntercambios+=1;
	return (i+1);
}

void quickSort(int arr[],int low, int high){
	ContadorQComparaciones+=1;
	if(low<high){
		int pi=partition(arr,low,high);
		quickSort(arr,low,pi-1);
		quickSort(arr,pi+1,high);
	}
	printf("Numero de comparaciones:%d\n Numero de intercambios:%d\n Numero de entradas al for:%d\n",ContadorQComparaciones,ContadorQIntercambios,ContadorQFor);
}

void bubbleSort(int a[],int size){
	int i,j,n,verifica,ContadorBComparaciones=0, ContadorBFor=0, ContadorBIntercambios=0;
	n=size;
	for(i=n-1;i>0;i--){
		ContadorBFor+=1;
		for(j=0;j<i;j++){
			ContadorBFor+=1;
			ContadorBComparaciones+=1;
			if(a[j]>a[j+1]){
				swap(&a[j],&a[j+1]);
				ContadorBIntercambios+=1;
			}
		}
	}
	printf("Numero de comparaciones:%d\n Numero de intercambios:%d\n Numero de entradas al for:%d\n",ContadorBComparaciones,ContadorBIntercambios,ContadorBFor);
}
