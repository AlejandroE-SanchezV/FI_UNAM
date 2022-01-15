#include<stdio.h>
#include<stdlib.h>


typedef struct Nodo{
    int val;
    struct Nodo* next;
    struct Nodo* prev;
}Nodo;

typedef struct{
	int tamano;
	struct Nodo* head;
}Lista;

Lista crearLista();
void print_list(Lista);
void addPrincipioLista(Lista*,int);   
void addFinalLista(Lista*,int);
void primerNodo(Lista*,int);
void borrarPrimero(Lista*);
void borrarUltimo(Lista*);
void recorrerLista(Lista);

Lista crearLista(){
	Lista lista;
	lista.head = NULL;
	lista.tamano=0;
	return lista;
}

void recorrerLista(Lista lista){
	int var;
	Nodo *temp = lista.head;
	printf("Para seleccionar es neceario que coloque el valor de la posicion\n");
	do{
		printf(" 1)Mover al siguiente elemento\n 2)Ver el valor del elemento actual\n 3)Mover al elemento anterior\n 4)Salir\n");
		printf("Inserte la opcion:");
		scanf("%d",&var);
		switch(var){
			
			case 1:
				temp=temp->next;
				break;
				
			case 2:
				printf("El valor es:%d\n",temp->val);
				break;
			
			case 3:
				temp=temp->prev;
				break;
			
			default:
				var=4;
			
		}
	}while (var<4);
}


void print_list(Lista lista) {
    int tamano = lista.tamano;
	if(lista.head==NULL){
    	printf("LA LISTA ESTA VACIA \n");
    }
    else{
    	printf("Los elementos de la lista son: \n");
    	Nodo *current = lista.head;
   		while (tamano>0){
		   printf("%d\n",current->val) ;
		   current = current->next; 
		   tamano--;
		}	
	}
}


void addFinalLista(Lista *lista, int val) {
	if(lista->head==NULL){
		primerNodo(lista,val);
	}	
	else
	{
		Nodo *new_node, *temp;
    	new_node = (Nodo*)malloc(sizeof(Nodo));
    	new_node->val = val;
    	new_node->next = lista->head;
    	new_node->prev = lista->head->prev;
		lista->head->prev=new_node;
		temp=lista->head;
		
		while(temp->next!=lista->head)
			temp=temp->next;
    	temp->next=new_node;
	}	
	lista->tamano++;
}
void addPrincipioLista(Lista *lista, int val) {
	if(lista->head==NULL){
		primerNodo(lista,val);
	}	
	else{
		Nodo *new_node, *temp;
    	new_node = (Nodo*)malloc(sizeof(Nodo));
    	new_node->val = val;
    	new_node->next = lista->head;
    	new_node->prev = lista->head->prev;
    	lista->head->prev=new_node;
		
		temp=lista->head;
		
		while(temp->next!=lista->head)
			temp=temp->next;
    	temp->next=new_node;
		
		lista->head = new_node;
	}
	lista->tamano++;
}

void primerNodo(Lista *lista, int val){
	Nodo *nodo = (Nodo*)malloc(sizeof(Nodo));
	nodo->val = val;
    nodo->next = nodo;
    nodo->prev = nodo;
    lista->head = nodo;
}

void borrarPrimero(Lista *lista) {
    if (lista->head == NULL) {
        printf("La lista esta vacia");
    }
    else{
    	Nodo *Nuevo_Head=lista->head;
    	Nuevo_Head=Nuevo_Head->next;
    	Nodo *Aux=lista->head;
    	while (Aux->next!=lista->head){
    		Aux=Aux->next;
		}
		free(Aux->next);
		Aux->next=Nuevo_Head;
		Nuevo_Head->prev=Aux;
		lista->head=Nuevo_Head;
		lista->tamano--;
	}
}

void borrarUltimo(Lista *lista) {
    if (lista->head == NULL) {
        printf("La lista esta vacia");
    }
    else{
    	Nodo *Aux=lista->head;
    	while(Aux->next->next!=lista->head){
    		Aux=Aux->next;
		}
		lista->head->prev=Aux;
		free(Aux->next);
		Aux->next=lista->head;
		lista->tamano--;
	}
}





