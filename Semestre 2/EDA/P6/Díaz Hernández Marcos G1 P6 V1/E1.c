#include<stdio.h>
#include<stdlib.h>
#include "colaDoble.h"

void Operaciones(Cola *Cola1);

void main(){
	int longitud;
	printf("Ingresa el tamaño\n");
	scanf("%d",&longitud);
	Cola Cola1=crearCola(longitud);
	Operaciones(&Cola1);
}

void Operaciones(Cola *Cola1){
	mostrarIndices(*Cola1);
	encolarFinal(Cola1,11);
	encolarFinal(Cola1,12);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("Primera ejecucion \n");
	desencolarInicio(Cola1);
	desencolarInicio(Cola1);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("Segunda ejecucion \n");
	encolarFinal(Cola1,13);
	encolarFinal(Cola1,14);
	encolarInicio(Cola1,9);
	encolarInicio(Cola1,10);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("Tercera ejecucion\n");
	liberar(Cola1);
	system("PAUSE");
	 	
}
