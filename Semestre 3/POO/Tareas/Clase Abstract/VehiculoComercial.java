class VehiculoComercial extends VehiculosT{
	private String categoria="Clasico";
	private String modelo="Mustang G5";

	VehiculoComercial(){
		System.out.println("Constructor de la clase VehiculoComercial");
	}

	/**
	*Los metodos solo imprimen las acciones que tendría que hacer el vehiculo en caso de realizar la accion
	*/
	
	public void frenar(){
		System.out.println("Se esta disminuyendo la velocidad, hay un paso de cebras, hay que respetar");
	}

	public void acelerar(){
		System.out.println("Ya es tarde para llegar a la escuela, tienes que irte muy rapido");
	}	

	public void limiteDeVelocidad(){
		System.out.println("Ya no puede acelerar mas porque te agarro la hora pico y estas encerrado en el trafico");
	}

	public void mostrar(int hola){
		System.out.println("Categoria:"+categoria);
		System.out.println("Modelo:"+modelo);
	}
}