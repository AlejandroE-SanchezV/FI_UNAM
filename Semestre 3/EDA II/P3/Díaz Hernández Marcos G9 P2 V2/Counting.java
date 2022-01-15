 import java.util.Scanner;

public class Counting{
	public static void main(String[] args){
		Scanner valor = new Scanner(System.in);

		char [] entrada = new char [15];

		for(int i=0;i<15;i++){
			System.out.println("Inserta tu Character:"+(i+1));
			char deposito=valor.next().charAt(0);
			entrada[i]=deposito;
		}

		int [] contador = new int [7]; //Se comienza el arreglo contador de elementos, en cada posicion se coloca un cero.
		for(int i=0;i<7;i++){
			contador[i]=0;
		}
		

		for(int i=0;i<15;i++){    //Se comienzan a contar las apariciones de cada valor por lo que se aumenta el valor en cada posicion
			if(entrada[i]=='A'){  //si se cumple la aparicion del valor, existe la generalizacion del proceso pero no me lo  permitia.
				contador[0]+=1;
			}
			if(entrada[i]=='B'){
				contador[1]+=1;
			}
			if(entrada[i]=='C'){
				contador[2]+=1;
			}
			if(entrada[i]=='D'){
				contador[3]+=1;
			}
			if(entrada[i]=='E'){
				contador[4]+=1;
			}
			if(entrada[i]=='F'){
				contador[5]+=1;
			}
			if(entrada[i]=='G'){
				contador[6]+=1;
			}
		}


		for(int a=0;a<7;a++){
			System.out.println("El arreglo quedo["+(a+1)+"]:"+contador[a]);
		}

		System.out.println("\nArregLo contador que indica posiciones:\n");

		for(int i=1;i<7;i++){
			contador[i]+=contador[i-1];
		}

		for(int a=0;a<7;a++){
			System.out.println("El arreglo quedo["+(a+1)+"]:"+contador[a]);
		}

		System.out.println("\n");

		char [] ordenS= new char[15]; //Se crea el arreglo final donde se ordenaran los valores.

		/*Se comienza a leer de derecha a izquierda y si coincide se envia el valor al arreglo donde estara su posicion final,
		un detalle es la resta de valores porque la cuenta de apariciones contempla un rango de [0,15], donde el 15 no esta en el
		arreglo, sino se considera esto se tiene un error debido a que los valores entrar en una posicion no valida
		*/
		for(int i=14,j=0;i>=0 && j<15;i--,j++){
			if(entrada[i]=='A'){
				ordenS[contador[0]-1]=entrada[i];
				contador[0]--;
				System.out.println("Introduccion:["+(j+1)+"]:"+ordenS[j]);
			}
			if(entrada[i]=='B'){
				ordenS[contador[1]-1]=entrada[i];
				contador[1]--;
				System.out.println("Introduccion:["+(j+1)+"]:"+ordenS[j]);
			}
			if(entrada[i]=='C'){
				ordenS[contador[2]-1]=entrada[i];
				contador[2]--;
				System.out.println("Introduccion:["+(j+1)+"]:"+ordenS[j]);
			}
			if(entrada[i]=='D'){
				ordenS[contador[3]-1]=entrada[i];
				contador[3]--;
				System.out.println("Introduccion:["+(j+1)+"]:"+ordenS[j]);
			}
			if(entrada[i]=='E'){
				ordenS[contador[4]-1]=entrada[i];
				contador[4]--;
				System.out.println("Introduccion:["+(j+1)+"]:"+ordenS[j]);
			}
			if(entrada[i]=='F'){
				ordenS[contador[5]-1]=entrada[i];
				contador[5]--;
				System.out.println("Introduccion:["+(j+1)+"]:"+ordenS[j]);
			}
			if(entrada[i]=='G'){
				ordenS[contador[6]-1]=entrada[i];
				contador[6]--;
				System.out.println("Introduccion:["+(j+1)+"]:"+ordenS[j]);
			}
		}

		System.out.println("\nArreglo final:\n");

		for(int a=0;a<15;a++){
			System.out.println("El arreglo quedo["+(a+1)+"]:"+ordenS[a]);
		} 


 	}
	
}