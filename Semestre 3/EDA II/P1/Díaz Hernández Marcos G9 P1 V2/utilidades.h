#include <stdio.h>

void swap(int* a, int* b);
void printArray(int arr[],int size);
void printSubArray(int arr[],int low, int high);

//No estan definidas las lineas de codigo de las funciones por lo que cuando se invocan, las funciones no saben que hacer, o 
// no saben lo que se supone que tendrían que hacer porque no hay conexion entre las sentencias de utilidades.c 

void swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}

void printArray(int arr[],int size){
	int i;
  	for (i=0; i < size; i++)
       	printf("%d ", arr[i]);
    	printf("\n");
}

void printSubArray(int arr[],int low, int high){
    int i;
    printf("Sub array :  ");
	for (i=low; i <= high; i++)
       printf("%d ", arr[i]);
    printf("\n");
}
