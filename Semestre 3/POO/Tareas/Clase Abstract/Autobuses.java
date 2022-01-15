class Autobuses extends VehiculosT{
	private int costoPasaje=12;
	private String playlistCamion="Cumbias rebajadas";

	Autobuses(){
		System.out.println("Constructor de la clase Autobuses");
	}
	
	/**
	*Los metodos solo imprimen las acciones que tendría que hacer el vehiculo en caso de realizar la accion
	*/

	public void frenar(){
		System.out.println("Se esta disminuyendo la velocidad, señores pasajeros agarrense, el chofer no se hace responsable");
	}

	public void acelerar(){
		System.out.println("Se esta incrementando la velocidad, el chofer ya se puso a competir con el otro autobus");
	}	

	public void limiteDeVelocidad(){
		System.out.println("Ya no puede acelerar mas porque hay reten, y va a descender un pasajero");
	}

	public void mostrar(int hola){
		System.out.println("Costo de pasaje:"+costoPasaje);
		System.out.println("Playlist del camion:"+playlistCamion);
	}
}