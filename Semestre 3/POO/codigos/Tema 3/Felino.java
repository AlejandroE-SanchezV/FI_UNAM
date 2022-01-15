class Felino extends Animal{
	int colorDeOjos;

	Felino(){
		System.out.println("Constructor de la clase Felino");
	}

	void correr(){
		System.out.println("Corriendo...");
		nivelEnergia -= 20;
		nivelHambre += 15;
		peso --;
	}
}

