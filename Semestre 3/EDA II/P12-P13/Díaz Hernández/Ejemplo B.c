#include<stdio.h>
#include<math.h>


int main(){
	int retorno,res=0;
	int b[10][0];
	int a[10];
	
	int i,j;
	for(i=0;i<10;i++){
		b[i][0]=rand()%10;
		a[i]=rand()%10;
	}
	
	#pragma omp parallel for reduction (+:res)
	for(i=0;i<10;i++){
		res+=a[i]*b[i][0];
	}
	printf("Multiplicacion: %d",res);
	return 0;
}

