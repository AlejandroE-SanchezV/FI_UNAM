#include<stdio.h>
int main()
{
	int i,f,b,c=0,j,g,A[10];
	int B[]={512,256,128,64,32,16,8,4,2,1};
	printf("Inserte diez d%cgitos, estos deben ser solo ceros y unos",161);
	for(i=0;i<10;i++)
		{
	printf("\n Inserta el valor:");	
	scanf("%d", &A[i]);
		}
	
		printf("\nElige una operaci%cn:\n 1)Binario puro\n 2)Signo y magnitud\n 3)Complemento a 2\n",162);
		scanf("%d",&b);
		
		switch(b)
		{
			case 1:
				for(i=0;i<10;i++)
				{
					if(A[i]==1)
					{
						c=A[i]*B[i];
					}
					else
					{
						c=A[i]*B[i];
					}
					A[i]=c;	
				}
				for(i=0;i<10;i++)
				printf("\nA[%d]:%d", i,A[i]);
				
				b=0;
				for(i=0;i<10;i++)
					b=b+A[i];
				
				printf("\nEl n%cmero decimal es:%d\n",163,b);
				break;
				
			case 2:
				for(i=1;i<10;i++)
				{
					if(A[i]==1)
					{
						c=A[i]*B[i];
					}
					else
					{
						c=A[i]*B[i];
					}
					A[i]=c;	
				}
				
				for(i=0;i<10;i++)
				printf("\nA[%d]:%d", i,A[i]);
				
				b=0;
				for(i=1;i<10;i++)
					b=b+A[i];
					
				if(A[0]==1)
					b=b*(-1);
				else
					b=b;
				printf("\nEl n%cmero decimal es:%d\n",163,b);
				break;
				
			case 3:
				
				for(i=1;i<10;i++)
				{
					if(A[i]==1)
					{
						c=A[i]*B[i];
					}
					else
					{
						c=A[i]*B[i];
					}
					A[i]=c;	
				}
				
				b=0;
				for(i=1;i<10;i++)
					b=b+A[i];
					
				if(A[0]==1)
					b=b*(-1);
				else
					b=b;
				
				for(i=9;i>=0;i--)
				{	
				if(A[i]==1)
				{
					i=i-1;
					for(i=i;i>=0;i--)
					{
						if(A[i]==0)
							A[i]=1;
						else
							A[i]=0;
					}
				}
				else
					A[i]=0;
				}
				
				if(A[0]==1)
					b=b*(-1);
				else
					b=b;
				
				printf("Conversi%cn:\n",162);
				for(i=0;i<10;i++)
				printf("\nA[%d]:%d\n", i,A[i]);
					
				printf("\nEl n%cmero decimal es:%d\n",163,b);
				break;
				
			default:
				printf("Opci%cn no disponible",162); 		
				break;		
		}
	getchar();
	return 0;
}
