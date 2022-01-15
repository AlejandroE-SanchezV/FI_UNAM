//Clase externa contenedora
class Contenedora{
	private int externa_x;

	Contenedora(int x){
		externa_x = x;
	}

	void prueba(){
		Interna i = new Interna(3);
		i.mostrar();
	}

	//Clase interna
	class Interna{
		int interna_y;

		Interna(){}

		Interna(int y){
			interna_y = y;
		}

		void mostrar(){
			System.out.println("Mostrando: externa_x = " + externa_x);
		}
	}

	static class Interna2{
		int static_intern_y;

		Interna2(int y){
			static_intern_y = y;
		}

		void mostrar(){
			Contenedora c1 = new Contenedora(5);
			System.out.println(c1.externa_x);
		}
	}

	void mostrarY(){
		//System.out.println("Mostrando: interna_y = " + interna_y);
	}
}

class PruebaInterna{
	public static void main(String[] args) {
		Contenedora c = new Contenedora(29);
		c.prueba();
		c.mostrarY();

		//Dado que Interna es un miembro de la clase Contenedora, 
		//solo se puede invocar a su constructor a través de un objeto
		//de la clase externa Contenedora. 
		Contenedora.Interna c$i = c.new Interna(); //no estatica
		c$i.interna_y = 3;
		System.out.println("Mostrando: c$i.interna_y = " + c$i.interna_y);

		Contenedora.Interna2 ci2 = new Contenedora.Interna2(5); //estatica

		System.out.println("Mostrando y de la clase interna estática: " + ci2.static_intern_y);
	}
}