public class Cuadrilatero extends Poligono{
	private int alpha, beta; //Angulos en grados
	private double a, b; //Angulos en radianes
	private double base, altura;

	public void setBase(double base){
		this.base = base;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public double area(){
		return 0d;
	}

	public double perimetro(){
		return (2 * base) + (2 * altura);
	}

	public String toString(){
		return "Cuadrilatero";
	}
}