#include "utilidades.h"
#include <stdio.h>
#include <stdlib.h>

void selectionSort(int arreglo[], int n);
void insertionSort(int a[], int n);

void selectionSort(int arreglo[], int n){
	int indiceMenor, i, j, contadorM=0, contadorC=0, contadorS=0, contadorI=0, contadorF=0;
	for (i=0; i<n-1; i++){
		indiceMenor=i;
		contadorM+=1;
		for(j = i+1; j<n; j++){
			contadorC+=1;
			if(arreglo[j]<arreglo[indiceMenor]){
				indiceMenor=j;
				contadorI+=1;
			}
		}
		contadorF+=1;
		if (i!=indiceMenor){ //Colocarse dentro de otra posicion distinta a la que tenia al inicio
			swap(&arreglo[i],&arreglo[indiceMenor]);
			contadorS+=1;
		}
		printf("\nIteracion numero %d \n",i+1);
		printArray(arreglo,n);
	}
	printf("\nCambios de indice i: %d\n", contadorM);
	printf("Numero de comparaciones entre elementos: %d\n", contadorC);
	printf("Numero de cambio del indiceMenor: %d\n", contadorI);
	printf("Numero de intercambios: %d\n", contadorS);
	printf("Numero de posibles intercambios: %d\n", contadorF);
}


void insertionSort(int a[], int n){
	int i,j,k, UNO=0, DOS=0, TRES=0;
	int aux;
	for(i=1; i<n; i++){
		j=i;
		aux=a[i];
		while (j>0 && aux < a[j-1]){
			a[j] = a[j-1];
			j--;
			UNO+=1;
		}
		DOS+=1;
		a[j]=aux;
		printf("\nIteracion numero %d \n",i);
		printArray(a,n);
	}
	
	printf("\nNumero de inserciones/comparaciones totales: %d \n", (UNO + DOS)); //Se considera igual cuando no cambia de posicion
	printf("Numero inserciones que llevaron a la posicion preliminar: %d\n",UNO); //Movimientos en el arreglo que se llevaron en el while, y sirvieron para 
	/*																			  llevar a cabo un iteracion del for. */
	printf("Numero de inserciones en posicion final: %d\n", (UNO + DOS)/2); //Cada movimiento de posiciones implica llevar a cabo dos acciones una de copiar
	/*																		y después insertar, por lo que el movimieto se divide entre dos */
}

