#include<stdio.h>

void actTodos();
void actSingle();

int main(){
	int tid;
	
	printf("Single:\n");
	#pragma omp parallel 
	{
		tid = omp_get_thread_num();
		printf("Hilo:%d\n",tid);
		actTodos();
		#pragma omp single
		{
			tid = omp_get_thread_num();
			printf("HiloSINGLE:%d\n",tid);
			actSingle();
		}
		tid = omp_get_thread_num();
		printf("Hilo:%d\n",tid);
		actTodos();
	}
	
	printf("\nMaster:\n");
	#pragma omp parallel 
	{
		tid = omp_get_thread_num();
		printf("Hilo:%d\n",tid);
		actTodos();
		#pragma omp master
		{
			tid = omp_get_thread_num();
			printf("HiloMASTER:%d\n",tid);
			actSingle();
		}
		tid = omp_get_thread_num();
		printf("Hilo:%d\n",tid);
		actTodos();
	}
	
	return 0;
}

void actTodos(){
	printf("Hola:) \n");
}

void actSingle(){
	printf("Adios:( \n");
}
