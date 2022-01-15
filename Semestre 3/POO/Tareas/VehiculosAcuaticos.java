public abstract class VehiculosAcuaticos{
	double posX;
	double posY;

	void desplazarse(double desplazamientoX, double desplazamientoY){
		posX +=desplazamientoX;
		posY +=desplazamientoY;
		System.out.println("Moviendose");
		System.out.println("posX:"+posX+"posY:"+posY);
	}

	public abstract void arrancar();
}

class Lancha extends VehiculosAcuaticos{

	public void arrancar(){
		System.out.println("El tripulante rema...");
	}
}

class Barco extends VehiculosAcuaticos{
	Motor m1;
	Motor m2;
	Motor m3;

	public void arrancar(){
		System.out.println("Encender motores...");
	}

	public void arrancar(){
		m1.encender();
		m2.encender();
		m3.encender();
	}
}