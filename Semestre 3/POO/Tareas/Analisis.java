import java.io.IOException; //La importacion de IOException es un instancia de Java, que pueden detener u obtener cierta informacion concreta 
										
public class Analisis {
	public static void main(String args[]) throws IOException{
		int choice;
		do {
			System.out.println("Mostrar la forma general de:");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. while");
			System.out.println(" 4. do-while");
			System.out.println(" 5. for\n");
			System.out.println("Elije uno:");
			choice =(int) System.in.read(); 

			/*El metodo toma la entrada de un caracter, representado por byte, es decir
			en un rango de 0 a 255, en este caso es un metodo abstracto de la clase InpuStream, que al utilizarse
			con la clase System.in resulta ser una implementacion del read().*/

			/*El funcionamiento corresponde a que detecta la entrada como caracteres, esto significa que no toma el valor 
			real de la entrada sino que lo traduce al valor del estandar de lenguaje de Unicode, pero al ser unicamente 
			la lectura del 0 al 255, no toma caracteres los cuales su representacion sea mayor a esta */

			/*Al mismo tiempo esto representa la forma en que las entradas se representan en la computadora, por lo que
			es necesario llevar a cabo un casteo, con la intencion de que el metodo pueda entender tipo de dato que se 
			va a introducir, y de esta forma lo traduzca de la representacion de byte a la correspondiente, y en este
			caso significa que se tiene que es neceario tener la clase char para que se detecte como un caracter.*/

			System.out.println("\n"+choice);
		
			switch(choice) {
				case 1:
				System.out.println("If:\n");
				System.out.println("if(condicion) sentencia;");
				System.out.println("else sentencia;");
				break;

				case 2:
				System.out.println("Switch:\n");
				System.out.println("switch(expresion) {");
				System.out.println(" case constante:");
				System.out.println(" //código");
				System.out.println(" break;");
				System.out.println(" // ...");
				System.out.println("}");
				break;

				case 3:
				System.out.println("While:\n");
				System.out.println("while(condicion) sentencia;");
				break;

				case 4:
				System.out.println("Do-While:\n");
				System.out.println("do {");
				System.out.println(" sentencia;");
				System.out.println("} while (condicion);");
				break;

				case 5:
				System.out.println("For:\n");
				System.out.print("for(inicialización; condicion; iteracion)");
				System.out.println(" sentencia;");
				break;
			}
			System.out.println("\n\n");
		} while( choice >= 1 && choice <= 5);
			
		
	}
}