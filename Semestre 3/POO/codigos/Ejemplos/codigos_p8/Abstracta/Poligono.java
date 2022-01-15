public abstract class Poligono{
	public abstract double area();			//<-----
											//      |-> Metodos abstractos (No tienen implementación)
	public abstract double perimetro();		//<-----

	public String toString(){		//<------ Metodo concreto (su implementacion si esta definida)
		return "Poligono";
	}
}