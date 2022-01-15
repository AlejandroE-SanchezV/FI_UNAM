import java.util.Scanner;

/**
*Autor: Díaz Hernández Marcos Bryan
*Se crea una clase SegundoE, sin atributos de clase, unicamente se declaran variables de instancia, para que puedan 
*recibir los valores, se importa la clase Scanner para poder recibir los valores y realizar
*el ordenamiento de los valores que se inserten.
*/

public class SegundoE{


	public static void main(String[] args){
	/**
	*Se crea la variable dos, para que se puedan recibir los valores del usuario
	*/

	Scanner dos = new Scanner(System.in);

	/**
	*Se imprimen las intrucciones para el usuarion y se guardan los valores de la entrada en las variables de instancia
	*primero, segundo y tercero.
	*/

	int primero,segundo,tercero,mayor1,mayor2,medio;
	System.out.println("Inserta el primer valor:");
	primero=dos.nextInt();
	System.out.println("Inserta el segundo valor:");
	segundo=dos.nextInt();
	System.out.println("Inserta el tercer valor");
	tercero=dos.nextInt();

	/**
	*Comienza el desarrollo de la comparacion, ahora se implementa el operador ternario, este devuelve un valor en caso de
	*que se cumpla la condicion el primer termino se regresa y en caso de que no se regresa el segundo, esto se puede utilizar
	*para comprobar las posiciones de los valores,en un determinado caso pense en utilizar el operador ternario con mas variables,
	*pero eso no es optimo, por lo que utilice dos recursos la estructura if y el operador.
	*/

	mayor1=(primero>segundo)?primero:segundo;
	mayor2=(mayor1>tercero)?mayor1:tercero;
	medio=(segundo>tercero)?segundo:tercero;

	/**
	*Comienza el desarrollo de la estructura de selección if, esta se caracteriza por el uso de condiciones boleanas,
	*y en caso de que se se cumplan se ejecuta el codigo dentro de la estructura, en caso contrario se realiza el else
	*/

	if(mayor1==mayor2 && mayor1==primero){
		System.out.println("El mayor es:"+primero);
		if(medio==segundo){
			System.out.println("El segundo mayor es:"+segundo);
			System.out.println("El menor es:"+tercero);
		}else{
			System.out.println("El segundo mayor es:"+tercero);
			System.out.println("El menor es:"+segundo);
		}
	}else{
		mayor1=(segundo>primero)?segundo:primero;
		mayor2=(mayor1>tercero)?mayor1:tercero;
		medio=(primero>tercero)?primero:tercero;

		if(mayor1==mayor2 && mayor1==segundo){
			System.out.println("El mayor es:"+segundo);
			if(medio==primero){
				System.out.println("El segundo mayor es:"+primero);
				System.out.println("El menor es:"+tercero);
			}else{
				System.out.println("El segundo mayor es:"+tercero);
				System.out.println("El menor es:"+primero);
			}
		}else{
			mayor1=(tercero>primero)?tercero:primero;
			mayor2=(mayor1>segundo)?mayor1:segundo;
			medio=(primero>segundo)?primero:segundo;

			if(mayor1==mayor2 && mayor2==tercero){
				System.out.println("El mayor es:"+tercero);
				if(medio==primero){
					System.out.println("El segundo mayor es:"+primero);
					System.out.println("El menor es:"+segundo);
				}else{
					System.out.println("El segundo mayor es:"+segundo);
					System.out.println("El menor es:"+primero);
				}
			}
		}
	}

	/**
	*Las condiciones se realizaron de forma que primero se tenga que comprobar el elemento mayor de todos, despues se 
	*tenga que buscar el segundo mayor y por default se encuentre el menor de todos, en caso de que no haya mayores,
	*es decir que algunos valores sean iguales se tendra que comparar primero si son todos iguales, y si no, a partir de 
	*lo anterior se infiere que pueden haber dos iguales, por lo que se comprueban los posibles iguales.
	*/

	/**
	*
	*/

	mayor1=(primero==segundo)?primero:segundo;
	mayor2=(primero==tercero)?primero:tercero;
	
	if(mayor1==mayor2 && primero==tercero){
		System.out.println("Todos los valores son iguales");
	}else if(primero==segundo){
			System.out.println("El primero con el segundo son iguales:"+primero);
			System.out.println("El tercero es diferente");
			}else if(primero==tercero){
					System.out.println("El primero con el tercero son iguales:"+primero);
					System.out.println("El segundo es diferente");
					}else if(segundo==tercero){
							System.out.println("El tercero con el segundo son iguales:"+segundo);
							System.out.println("El primero es diferente");
							}
	dos.close();
	}
}