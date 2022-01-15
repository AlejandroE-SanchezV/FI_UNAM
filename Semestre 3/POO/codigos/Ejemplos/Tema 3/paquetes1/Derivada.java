package p1;

class Derivada extends Proteccion {
	Derivada() {
		System.out.println("constructor derivado");
		System.out.println("n = " + n);
		// atributo privado de la clase Protection
		//System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}