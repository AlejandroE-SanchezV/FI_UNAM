class Ambito {
	public static void main(String args[]) {
		int x; // conocido por todo el código dentro de main
		//int y;
		if(x == 10) { // nuevo ámbito
			int y = 20; // y solo es visible dentro del nuevo ámbito
			System.out.println("x, y: " + x + ", " + y);
			x = y * 2; //Tanto x como y son conocidas en este ámbito
		}
		
		//y = 100; // Error! y no es visible fuera de su ámbito
		// x sigue visible
		System.out.println("x es " + x + "y es ");
	}
}