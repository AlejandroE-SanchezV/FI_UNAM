package p2;
class Proteccion2 extends p1.Proteccion {
	Proteccion2() {
		System.out.println("constructor de subclase en otro paquete");
		// atributo de la clase Proteccion con modificador por defecto
		//System.out.println("n = " + n);
		// atributo privado de la clase Proteccion
		//System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}