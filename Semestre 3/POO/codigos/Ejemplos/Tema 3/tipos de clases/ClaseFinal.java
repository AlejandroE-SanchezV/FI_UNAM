abstract class Animal{
	double peso;
	double edad;

	public void setPeso(double peso){
		peso=peso;
	}

	public void setEdad(double edad){
		edad=edad;
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
	String ColorDePelaje;

	abstract void comer();
}

final class Morsa extends Mamifero{
	void respirar(){
		System.out.println("Respirando...");
	}

	void comer(){
		System.out.println("Comiendo...");
	}
}
/*
class Bebe extends Morsa{

}*/

class PruebaAnimal{
	public static void main(String [] args){
		Morsa mo = new Morsa();
		mo.setPeso(210.80);
		System.out.println("El peso de la morsa es:"+ mo.getPeso());
		
	}
}