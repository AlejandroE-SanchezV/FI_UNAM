#include "Pila.h"
#include<stdio.h>
#include <stdlib.h>

void Ingresar(Pila *P);
void Mayor(Pila *P,Pila *A, Pila *B);
void Orden(Pila *P,Pila *A);

int main(){
	int M;
	Pila PrimerPila=CrearPila();
	Ingresar(&PrimerPila);
	Pila PilaA=CrearPila();
	Pila PilaB=CrearPila();
	Mayor(&PrimerPila,&PilaA,&PilaB);
	return 0;
}

void Ingresar(Pila *P){
	int i,j[10];
	printf("Ingresar valores numericos enteros\n");
	for(i=0;i<10;i++){
		printf("El valor[%d]:\n",i+1);
		scanf("%d",&j[i]);
		Push(P,j[i]);
	}
}

void Orden(Pila *P,Pila *A){
	int i;
	for(i=0;i<2;i++){
		Push(A,Pop(P));
		//printf("Top de P%d\n",Top(*P));
		//printf("Top de A%d\n",Top(*A));
	}
	//printf("Primera parte\n\n");
}

void Mayor(Pila *P,Pila *A, Pila *B){
	Orden(P,A);
	int j;
	for(j=0;j<8;j++){	
		if((A->lista[A->tope])>(A->lista[A->tope-1])){
			Push(P,Pop(A));
			Push(B,Pop(A));
		Orden(P,A);
		
		}
		else{
			((A->lista[A->tope])<(A->lista[A->tope]-1));
			Push(B,Pop(A));
			Push(P,Pop(A));
			Orden(P,A);
		}
	}
	
	if((A->lista[A->tope])>(A->lista[A->tope-1])){
			Push(P,Pop(A));
			Push(B,Pop(A));
	}
	else{
			((A->lista[A->tope])<(A->lista[A->tope]-1));
			Push(B,Pop(A));
			Push(P,Pop(A));
		}
		
	printf("Maximo Valor:%d",Top(*P));
}
