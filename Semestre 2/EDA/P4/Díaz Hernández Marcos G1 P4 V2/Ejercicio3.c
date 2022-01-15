#include<stdio.h>
#include<stdlib.h>

typedef struct{
	char Marca[10];
	char Modelo[15];
	char Color[10];
	char Tipo[15];
}Automovil;

int Dato();
void CrearAutos(Automovil *Ap,int a);
void ImprimirAutos(Automovil *Az,int b);
void ImprimirMemoria(Automovil *Ac,int c);

int main(){
	int z=Dato();
	Automovil *Autos=(Automovil *)calloc(z,sizeof(Automovil));
	ImprimirMemoria(Autos,z);
	CrearAutos(Autos,z);
	ImprimirAutos(Autos,z);
	ImprimirMemoria(Autos,z);
	free(Autos);
	ImprimirMemoria(Autos,z);
	
	return 0;
}

int Dato(){
	int a;
	printf("¿Cuantos autos registrara?:");
	scanf("%d",&a);
	return a;
}

void ImprimirMemoria(Automovil *Ac,int c){
	int i;
	for(i=0;i<c;i++){
		printf("Valor[%d]:%d, Memoria[%d]:%d\n",i+1,*(Ac+i),i+1,Ac+i);
	}
	printf("\n");
}

void CrearAutos(Automovil *Ap,int a){
	int i;
	for(i=0;i<a;i++){
	printf("Inserta los datos del vehiculo[%d], Memoria:%d\n",i+1,Ap+i);
	printf("Inserte la marca de auto:\n");
	scanf("%s",&Ap[i].Marca);
	printf("Inserte el modelo del auto:\n");
	scanf("%s",&Ap[i].Modelo);
	printf("Inserte el color del auto:\n");
	scanf("%s",&Ap[i].Color);
	printf("Inserte el tipo de auto:\n");
	scanf("%s",&Ap[i].Tipo);
	}
	printf("\n");
}

void ImprimirAutos(Automovil *Az,int b){
	int i;
	for(i=0;i<b;i++){
		printf("Datos del automovil[%d]\n",i+1);
		printf("Marca:%s\n",Az->Marca);
		printf("Modelo:%s\n",Az->Modelo);
		printf("Color:%s\n",Az->Color);
		printf("Tipo:%s\n",Az->Tipo);
		printf("\n");
	}
	
}




