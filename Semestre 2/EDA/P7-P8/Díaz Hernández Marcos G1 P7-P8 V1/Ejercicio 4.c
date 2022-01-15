#include<stdio.h>
#include"listaDobleCircular.h"

void main(){
	printf("Este menu le permite realizar distintas operaciones sobre la lista cricular doble \n\n");
	Lista ListaP=crearLista();
	int opcion,valor;
	do{
	printf("\nSelecciona la opcion, insertando el valor de la posicion\n 1)Imprimir la lista\n 2)Agregar al principio\n 3)Agregar al final\n"); 
	printf(" 4)Crear un nodo unico\n 5)Eliminar al inicio\n 6)Eliminar al final\n 7)Recorrer la lista\n 8)Salir\n"); 
	printf("\nInserta la opcion:");
	scanf("%d",&opcion);
	
		switch(opcion){
			case 1:
			print_list(ListaP);
			break;
			
			case 2:
			printf("Inserte el valor:");
			scanf("%d",&valor);
			addPrincipioLista(&ListaP,valor);
			break;
			
			case 3:
			printf("Inserte el valor:");
			scanf("%d",&valor);
			addFinalLista(&ListaP,valor);
			break;
			
			case 4:
			printf("Inserte el valor:");
			scanf("%d",&valor);
			primerNodo(&ListaP,valor);
			break;
			
			case 5:
			borrarPrimero(&ListaP);
			break;
			
			case 6:
			borrarUltimo(&ListaP);
			break;
			
			case 7:
			recorrerLista(ListaP);
			break;
	
			defaulf:
			opcion=8;
			break;
		}
	}
	while(opcion<8);
}
