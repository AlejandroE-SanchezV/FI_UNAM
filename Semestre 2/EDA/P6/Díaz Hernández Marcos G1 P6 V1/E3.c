#include "colaDoble.h"

void EstadoU(Cola *Cola1);
void EstadoD(Cola *Cola1);
void EstadoT(Cola *Cola1);

void main(){
	int tamano;
	printf("Inserte el tamano de la lista\n");
	scanf("%d",&tamano);
	Cola Cola1=crearCola(tamano);
	EstadoU(&Cola1);
	EstadoD(&Cola1);
	EstadoT(&Cola1);
}

void EstadoU(Cola *Cola1){
	printf("Primer Diagrama\n");
	encolarInicio(Cola1,1);
	encolarFinal(Cola1,102);
	encolarFinal(Cola1,103);
	encolarFinal(Cola1,104);
	encolarFinal(Cola1,105);
	desencolarInicio(Cola1);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("\n");
}

void EstadoD(Cola *Cola1){
	printf("Segundo Daigrama\n");
	desencolarFinal(Cola1);
	desencolarInicio(Cola1);
	encolarInicio(Cola1,99);
	encolarInicio(Cola1,98);
	encolarInicio(Cola1,97);
	encolarFinal(Cola1,120);
	encolarFinal(Cola1,121);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("\n");
}

void EstadoT(Cola *Cola1){
	printf("Tercer Diagrama\n");
	desencolarInicio(Cola1);
	desencolarInicio(Cola1);
	desencolarInicio(Cola1);
	encolarFinal(Cola1,122);
	mostrarValores(*Cola1);
	mostrarIndices(*Cola1);
	printf("\n");
}
