#include "colaDoble.h"

void OperacionesNormal(Cola *Cola1);
void OperacionesCircular(Cola *Cola2);

void main(){
	int tamano,size;
	printf("Inserte el tamano de la lista normal\n");
	scanf("%d",&tamano);
	printf("Inserte el tamano de la lista circular\n");
	scanf("%d",&size);
	Cola Cola1=crearcola(tamano);
	Cola Cola2=crearCola(size);
	OperacionesNormal(&Cola1);
	OperacionesCircular(&Cola2);
}

void OperacionesNormal(Cola *Cola1){
	printf("Operaciones de cola normal en cola normal\n");
	mostrarIndices(*Cola1);
	encolar(Cola1,15);
	encolar(Cola1,25);
	encolar(Cola1,35);
	encolar(Cola1,45);
	encolar(Cola1,55);
	encolar(Cola1,65);
	encolar(Cola1,75);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("\n");
	desencolar(Cola1);
	desencolar(Cola1);
	desencolar(Cola1);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("\n");
	encolar(Cola1,85);
	desencolar(Cola1);	
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	liberar(Cola1);
	printf("\n");
}

void OperacionesCircular(Cola *Cola2){
	printf("Operaciones de cola normal en cola circular\n");
	mostrarIndices(*Cola2);
	encolar(Cola2,15);
	encolar(Cola2,25);
	encolar(Cola2,35);
	encolar(Cola2,45);
	encolar(Cola2,55);
	encolar(Cola2,65);
	encolar(Cola2,75);
	mostrarValores(*Cola2);
	mostrarIndices(*Cola2);
	printf("\n");
	desencolar (Cola2);
	desencolar (Cola2);
	desencolar (Cola2);
	mostrarValores(*Cola2);
	mostrarIndices(*Cola2);
	printf("\n");
	encolar(Cola2,85);
	desencolar(Cola2);	
	mostrarValores(*Cola2);
	mostrarIndices(*Cola2);
	liberar(Cola2);
	system("PAUSE");
	
}
