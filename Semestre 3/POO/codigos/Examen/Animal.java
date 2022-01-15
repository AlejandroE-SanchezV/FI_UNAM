class AnimalAcuatico{
	private String color;
	private double tamano;

	public void yoSoy(){
		System.out.println("Soy un AnimalAcuatico");
	}

	public void nadar(){
		System.out.println("Nadando...");
	}
}

class Delfin extends AnimalAcuatico{
	public void yoSoy(){
		System.out.println("Soy un delfin");
	}

	public void usarRadar(){
		System.out.println("Buscando...");
	}

	public void usarSensor(){
		System.out.println("Buscando...");
	}
}

class PruebaDelfin{
	public static void main (String[] args){
		AnimalAcuatico flipper = new Delfin();
		flipper.yoSoy();
		flipper.nadar();
		flipper.usarRadar();
		flipper.usarSensor();
	}
}