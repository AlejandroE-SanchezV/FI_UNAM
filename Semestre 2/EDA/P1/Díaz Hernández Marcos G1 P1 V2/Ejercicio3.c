#include<stdio.h>
int main()
{
	long i,j,A[4][6];
 	printf("Inserte 6 valores del primer rengl%cn:\n",162);
 	
 	for(i=0;i<1;i++)
 	{
 		for(j=0;j<6;j++)
 		{
 			printf("\nInserte el valor:");
 			scanf("%ld",&A[i][j]);
 		}
	}
	
	for(i=0;i<3;i++)
		for(j=0;j<6;j++)
				A[i+1][j]=3*A[i][j];
	
	for(i=0;i<4;i++)
		for(j=0;j<6;j++)
			printf("\nArreglo[%ld][%ld]:%ld", i,j, A[i][j]);
			
	getchar();
	return 0;
}

