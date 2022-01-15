class IfAnidados{
	public static void main(String[] args) {
		int a = 10, b = 50, c = 29, d = 37;

		if(a < b){
			if(c > d) System.out.println("Primer if en el bloque");
			if(b == a) System.out.println("b y a son iguales!!!");
			else System.out.println("else correspondiente al if anterior");
		}

		//Escalera if - else - if

		if(a < 10){ a ++;}
		else if(a == 10) a += 2;
		else if(a < 50) a -= 10;
		else a = c;

		System.out.println("a = " + a);
	}
}