abstract class Figura{
	double punto;
	abstract double area();//método abstracto

	void setPunto(double punto){//método concreto
		this.punto = punto;
	}
}

class Circulo extends Figura{
	static final double PI = 3.14158;
	double radio;

	Circulo(double r){
		radio = r;
	}

	double area(){
		return PI*radio*radio;
	}
}

class Triangulo extends Figura{
	double base;
	double altura;

	Triangulo(double b, double a){
		base = b;
		altura = a;
	}

	double area(){
		return (base*altura)/2;
	}
}

abstract class Cuadrilatero extends Figura{
	double lado;
	Cuadrilatero(double l){
		lado = l;
	}
}

class Cuadrado extends Cuadrilatero{
	
	Cuadrado(double l){
		super(l);
	}

	double area(){
		return lado*lado;
	}
}

class PruebaFigura{
	public static void main(String[] args) {
		Circulo c1 = new Circulo(5.7);
		System.out.println("Area del circulo: " + c1.area());

		Triangulo t1 = new Triangulo(7, 8.3);
		System.out.println("Area del triangulo: " + t1.area());

		Cuadrado cuad1 = new Cuadrado(8);
		System.out.println("Area del triangulo: " + cuad1.area());

		Figura f;

		f = c1;
		System.out.println("Area del circulo: " + f.area()); //enlace dínamico

		PruebaFigura pf = new PruebaFigura();
		pf.tipoFigura(t1);
		pf.tipoFigura(cuad1);
	}

	public void tipoFigura(Figura f){
		if(f instanceof Circulo) System.out.println("Circulo");
		else if(f instanceof Triangulo) System.out.println("Triangulo");
		else if(f instanceof Cuadrado) System.out.println("Cuadrado");
	}
}