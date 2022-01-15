public class TryCatchFinally{
	public static void main(String[] args) {
		try{
			float equis = 5/0;
			/**
			*Se divide un número entre cero, lo cual generará una indeterminación
			*/
			System.out.println("Equis: " + equis);
			/**
			*Se imprime el valor del número equis
			*/
		}
		catch(ArithmeticException ae){ //Error en tiempo de compilación
			System.out.println("Division entre cero");
			/**
			*Se captura una excepción específica de la clase ArithmeticException, y 
			*se imprime a pantalla el error que se generó
			*/
		}catch(Exception e){
			System.out.println("Excepcion general");
			/**
			*Se captura una excepción más general, la cual es de la clase Exception, y se imprime a 
			*pantalla el tipo de excepción, y de acuerdo a la jerarquía de excepciones este programa
			*tiene un buen manejo de excepciones
			*/
		}
		finally{
			System.out.println("Este bloque siempre se ejecuta aun si no ocurre un error");
			/**
			*El bloque finally siempre se ejecutará, independientemente si se generán o no
			*excepciones, entonces este mensaje siempre se imprimirá a pantalla
			*/
		}
	}
}