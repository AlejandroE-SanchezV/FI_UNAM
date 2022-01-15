class Animal{
	int nivelHambre;
	int nivelEnergia;
	int peso;

	Animal(){
		System.out.println("Constructor en la clase Animal");
		peso = 3;
		nivelHambre = 50;
		nivelEnergia = 50;

	}

	Animal(int peso, int nh){
		this.peso = peso;
		nivelHambre = nh;
		System.out.println("Hola constructor con tres parametros");
		//nivelEnergia = ne;
	}

	Animal(int p, int nh, int ne){
		this(p, nh);
		System.out.println("Hola constructor con dos parametros");
		
		nivelEnergia = ne;
	}

	void buscarComida(){
		System.out.println("Buscando comida...");
		this.nivelEnergia -= 10;
	}

	void comer(){
		if(nivelHambre > 40){
			System.out.println("Comiendo");
			this.nivelHambre -= 10;
			this.nivelEnergia += 10;
			this.peso++;
		}
		else
			System.out.println("No tengo hambre");
	}

	public static void main(String[] args) {
		Animal a = new Animal(50, 60, 60);
	}
}

