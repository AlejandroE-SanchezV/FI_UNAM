class EjemploSwitch{
	public static void main(String[] args) {
		int mes = 10;

		switch(mes){
			case 1:
				System.out.println("Enero");
				break; //la palabra break detiene la ejecución del bloque de código,
					   //saltando la ejecución hasta el fin del bloque switch
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septirmbre");
				break;
			case 10:
				System.out.println("Octubre");
				//Si se omite la palabra break, los bloques subsecuentes se ejecutarán.
				//break;
			case 11:
				System.out.println("Noviembre");
				//break;
			case 12:
				System.out.println("Diciembre");
				//break;
			default:
				System.out.println("No existe el mes: " + mes);
				//break;
		}

		System.out.println("Despues de la estructura switch");
	}
}