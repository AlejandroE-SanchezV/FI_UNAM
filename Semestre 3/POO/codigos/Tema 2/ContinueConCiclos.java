class ContinueConCiclos{
	public static void main(String[] args) {
		for(int i=0; i<100; i++){
			if(i%5 != 0) continue;
			else System.out.println(i + " es multiplo de 5");
		}

		//Criba de Eratostenes
		//Obtención de los números primos del 1 al 100

		int n = 1;
		int criba[] = new int[100];
		do{
			n += 1; //Desde n = 2
			if(criba[n-1] == 0){
				//Marcado de los multiplos de n
				for(int j=n; j<=(100 / n); j++){
					criba[(n*j)-1] = (n*j);
					System.out.println(n + " * " + j + " = " + (n*j));
				}

			}else continue;
		}while(n <= (int)Math.sqrt(100));

		System.out.println("\nLos numeros primos del 1 al 100 son: \n");

		for (int i=1; i<99; i++) {
			if(criba[i] != 0) continue;
			else System.out.println(i+1);
		}
	}
}