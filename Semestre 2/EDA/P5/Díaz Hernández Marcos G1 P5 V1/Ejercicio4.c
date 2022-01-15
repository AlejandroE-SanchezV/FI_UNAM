#include<stdio.h>
#include<stdlib.h>
#include "Cola2.h"

void Llenar(Libro *A,int z,Cola *C);
void Leer(Cola C,int z);


int main(){
	int a;
	printf("Inserta los libros a registrar:");
	scanf("%d",&a);
	Libro *Libros=calloc(a,sizeof(Libro));
	Cola Books=crearCola();
	
	Llenar(Libros,a,&Books);
	Leer(Books,a);
	free(Libros);
	
	return 0;
}

void Llenar(Libro *A,int z,Cola *C){
	int i;
	for(i=0;i<z;i++){
		printf("\nDatos del libro[%d]\n",i+1);
		printf("Inserta el Titulo:\n");
		scanf("%s",&A[i].Titulo);
		printf("Insertar el Autor:\n");
		scanf("%s",&A[i].Autor);
		printf("Insertar N° de paginas:\n");
		scanf("%f",&A[i].Paginas);
		printf("Insertar la clave:\n");
		scanf("%d",&A[i].Clave);
		encolar(C,A[i]);
	}
}

void Leer(Cola C,int z){
	int i,a;
	a=0;
	for(i=0;i<z;i++){
	printf("\nLos datos de los libro[%d]:\n",i+1);
	printf("Libro:%s\n",C.lista[i].Autor);
	printf("Paginas:%f, Tiempo de Lectura:%f minutos\n",C.lista[i].Paginas,(C.lista[i].Paginas)*(1.0/3));
	a+=C.lista[i].Paginas;
	}
	printf("Suma Total de lectura:%f",a*(1.0/3));
}
