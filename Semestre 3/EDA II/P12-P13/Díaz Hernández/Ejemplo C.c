#include<stdio.h>


int alfa();
int beta();
int delta();
int gama(int a, int b);
int epsilon(int a, int b);

int main(){
	printf("Primer forma:\n");
	int v,w,y,x,r,R;
	#pragma omp parallel sections
	{
		#pragma omp section 
			v=alfa();
		#pragma omp section
			w=beta();
		#pragma omp section 
			y=delta();
	}
	x=gama(v,w);
	printf("\nAAA:%d\n",r=epsilon(x,y));
	
	
	printf("\nSegunda forma:\n");
	#pragma omp parallel 
	{
		#pragma omp sections
		{
			#pragma omp section
			v=alfa();
			#pragma omp section
			w=beta();
		}
		#pragma omp sections
		{
			#pragma omp section
			x=gama(v,w);
			#pragma omp section
			y=delta();
		}
	}
	printf("\nAAA:%d\n",R=epsilon(x,y));
	return 0;
}

int alfa(){
	int v;
	v=10*12;
	return v;
}

int beta(){
	int w;
	w=15+65;
	return w;
}

int delta(){
	int y;
	y=233%6;
	return y;
}

int gama(int a, int b){
	int c=a/b;
	return c;
}

int epsilon(int a, int b){
	printf("Valor:%d \nValor:%d",a,b);
	int c=a+b;
	return c;
}

