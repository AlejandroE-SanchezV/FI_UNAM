#include<stdio.h>
#include "cola.h"
#include "Pila.h"

void Ingresar(Pila *P);
void PasarPila(Pila *P,Cola *C);
void Invertir(Pila *P,Cola *C);
void Imprimir(Pila *P);

int main(){
	
	Pila PrimerPila=CrearPila();
	Ingresar(&PrimerPila);
	Cola PrimerCola=crearCola();
	PasarPila(&PrimerPila,&PrimerCola);
	Invertir(&PrimerPila,&PrimerCola);
	Imprimir(&PrimerPila);
	return 0;
}

void Ingresar(Pila *P){
	printf("\nIngresa\nPrimer valor:");
	scanf("%d",&P->lista[0]);
	P->tope=P->tope+1;
	
	printf("\nSegundo valor:");
	scanf("%d",&P->lista[1]);
	P->tope=P->tope+1;
	
	printf("\nTercer valor:");
	scanf("%d",&P->lista[2]);
	P->tope=P->tope+1;
	
	printf("\nCuarto valor:");
	scanf("%d",&P->lista[3]);
	P->tope=P->tope+1;
	
	printf("\nQuinto valor:");
	scanf("%d",&P->lista[4]);
	P->tope=P->tope+1;
	
	printf("\nSexto valor:");
	scanf("%d",&P->lista[5]);
	P->tope=P->tope+1;
	
	printf("\nSeptimo valor:");
	scanf("%d",&P->lista[6]);
	P->tope=P->tope+1;
	
	printf("\nOctavo valor:");
	scanf("%d",&P->lista[7]);
	P->tope=P->tope+1;
	
	printf("\nNoveno valor:");
	scanf("%d",&P->lista[8]);
	P->tope=P->tope+1;
	
	printf("\nDecimo valor:");
	scanf("%d",&P->lista[9]);
	P->tope=P->tope+1;
		
}


void PasarPila(Pila *P,Cola *C){
	
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));
	encolar(C,Pop(P));

}

void Invertir(Pila *P,Cola *C){
	
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	Push(P,desencolar(C));
	
	
}

void Imprimir(Pila *P){
	
	printf("\nValor[1]:%d\n",P->lista[P->tope-9]);
	printf("Valor[2]:%d\n",P->lista[P->tope-8]);
	printf("Valor[3]:%d\n",P->lista[P->tope-7]);
	printf("Valor[4]:%d\n",P->lista[P->tope-6]);
	printf("Valor[5]:%d\n",P->lista[P->tope-5]);
	printf("Valor[6]:%d\n",P->lista[P->tope-4]);
	printf("Valor[7]:%d\n",P->lista[P->tope-3]);
	printf("Valor[8]:%d\n",P->lista[P->tope-2]);
	printf("Valor[9]:%d\n",P->lista[P->tope-1]);
	printf("Valor[10]:%d\n",P->lista[P->tope]);
	
	
}
