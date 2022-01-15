class Figura{
	double area(){
		return 0;
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

class PruebaFigura{
	public static void main(String[] args) {
		Circulo c1 = new Circulo(5.7);
		System.out.println("Area del circulo: " + c1.area());

		Triangulo t1 = new Triangulo(7, 8.3);
		System.out.println("Area del triangulo: " + t1.area());

		PruebaFigura pf = new PruebaFigura();
		pf.tipoFigura(c1);
		pf.tipoFigura(t1);
	}

	public void tipoFigura(Figura f){
		if(f instanceof Circulo) System.out.println("Circulo");
		else if(f instanceof Triangulo) System.out.println("Triangulo");
	}
}