class Bicicletas extends VehiculosT{
	private String tipoDeAsiento="Vagabudno";
	private String tipoDeManubrio="Cuernos de toro";

	/**
	*Los metodos solo imprimen las acciones que tendría que hacer el vehiculo en caso de realizar la accion
	*/

	Bicicletas(){
		System.out.println("Constructor de la clase Bicicletas");
	}

	public void frenar(){
		System.out.println("Se esta disminuyendo la velocidad, coloque el pie para detenerse");
	}

	public void acelerar(){
		System.out.println("Se esta incrementando la velocidad, pedalee mas duro");
	}	

	public void limiteDeVelocidad(){
		System.out.println("Ya no se puede acelerar mas, se canso de mucho peladear");
	}

	public void mostrar(int hola){
		System.out.println("Tipo de asiento:"+tipoDeAsiento);
		System.out.println("Tipo de manubrio:"+tipoDeManubrio);
	}

}