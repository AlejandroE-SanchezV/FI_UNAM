#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "ordenamientos modificados.h"

void main(){
	int i, opcion, valor;
	int *A;
	printf("Inserta la cantidad de valores de tu arreglo:\n");
	scanf("%d",&valor);
	A=(int*)calloc(valor,sizeof(int));
	
	srand (time(NULL));
    for (i=0; i<=valor; i++) {
        A[i] = rand()%10000000;
    }
    
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
	free(A);
}
