class A{
	public int x;
	private int y;
	protected int z;

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setZ(int z){
		this.z = z;
	}

	public int getY(){
		return y;
	}

	public static void main(String[] args) {
		A objA = new A();
		/*objA.x = 3;
		objA.y = 6;
		objA.z = 9;*/
		objA.setX(3);
		objA.setY(6);
		objA.setZ(9);
		System.out.println("Los valores de los atributos del objeto objA son: x=" + objA.x + ", y=" + objA.y + ", z=" + objA.z);
	}
}

class B extends A{
	public static void main(String[] args) {
		B objB = new B();
		//objB.x = 3;
		//objB.y = 6;		
		//objB.z = 9;

		objB.setX(3);
		objB.setY(6);
		objB.setZ(9);
		//System.out.println("Los valores de los atributos del objeto objA son: x=" + objB.x + ", y=" + objB.y + ", z=" + objB.z);
		System.out.println("Los valores de los atributos del objeto objB son: x=" + objB.x + ", z=" + objB.z);
		System.out.println("Los valores de los atributos del objeto objA son: x=" + objB.x + ", y=" + objB.getY() + ", z=" + objB.z);
	}
}

class C{
	public static void main(String[] args) {
		A objA = new A();
		/*objA.x = 3;
		objA.y = 6;
		objA.z = 9;*/
		
		objA.setX(3);
		objA.setY(6);
		objA.setZ(9);
		
		//System.out.println("Los valores de los atributos del objeto objA son: x=" + objA.x + ", y=" + objA.y + ", z=" + objA.z);
		System.out.println("Los valores de los atributos del objeto objA son: x=" + objA.x + ", z=" + objA.z);
		System.out.println("Los valores de los atributos del objeto objA son: x=" + objA.x + ", y=" + objA.getY() + ", z=" + objA.z);

		B objB = new B();
		/*objB.x = 5;
		objB.y = 6;
		objB.z = 10;*/
		
		objB.setX(5);
		objB.setY(6);
		objB.setZ(10);
		//System.out.println("Los valores de los atributos del objeto objA son: x=" + objB.x + ", y=" + objB.y + ", z=" + objB.z);
		System.out.println("Los valores de los atributos del objeto objB son: x=" + objB.x + ", z=" + objB.z);
		System.out.println("Los valores de los atributos del objeto objA son: x=" + objB.x + ", y=" + objB.getY() + ", z=" + objB.z);
	}
}