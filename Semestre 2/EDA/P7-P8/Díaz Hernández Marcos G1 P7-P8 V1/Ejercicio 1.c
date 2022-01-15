#include<stdio.h>
#include"lista.h"

void main(){
	printf("Este menu le permite realizar distintas operaciones sobre la lista \n\n");
	Lista ListaP=crearLista();
	int opcion,valor;
	do{
	printf("\nSelecciona la opcion, insertando el valor de la posicion\n 1)Agregar al principio\n 2)Agregar al final\n 3)Agregar en un posicion indicada\n"); 
	printf(" 4)Eliminar al inicio\n 5)Eliminar al final\n 6)Buscar un elemento\n 7)Eliminar un elemento en una posicion indicada\n"); 
	printf(" 8)Eliminar elementos mayores\n 9)Imprimir la lista\n 10)Salir");
	printf("\nInserta la opcion:");
	scanf("%d",&opcion);
	
		switch(opcion){
			case 1:
			printf("Inserte el valor:");
			scanf("%d",&valor);
			addPrincipioLista(&ListaP,valor);
			break;
			
			case 2:
			printf("Inserte el valor:");
			scanf("%d",&valor);
			addFinalLista(&ListaP,valor);
			break;
			
			case 3:
			printf("Inserte el valor:");
			scanf("%d",&valor);
			addIesimoLista(&ListaP,valor);
			break;
			
			case 4:
			borrarPrimero(&ListaP);
			break;
			
			case 5:
			borrarUltimo(&ListaP);
			break;
			
			case 6:
			printf("Inserte el valor a buscar:");
			scanf("%d",&valor);
			valor=BuscarElemento(ListaP,valor);
			if (valor==0) printf("No existe\n");
			else printf("La posicion es:%d\n",valor);
			break;
			
			case 7:
			printf("Inserte la posicion que se va a eliminar:");
			scanf("%d",&valor);
			EliminarIesimo(&ListaP,valor);
			break;
			
			case 8:
			printf("Inserte el valor que servira de medida para eliminar los elementos mayores a este:");
			scanf("%d",&valor);
			EliminarMayores(&ListaP,valor);
			break;
			
			case 9:
			print_list(ListaP);
			break;
			
			defaulf:
			opcion=10;
			break;
		}
	}
	while(opcion<10);
}
