class IfElseSimple{
	public static void main(String[] args) {
		int a = 2, b = 8, c;

		if(a > b){
			c = a - b;
			System.out.println("En If: El valor de c es: " + c);
		}else{
			c = b - a;
			System.out.println("En Else: El valor de c es: " + c);
		}

		//Estructura if - else que ejecuta una sola sentencia, tanto en if como  en else

		if(a > b) 
			System.out.println("a " + a + " > " + b);
		else 
			System.out.println("a " + a + " <= " + b);

		//else System.out.println("Esto es un error!!!");
	}
}