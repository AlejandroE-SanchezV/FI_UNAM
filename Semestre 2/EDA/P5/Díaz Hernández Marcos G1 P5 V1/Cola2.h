#include <stdio.h>
#include <stdlib.h>

typedef struct{
	char Titulo[15];
	char Autor[10];
	float Paginas;
	int Clave;
}Libro;

typedef struct{
    int primero;
    int ultimo;
    Libro lista[100];
}Cola;

//declaración de funciones para trabajar con la estructura
Cola crearCola();
void encolar(Cola*,Libro );
Libro desencolar(Cola*);

//Estado de la Queue
Libro first(Cola);
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

void encolar(Cola *c,Libro x){
	c->ultimo=c->ultimo+1;
	c->lista[c->ultimo]=x;
}

Libro desencolar(Cola *c){
	Libro aux;
	if(isEmpty(*c)==1){
		printf("Cola vacia\n");
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

Libro first(Cola c){
	if(isEmpty(c)==1){
		printf("La cola ya est%c vac%ca. \n",160,161);
	}
	else
		return c.lista[c.primero];
}

