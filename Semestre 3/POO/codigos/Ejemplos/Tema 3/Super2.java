class A{
	int i, j;

	void mostrarij(){
		System.out.println("i = "+ i + " j = " + j);
	}
}

class B extends A{
	int i;

	void inicializar(){
		this.i = 3;
		super.i = 1;
	}

	void mostrarVar(){
		System.out.println("i de la superclase: super.i="+ super.i);
		System.out.println("i de la subclase: this.i="+ this.i);
	}

	void mostrarij(){
		System.out.println("i de la subclase: "+ i);
		System.out.println("j = " + j);
		System.out.println("\n");

		super.mostrarij();
	}

	void mostrarij(int x){
		this.i = x;
		System.out.println("i de la subclase: "+ i);
		System.out.println("j = " + j);
		System.out.println("\n");

		//super.mostrarij();
	}
}

class PruebaHerencia{
	public static void main(String[] args) {
		B objB = new B();
		objB.inicializar();
		objB.mostrarVar();
		System.out.println("\n");
		objB.mostrarij();
		objB.mostrarij(6);
	}
}