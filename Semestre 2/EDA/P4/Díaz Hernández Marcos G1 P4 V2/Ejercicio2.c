#include "Alumno.h"
#include <stdlib.h>

void LlenarAlumnos(Alumno *Al);
void Imprimir(Alumno *Al);

main(){
	int j;
	printf("Tamaño de objeto Alumno = %d \n",sizeof(Alumno));
	Alumno *din1,*din2,*din3;
	din1 = malloc(5*sizeof(Alumno));
	din2 = calloc(5,sizeof(Alumno));
	
	printf("Primer apuntador: \n");
	for(j=0;j<5;j++){
		printf("Direccion[%d]=%d \n",j,din1+j);
	}
	printf("\n");
	
	printf("Segundo apuntador \n");
	for(j=0;j<5;j++){
		printf("Direccion[%d]=%d \n",j,din2+j);
	}
	printf("\n");
	
	printf("Con realloc: \n");
	din3 = realloc(din2,10);
	for(j=0;j<10;j++){
		printf("&din3[%d]=%d \n",j,din3+j);
	}
	printf("\n");
	
	LlenarAlumnos(din3);
	Imprimir(din3);
	
	free(din1);
	free(din2);
	free(din3);
	
	system("PAUSE");
}


 void LlenarAlumnos(Alumno *Al){
	int i;
	for(i=0;i<10;i++){
		printf("\nInserta los datos del alumno[%d] Memoria:%d\n",i+1,Al+i);
		printf("Inserta el Numero de cuenta del alumno:\n");
		scanf("%d",&Al[i].numCuenta);
		printf("Inserta el nombre:\n");
		scanf("%s",&Al[i].nombre);
		printf("Inserta el apellido:\n");
		scanf("%s",&Al[i].apellido);
		printf("Inserta su promedio:\n");
		scanf("%f",&Al[i].promedio);
		printf("Inserta la calle donde vive:\n");
		scanf("%s",&Al[i].domicilio.calle);
		printf("Inserta el numero de la casa:\n");
		scanf("%d",&Al[i].domicilio.num);
		printf("Inserta la colonia:\n");
		scanf("%s",&Al[i].domicilio.colonia);
		printf("Inserta el codigo postal:\n");
		scanf("%d",&Al[i].domicilio.cPostal);
	}
}

void Imprimir(Alumno *Al){
	int i;
	for(i=0;i<10;i++){
		printf("\nDatos del alumno[%d]:%d\n",i+1,Al+i);
		printf("Numero de cuenta del alumno:%d\n",Al[i].numCuenta);
		printf("Nombre:%s\n",Al[i].nombre);
		printf("Apellido:%s\n",Al[i].apellido);
		printf("Promedio:%f\n",Al[i].promedio);
		printf("Calle donde vive:%s\n",Al[i].domicilio.calle);
		printf("Numero de la casa:%d\n",Al[i].domicilio.num);
		printf("Colonia:%s\n",Al[i].domicilio.colonia);
		printf("Codigo postal:%d\n",Al[i].domicilio.cPostal);
		printf("\n");
	}
}
