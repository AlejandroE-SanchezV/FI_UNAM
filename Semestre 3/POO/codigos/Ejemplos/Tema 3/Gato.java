class Gato extends Felino{
	String nombre;

	Gato(){
		System.out.println("Constructor de la clase Gato");
	}

	void maullar(){
		System.out.println("Miau...");
	}

	void verificarHambre(){
		if (nivelHambre > 40) {
			System.out.println("Tengo hambre");
			buscarComida();
			while(nivelHambre > 40)
				comer();
		}
	}

	void jugar(){
		do{
			nivelHambre += 5;
			nivelEnergia -= 10;
			System.out.println("Jugando...");
			maullar();
		}while(nivelHambre <= 40);

		verificarHambre();
		maullar();
		comer();
	}
}

