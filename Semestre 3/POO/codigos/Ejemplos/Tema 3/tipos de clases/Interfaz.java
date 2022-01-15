interface Medible{
	double calcularPerimetro();
	double calcularArea();
}

abstract class Figura implements Medible{ //Implementación parcial de la interfaz Medible
	String color;

	public Figura(String color){
		this.setColor(color);
	}

	public String getColor(){
		return this.color;
	}

	public void setColor(String color){
		this.color = color;
	}
}

class Cuadrado extends Figura{
	double lado;

	public Cuadrado(double lado, String color){
		super(color);
		this.lado = lado;	
	}

	public double calcularPerimetro(){
		return lado * 4;
	}

	public double calcularArea(){
		return lado*lado;
	}
}

class PruebaInterfaz{
	public static void main(String[] args) {
		Medible m;
		Figura f;

		Cuadrado c1 = new Cuadrado(3, "azul");
		Cuadrado c2 = new Cuadrado(4, "verde");

		System.out.println(c1.calcularPerimetro());
		System.out.println(c1.calcularArea());
		System.out.println(c1.getColor());

		m = c1;

		System.out.println(m.calcularPerimetro());
		//System.out.println(m.getColor());
		//m.setColor("amarillo");

		f = c2;

		System.out.println(f.calcularPerimetro());
		System.out.println(f.getColor());
		f.setColor("rojo");

	}
}