class Prueba{
	public static void main(String[] args){
		System.out.println("Clase Bicicletas");
		Bicicletas nueva = new Bicicletas();
		nueva.caballosDeFuerza=50;
		nueva.cantidadDePasajeros=2;
		nueva.fuenteDePoder="Piernas";
		nueva.encender();
		nueva.frenar();
		nueva.acelerar();
		nueva.limiteDeVelocidad();
		nueva.apagar();
		nueva.mostrar();
		nueva.mostrar(1);


		System.out.println("\nClase Camiones");
		Camiones nueva1 = new Camiones();
		nueva1.caballosDeFuerza=300;
		nueva1.cantidadDePasajeros=2;
		nueva1.fuenteDePoder="MotorG594";
		nueva1.encender();
		nueva1.frenar();
		nueva1.acelerar();
		nueva1.limiteDeVelocidad();
		nueva1.apagar();
		nueva1.mostrar();
		nueva1.mostrar(1);

		System.out.println("\nClase Autobuses");
		Autobuses nueva2 = new Autobuses();
		nueva2.caballosDeFuerza=200;
		nueva2.cantidadDePasajeros=40;
		nueva2.fuenteDePoder="Motor45A";
		nueva2.encender();
		nueva2.frenar();
		nueva2.acelerar();
		nueva2.limiteDeVelocidad();
		nueva2.apagar();
		nueva2.mostrar();
		nueva2.mostrar(1);

		System.out.println("\nClase Motocicletas");
		Motocicletas nueva3 = new Motocicletas();
		nueva3.caballosDeFuerza=250;
		nueva3.cantidadDePasajeros=2;
		nueva3.fuenteDePoder="MotorXY6";
		nueva3.encender();
		nueva3.frenar();
		nueva3.acelerar();
		nueva3.limiteDeVelocidad();
		nueva3.apagar();
		nueva3.mostrar();
		nueva3.mostrar(1);

		System.out.println("\nClase VehiculoComercial");
		VehiculoComercial nueva4 = new VehiculoComercial();
		nueva4.caballosDeFuerza=230;
		nueva4.cantidadDePasajeros=4;
		nueva4.fuenteDePoder="MotorMK9";
		nueva4.encender();
		nueva4.frenar();
		nueva4.acelerar();
		nueva4.limiteDeVelocidad();
		nueva4.apagar();
		nueva4.mostrar();
		nueva4.mostrar(1);
	} 
}