#include<stdio.h>

int main(){
	int a[5],i;
	#pragma omp parallel
	{
		#pragma omp for
		for(i=0;i<5;i++){
			a[i]=i*i;
		}
		
		//#pragma omp master
		#pragma omp single
		for(i=0;i<5;i++){
			printf("a[%d]=%d\n",i,a[i]);
		}
		//#pragma omp barrier
		
		#pragma omp for
		for(i=0;i<5;i++){
			a[i]+=i;
			printf("Despues de barrera: a[%d]=%d\n",i,a[i]);
		}
	}
}
