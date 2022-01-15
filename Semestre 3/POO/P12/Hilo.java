public class Hilo extends Thread{
	/**
	*La clase Hilo hereda todos los atributos y métodos
	*de la clase Thread, que modela hilos
	*/
	public Hilo(String nombre){
	/**
	*El método constructor de l hilo recibe como parámetro una cadena
	*que será el nombre del hilo
	*/
		super(nombre);
	/**
	*Se invoca el método de la clase Thread que permite nombrar al hilo 
	*con una cadena.
	*/
	}

	public void run(){
		/**
		*Se sobrecarga el método run de la clase Thread
		*/
		for(int i=0; i<5; i++){
			System.out.println("Iteracion: " + (i+1) + " de " + getName());
			/**
			*Cada hilo realizará este método run, y en un ciclo for, imprimirá a pantalla 
			*las iteraciones que realiza que serán en total 5
			*/
		}
		System.out.println("Termina el " + getName());
		/**
		*Se indica que el hilo termino de iterar
		*/
	}

	public static void main(String[] args) {
		new Hilo("Primer hilo").start();
		/**
		*Como la clase hereda de la clase Thread, no es necesario hacer referencias
		*para instanciar un hilo, solo se invoca a su método constructor y como parámetro
		*se pasa a la cadena que será el nombre del hilo.
		*/
		new Hilo("Segundo hilo").start();
		System.out.println("Termina el hilo principal");
		/**
		*Se indica que el hilo principal, o main culmina, aunque esto no significa que 
		*los hilos anteriormente creados dejen de funcionar.
		*/
	}
}