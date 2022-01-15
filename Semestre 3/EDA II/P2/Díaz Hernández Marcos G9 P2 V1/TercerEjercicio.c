#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "OrdenamientosModificados.h"

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
    
	printf("\nSelecciona el tipo de ordenamiento:\n 1)QuickSort\n 2)BubbleSort\n 3)HeapSort\n");
	scanf("%d",&opcion);
	
	switch(opcion){

		case 1:
			printf("Arreglo original:\n");
			printArray(A,valor);
			int i,j;
			quickSort(A,-1,valor);	
			printf("\nArreglo ordenado:\n");
			printArray(A,valor);
		break;
				
		case 2:
			printf("Arreglo original:\n");
			printArray(A,valor);
			bubbleSort(A,valor);	
			printf("\nArreglo ordenado:\n");
			printArray(A,valor);
		break;
				
		case 3:
			printf("Arreglo original:\n");
			printArray(A,valor);
			HeapSort(A,valor);	
			printf("\nArreglo ordenado:\n");
			printArray(A,valor);
		break;
				
		default:
			opcion=4;
			break;
		}
	free(A);
}
