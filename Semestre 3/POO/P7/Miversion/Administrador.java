
import java.util.Scanner;

/**
*Se crea la clase administrados que tiene como atributos a cada tipo de empleado, donde solo hay un administrados, y un lider del proyecto
*y se pueden incluir los trabajadores que se quieran añadir del tipo: desarrollador, tester, y diseñador, ademas que esta clase tiene 
*que tener la posiblidad de cambiar el salario de cada tipo de trabajador, por ende dispusimos a inicializar todos los objetos de las subclases
*para posteriormente poder modificar  el salario  y ver los atributos de cada objeto.
*/

public class Administrador extends Empleados{
	private String posicionEnElProyecto;
	LiderDeProyecto lider;
	Desarrollador[] desarrolladores;
	Disenador[] disenadores;
	Tester[] testers;


	/**
	*En esta clase se crea el constructor, para poder asignar valores a cada uno de los objetos de las subclase de empleados.
	*/

	public Administrador(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo);
		this.posicionEnElProyecto=posicionEnElProyecto;
		asignarLider();
		asignarDesarrollador();
		asignarDisenadores();
		asignarTesters();
	}

	/**
	*El metodo se llama para poder asignar valores por medio del constructor de la subclase lider de proyecto 
	*/

	public void asignarLider(){
		Scanner entradaL=new Scanner(System.in);
		System.out.println("Inserta el nombre del lider de proyecto:");
		String nombreL=entradaL.next();
		System.out.println("Inserta el area de trabajo del lider:");
		String nombreT=entradaL.next();
		System.out.println("Inserta el nombre del proyecto:");
		String nombreP=entradaL.next();
		System.out.println("Inserta la cantidad de personas que conforman el equipo:");
		int miembros=entradaL.nextInt();
		lider = new LiderDeProyecto(nombreL,nombreT,0,0,"LiderDeProyecto",nombreP,miembros);
	}

	/**
	*Se define el metodo para poder asignar valores por medio del constructor de la subclase desarrollador donde se crean objetos
	*en base a la cantidad que el usuario defina.
	*/

	public void asignarDesarrollador(){
		Scanner entradaD=new Scanner(System.in);
		System.out.println("Inserta la cantidad de desarrolladores:");
		int cantidad=entradaD.nextInt();
		desarrolladores=new Desarrollador[cantidad];
		for(int i=0;i<cantidad;i++){
			System.out.println("Inserta el nombre del desarrollador:");
			String nombreL=entradaD.next();
			System.out.println("Inserta el area de trabajo del desarrollador:");
			String nombreT=entradaD.next();
			desarrolladores[i] = new Desarrollador(nombreL,nombreT,0,0,"Desarrollador","Logaritmica","POO");
		}
	}

	/**
	*Se define el metodo para poder asignar valores por medio del constructor de la subclase diseñador donde se crean objetos
	*en base a la cantidad que el usuario defina.
	*/

	public void asignarDisenadores(){
		Scanner entradaDI=new Scanner(System.in);
		System.out.println("Inserta la cantidad de disenadores:");
		int cantidad=entradaDI.nextInt();
		disenadores=new Disenador[cantidad];
		for(int i=0;i<cantidad;i++){
			System.out.println("Inserta el nombre del disenador:");
			String nombreL=entradaDI.next();
			System.out.println("Inserta el area de trabajo del disenador:");
			String nombreT=entradaDI.next();
			disenadores[i] = new Disenador(nombreL,nombreT,0,0,"Disenador","Modular","GUI");
		}
	}

	/**
	*Se define el metodo para poder asignar valores por medio del constructor de la subclase testers donde se crean objetos
	*en base a la cantidad que el usuario defina.
	*/

	public void asignarTesters(){
		Scanner entradaT=new Scanner(System.in);
		System.out.println("Inserta la cantidad de testers:");
		int cantidad=entradaT.nextInt();
		testers=new Tester[cantidad];
		for(int i=0;i<cantidad;i++){
			System.out.println("Inserta el nombre del tester:");
			String nombreL=entradaT.next();
			System.out.println("Inserta el area de trabajo del tester:");
			String nombreT=entradaT.next();
			testers[i] = new Tester(nombreL,nombreT,0,0,"Desarrollador",0,0);
		}
	}

	/**
	*Se define el metodo para poder cambiar el salario al lider de proyecto.
	*/

	public void pagarLider(){
		Scanner tiempo=new Scanner(System.in);
		System.out.println("Inserta la cantidad de horas de trabajo");
		int horas=tiempo.nextInt();
		lider.setHorasDeTrabajo(horas);
		Nomina nomina = new Nomina();
		nomina.pagar(lider);
	}

	/**
	*Se define el metodo para poder cambiar el salario al desarrollador, en este caso para cada uno de los trabajadores que se definan.
	*/

	public void pagarDesarrollador(){
		Scanner tiempo=new Scanner(System.in);
		for(int i=0;i<desarrolladores.length;i++){
			System.out.println("Inserta la cantidad de horas de trabajo");
			int horas=tiempo.nextInt();
			desarrolladores[i].setHorasDeTrabajo(horas);
			Nomina nomina = new Nomina();
			nomina.pagar(desarrolladores[i]);
		}
	}

	/**
	*Se define el metodo para poder cambiar el salario al diseñador, en este caso para cada uno de los trabajadores que se definan.
	*/

	public void pagarDisenador(){
		Scanner tiempo=new Scanner(System.in);
		for(int i=0;i<disenadores.length;i++){
			System.out.println("Inserta la cantidad de horas de trabajo");
			int horas=tiempo.nextInt();
			disenadores[i].setHorasDeTrabajo(horas);
			Nomina nomina = new Nomina();
			nomina.pagar(disenadores[i]);
		}
	}

	/**
	*Se define el metodo para poder cambiar el salario al tester, en este caso para cada uno de los trabajadores que se definan.
	*/

	public void pagarTester(){
		Scanner tiempo=new Scanner(System.in);
		for(int i=0;i<testers.length;i++){
			System.out.println("Inserta la cantidad de horas de trabajo");
			int horas=tiempo.nextInt();
			testers[i].setHorasDeTrabajo(horas);
			Nomina nomina = new Nomina();
			nomina.pagar(testers[i]);
		}
	}

	/**
	*Se define el metodo para imprimir las caracteristicas del lider del proyecto
	*/

	public void lider(){
		System.out.println(lider.toString());
	}

	/**
	*Se define el metodo para imprimir las caracteristicas de cada desarrollador, que el usuario defina
	*/

	public void desarrollador(){
		int i=1;
        for (Desarrollador desarrollador: desarrolladores){
            System.out.println("\n"+i+")"+desarrollador.toString());
            i+=1;
        }
	}

	/**
	*Se define el metodo para imprimir las caracteristicas de cada diseñador, que el usuario defina
	*/

	public void disenador(){
		int i=1;
        for (Disenador disenador: disenadores){
            System.out.println("\n"+i+")"+disenador.toString());
            i+=1;
        }
	}

	/**
	*Se define el metodo para imprimir las caracteristicas de cada tester, que el usuario defina
	*/

	public void tester(){
		int i=1;
        for (Tester tester: testers){
            System.out.println("\n"+i+")"+tester.toString());
            i+=1;
        }
	}

	/**
	*Metodo setter en el cual, se asigna el atributo del administrador.
	*/

	public void setPosicionEnElProyecto(String posicionEnElProyecto){
		this.posicionEnElProyecto=posicionEnElProyecto;
	}

	/**
	*Metodo getter en el cual, se obtiene el atributo del administrador.
	*/

	public String getPosicionEnElProyecto(){
		return posicionEnElProyecto;
	}

	/**
	*Metodo trabajar que se solicita en la practica que se define la superclase y se hace una sobreescitura;
	*/

	public String trabajar(){
		return super.trabajar()+"Trabajando en la administracion del proyecto";
	}

	/**
	*Metodo toString que se solicita en la practica que se define la superclase y se hace una sobreescitura;
	*/
	
	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto();
	}

}