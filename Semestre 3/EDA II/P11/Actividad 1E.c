#include<stdio.h>
#include<omp.h>

int main(){
	int tid,nth;
	#pragma omp parallel private (tid)
	{
		tid=omp_get_thread_num();
		nth=omp_get_num_threads();
		printf("Hola mundo desde el hilo %d de un total de:%d\n",tid,nth);
	}
	printf("Adios");
	
	int noProc= omp_get_num_procs();
	printf("\nNumero de procesadores:%d",noProc);
	return 0;
}  //Al no estar en dentro del pragma se toma la race entre los hilos para 
//su ejecucion de las variables
