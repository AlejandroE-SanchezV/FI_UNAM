class Alumno{
	String nombre;
	String apellidos;
	int numeroDeCuenta;
	String[] materias;
	final String carrera = "Ingenieria en Computación";

	public static void main(String[] args) {
		Alumno jesus = new Alumno();
		Alumno rosa = new Alumno();

		//System.out.println("Nombre: " + jesus.nombre);
		//System.out.println("Nombre: " + jesus.numeroDeCuenta);

		jesus.nombre = "Jesus";
		jesus.apellidos = "Morales Lopez";
		jesus.numeroDeCuenta = 1020;
		jesus.materias = new String []{
			"Programación Orientada a Objetos",
			"Circuitos Electricos",
			"Compiladores"
		};

		rosa.nombre = "Rosa";
		rosa.apellidos = "Morales Lopez";
		rosa.numeroDeCuenta = 1145;
		rosa.materias = new String[] {
			"Fundamentos de Programación",
			"Calculo I"
		};

		System.out.println("Nombre: " + jesus.nombre + " " + jesus.apellidos);
		System.out.println("No. Cuenta: " + jesus.numeroDeCuenta);
		System.out.println("Numero de materias inscritas: " + jesus.materias.length);
		System.out.println("Materia en posición 0 " + jesus.materias[0]);
		System.out.println("Carrera: " + jesus.carrera);

		System.out.println("\n");

		System.out.println("Nombre: " + rosa.nombre + " " + rosa.apellidos);
		System.out.println("No. Cuenta: " + rosa.numeroDeCuenta);
		System.out.println("Numero de materias inscritas: " + rosa.materias.length);
		System.out.println("Materia en posición 0 " + rosa.materias[0]);
		System.out.println("Carrera: " + rosa.carrera);

		System.out.println(Alumno.carrera);

		//rosa.carrera = "Electronica";
	}
}