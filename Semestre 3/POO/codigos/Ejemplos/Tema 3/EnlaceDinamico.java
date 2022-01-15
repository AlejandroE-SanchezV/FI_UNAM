class A {
    void hola(){
      System.out.println("Hola desde A, superclase");
    }
}

class B extends A{

    void hola(){
        System.out.println("Hola desde B, subclase de A");
    }
}

class C extends B{

    void hola(){
        System.out.println("Hola desde C, subclase de B");
    }
}

class EnlaceDinamico {

  public static void main(String[] args) {
     A referencia;
     
     A objA = new A();
     referencia = objA;
     referencia.hola();

     B objB = new B();
     referencia = objB;
     referencia.hola();
     
     C objC = new C();
     referencia = objC;
     referencia.hola();
     
     if(referencia instanceof C)
         System.out.println("La referencia contiene una instancia de la clase C");
     else if(referencia instanceof B)
         System.out.println("La referencia contiene una instancia de la clase B");
     else if(referencia instanceof A)
         System.out.println("La referencia contiene una instancia de la clase A");
  }
}
