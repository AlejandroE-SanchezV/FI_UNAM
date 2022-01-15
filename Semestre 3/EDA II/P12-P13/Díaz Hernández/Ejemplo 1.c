#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <omp.h>

//NRA: numero de renglones; NCB: numero de columnas; NCA: numero de columnas
int main(){
	int a[400][400], b[400][400], c[400][400];
	int i,j,k,tid,opcion;
	
	for(i=0;i<400;i++){
		for(j=0;j<400;j++){
			a[i][j]=rand()%10;
		}
	}
	
	for(i=0;i<400;i++){
		for(j=0;j<400;j++){
			b[i][j]=rand()%10;
		}
	}
	
	for(i=0;i<400;i++){
		for(j=0;j<400;j++){
			c[i][j]=0;
		}
	}
	do{
		printf("Inserta la opcion de multiplicacion: 1)Secuencial 2)Paralelo");
		scanf("%d",&opcion);
		switch(opcion){
			case 1:
				for(i=0;i<400;i++){
					for(j=0;j<400;j++){
						for(k=0;k<400;k++){
							c[i][j]+=a[i][k]*b[k][j];
							tid=omp_get_thread_num();
							printf("\nHilo:%d, valor C[%d][%d]=%d",tid,i,j,c[i][j]);
						}
					}
				}
				
				for(i=0;i<400;i++){
					for(j=0;j<400;j++){
						printf("\n C[%d][%d]:%d",i,j,c[i][j]);
					}
				}
				break;
				
			case 2:
				#pragma omp parallel for private (j,k)
				for(i=0;i<400;i++){
					for(j=0;j<400;j++){
						for(k=0;k<400;k++){
							c[i][j]+=a[i][k]*b[k][j];
							tid=omp_get_thread_num();
							printf("\nHilo:%d, valor C[%d][%d]=%d",tid,i,j,c[i][j]);
						}
					}
				}
				
				for(i=0;i<400;i++){
					for(j=0;j<400;j++){
						printf("\n C[%d][%d]:%d",i,j,c[i][j]);
					}
				}
				break;
				
			default:
				opcion=3;
				break;
		}
	}while(opcion<3);
	
	//Impresiones de los arreglos
	/*
	for(i=0;i<400;i++){
		for(j=0;j<400;j++){
			printf("\n A[%d][%d]:%d",i,j,a[i][j]);
		}
	}
	
	for(i=0;i<400;i++){
		for(j=0;j<400;j++){
			printf("\n B[%d][%d]:%d",i,j,b[i][j]);
		}
	}*/
	return 0;
}

