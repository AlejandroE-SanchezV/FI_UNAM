public class PruebaFiguras{
	public static void main(String[] args) {
		Poligono poligono = new Poligono();

		Object objeto = poligono;

		System.out.println(objeto);

		poligono = new Triangulo();
		System.out.println(poligono);
		objeto = poligono;		
		System.out.println("Desde la referencia objeto: " + objeto);
		poligono = new Cuadrilatero();
		System.out.println(poligono);
		objeto = poligono;

		//objeto.setBase(5d); //No esta definido dentro de Object

		//poligono.setBase(5d); //No esta definido dentro de la clase Poligono
		
		System.out.println("Desde la referencia objeto: " + objeto);

		getPoligono(poligono);
		Triangulo t = new Triangulo();
		System.out.println("\nEl objeto t es un: \n");
		getPoligono(t);

		objeto = new Poligono();
		getPoligono(objeto);
	}

	/*public static void getPoligono(Poligono p){
		if(p instanceof Triangulo){
			System.out.println("Es un triangulo");
		}else if(p instanceof Cuadrilatero) System.out.println("Es un cuadrilatero");
		else System.out.println("Es un poligono");
	}*/

	public static void getPoligono(Object p){
		if(p instanceof Triangulo){
			System.out.println("Es un triangulo");
		}else if(p instanceof Cuadrilatero) System.out.println("Es un cuadrilatero");
		else System.out.println("Es un poligono");
	}
}