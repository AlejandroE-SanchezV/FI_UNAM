#include<stdio.h>
int main()
{
	int i,a,b,c,A[15];
	printf("Inserte los 15 valores de su arreglo\n");
	for(i=0;i<15;i++)
		{
	printf("\n Inserte el valor:");	
	scanf("%d", &A[i]);
		}

		printf("\nSeleccione la operaci%cn que desea realizar\n",162);
		printf(" 1)Suma de elementos\n 2)Multiplicaci%cn de los elementos\n 3)Suma de los elementos divisibles entre 4\n 4)Multiplicar cada elemento por 3\n",162);
		scanf("%d", &a);
		switch(a)
		{
			case 1:
				printf("\nArreglo original:\n");
				for(i=0;i<15;i++)
 					printf("\nArreglo[%d]:%d",i,A[i]);
 					
 				b=0;
				for(i=0;i<15;i++)
					b=b+A[i];
					
				printf("\nLa suma es:%d",b);
				break;
				
			case 2:
				printf("\nArreglo original:\n");
				for(i=0;i<15;i++)
 					printf("\nArreglo[%d]:%d",i,A[i]);
 					
				for(i=0;i<15;i++)
					b=b*A[i];
					
				printf("\nLa multiplicaci%cn es:%d",162,b);
				break;
				
			case 3:
				printf("\nArreglo original:\n");
				for(i=0;i<15;i++)
 					printf("\nArreglo[%d]:%d",i,A[i]);
				
				for(i=0;i<15;i++)
				{
					b=0;
					b=A[i]%4;
					if(b==0)
					{
					c=c+A[i];
					}
				}
				printf("\nSuma de los elementos: %d",c);
				break;
				
			case 4:
				printf("\nArreglo original:\n");
				for(i=0;i<15;i++)
 					printf("\nArreglo[%d]:%d",i,A[i]);
 				
 				for(i=0;i<15;i++)
				 	A[i]=3*A[i];
	
				printf("\nArreglo modificado:\n");
				for(i=0;i<15;i++)
 				printf("\nArreglo[%d]:%d",i,A[i]);
 				break;
 			
 			default:
 				printf("\nNo existe la opci%cn\n",162);
 				break;
	}

getchar();
return 0;		
}
