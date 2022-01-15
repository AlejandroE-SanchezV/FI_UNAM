import java.util.Scanner;

public class Radix{
	int primero=0;
	int ultimo=-1;
	int [] lista=new int [10];

	public static void main(String[] args){
		Radix orden = new Radix();
		Scanner valor = new Scanner(System.in);
		Radix digito0 = new Radix();
		Radix digito1 = new Radix();
		Radix digito2 = new Radix();
		Radix digito3 = new Radix();

		for(int i=0;i<10;i++){
			System.out.println("Inserta el valor de cuatro digitos["+(i+1)+"]:");
			int x=valor.nextInt();
			orden.lista[i]=x;
		}

		for(int i=0;i<10;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+orden.lista[i]);
		}

		for(int i=0;i<10;i++){
			if((orden.lista[i])%10==0){
				digito0.lista[i]=orden.lista[i];
			}
			if((orden.lista[i])%10==1){
				digito1.lista[i]=orden.lista[i];	
			}
			if((orden.lista[i])%10==2){
				digito2.lista[i]=orden.lista[i];
			}
			if((orden.lista[i])%10==3){
				digito3.lista[i]=orden.lista[i];
			}
		}

		int a=0,b=0,c=0,d=0;
		for (int i=0;i<10;i++){
			if(digito0.lista[i]!=0){
				a+=1;
			}
			if(digito1.lista[i]!=0){
				b+=1;
			}
			if(digito2.lista[i]!=0){
				c+=1;
			}
			if(digito3.lista[i]!=0){
				d+=1;
			}
		}

		for(int i=0;i<a;i++){
			orden.lista[i]=digito0.lista[i];
		}
		for(int i=a;i<(a+b);i++){
			orden.lista[i]=digito1.lista[i-a];
		}
		for(int i=(a+b);i<(a+b+c);i++){
			orden.lista[i]=digito2.lista[i-(a+b)];
		}
		for(int i=(a+b+c);i<(a+b+c+d);i++){
			orden.lista[i]=digito3.lista[i-(a+b+c)];
		}

		System.out.println("\n");
		for(int i=0;i<10;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+orden.lista[i]);
		}

		System.out.println("\n");
		for(int i=0;i<5;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+digito0.lista[i]);
		}
		System.out.println("\n");

		for(int i=0;i<10;i++){
			if(((orden.lista[i])/10)%10==0){
				digito0.lista[i]=orden.lista[i];
			}
			if(((orden.lista[i])/10)%10==1){
				digito1.lista[i]=orden.lista[i];
			}
			if(((orden.lista[i])/10)%10==2){
				digito2.lista[i]=orden.lista[i];
			}
			if(((orden.lista[i])/10)%10==3){
				digito3.lista[i]=orden.lista[i];
			}
		}

		System.out.println("\n");
		for(int i=0;i<5;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+digito0.lista[i]);
		}
		System.out.println("\n");

		for(int i=0;i<5;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+digito1.lista[i]);
		}
		System.out.println("\n");

		for(int i=0;i<5;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+digito2.lista[i]);
		}
		System.out.println("\n");

		for(int i=0;i<5;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+digito3.lista[i]);
		}
		System.out.println("\n");


		int e=0,f=0,g=0,h=0;
		for (int i=0;i<10;i++){
			if(digito0.lista[i]!=0){
				e+=1;
			}
			if(digito1.lista[i]!=0){
				f+=1;
			}
			if(digito2.lista[i]!=0){
				g+=1;
			}
			if(digito3.lista[i]!=0){
				h+=1;
			}
		}

		for(int i=0;i<a;i++){
			orden.lista[i]=digito0.lista[i];
		}
		for(int i=a;i<(a+b);i++){
			orden.lista[i]=digito1.lista[i-a];
		}
		for(int i=(a+b);i<(a+b+c);i++){
			orden.lista[i]=digito2.lista[i-(a+b)];
		}
		for(int i=(a+b+c);i<(a+b+c+d);i++){
			orden.lista[i]=digito3.lista[i-(a+b+c)];
		}

		System.out.println("\n");
		for(int i=0;i<10;i++){
			System.out.println("Valor del arreglo["+(i+1)+"]:"+orden.lista[i]);
		}

	}
}

