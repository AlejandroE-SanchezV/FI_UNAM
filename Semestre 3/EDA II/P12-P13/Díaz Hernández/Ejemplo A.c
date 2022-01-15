#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<omp.h>

#define n 10

int buscaMaximo(int *a);
int buscaMaximoA(int *a);
void llenarArreglo(int *a);

int main(){
	printf("Paralela\n");
	int retorno, *a;
	a=(int *)malloc(sizeof(int)*n);
	llenarArreglo(a);
	retorno = buscaMaximo(a);
	printf("Maximo: %d",retorno);
	
	printf("\n\nSerial\n");
	retorno = buscaMaximoA(a);
	printf("Maximo: %d",retorno);
	return 0;
}

int buscaMaximo(int *a){
	int max,i;
	max=a[0];
	#pragma omp parallel for
	for(i=0;i<n;i++){
		if(a[i]>max){
			#pragma omp critical
			{
				if(a[i]>max){
					max=a[i];
				}
			}
		}
	}
	return max;
}

int buscaMaximoA(int *a){
	int max,i;
	max=a[0];
	for(i=0;i<n;i++){
		if(a[i]>max){
			max=a[i];
		}
	}
	return max;
}

void llenarArreglo(int *a){
	int i;
	for(i=0;i<n;i++){
		a[i]=rand()%n; 
		printf("%d\t",a[i]);
	}
	printf("\n");
}
