#include<stdio.h>

void alfa(int a, int b);

int main(){
	int A,B,C,D,tid;
	#pragma omp parallel shared(A,B,C)
	{
		tid = omp_get_thread_num();
		printf("Hilo:%d\n",tid);
		alfa(A,B);
		printf("Trabajando en A y B\n");
		
		#pragma omp barrier
		
		alfa(B,C);
		printf("Trabajando en B y C\n");
	}
	return 0;
}

void alfa(int a, int b){
	printf("Hola:) \n");
}

