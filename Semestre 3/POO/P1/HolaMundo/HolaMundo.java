/**
* @author: Marcos Bryan Díaz Hernández 
* En caso de ser publica la clase, se necesita que el nombre del
* archivo sea el mismo al de la clase
*/
public class HolaMundo{

}
	//Se busca en la MV, que el metodo sea main y el argumento sea una cadena.
	class Hola{
	public static void main(String[] b){
		System.out.println("Hola Mundo");
		int holaAtodos = 1;
		int holaATodos = 2;
		int c = holaATodos + holaAtodos;
		System.out.println("C: " + c);
	}
}

 /*Modificador de acceso friendly/sin modificador de acceso / modificarador de acceso por defecto*/
 /* Nombre de las clases con  mayuscula la primera palabra / La clase principal debe ser publica */

/**
*Estas clases fueron creadas con el proposito de la demostacion del modificado de acceso no las afecta
 por lo mismo, que tengan otro nombre distinto al del programa no causa errores.
*/
class A{
	public static void main(String[] a){
		System.out.println("Hola Mundo de la clase A");
	}
}


class B{
	public static void main(String[] s){
		System.out.println("Hola Mundo de la clase B");
	}
}