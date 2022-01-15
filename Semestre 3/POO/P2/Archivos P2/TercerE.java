import java.util.Scanner;

/**
*Autor: Díaz Hernández Marcos Bryan
*Se crea una clase TercerE, sin atributos de clase, unicamente se declaran variables de instancia, para que puedan 
*recibir los valores, se importa la clase Scanner para poder recibir las cadenas y despues comprobar las condiciones que
*se impusieron.
*/

public class TercerE{
	public static void main(String[] args){
	/**
	*Primero se colocan las condicionantes String, para comparar en el momento que sea necesario, lo siguiente es
	*crear el do-while, para esto igual se utilizan las instrucciones de salto, continue y break 
	*/

	String salida="stop";
	String continua="seguir";

	/**
	*En esta seccion de crea el objeto de Scanner para poder recibir las cadenas y se pide dentro del for la cadena 
	*que se comparara con las condiciones iniciales stop y seguir, en cuanto se guarda la cadena se compara con 
	*equals, y de ahí si cumple la cadena con ser igual a seguir, el for continua con la iteracion siguiente y de ser igual
	*a stop termina la ejecucion del programa, y en caso de no ser ninguna de las dos imprime la  cadena que se inserto
	*/

	do{
		Scanner cadena = new Scanner(System.in);
		for(int i=0;i<1000;i++){
			System.out.println("Inserta tu cadena");
			String entrada=cadena.next();

			if(entrada.equals(continua)){
				continue;
			}else{
				System.out.println("Insertaste:"+entrada);
				if(entrada.equals(salida)){
					break;
				}
			}
		}
		break;
	}
	while(True);
	}
}