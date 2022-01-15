package p1;

public class Proteccion{
	int n;
	private int n_pri;
	protected int n_pro;
	public int n_pub;

	public Proteccion(){
		System.out.println("Constructor base");
		n=1;
		n_pri=2;
		n_pro=3;
		n_pub=4;
	}
}