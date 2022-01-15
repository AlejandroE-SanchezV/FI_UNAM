#include<stdio.h>
#include"listacirc.h"

void main(){
	printf("Este menu le permite realizar distintas operaciones sobre la lista circular \n\n");
	Lista ListaP=crearLista();
	int opcion;
	char Placa[10],Marca[10],Modelo[10],Color[10],Estado[10];
	do{
	printf("\nSelecciona la opcion, insertando el valor de la posicion\n 1)Agregar al principio\n 2)Agregar al final\n 3)Eliminar al inicio\n"); 
	printf(" 4)Eliminar al final\n 5)Imprimir la lista\n 6)Busqueda\n 7)Recorrer Lista\n 8)Salir\n"); 
	printf("\nInserta la opcion:");
	scanf("%d",&opcion);
	
		switch(opcion){
			case 1:
			printf("Inserte la placa:");
			scanf("%s",&Placa);
			printf("Inserte la marca:");
			scanf("%s",&Marca);
			printf("Inserte el modelo:");
			scanf("%s",&Modelo);
			printf("Inserte el color:");
			scanf("%s",&Color);
			printf("Inserte el estado:");
			scanf("%s",&Estado);
			addPrincipioLista(&ListaP,Placa,Marca,Modelo,Color,Estado);
			break;
			
			case 2:
			printf("Inserte la placa:");
			scanf("%s",&Placa);
			printf("Inserte la marca:");
			scanf("%s",&Marca);
			printf("Inserte el modelo:");
			scanf("%s",&Modelo);
			printf("Inserte el color:");
			scanf("%s",&Color);
			printf("Inserte el estado:");
			scanf("%s",&Estado);
			addFinalLista(&ListaP,Placa,Marca,Modelo,Color,Estado);
			break;
			
			case 3:
			borrarPrimero(&ListaP);
			break;
			
			case 4:
			borrarUltimo(&ListaP);
			break;
			
			case 5:
			print_list(ListaP);
			break;
			
			case 6:
			printf("Inserte la marca del automovil:");
			scanf("%s",&Marca);
			BuscarAuto(ListaP,Marca);
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
