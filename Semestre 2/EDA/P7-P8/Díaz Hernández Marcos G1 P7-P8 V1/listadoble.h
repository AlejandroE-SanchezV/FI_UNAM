#include<stdio.h>
#include<stdlib.h>


typedef struct Nodo{
    int val;
    struct Nodo* next;
    struct Nodo* prev;
}Nodo;

typedef struct{
	struct Nodo* head;
}Lista;

Lista crearLista();
void print_list(Lista);
void addPrincipioLista(Lista*,int);  
void addIesimoLista(Lista*,int,int);
void addFinalLista(Lista*,int);
void primerNodo(Lista*,int);
void borrarPrimero(Lista*);
void borrarUltimo(Lista*);


Lista crearLista(){
	Lista lista;
	lista.head = NULL;
	return lista;
}

void print_list(Lista lista) {
    if(lista.head==NULL){
    	printf("LA LISTA ESTA VACIA \n");
    }
    else{
    	printf("Los elementos de la lista son: \n");
    	Nodo *current = lista.head;
   		while (current != NULL){
		   printf("%d\n",current->val) ;
		   current = current->next; 
		}	
	}
}


void print_list2(Lista lista) {
    if(lista.head==NULL){
    	printf("LA LISTA ESTA VACIA \n");
    }
    else{
    	printf("Los elementos de la lista son: \n");
    	Nodo *current = lista.head;
   		if(current->next!=NULL){
   			do{
			   current = current->next; 
			}while (current->next != NULL) ;
    	}
   	 	
   	 	while (current!=NULL){
   	 	    printf("%d \n",current->val);  
			current = current->prev;	
   	 	}
	}
}

void addFinalLista(Lista *lista, int val) {
	if(lista->head==NULL){
		primerNodo(lista,val);
	}	
	else
	{
		Nodo *current = lista->head;
		while (current->next != NULL) {
       		current = current->next;
 		}
		Nodo *nuevoNodo;
		nuevoNodo = (Nodo*)malloc(sizeof(Nodo));
    	nuevoNodo->val = val;
    	nuevoNodo->next = NULL;
    	nuevoNodo->prev = current;
 		current->next = nuevoNodo;
	}	
}
void addPrincipioLista(Lista *lista, int val) {
	if(lista->head==NULL){
		primerNodo(lista,val);
	}	
	else{
		Nodo *new_node;
    	new_node = (Nodo*)malloc(sizeof(Nodo));
    	new_node->val = val;
    	new_node->next = lista->head;
    	new_node->prev = NULL;
    	lista->head->prev=new_node;
    	lista->head = new_node;
	}
}

void primerNodo(Lista *lista, int val){
	Nodo *nodo = (Nodo*)malloc(sizeof(Nodo));
	nodo->val = val;
    nodo->next = NULL;
    nodo->prev = NULL;
    lista->head = nodo;
}

void addIesimoLista(Lista *lista, int val,int posicion){
	int contador, Nuevo, contadorN, Hecho=0, Limite=0;
	Nodo *temp=lista->head;
	Nodo *Aux=lista->head;
	
	for(contador=1;contador<posicion-1;contador++){
		if(temp->next!=NULL){
			Limite+=1;
		}
	    temp=temp->next;
	    if(temp==NULL){
			printf("No se puede insertar en esa posicion, ya que no existen elementos que lleguen a la posicion\n");
			printf("Inserte el valor que este entre el rango de valores que si se pueden añadir (1-%d):",Limite+2);
			scanf("%d",&Nuevo);
			temp=lista->head;
			for(contadorN=1;contadorN<Nuevo-1;contadorN++){
				temp=temp->next;
			}
			contador=posicion;
		}	
	}
	
	if(temp->next==NULL){
	    addFinalLista(lista,val);
	    Hecho+=1;
	}	 
	
	if(posicion==1||Nuevo==1){
		addPrincipioLista(lista,val);
		Hecho+=1;
	}
	
	if(Hecho==1){
		printf("Ya se agrego\n");
	}
	else{
		Nodo *nuevoNodo;
		nuevoNodo = (Nodo*)malloc(sizeof(Nodo));
   		nuevoNodo->val = val;
   		nuevoNodo->next = temp->next;
   		nuevoNodo->prev = temp;
   		temp->next->prev = nuevoNodo;
		temp->next = nuevoNodo; 
	}
	
}


void borrarPrimero(Lista *lista) {
    if (lista->head == NULL) {
        printf("La lista esta vacia");
    }
    else{
    	Nodo *nuevo_head = NULL;
    	Nodo *temp = lista->head;
    	nuevo_head = temp->next;
    	free(lista->head);
		if (nuevo_head!=NULL){
			nuevo_head->prev=NULL;
			lista->head = nuevo_head;
		}
		else
			lista->head = NULL;
		
	}
}

void borrarUltimo(Lista *lista) {
    Nodo *temp = lista->head;
	if (lista->head == NULL) {
        printf("La lista esta vacia");
    }
    else{
    	if(temp->next==NULL){
    		lista->head = NULL;
			free(lista->head);	
    	}else{
    		Nodo *current = lista->head;
    		while (current->next->next != NULL) {
        		current = current->next;
    		}
    		current->next = NULL;
			free(current->next);
       	}
	}

}





