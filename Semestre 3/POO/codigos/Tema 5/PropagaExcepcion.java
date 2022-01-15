public class PropagaExcepcion{
	public static int miMetodo(int a, int b) throws ArithmeticException{
		if(b==0) throw new ArithmeticException();

		int c = a/b;
		return c;
	}

	public static void main(String[] args) {
		//try{
			int resultado = miMetodo(10, 0);
			System.out.println("Resultado: " + resultado);
		/*}catch(ArithmeticException ae){
			System.out.println("division entre cero");
			ae.printStackTrace();
		}*/
	}
}