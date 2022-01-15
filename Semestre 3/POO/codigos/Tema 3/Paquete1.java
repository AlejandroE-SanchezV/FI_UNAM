
package unam.fi.computacion;

class A{
	void hola(){
		System.out.println("Hola");
	}
}

class B{
	void hola(){
		System.out.println("Hola");
	}
}

class C{
	void hola(){
		System.out.println("Hola");
	}
}

class Prueba{
	public static void main(String[] args) {
		A objA = new A();
		objA.hola();

		B objB = new B();
		objB.hola();

		C objC = new C();
		objC.hola();
	}
}