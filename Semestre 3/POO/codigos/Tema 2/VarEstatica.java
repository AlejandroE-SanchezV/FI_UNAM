class Puntos{
	static int numPuntos;
	static int numX;
	int x, y;

	public Puntos(){
		numPuntos++;
	}

	public static void main(String[] args) {
		Puntos a = new Puntos();
		Puntos b = new Puntos();

		a.x = 5;
		a.y = 6;

		System.out.println("A(x,y): A(" + a.x + ", " + a.y + ")");

		Puntos.numX = 7;

		b.x = Puntos.numPuntos;
		b.y = numX; //Debido a que se accesa a esta variable dentro de un contexto estatico dentro de la misma clase

		System.out.println("B(x,y): B(" + b.x + ", " + b.y + ")");


		b.numX = 8;

		System.out.println("numX: " + numX);

	}
}