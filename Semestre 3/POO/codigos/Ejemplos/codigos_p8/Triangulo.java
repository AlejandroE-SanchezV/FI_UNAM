public class Triangulo extends Poligono{
	private int alpha, beta, gamma;	//Angulos en grados
	private double a, b, c;	// Angulos en radianes
	private double base, altura;

	public void setBase(double base){
		this.base = base;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public double area(){
		return (base * altura) / 2;
	}

	public double perimetro(){
		return 0d;
	}

	public String toString(){
		return "Triangulo";
	}
}