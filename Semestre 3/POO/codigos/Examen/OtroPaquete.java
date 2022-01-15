package p2;

class OtroPaquete{
	OtroPaquete(){
		p1.Proteccion p = new p1.Proteccion();
		System.out.println("Constructor en otro paquete");
		System.out.println("n ="+p.n);
		System.out.println("n_pri ="+p.n_pri);
		System.out.println("n_pro ="+p.n_pro);
		System.out.println("n_pub ="+p.n_pub);
	}
}