public class PropagaExcepcion{
	public static int miMetodo(int a, int b) throws ArithmeticException{
		/**
		*Se utiliza la palabra reservada throws, para indicar que este método puede lanzar
		*una excepción, que en este caso será de la clase ArithmeticException
		*/
		if(b==0) throw new ArithmeticException();
		/**
		*En una estructura de control de flujo if se verifica si la variable b es igual a 0
		*en caso afirmativo, se lanza la excepción que se manejo en la propia definición
		*del método que será la ArithmeticException
		*/

		int c = a/b;
		/**
		*En este método, la variable b que se pasa como parámetro no puede ser 0, debido a que
		*ocurriría una indeterminación
		*/
		return c;
	}

	public static void main(String[] args) {
		//try{
			int resultado = miMetodo(10, 0);
			/**
			*La variable resultado se iguala al valor de retorno del método miMetodo, y se pasan
			*como parámetros al número 10 y 0 pero como el segundo parámetro es 0, entonces en el método 
			*miMetodo se lanzará la excepción. Pero recordando aspectos de la clase, las excepciones 
			*deben de manejarse casi siempre en el main, ya que si se hacen en otros métodos 
			*pueden haber errores de retorno de valores
			*/
			System.out.println("Resultado: " + resultado);
			/**
			*Este resultado no se imprimirá a pantalla, ya que la excepción se lanza en el método
			*miMetodo
			*/
		/*}catch(ArithmeticException ae){
			System.out.println("division entre cero");
			ae.printStackTrace();
		}*/
	}
}