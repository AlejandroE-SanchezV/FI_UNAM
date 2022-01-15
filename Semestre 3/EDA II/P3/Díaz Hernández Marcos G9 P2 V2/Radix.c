#include <stdio.h>
#include "Cola.h"

void EnviarColas(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden);
void EnviarColas1(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden);
void EnviarColas2(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden);
void EnviarColas3(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden);

int Cantidad(Cola *a);
void regresarO(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden,int z,int w,int y,int v);
void imprimir(Cola *a);
void imprimirQ(Cola *a);

void main(){
	
	int i,b,c,d,e;
	Cola Digito0 = crearCola(); //Se crean tantas colas como el algoritmo lo pida, de acuerdo a los digitos que se tengan, en este caso 4 [0,3]
	Cola Digito1 = crearCola();
	Cola Digito2 = crearCola();
	Cola Digito3 = crearCola();
	Cola Entrada = crearCola();
	
	for(i=0;i<10;i++){
		Digito0.lista[i]=0;//Limpio las localidades del arreglo porque normalmente tienen basura o elementos aleatorios que pueden causar error
		Digito1.lista[i]=0;
		Digito2.lista[i]=0;
		Digito3.lista[i]=0;
	}
	
	for(i=0;i<10;i++){
		int x;
		printf("Inserta los valores:");
		scanf("%d",&x);
		encolar(&Entrada, x);
	}

	imprimir(&Entrada);
	EnviarColas(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada);
	
	b=Cantidad(&Digito0); //Este paso es importante porque se buscan las posiciones iniciales y finales del arreglo, de tal forma que al regresar los valores al
	c=Cantidad(&Digito1); //arreglo original se puedan acomodar en la posicion indicada. Al ver formas de hacerlo general, se usa el counting, pero no lo pude 
	d=Cantidad(&Digito2); //implementar de esta forma se puede hacer igual
	e=Cantidad(&Digito3);
	
	regresarO(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada,b,c,d,e);
	
	imprimir(&Entrada);
	
	for(i=0;i<10;i++){
		Digito0.lista[i]=0;
		Digito1.lista[i]=0;
		Digito2.lista[i]=0;
		Digito3.lista[i]=0;
	}
	
	EnviarColas1(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada);
	
	b=Cantidad(&Digito0);
	c=Cantidad(&Digito1);
	d=Cantidad(&Digito2);
	e=Cantidad(&Digito3);
	
	regresarO(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada,b,c,d,e);
	
	imprimir(&Entrada);
	
	for(i=0;i<10;i++){
		Digito0.lista[i]=0;
		Digito1.lista[i]=0;
		Digito2.lista[i]=0;
		Digito3.lista[i]=0;
	}

	EnviarColas2(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada);
	
	b=Cantidad(&Digito0);
	c=Cantidad(&Digito1);
	d=Cantidad(&Digito2);
	e=Cantidad(&Digito3);
	
	regresarO(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada,b,c,d,e);

	imprimir(&Entrada);

	for(i=0;i<10;i++){
		Digito0.lista[i]=0;
		Digito1.lista[i]=0;
		Digito2.lista[i]=0;
		Digito3.lista[i]=0;
	}

	EnviarColas3(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada);
	
	b=Cantidad(&Digito0);
	c=Cantidad(&Digito1);
	d=Cantidad(&Digito2);
	e=Cantidad(&Digito3);
	
	regresarO(&Digito0,&Digito1,&Digito2,&Digito3,&Entrada,b,c,d,e);
	
	imprimir(&Entrada);
}

void EnviarColas(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden){
	int i;
	for(i=0;i<10;i++){
		if((orden->lista[i])%10==0){   //Estas son las operaciones basicas del algoritmo ya que con estas se tiene el valor de digito, ya que con el modulo
			encolar(a,orden->lista[i]);//se puede deducir el digito, y en general se tiene que dividir el numero del arreglo entre la potencia de 10, tal que	 
		}							   //la potencia sea el numero de la iteracion y las iteraciones estan relacionadads con elnumoer de terminos del valor
		if((orden->lista[i])%10==1){   //al final se hace el modulo para comprobar el residuo y decidir a donde mandarlo
			encolar(b,orden->lista[i]);
		}
		if((orden->lista[i])%10==2){
			encolar(c,orden->lista[i]);
		}
		if((orden->lista[i])%10==3){
			encolar(d,orden->lista[i]);
		}
	}
}

void EnviarColas1(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden){
	int i;
	for(i=0;i<10;i++){
		if((orden->lista[i]/10)%10==0){
			encolar(a,orden->lista[i]);
		}
		if((orden->lista[i]/10)%10==1){
			encolar(b,orden->lista[i]);
		}
		if((orden->lista[i]/10)%10==2){
			encolar(c,orden->lista[i]);
		}
		if((orden->lista[i]/10)%10==3){
			encolar(d,orden->lista[i]);
		}
	}
}

void EnviarColas2(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden){
	int i;
	for(i=0;i<10;i++){
		if((orden->lista[i]/100)%10==0){
			encolar(a,orden->lista[i]);
		}
		if((orden->lista[i]/100)%10==1){
			encolar(b,orden->lista[i]);
		}
		if((orden->lista[i]/100)%10==2){
			encolar(c,orden->lista[i]);
		}
		if((orden->lista[i]/100)%10==3){
			encolar(d,orden->lista[i]);
		}
	}
}

void EnviarColas3(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden){
	int i;
	for(i=0;i<10;i++){
		if((orden->lista[i]/1000)%10==0){
			encolar(a,orden->lista[i]);
		}
		if((orden->lista[i]/1000)%10==1){
			encolar(b,orden->lista[i]);
		}
		if((orden->lista[i]/1000)%10==2){
			encolar(c,orden->lista[i]);
		}
		if((orden->lista[i]/1000)%10==3){
			encolar(d,orden->lista[i]);
		}
	}
}


int Cantidad(Cola *a){  //Cuenta la cantidad de elementos de cada cola
	int i,z=0;
	for (i=0;i<10;i++){
		if(a->lista[i]!=0){
			z+=1;
		}
	}
	return z;
}

void regresarO(Cola *a,Cola *b,Cola *c,Cola *d,Cola *orden,int z,int w,int y,int v){
	int i;
	for(i=0;i<z;i++){ 
		orden->lista[i]=desencolar(a);  //La operacion regresa los valores de cada subcola de termino, a la cola principal, de ahí que sea neceario conocer
	}									//los elementos que contiene cada cola, y despues ordenar el envio de los valores.
	for(i=z;i<(z+w);i++){
		orden->lista[i]=desencolar(b);
	}
	for(i=(z+w);i<(z+w+y);i++){
		orden->lista[i]=desencolar(c);
	}
	for(i=(z+w+y);i<(z+w+y+v);i++){
		orden->lista[i]=desencolar(d);
	}
}

void imprimir(Cola *a){
	int i;
	printf("\n Cola resultante:\n");
	for(i=0;i<10;i++){
		printf("Los valores son:[%d]:%d\n",(i+1),a->lista[i]);
	}
	printf("\n");
}

void imprimirQ(Cola *a){
	int i;
	printf("\n");
	for(i=0;i<10;i++){
		printf("Los valores son:[%d]:%d\n",(i+1),a->lista[i]);
	}
	printf("\n");
}
