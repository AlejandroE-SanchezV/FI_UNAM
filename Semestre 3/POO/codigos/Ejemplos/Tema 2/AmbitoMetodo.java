/**
*Comentario de documentación para la clase
*@author Lizeth Parrales
*No. Cuenta: 12345
*/
class Ambito {
	/**
	* Comentario de documentación para el método main
	* Creacion de dos variables y prueba de ambito de método
	*/
	public static void main(String args[]) {
		int x = 10; // conocido por todo el código dentro de main
		int y;
		if(x == 10) { // nuevo ámbito
			y = 20; // y solo es visible dentro del nuevo ámbito
			System.out.println("x, y: " + x + ", " + y);
			x = y * 2; //Tanto x como y son conocidas en este ámbito
		}
		
		y = 100; // Error! y no es visible fuera de su ámbito
		// x sigue visible
		System.out.println("x es " + x + " y es "+ y);
	}
}