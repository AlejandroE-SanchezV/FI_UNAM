class Camiones extends VehiculosT{
	private int cantidadDeCarga=500;
	private String tipoDeCarga="Piedra";

	Camiones(){
		System.out.println("Constructor de la clase Camiones");
	}

	/**
	*Los metodos solo imprimen las acciones que tendría que hacer el vehiculo en caso de realizar la accion
	*/
	
	public void frenar(){
		System.out.println("Se esta disminuyendo la velocidad, dirigase a espacio designado en la carretera");
	}

	public void acelerar(){
		System.out.println("Se esta incrementando la velocidad, detente, puedes causar un accidente");
	}	

	public void limiteDeVelocidad(){
		System.out.println("De acuerdo a tu carga no puedes acelerar mas, sino se va a descomponer el motor");
	}

	public void mostrar(int hola){
		System.out.println("Cantidad de carga:"+cantidadDeCarga);
		System.out.println("Tipo de carga:"+tipoDeCarga);
	}
}