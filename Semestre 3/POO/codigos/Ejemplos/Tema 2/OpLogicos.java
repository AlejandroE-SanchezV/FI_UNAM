class OpLogicos{
	

	public static void main(String [] args){
		int a; //variable a manipular 
		int b; //número de bits a recorrer
		a = 15;
		b = 2;
		int c = a >> b;
		int d = a << b;
		int e = c >>> b;
		System.out.println("Corrimiento a la derecha: "+c);
		System.out.println("Corrimiento a la izquierda: "+d);	
		System.out.println("Corrimiento a la derecha sin signo: "+e);
	}
}