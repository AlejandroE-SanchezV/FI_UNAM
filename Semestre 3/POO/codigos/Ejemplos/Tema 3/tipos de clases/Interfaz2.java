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
		
	}
}