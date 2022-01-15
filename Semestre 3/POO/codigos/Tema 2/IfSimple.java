class IfSimple{
	public static void main(String[] args) {
		int a = 3, b = 5;

		if(a < b){
			a -= b;
			System.out.println("Dentro de un bloque de código en una sentencia if, a = " + a);
		}

		//if que ejecuta una sola sentencia si se cumple

		if(a < 0) System.out.println("Unica sentencia de este if, a = " + a);
	}
}