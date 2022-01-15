import java.util.Scanner; //Se importa la clase para el poder leer valores de entrada y dar un valor al radio

/**
* La clase circulo se crea con dos atributos, uno de instancia y otro constante, en este caso no utilizo variable de clase
*porque no es necesario, ya que creo un objeto de la clase y por medio de este se puede acceder a los atributos y a la 
*vez es posible el dar un valor al radio.
*/

public class Circulo{
	private int radio;        //Se coloca un int para el radio, simplemente para hacerlo mas practico pero se puede colocar un float o double
	private final float pi=3.1416f; //En este caso se coloca el float por la inicializacion del pi, ya que no cambia

	/*
	*Las funciones no son estaticas ya que no se necesita acceder a ellas por otro medio ya que se crea un objeto,
	*en caso de colocar el static sería cuando se enviaran valores a las funciones y no se tuviera una instancia de la clase
	*o si se necesitaran en otra clase
	*/

	public void Area(){
		float resultado=pi*radio*radio;
		System.out.println("El resultado es:"+resultado);
	}
	public void Perimetro(){
		float resultado=pi*2*radio;
		System.out.println("El resultado es:"+resultado);
	}

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		Circulo primero=new Circulo();
        System.out.println("Escribe el valor del radio:");
        primero.radio=sc.nextInt();
		primero.Area();
		primero.Perimetro();
		sc.close()
	}
}