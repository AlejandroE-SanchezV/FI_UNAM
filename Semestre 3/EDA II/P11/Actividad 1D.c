#include<stdio.h>

int main(){
	int i;
	#pragma omp parallel private(i)
	{
		printf("Hola mundo\n");
		for(i=0;i<10;i++){
			printf("Iteracion:%d\n",i);
		}
		printf("Adios");
	}
	return 0;
} //Lo que sucede es que se toma la variable como unica para cada uno de los hilos
 //y esto significa que los for se imprimen en un orden 
