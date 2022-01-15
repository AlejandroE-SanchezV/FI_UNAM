import java.io.IOException;
class Menu {
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
			choice = (int) System.in.read(); //Analizar esta parte

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