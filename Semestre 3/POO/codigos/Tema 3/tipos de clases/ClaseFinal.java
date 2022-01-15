abstract class Animal{
	private double peso;
	private double edad;

	public void setPeso(double p){
		peso = p;
		System.out.println("Peso recibido: " + p);
	}

	public void setEdad(double edad){
		edad = edad;
	}

	public double getPeso(){
		return peso;
	}

	public double getEdad(){
		return edad;
	}

	abstract void respirar();
}

abstract class Mamifero extends Animal{
	String colorDePelo;

	abstract void comer();
}

final class Morsa extends Mamifero{
	void respirar(){
		System.out.println("Respirando...");
	}

	void comer(){
		System.out.println("Comiendo ...");
	}
}
/*
class MorsaCafe extends Morsa{

}*/

class PruebaAnimal{
	public static void main(String[] args) {
		Morsa mo = new Morsa();
		mo.setPeso(200.50);
		System.out.println("El peso de la morsa es: " + mo.getPeso());
	}
}