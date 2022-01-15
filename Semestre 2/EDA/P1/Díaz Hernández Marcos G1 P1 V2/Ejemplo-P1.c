#include <stdio.h>

void crearmensaje();
void descifrarmensaje();

int main()
{
	short opcion=0;
	
	while(1)
	{
		printf("\n \t*** ESC%cTALA ESPARTANA ***\n",214);
		printf("%cQu%c desea realizar?\n",168,130);
		printf("\n 1) Crear mensaje cifrado \n 2) Descifrar mensaje\n 3) Salir \n");
		scanf("%d", &opcion);
		
		switch(opcion)
			{
				case 1:
					crearmensaje();
					break;
				case 2:
					descifrarmensaje();
					break;
				case 3:
					return 0;
				default:
					printf("Opci%cn no valida \n",162);
					
			}
		
	}
	
	return 0;
}

void crearmensaje()
{
	int ren,col, i, j, k=0;
	printf("Ingresar el tama%co de la esc%ctala: \n",164, 161);
	printf("Renglones:\n");
	scanf("%i", &ren);
	printf("Columnas:\n");
	scanf("%i", &col);
	char escitala[ren][col];
	char texto[ren*col];
	
	printf("Escriba el texto a cifrar:");
	scanf("%s", &texto);
	
	for (i=0;i<ren;i++)
		for(j=0;j<col;j++)
		 escitala[i][j]=texto[k++];
	
	printf("El texto en la tira queda de la siguiente manera:\n");
	
	for(i=0;i<col;i++)
		for(j=0;j<ren;j++)
			printf("%c", escitala[j][i]);	
	
	printf("\n");
}

void descifrarmensaje()
{
	int ren, col, i,j, k=0;
	printf("Ingresar el tama%co de la esc%ctala:\n",164, 161);
	printf("Renglones:\n");
	scanf("%i", &ren);
	printf("Columnas:");
	scanf("%i", &col);
	
	char escitala[ren][col];
	char texto[ren*col];
	
	printf("Escriba el texto a descifrar:\n");
	scanf("%s",&texto);
	
	for(i=0;i<col;i++)
		for(j=0;j<ren;j++)
			escitala[j][i]=texto[k++];
	
	printf("El texto cifrado es:\n");
	for(i=0;i<ren;i++)
		for(j=0;j<col;j++)
			printf("%c", escitala[i][j]);
			
}
