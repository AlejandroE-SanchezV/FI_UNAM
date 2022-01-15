public class Punto{
	int x,y;

	public Punto(int x, int y){ //Constructor
		this.x=x;
		this.y=y;
	}

	public void imprimePunto(){
	System.out.println("x="+x+"y="+y);
	}
	public void imprimePunto(double x, double y){
	System.out.println("x="+x+"y="+y);
	System.out.println("x="+this.x+"y="+this.y);
	}
}

 class Prueba{
	public static void main(String[] args){
		Punto p=new Punto();
		p.x=2;
		p.x=7;
		p.imprimePunto();

		Punto a=new Punto();
		a.x=5;
		a.y=9;

		a.imprimePunto(10.9f,20.6f);

	}
}