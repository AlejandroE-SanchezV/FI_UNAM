//Clase externa contenedora
class Contenedora{
	int externa_x;

	Contenedora(int x){
		externa_x = x;
	}

	void prueba(){

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

		Interna i = new Interna();
		i.mostrar();
	}
}

class PruebaInterna{
	public static void main(String[] args) {
		Contenedora c = new Contenedora(29);
		c.prueba();
	}
}