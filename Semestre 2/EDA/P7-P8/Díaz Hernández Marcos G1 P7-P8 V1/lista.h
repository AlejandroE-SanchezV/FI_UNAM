#include<stdio.h>
#include<stdlib.h>


typedef struct Nodo{
    int val;
    struct Nodo* next;
}Nodo;

typedef struct{
	struct Nodo* head;
}Lista;

Lista crearLista();
void print_list(Lista);
void addPrincipioLista(Lista*,int);  
void addFinalLista(Lista*,int);
void borrarPrimero(Lista*);
void borrarUltimo(Lista*);
int primerElemento(Lista);
void addIesimoLista(Lista *, int);

//Añadidas
int BuscarElemento(Lista, int);
void EliminarIesimo(Lista *,int);
void EliminarMayores(Lista *,int);


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
   		while (current != 0) {
        	printf("%d \n",current->val);
			current = current->next;
   	 	}
	}
}

void addFinalLista(Lista *lista, int val) {
	if(lista->head==NULL){
		
		Nodo *nodo = (Nodo*)malloc(sizeof(Nodo));
		nodo->val = val;
    	nodo->next = NULL;
    	lista->head = nodo;
	}	
	else
	{
		Nodo *current = lista->head;
		while (current->next != 0) {
       		current = current->next;
 		}
		Nodo *nuevoNodo;
		nuevoNodo = (Nodo*)malloc(sizeof(Nodo));
    	nuevoNodo->val = val;
    	nuevoNodo->next = NULL;
 		current->next = nuevoNodo;
	}	
}
void addPrincipioLista(Lista *lista, int val) {
	Nodo *new_node;
    new_node = (Nodo*)malloc(sizeof(Nodo));
    new_node->val = val;
    new_node->next = lista->head;
    lista->head = new_node;
}

void addIesimoLista(Lista *lista, int val){
	
	int contador, posicion;
	printf("Ingrese la posicion:");
	scanf("%d",&posicion);
	Nodo *temp;   //creacion de nodo temporal para recorrer la lista
    temp=lista->head;
		
	for(contador=1;contador<posicion-1;contador++)   {
	      temp=temp->next;
    
	}
	Nodo *nuevoNodo;
	nuevoNodo = (Nodo*)malloc(sizeof(Nodo));
   	nuevoNodo->val = val;
   	nuevoNodo->next = temp->next;
	temp->next = nuevoNodo;
}

void borrarPrimero(Lista *lista) {
    if (lista->head == NULL) {
        printf("La lista esta vacia");
    }
    else{
    	Nodo *nuevo_head = NULL;
    	Nodo *temp = lista->head;
    	nuevo_head=temp->next;
    	free(lista->head);
    	lista->head = nuevo_head;
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

int primerElemento(Lista lista){
	return lista.head->val;
}

// Hasta acá
int BuscarElemento(Lista Lista, int valor){
	Nodo *Temp=Lista.head;
	int Contador=0;
	while(Temp->next!=NULL){
		Contador+=1;
		if (Temp->val==valor){
			return Contador;
		}
		else{
			Temp=Temp->next;
		}
	}
	if(Temp->val==valor){
		return Contador+1;
	}
	return 0;
}

void EliminarIesimo(Lista *Lista,int valor){
	int i,j;
	Nodo *Temp=Lista->head;
	if(Lista->head==NULL){
		printf("Lista vacia\n");
	}
	else{
		if(valor>1){
			Nodo *Temp;
			Nodo *Aux=Lista->head;
			for(j=1;j<valor-1;j++){
				Aux=Aux->next;
			}
			Temp=Aux->next->next;
			Aux->next=NULL;
			free(Aux->next);
			Aux->next=Temp;
		}
		if(valor==1){
			borrarPrimero(Lista);
		}
	}
	
}

void EliminarMayores(Lista *Lista,int valor){
	Nodo *Aux=Lista->head;
	int Contador, Eliminados;
	Contador=1;
	Eliminados=0;
	while(Aux->next!=NULL){
		if((Aux->val)>valor){
			EliminarIesimo(Lista,Contador);
			printf("Se elimino el elemento de la posicion:%d con valor:%d\n",Contador,Aux->val);
			Aux=Aux->next;
			Eliminados+=1;
		}
		else{
			Aux=Aux->next;
			Contador+=1;
		}
	}
	if((Aux->val)>valor){
		EliminarIesimo(Lista,Contador);
		printf("Se elimino el elemento de la posicion:%d con valor:%d\n",Contador,Aux->val);
		Eliminados+=1;
	}
	if(Eliminados==0){
		printf("No se elimino ningun elemento\n");
	}
	else{
		printf("Se eliminaron:%d elementos\n",Eliminados);
	}
}




