
/**
*En este caso se determinan los atributos unos como publicos y otros como publicos para que se puedan modificar los valores.  
*/

class VehiculosT{
	private String sistemaDeMovimiento;
	public  String fuenteDePoder;
	public int caballosDeFuerza;
	public int cantidadDePasajeros;
	private String tipoDeTerreno;

	VehiculosT(){
		System.out.println("Constructor de la clase VehiculosT");
		sistemaDeMovimiento="";
	 	fuenteDePoder="";
		caballosDeFuerza=0;
		cantidadDePasajeros=0;
		tipoDeTerreno="";
	}

	/**
	*Los metodos solo imprimen las acciones que tendría que hacer el vehiculo en caso de realizar la accion
	*/

	public void encender(){
		System.out.println("El vehiculo esta encendiendo");
	}

	public void frenar(){
		System.out.println("Se esta disminuyendo la velocidad");
	}

	public void acelerar(){
		System.out.println("Se esta incrementando la velocidad");
	}	

	public void apagar(){
		System.out.println("El vehiculo se esta apagando");
	}

	public void limiteDeVelocidad(){
		System.out.println("Ya no se puede acelerar mas");
	}

	/**
	*Imprime los valores de los atributos de la clase
	*/
	public void mostrar(){
		System.out.println("Sistema de movimiento:"+sistemaDeMovimiento);
		System.out.println("Fuente de poder:"+fuenteDePoder);
		System.out.println("Caballos de fuerza:"+caballosDeFuerza);
		System.out.println("Cantidad de pasajeros:"+cantidadDePasajeros);
		System.out.println("Tipo de Terreno:"+tipoDeTerreno);
	}

	
	public static void main(String [] args){
		VehiculosT nuevo = new VehiculosT();
		nuevo.mostrar();
	}

}