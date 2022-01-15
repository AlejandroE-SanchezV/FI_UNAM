#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int primero;
    int ultimo;
    int lista[100];
}Cola;

//declaración de funciones para trabajar con la estructura
Cola crearCola();
void encolar(Cola*,int);
int desencolar(Cola*);

//Estado de la Queue
int first(Cola);
int isEmpty(Cola);

Cola crearCola(){
	Cola c;
	c.primero=0;
	c.ultimo=-1;
	return c;
}
int isEmpty(Cola c){
	if(c.primero==c.ultimo+1)
		return 1;
	return 0;
}

void encolar(Cola *c,int x){
	c->ultimo=c->ultimo+1;
	c->lista[c->ultimo]=x;
}

int desencolar(Cola *c){
	int aux;
	if(isEmpty(*c)==1){
		printf("Cola vacia\n");
		return -1;
	}
	else{
		aux=c->lista[c->primero];
		c->primero=c->primero+1;
	}
	if(c->primero==c->ultimo+1){
		printf("Cola vacia");
		*c=crearCola();//Se crea nueva cola, ya que la anterior esta vacia
	}
	return aux;
}

int first(Cola c){
	if(isEmpty(c)==1){
		printf("La cola ya est%c vac%ca. \n",160,161);
		return -1;
	}
	else
		return c.lista[c.primero];
}

