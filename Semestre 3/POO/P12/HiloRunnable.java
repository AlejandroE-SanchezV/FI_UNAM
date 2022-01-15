public class HiloRunnable implements Runnable{
	/**
	*La clase HiloRunnable implementará la interfaz Runnable
	*la cual va a permitir la multiherencia en caso de que se quieran extender más 
	*objetos de la clase Thread. Aunque realmente esta interfaz, también hace
	*uso de métodos de la clase Thread, por lo tanto es mejor que las clases creadas 
	*hereden de la clase Thread, ya que es una implementación más sencilla
	*/
	public void run(){
		/**
		*Se sobrecarga el método run de la imterfaz Runnable
		*/
		for (int i = 0; i<5; i++) {
			System.out.println("Iteracion " + (i+1) + " de " + Thread.currentThread().getName());
		}
		/**
		*En un ciclo for se imprimirán a pantalla las iteraciones que realiza un hilo
		*y para obtener el nombre de dicho hilo, a patir de un objeto Thread, invocamos a su método
		*currentThread que nos dará la referencia del hilo actual, y después obtenemos su nombre
		*al invocar a su método getName
		*/

		System.out.println("Termina el " + Thread.currentThread().getName());	
		/**
		*Se indica que el hilo ha terminado su ejecución
		*/
	}

	public static void main(String[] args) {
		new Thread(new HiloRunnable(), "Primer hilo").start();
		new Thread(new HiloRunnable(), "Segundo hilo").start();
		/**
		*En el método main de la clase HiloRunnable, se crean 2 hilos, sin necesidad de crear una 
		*referencia de un objeto Thread, y para crearlos se invoca a un método constructor 
		*predeterminado de la clase Thread, que como parámetros, recibe el objeto al cual
		*hace refrencia el hilo creado y el nombre del hilo, en este caso el objeto al cual
		*hará referencia el hilo, será a un objeto de la clase HiloRunnable
		*luego se invoca su método start, que invocará al método run
		*/
		System.out.println("Termina el hilo principal");
	}
}