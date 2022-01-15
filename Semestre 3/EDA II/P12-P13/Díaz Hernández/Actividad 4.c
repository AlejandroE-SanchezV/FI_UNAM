#include<stdio.h>
#include<omp.h>
#define N 10000 //Modificado por memoria

int main(){
	int opcion;
	double empezar, terminar;
	int i,j,tid;
	float a[N],b[N],c[N],d[N],e[N],f[N];
	do{
		printf("Cual metodo: \n1)section \n2)for\n");
		scanf("%d",&opcion);
		switch(opcion){
			case 1:
				#pragma omp parallel sections
				{
					#pragma omp section 
					{
						empezar=omp_get_wtime();
						printf("Tiempo:%f\n",empezar);
						
						for(i=0;i<N;i++){
							a[i]=b[i]=i*1;
						}
					}
			
					#pragma omp section 
					{
						for(i=0;i<N;i++){
							c[i]=a[i]+b[i];
						}
					}
					#pragma omp section 
					{
						for(j=0;j<N;j++){
							d[j]=e[j]+f[j];
						}
						terminar=omp_get_wtime();
						printf("Tiempo:%f\n",terminar);
					}
				}		
				printf("Tiempo:%f\n",empezar-terminar);
				break;
				
			case 2:
				#pragma omp parallel //La seccion del codigo se ejecutara por medio de los 4 hilos de procesamiento
				{
					empezar=omp_get_wtime();
					printf("TiempoEmpezo:%f\n",empezar);
					
					#pragma omp for
					for(i=0;i<N;i++){
						a[i]=b[i]=i*1;
					}
					
					#pragma omp for
					for(i=0;i<N;i++){
						c[i]=a[i]+b[i];
					}
					
					#pragma omp for
					for(j=0;j<N;j++){
						d[j]=e[j]+f[j];
					}
	
					terminar=omp_get_wtime();
					printf("TiempoTermino:%f\n",terminar);
					
				}		
				printf("Tiempo:%f\n",terminar-empezar);
				break;
				
			default:
				opcion=3;
				break;
		}
	}while(opcion<3);

	return 0;
}
