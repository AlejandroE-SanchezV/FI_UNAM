
import java.util.Scanner;

/**
*Se crea la clase administrados que tiene como atributos a cada tipo de empleado, donde solo hay un administrados, y un lider del proyecto
*y se pueden incluir los trabajadores que se quieran añadir del tipo: desarrollador, tester, y diseñador, ademas que esta clase tiene 
*que tener la posiblidad de cambiar el salario de cada tipo de trabajador, por ende dispusimos a inicializar todos los objetos de las subclases
*para posteriormente poder modificar  el salario  y ver los atributos de cada objeto.
*/

public class Administrador extends Empleados{
	private String posicionEnElProyecto;
	Nomina nomina= new Nomina();
	LiderDeProyecto lider;
	Desarrollador[] desarrolladores;
	Disenador[] disenadores;
	TesterDesarrollador[] testersD;
	TesterUsuario[] testersU;


	/**
	*En esta clase se crea el constructor, para poder asignar valores a cada uno de los objetos de las subclase de empleados.
	*/

	public Administrador(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo);
		this.posicionEnElProyecto=posicionEnElProyecto;
		asignarLider();
		asignarDesarrollador();
		asignarDisenadores();
		asignarTesterDesarrollador();
		asignarTesterUsuario();
	}

	/**
	*El metodo se llama para poder asignar valores por medio del constructor de la subclase lider de proyecto 
	*/

	public void asignarLider(){
		Scanner entradaL=new Scanner(System.in);
		System.out.println("--Lider--");
		System.out.println("Inserta el nombre del lider de proyecto:");
		String nombreL=entradaL.next();
		System.out.println("Inserta el area de trabajo del lider:");
		entradaL.nextLine();
		String nombreT=entradaL.next();
		System.out.println("Inserta el nombre del proyecto:");
		entradaL.nextLine();
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
		System.out.println("--Desarrollador--");
		System.out.println("Inserta la cantidad de desarrolladores:");
		int cantidad=entradaD.nextInt();
		desarrolladores=new Desarrollador[cantidad];
		for(int i=0;i<cantidad;i++){
			System.out.println("Inserta el nombre del desarrollador:");	
			String nombreL=entradaD.next();
			System.out.println("Inserta el area de trabajo del desarrollador:");
			entradaD.nextLine();
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
		System.out.println("--Disenador--");
		System.out.println("Inserta la cantidad de disenadores:");
		int cantidad=entradaDI.nextInt();
		disenadores=new Disenador[cantidad];
		for(int i=0;i<cantidad;i++){
			System.out.println("Inserta el nombre del disenador:");
			String nombreL=entradaDI.next();
			System.out.println("Inserta el area de trabajo del disenador:");
			entradaDI.nextLine();
			String nombreT=entradaDI.next();
			disenadores[i] = new Disenador(nombreL,nombreT,0,0,"Disenador","Modular","GUI");
		}
	}

	/**
	*Se define el metodo para poder asignar valores por medio del constructor de la subclase testers donde se crean objetos
	*en base a la cantidad que el usuario defina.
	*/

	public void asignarTesterUsuario(){
		Scanner entradaT=new Scanner(System.in);
		System.out.println("--Tester--");
		System.out.println("Inserta la cantidad de testers de usuario:");
		int cantidad=entradaT.nextInt();
		testersU=new TesterUsuario[cantidad];
		for(int i=0;i<cantidad;i++){
			System.out.println("Inserta el nombre del tester:");
			entradaT.nextLine();
			String nombreL=entradaT.next();
			System.out.println("Inserta el area de trabajo del tester:");
			entradaT.nextLine();
			String nombreT=entradaT.next();
			testersU[i] = new TesterUsuario(nombreL,nombreT,0,0,"Tester",0,0);
		}
	}
	public void asignarTesterDesarrollador(){
		Scanner entradaT=new Scanner(System.in);
		System.out.println("--Tester--");
		System.out.println("Inserta la cantidad de testers:");
		int cantidad=entradaT.nextInt();
		testersD=new TesterDesarrollador[cantidad];
		for(int i=0;i<cantidad;i++){
			System.out.println("Inserta el nombre del tester:");
			entradaT.nextLine();
			String nombreL=entradaT.next();
			System.out.println("Inserta el area de trabajo del tester:");
			entradaT.nextLine();
			String nombreT=entradaT.next();
			testersD[i] = new TesterDesarrollador(nombreL,nombreT,0,0,"Tester",0,0);
		}
	}

	/**
	*Se define el metodo para poder cambiar el salario al administrador de proyecto.
	*/

	public void pagarAdministrador(Administrador administrador){
		Scanner tiempo=new Scanner(System.in);
		System.out.println("Inserta la cantidad de horas de trabajo de:"+administrador.getNombre());
		int horas=tiempo.nextInt();
		administrador.setHorasDeTrabajo(horas);
		nomina.pagar(administrador);
	}

	/**
	*Se define el metodo para poder cambiar el salario al lider de proyecto.
	*/

	public void pagarLider(){
		Scanner tiempo=new Scanner(System.in);
		System.out.println("Inserta la cantidad de horas de trabajo de:"+lider.getNombre());
		int horas=tiempo.nextInt();
		lider.setHorasDeTrabajo(horas);
		nomina.pagar(lider);
	}

	/**
	*Se define el metodo para poder cambiar el salario al desarrollador, en este caso para cada uno de los trabajadores que se definan.
	*/

	public void pagarDesarrollador(){
		Scanner tiempo=new Scanner(System.in);
		for(int i=0;i<desarrolladores.length;i++){
			System.out.println("Inserta la cantidad de horas de trabajo de: " +desarrolladores[i].getNombre());
			int horas=tiempo.nextInt();
			desarrolladores[i].setHorasDeTrabajo(horas);
			nomina.pagar(desarrolladores[i]);
		}
	}

	/**
	*Se define el metodo para poder cambiar el salario al diseñador, en este caso para cada uno de los trabajadores que se definan.
	*/

	public void pagarDisenador(){
		Scanner tiempo=new Scanner(System.in);
		for(int i=0;i<disenadores.length;i++){
			System.out.println("Inserta la cantidad de horas de trabajo de: " +disenadores[i].getNombre());
			int horas=tiempo.nextInt();
			disenadores[i].setHorasDeTrabajo(horas);
			nomina.pagar(disenadores[i]);
		}
	}

	/**
	*Se define el metodo para poder cambiar el salario al tester, en este caso para cada uno de los trabajadores que se definan.
	*/

	public void pagarTesterU(){
		Scanner tiempo=new Scanner(System.in);
		for(int i=0;i<testersU.length;i++){
			System.out.println("Inserta la cantidad de horas de trabajo de: "+testersU[i].getNombre());
			int horas=tiempo.nextInt();
			testersU[i].setHorasDeTrabajo(horas);
			nomina.pagar(testersU[i]);
		}
	}
	public void pagarTesterD(){
		Scanner tiempo=new Scanner(System.in);
		for(int i=0;i<testersD.length;i++){
			System.out.println("Inserta la cantidad de horas de trabajo de: "+testersD[i].getNombre());
			int horas=tiempo.nextInt();
			testersD[i].setHorasDeTrabajo(horas);
			nomina.pagar(testersD[i]);
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

	public void testerU(){
		int i=1;
        for (TesterUsuario tester: testersU){
            System.out.println("\n"+i+")"+tester.toString());
            i+=1;
        }
	}
	public void testerD(){
		int i=1;
        for (TesterDesarrollador tester: testersD){
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
	*Metodos de la clase abstracta donde se definen los metodos abstractos que son los getters y setters de los atributos
	*/

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setAreaDeTrabajo(String areaDeTrabajo){
		this.areaDeTrabajo=areaDeTrabajo;
	}

	public void setSueldo(int sueldo){
		this.sueldo=sueldo;
	}

	public void setHorasDeTrabajo(int horasDeTrabajo){
		this.horasDeTrabajo=horasDeTrabajo;
	}

	public String getNombre(){
		return nombre;
	}

	public String getAreaDeTrabajo(){
		return areaDeTrabajo;
	}

	public int getSueldo(){
		return sueldo;
	}

	public int getHorasDeTrabajo(){
		return horasDeTrabajo;
	}

	/**
	*Metodo trabajar que se solicita en la practica que se define la superclase y se hace una sobreescitura;
	*/

	public String trabajar(){
		return "Trabajando en la administracion del proyecto";
	}

	/**
	*Metodo toString que se solicita en la practica que se define la superclase y se hace una sobreescitura;
	*/
	
	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto();
	}

}