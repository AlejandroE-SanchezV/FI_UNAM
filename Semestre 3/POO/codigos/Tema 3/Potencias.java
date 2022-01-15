class Cuad{
	
	void cuadrado(){
		System.out.println("Este metodo no devuelve nada");
	}

	void cuadrado(int x){
		System.out.println(x*x);
	}

	void cuadrado(float x){
		System.out.println(x*x);
	}

	//int cuadrado(int x){
	int cuadrado(int x, int y){
		return x*y;
	}

	//float cuadrado(float x){
	float cuadrado(float x, float y){
		return x*y;
	}
}

class Prueba{
	public static void main(String[] args) {
		Cuad c = new Cuad();
		c.cuadrado();
		c.cuadrado(5);
		c.cuadrado(6.3f);
		int y = c.cuadrado(7, 7);
		System.out.println("y = "+y);
		float z = c.cuadrado(3.2f, 3.2f);
		System.out.println("z = "+z);
	}
}
