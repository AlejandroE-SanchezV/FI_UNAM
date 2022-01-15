#include<stdio.h>

int main(){
	int i;
	omp_set_num_threads(8); //Indica los hilos que usar en todos los progamas
	#pragma omp parallel num_threads(4) //Indica cuantos usar en el progama indicados
	{
		printf("Hola mundo\n");
		for(i=0;i<10;i++){
			printf("Iteracion:%d\n",i);
		}
		printf("Adios");
	}
	return 0;
}
