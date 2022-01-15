class PruebaGato{
	public static void main(String[] args) {
		Gato silvestre = new Gato();
		//silvestre.jugar();
		System.out.println("Peso: " + silvestre.peso);
		System.out.println("Hambre: " + silvestre.nivelHambre);
		System.out.println("Energia: " + silvestre.nivelEnergia);
		Animal a;
		Gato g = silvestre;
		a = silvestre;
		System.out.println("gato referenciado mediante animal\n");
		//a.maullar();
		a.buscarComida();
		Felino f;
		f = silvestre;
		//f.maullar();
		f.correr();
		f.buscarComida();
		//g.jugar();
	}

}