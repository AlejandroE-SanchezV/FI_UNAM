# include<stdio.h>

int main(){
	int i,tid;
	#pragma omp parallel private(tid)
	{
		tid=omp_get_thread_num();
		printf("Hola mundo\n");
		#pragma omp for
		for(i=0;i<10;i++){
			printf("Hilo:%d Iteracion:%d\n",tid,i);
		}
	}
	printf("Adios");
	return 0;
}
