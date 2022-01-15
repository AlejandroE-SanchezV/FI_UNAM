#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<omp.h>

#define n 30

void llenarArreglo(int *a);
void suma (int *a,int *b, int *c);

void main(){
	int max,*a,*b,*c;
	
	a=(int *)malloc(sizeof(int)*n);
	b=(int *)malloc(sizeof(int)*n);
	c=(int *)malloc(sizeof(int)*n);
	
	llenarArreglo(a);
	llenarArreglo(b);
	
	suma(a,b,c);
}

void llenarArreglo(int *a){
	int i;
	for(i=0;i<n;i++){
		a[i]=rand()%n;
		printf("%d ",a[i]);
	}
	printf("\n");
}

void suma (int *A, int *B, int *C){
	int i, tid;
	#pragma omp parallel private(tid) num_threads(4)
	{
		tid = omp_get_thread_num(); //Obtienen el identificador numerico del hilo
		#pragma omp for
		for(i=0;i<n;i++){
			C[i]=A[i]+B[i];
			printf("Hilo:%d Calculo:C[%d]=%d\n",tid,i,C[i]);
		}
	}
}

/* Suma paralela
void suma(int *A, int *B, int *C){
	int i, tid, inicio, fin;
	omp_set_num_threads(2);
	#pragma omp parallel private(inicio,fin,tid,i)
	{
		tid=omp_get_thread_num();
		inicio = tid*5;
		fin = (tid+1)*5-1;
		for(i=inicio;i<=fin;i++){
			C[i]=A[i]+B[i];
			printf("Hilo:%d calculo C[%d]=%d\n",tid,i,C[i]);
		}
	}

}*/


/* Suma serial
void suma(int *A, int *B, int *C){
	int i;
	for(i=0;i<n;i++){
		C[i]=A[i]+B[i];
		printf("%d\t",C[i]);
	}
} */
