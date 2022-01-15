package p2;

import p1.*;

class OtroPaquete {
	OtroPaquete() {
		Proteccion p = new Proteccion();
		System.out.println("constructor en otro paquete");
		// atributo de Proteccion con modificador por defecto
		// System.out.println("n = " + p.n);
		// atributo privado de Proteccion
		// System.out.println("n_pri = " + p.n_pri);
		// atributo protegido
		// System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}