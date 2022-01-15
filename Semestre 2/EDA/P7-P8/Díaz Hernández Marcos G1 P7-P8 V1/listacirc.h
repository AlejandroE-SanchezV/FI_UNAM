#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct Auto{
    char Marca[10];
	char Placa[10];
	char Modelo[10];
	char Color[10];
	char Estado[10];
    struct Auto* next;
}Auto;

typedef struct{
	struct Auto* head;
	int tamano;
}Lista;

Lista crearLista();
void print_list(Lista);
void addPrincipioLista(Lista*,char A[],char B[],char C[],char D[],char E[]);
void addFinalLista(Lista*,char A[],char B[],char C[],char D[],char E[]);
void borrarPrimero(Lista*);
void borrarUltimo(Lista*);

//Completar
void recorrerLista(Lista);
void BuscarAuto(Lista, char A[]);

Lista crearLista(){
	Lista lista;
	lista.head = NULL;
	lista.tamano = 0;
	return lista;
}

void print_list(Lista lista) {
    if(lista.head==NULL){
    	printf("LA LISTA ESTA VACIA \n");
    }
    else{
    	int tamano = lista.tamano;				//se define el tamaño
		printf("Los elementos de la lista son: \n");
    	Auto *current = lista.head;
    	int posicion=1;
   		while (tamano > 0 ) {					//tamaño como condicional
   			printf("\nAuto:%d\n",posicion);
        	printf("Marca:%s\n", current->Marca);
        	printf("Modelo:%s\n", current->Modelo);
        	printf("Placa:%s\n", current->Placa);
        	printf("Color:%s\n", current->Color);
        	printf("Estado:%s\n", current->Estado);
        	current = current->next;
        	tamano--;                           //se reduce tamaño
        	posicion+=1;
   	 	}
	}
}

void addFinalLista(Lista *lista,char A[],char B[],char C[],char D[],char E[]) {
	int posicion=lista->tamano;
	if(lista->head==NULL){
		Auto *nodo = (Auto*)malloc(sizeof(Auto));
		strcpy(nodo->Placa,A);
		strcpy(nodo->Marca,B);
		strcpy(nodo->Modelo,C);
		strcpy(nodo->Color,D);
		strcpy(nodo->Estado,E);
    	nodo->next = nodo;
    	lista->head = nodo;
	}	
	else
	{
		Auto *current = lista->head;
		while (posicion!=1) {
       		current = current->next;
       		posicion--;
 		}
		Auto *nuevoNodo;
		nuevoNodo = (Auto*)malloc(sizeof(Auto));
    	current->next = nuevoNodo;
		strcpy(nuevoNodo->Placa,A);
		strcpy(nuevoNodo->Marca,B);
		strcpy(nuevoNodo->Modelo,C);
		strcpy(nuevoNodo->Color,D);
		strcpy(nuevoNodo->Estado,E);
    	nuevoNodo->next = lista->head;
	}	
	lista->tamano++; 
}

void addPrincipioLista(Lista *lista,char A[],char B[],char C[],char D[],char E[]) {
	Auto *node,*temp;
    node = (Auto*)malloc(sizeof(Auto));
   	strcpy(node->Placa,A);
	strcpy(node->Marca,B);
	strcpy(node->Modelo,C);
	strcpy(node->Color,D);
	strcpy(node->Estado,E);
    if(lista->head==NULL){
    	node->next=node;
	}
    else{
    	node->next = lista->head;
		temp = lista->head;
    	while(temp->next != lista->head){
    		temp=temp->next;
		}
		temp->next=node;
	}
	lista->head = node;
    lista->tamano++;
}

void borrarPrimero(Lista *lista) {
    if (lista->head == NULL) {
        printf("La lista esta vacia");
    }
    else{
    	Auto*nuevo_head = NULL;
    	Auto *temp = lista->head;
    	nuevo_head=temp->next;
    	free(lista->head);
    	lista->head = nuevo_head;
	}
}

void borrarUltimo(Lista *lista) {
    Auto *temp = lista->head;
	if (lista->head == NULL) {
        printf("La lista esta vacia");
    }
    else{
    	if(temp->next==NULL){
    		lista->head = NULL;
			free(lista->head);	
    	}else{
    		Auto *current = lista->head;
    		Auto *current2 =current->next;
    		while (current2->next != NULL) {
        		current = current->next;
    		}
    		free(current->next);
    		current->next = NULL;
    	}
	}
}

void BuscarAuto(Lista Lista, char A[]){
	Auto *Current=Lista.head;
	int Contador=0;
	while(Current->next!=Lista.head){
		Contador+=1;
		if(strcmp(Current->Marca,A)==0){
			printf("Se encontro el automovil\n");
			printf("Auto:%d\n",Contador);
        	printf("Marca:%s\n",Current->Marca);
        	printf("Modelo:%s\n",Current->Modelo);
        	printf("Placa:%s\n",Current->Placa);
        	printf("Color:%s\n",Current->Color);
        	printf("Estado:%s\n",Current->Estado);
        	Current=Current->next;
		}
		else{
			Current=Current->next;
		}
	}
	if(strcmp(Current->Marca,A)==0){
		Contador+=1;
		printf("Se encontro el automovil\n");
		printf("Auto:%d\n",Contador);
        printf("Marca:%s\n",Current->Marca);
        printf("Modelo:%s\n",Current->Modelo);
        printf("Placa:%s\n",Current->Placa);
        printf("Color:%s\n",Current->Color);
        printf("Estado:%s\n",Current->Estado);
	}
	if(Contador==0){
		printf("No se encontro\n");
	}
}

void recorrerLista(Lista Lista){
	Auto *Current=Lista.head;
	int Opcion,Contador=1;
	printf("Para poder moverse a traves de la lista debe colocar el valor de la posicion a continuacion\n");
	do{
		printf(" 1)Mover al siguiente elemento\n 2)Ver detalles del elemento actual\n 3)Salir\n");
		scanf("%d",&Opcion);
		switch(Opcion){
		
		case 1:
		Contador+=1;
		printf("El elemento esta en la posicion:%d\n",Contador);
		Current=Current->next;
		break;
		
		case 2:
		printf("El auto es:%d\n",Contador);
        printf("Marca:%s\n",Current->Marca);
        printf("Modelo:%s\n",Current->Modelo);
        printf("Placa:%s\n",Current->Placa);
        printf("Color:%s\n",Current->Color);
        printf("Estado:%s\n",Current->Estado);
		break;
			
		default:
		Opcion=3;
		break;
		}
	}
	while(Opcion<3);
}
