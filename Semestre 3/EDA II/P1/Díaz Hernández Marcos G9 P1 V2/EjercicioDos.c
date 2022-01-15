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
		printf("\nSelecciona el tipo de ordenamiento:\n 1)Selection\n 2)Insertion\n");
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
				
				default:
					opcion=3;
					break;
		}
	}
	while(opcion<3);
	free(A);
}
