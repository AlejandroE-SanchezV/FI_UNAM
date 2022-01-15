public class TryCatchFinally{
	public static void main(String[] args) {
		try{
			float equis = 5/0;
			System.out.println("Equis: " + equis);
		}catch(Exception e){ //Error en tiempo de compilación
			System.out.println("Division entre cero");
		}
		//catch(ArithmeticException ae){
		//	System.out.println("Excepcion general");
		//}
		finally{
			System.out.println("Este bloque siempre se ejecuta aun si no ocurre un error");
		}
	}
}