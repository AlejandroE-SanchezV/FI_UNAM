#include <stdio.h>
#include <stdlib.h>
#include "ordenamientos.h"

void main(){
	int i, opcion, valor;
	int *A;
	printf("Inserta la cantidad de valores de tu arreglo:\n");
	scanf("%d",&valor);
	
	A=(int*)calloc(valor,sizeof(int));
	printf("Inserta los valores de tu arreglo:\n");
				for(i=0; i<valor;i++){
					printf("Valor[%d]:",i+1);
					scanf("%d",&A[i]);
				}
	do{
		printf("\nSelecciona el tipo de ordenamiento:\n 1)Selection\n 2)Insertion\n 3)Quick\n 4)Bubble\n 5)Heap\n");
		scanf("%d",&opcion);
		switch(opcion){
				case 1:
					printf("Arreglo original:\n");
					printArray(A,valor);
					selectionSort(A,valor);
					printf("\nArreglo ordenado:\n");
					printArray(A,valor);
				break;
				
				case 2:
					printf("Arreglo original:\n");
					printArray(A,valor);
					insertionSort(A,valor);	
					printf("\nArreglo ordenado:\n");
					printArray(A,valor);
				break;
				
				case 3:
					printf("Arreglo original:\n");
					printArray(A,valor);
					int i,j;
					quickSort(A,0,valor-1);	
					printf("\nArreglo ordenado:\n");
					printArray(A,valor);
				break;
				
				case 4:
					printf("Arreglo original:\n");
					printArray(A,valor);
					bubbleSort(A,valor);	
					printf("\nArreglo ordenado:\n");
					printArray(A,valor);
				break;
				
				case 5:
					printf("Arreglo original:\n");
					printArray(A,valor);
					HeapSort(A,valor);	
					printf("\nArreglo ordenado:\n");
					printArray(A,valor);
				break;
				
				default:
					opcion=6;
					break;
		}
	}
	while(opcion<6);
	free(A);
}
