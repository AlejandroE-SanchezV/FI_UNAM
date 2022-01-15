package p1;

class MismoPaquete {
	MismoPaquete() {
		Proteccion p = new Proteccion();
		System.out.println("Constructor de clase dentro del mismo paquete");
		System.out.println("n = " + p.n);
		// atributo privado de la clase Protection
		//System.out.println("n_pri = " + p.n_pri);
		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}