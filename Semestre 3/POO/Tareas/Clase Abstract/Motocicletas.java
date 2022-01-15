class Motocicletas extends VehiculosT{
	private String categoria="Deportiva";
	private String modelo="Kawasaki Y90";

	Motocicletas(){
		System.out.println("Constructor de la clase Motocicletas");
	}

	/**
	*Los metodos solo imprimen las acciones que tendría que hacer el vehiculo en caso de realizar la accion
	*/
	
	public void frenar(){
		System.out.println("Se esta disminuyendo la velocidad, hay un cruce de vialidades, es mejor evitar un accidente");
	}

	public void acelerar(){
		System.out.println("La pista esta libre, y no hay curvas, puede acelerar hasta el limite");
	}	

	public void limiteDeVelocidad(){
		System.out.println("Ya no puede acelerar mas porque ya no tiene gasolina");
	}

	public void mostrar(int hola){
		System.out.println("Categoria:"+categoria);
		System.out.println("Modelo:"+modelo);
	}
}