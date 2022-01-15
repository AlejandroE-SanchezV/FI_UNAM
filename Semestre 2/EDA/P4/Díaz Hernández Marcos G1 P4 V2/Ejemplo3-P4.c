#include<stdio.h>
#include<stdlib.h>
int main(){
	int *arreglo,*arreglo1,num,cont;
	printf("Cuantos elementos tiene el conjunto\n");
	scanf("%d",&num);
	arreglo=(int *)malloc(num*sizeof(int));
	if(arreglo!=NULL){
		
			printf("Vector reservado:\n\t[");
		for(cont=0;cont<num;cont++){
			printf("\t%d",(arreglo+cont));
		}
		printf("\t]\n");
		
		for(cont=0;cont<num;cont++){
			printf("Inserte el elemento %d del conjunto.\n",cont+1);
			scanf("%d",(arreglo+cont));
		}
	}
	printf("Vector insertado:\n\t[");
	for(cont=0;cont<num;cont++){
		printf("\t%d",*(arreglo+cont));
	}
	printf("\t]\n");
	
	printf("Aumentando el tamaño del conjunto al doble.\n");
	num *=2;
	arreglo1=(int *)realloc(arreglo,num*sizeof(int));
	
	if(arreglo1!=NULL){
		arreglo=arreglo1; //Guardar datos anteriores sino se pierde
	
		for(;cont<num;cont++){
			printf("Inserte el elemento %d del conjunto.\n",cont +1);
			scanf("%d",(arreglo1+cont));
		}
		
	printf("Vector insertado:\n\t[");
	for(cont=0;cont<num;cont++){
		printf("\t%d",*(arreglo1+cont));
		}
	printf("\t]\n");
	}
	free(arreglo);
	return 0;
}
