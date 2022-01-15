#include <stdio.h>
#include <stdlib.h>
int main(){
	int *i=calloc(10,sizeof(int));
	int j;
	
	for(j=0;j<10;j++){
		printf("Valor:%d, Memoria:%d\n",*(i+j),i+j);
	}
	
	i=(int *)realloc(i,0);
	
	if(i!=0){
	for(j=0;j<10;j++){
		printf("Valor:%d, Memoria:%d\n",*(i+j),i+j);
		}
	}
	else{
		printf("Se libero la memoria");
	}
	return 0;
	
}
