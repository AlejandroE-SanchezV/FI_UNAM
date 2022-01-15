//Clase externa contenedora
class Contenedora{
	int externa_x;

	Contenedora(int x){
		externa_x = x;
	}

	void prueba(){
		for(int k=0; k<10;k++){
			//Clase interna
			class Interna{
				int interna_y;

				Interna(){}

				Interna(int y){
					interna_y = y;
				}

				void mostrar(){
					System.out.println("Mostrando: externa_x = " + externa_x);
					System.out.println("Mostrando: interna_y = " + interna_y);
				}
			}

			Interna i = new Interna(k);
			i.mostrar();
		}
	}
}

class PruebaInterna{
	public static void main(String[] args) {
		Contenedora c = new Contenedora(29);
		c.prueba();
	}
}