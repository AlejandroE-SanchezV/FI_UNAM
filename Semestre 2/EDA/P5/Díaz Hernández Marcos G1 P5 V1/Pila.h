#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int tope;
    int lista[100];
}Pila;

//declaración de funciones para trabajar con la estructura
Pila CrearPila();

//Estado de la pila
int Top(Pila P);
int IsEmpty(Pila P);

//Modificar la pila
void Push(Pila*,int);
int Pop(Pila*);


Pila CrearPila(){
	Pila P;
	P.tope=-1;
	return P;
}

int IsEmpty(Pila P){
	if(P.tope==-1)
		return 1;
	return 0;
}

void Push(Pila *P,int x){
	P->tope=P->tope+1;
	P->lista[P->tope]=x;
}

int Pop(Pila *P){
	if(IsEmpty(*P)==1){
		printf("No existen elementos en la pila\n");
	return -1;
	}
	else
	{
		int aux=P->lista[P->tope];
		P->lista[P->tope]=0;
		P->tope=P->tope-1;	
		return aux;
	}
}


int Top(Pila P){
	if(IsEmpty(P)==1){
		printf("La pila ya est%c vac%ca. \n",160,161);
		return -1;
	}
	else
		return P.lista[P.tope];
}

