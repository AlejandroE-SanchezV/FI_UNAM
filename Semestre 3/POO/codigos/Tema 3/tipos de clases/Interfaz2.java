interface Corre{
	void correr(); //por defecto los métodos son abstractos y públicos.
}

class Tiempo implements Corre{
	public void correr(){
		System.out.println("El tiempo corre...");
	}
}

class Programa implements Corre{
	public void correr(){
		System.out.println("Programa en ejecución");
	}
}

class AutoDeCarreras implements Corre{
	public void correr(){
		System.out.println("Ganando la carrera...");
	}
}

class PruebaInterfaz2{
	public static void main(String[] args) {
		Tiempo t = new Tiempo();
		Programa p = new Programa();
		AutoDeCarreras ac = new AutoDeCarreras();

		Corre co;

		co = t;

		System.out.println("Tiempo ");
		co.correr();

		co = p;
		System.out.println("Programa ");
		co.correr();

		co = ac;
		System.out.println("Auto de carreras ");
		co.correr();
	}
}