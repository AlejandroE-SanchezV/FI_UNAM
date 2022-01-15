#include "Pila.h"

main(){
    printf("vamos a crear una pila \n");
    Pila miPila=CrearPila();
    printf("vamos a ingresar algunos elementos \n");
	Push(&miPila,10);
    Push(&miPila,20);
    Push(&miPila,30);
	Push(&miPila,40);
    Push(&miPila,50);
    printf("El tope de la pila es: %d \n",miPila.tope);    //recuerda que el tope es un índice
	printf("El valor almacenado hasta arriba es: %d\n",Top(miPila));    
	int a = Pop(&miPila);
  	printf("Ahora el tope de la pila es : %d \n",miPila.tope);
	int b = Pop(&miPila);
  	int c = Pop(&miPila);
  	printf("Ahora el valor hasta arriba es: %d \n",Top(miPila));    
	int d = Pop(&miPila);
    printf("valor de c es: %d \n",c);  
    
    //Instrucciones adicionales
    printf("\n\n");
	int e = Pop(&miPila);
	printf("Ahora el valor hasta arriba es: %d \n",Top(miPila)); 
	int f = Pop(&miPila);
	printf("valor de f es: %d \n",f); 
}


