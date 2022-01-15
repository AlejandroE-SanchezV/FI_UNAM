#include <stdio.h>
#include <stdlib.h>


main(){
	
	int cont,arreglo[]={35,40,45,50,55}; 
	int variable;
	int *ptr=(int *)calloc(10,sizeof(int));
	int *ptr3=(int *)calloc(10,sizeof(int));
	int *Ap=(int *)calloc(10,sizeof(int));
	
	//Imprimiendo direcciones de un arreglo
	for(cont=0;cont<10;cont++){
		printf("direccion arreglo[%d]=%d   valor arreglo[%d]=%d\n",cont,&arreglo[cont],cont,arreglo[cont]);
	}
	printf("\n");
	
	
	//Imprimiendo direcciones y contenido de un apuntador de memoria dinámica reservado con malloc
	for(cont=0;cont<10;cont++){
		printf("direccion=%d   *valor=%d \n",ptr+cont, *(ptr+cont));
	}
	printf("\n");
	
	for(variable=0;variable<10;variable++){
		*(ptr+ variable)=variable*5;
	}
	
	for(cont=0;cont<10;cont++){
		printf("Direccion de memoria de Ptr:%d, Contenido:%d\n",ptr+cont,*(ptr+cont));
	}
	printf("\n");
	
    ptr=(int *)realloc(ptr,20);
    ptr3=(int *)realloc(ptr,20);
    
    printf("Redimensionados\n");
    
	for(cont=0;cont<20;cont++){
		printf("Direccion de memoria de Ptr:%d, Contenido:%d\n",ptr+cont,*(ptr+cont));
	}
	printf("\n");
    
    for(cont=0;cont<20;cont++){
		printf("Direccion de memoria Ptr3:%d, Contenido:%d\n",ptr3+cont,*(ptr3+cont));
	}
    
	free(ptr);	
	free(ptr3);
	
	system("PAUSE");
}

