public class Cuenta extends Thread{ //Hereda de la clase
	private static long saldo = 0;

	/**
	*Metodo constructor que permite asignar el nombre al hilo
	*/
	public Cuenta (String nombre){
		super(nombre);
	}

	/**
	*Override del metodo run, en el cual se utiliza un if, para poder determinar si se hace un deposito o se extrae dinero.
	*/
	public void run(){
		if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
			this.depositarDinero(100);
		}else {
			this.extraerDinero(50);
		}

		System.out.println("Termina el " + getName());
	}

	/**
	*Se utiliza un metodo sincronizado para evitar que dos hilos lleven a cabo la modificacion de los datos del metodo ya que se 
	*añade a la variable estatica la cantidad de 100 unidades.
	*/
	public synchronized void depositarDinero(int cantidad){
		saldo += cantidad;
		System.out.println(getName() + " se depositaron " + cantidad + " pesos.");
		notifyAll(); //Se notifica a los demas hilos que el metodo esta libre
	}

	/**
	*Se utiliza un metodo sincronizado para evitar que dos hilos lleven a cabo la modificacion de los datos del metodo ya que se modifican
	*en el metodo se ejecuta un sleep que permite que se ejecuten otros hilos pero que no pueden acceder al mismo metodo.
	*/
	public synchronized void extraerDinero(int cantidad){
		try{
			if(saldo <= 0){
				System.out.println(getName() + " espera deposito \n\tSaldo: " + saldo);
				sleep(1000);
			}
		} catch(InterruptedException ie){
			System.out.println(ie);
		}
		saldo -= cantidad;
		System.out.println(getName() + " extrajo " + cantidad + " pesos. \n\t Saldo restante: " + saldo);
		notifyAll();
	}

	public static void main(String[] args) {
		new Cuenta("Acceso 1").start(); //Al crearse los hilos se hacen de esta forma ya que no se van a modificar a los objetos
		new Cuenta("Acceso 2").start();
		new Cuenta("Deposito 1").start();
		new Cuenta("Deposito 2").start();

		System.out.println("Termina el hilo principal");
	}
}