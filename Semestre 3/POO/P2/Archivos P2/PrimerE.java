import java.util.Scanner;

/**
*Autor: Díaz Hernández Marcos Bryan
*Se crea una clase PrimerE, sin atributos de clase, unicamente se declaran variables de instancia, para que puedan 
*recibir los valores, se importa la clase Scanner para poder recibir los valores y realizar
*el ordenamiento de los valores que se inserten.
*/

public class PrimerE{

	public static void main(String[] args){

	/**
	*Se crea la variable dos, para que se puedan recibir los valores del usuario
	*/

	Scanner dos = new Scanner(System.in);
	
	/**
	*Se imprimen las intrucciones para el usuarion y se guardan los valores de la entrada en las variables de instancia
	*primero, segundo y tercero.
	*/

	int primero,segundo,tercero;
	System.out.println("Inserta el primer valor:");
	primero=dos.nextInt();
	System.out.println("Inserta el segundo valor:");
	segundo=dos.nextInt();
	System.out.println("Inserta el tercer valor");
	tercero=dos.nextInt();

	/**
	*Comienza el desarrollo de la estructura de selección if, esta se caracteriza por el uso de condiciones boleanas,
	*y en caso de que se se cumplan se ejecuta el codigo dentro de la estructura, en caso contrario se realiza el else
	*/

	if(primero>segundo && primero>tercero){
		System.out.println("El valor mayor es primero:"+primero);
		if(segundo>tercero){
			System.out.println("El segundo mayor es:"+segundo);
			System.out.println("El menor es:"+tercero);
		}
		else{
			System.out.println("El segundo mayor es:"+tercero);
			System.out.println("El segundo mayor es:"+segundo);
		}
	}else if(segundo>primero && segundo>tercero){
			System.out.println("El valor mayor es segundo:"+segundo);
			if(primero>tercero){
				System.out.println("El segundo mayor es:"+primero);
				System.out.println("El menor es:"+tercero);
			}
			else{
				System.out.println("El segundo mayor es:"+tercero);
				System.out.println("El menor es:"+primero);
			}
		}else if(tercero>primero && tercero>segundo){
				System.out.println("El valor mayor es tercero:"+tercero);
				if(segundo>primero){
					System.out.println("El segundo mayor es:"+segundo);
					System.out.println("El menor es:"+primero);
				}
				else{
					System.out.println("El segundo mayor es:"+primero);
					System.out.println("El menor es:"+segundo);
				}
			}

	/**
	*Las condiciones se realizaron de forma que primero se tenga que comprobar el elemento mayor de todos, despues se 
	*tenga que buscar el segundo mayor y por default se encuentre el menor de todos, en caso de que no haya mayores,
	*es decir que algunos valores sean iguales se tendra que comparar primero si son todos iguales, y si no, a partir de 
	*lo anterior se infiere que pueden haber dos iguales, por lo que se comprueban los posibles iguales.
	*/

	if(primero==segundo && primero==tercero){
		System.out.println("Todos los valores son iguales");
	}else if(primero==segundo){
			System.out.println("Primero es:"+primero+"igual al segundo:"+segundo);
			System.out.println("Tercero es diferente a los demas");
		}else if(primero==tercero){
				System.out.println("Primero es:"+primero+"igual al tercero:"+tercero);
				System.out.println("Segundo es diferente a los demas");
				} else if(segundo==tercero){
						System.out.println("Segundo es:"+segundo+"igual al tercero:"+tercero);
						System.out.println("Primero es diferente a los demas");
						}

	dos.close();
	}
}