class Objeto{
	String nombre;
	int dato;
}

class Pruebas{
	public static void main(String[] args) {
		Objeto miObj = new Objeto();
		Objeto miObj2 = new Objeto();

		System.out.println("Datos de miObj");
		System.out.println("Impresión de objeto: " + miObj);
		System.out.println("Codigo Hash: " + miObj.hashCode());
		System.out.println("Objeto como cadena: " + miObj.toString());

		System.out.println();

		System.out.println("Datos de miObj2");
		System.out.println("Impresión de objeto: " + miObj2);
		System.out.println("Codigo Hash: " + miObj2.hashCode());
		System.out.println("Objeto como cadena: " + miObj2.toString());

		//Haciendo referencia a la misma dirección de memoria
		miObj2 = miObj;

		System.out.println();

		System.out.println("Datos de miObj2");
		System.out.println("Impresión de objeto: " + miObj2);
		System.out.println("Codigo Hash: " + miObj2.hashCode());
		System.out.println("Objeto como cadena: " + miObj2.toString());

		System.out.println();

		if(miObj.equals(miObj2)) System.out.println("Los objetos miObj y miObj2 son iguales");
		else System.out.println("Los objetos miObj y miObj2 no son iguales");

		String cadena = "Hola";

		System.out.println("Objeto como cadena: " + cadena.hashCode());
	}
}