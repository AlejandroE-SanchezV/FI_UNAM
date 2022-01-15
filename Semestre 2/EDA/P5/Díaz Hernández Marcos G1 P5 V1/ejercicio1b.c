#include<stdio.h>
#include "cola.h"

int main(){
   
   	Cola queue1 = crearCola();
    desencolar(&queue1);
	encolar(&queue1,5);
	encolar(&queue1,10);
	encolar(&queue1,15);
	encolar(&queue1,20);
	printf("Valores de los indices: \n");
  	printf("Primero:%d \n",queue1.primero);  
  	printf("Ultimo: %d \n",queue1.ultimo);
	encolar(&queue1,25);
    int x = desencolar(&queue1);
	int y = desencolar(&queue1);
	printf("%d\n",x);
	printf("%d\n",y);
	printf("Valor misterioso:  %d \n",x+y);
	encolar(&queue1,30);
	encolar(&queue1,35);
	encolar(&queue1,40);
	encolar(&queue1,55);
	int f = first(queue1);
	printf("EL que esta hasta adelante es: %d\n",f);
  	printf("f = %d \n",f);
	printf("Valores de los indices: \n");
  	printf("Primero %d \n",queue1.primero);  
  	printf("Ultimo %d \n",queue1.ultimo);


	return 0;
}

