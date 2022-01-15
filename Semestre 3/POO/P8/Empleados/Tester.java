

public abstract class Tester extends Empleados{
	private String posicionEnElProyecto;
	private int tiempoDeEjecucion;
	private int errores;

	public Tester(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto,int tiempoDeEjecucion,int errores){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo);
		this.posicionEnElProyecto=posicionEnElProyecto;
		this.tiempoDeEjecucion=tiempoDeEjecucion;
		this.errores=errores;
	}

	public void setPosicionEnElProyecto(String posicionEnElProyecto){
		this.posicionEnElProyecto=posicionEnElProyecto;
	}

	public void setTiempoDeEjecucion(int tiempoDeEjecucion){
		if(tiempoDeEjecucion>0)
			this.tiempoDeEjecucion=tiempoDeEjecucion;
	}

	public void setErrores(int errores){
		if(errores>=0)
			this.errores=errores;
	}


	public String getPosicionEnElProyecto(){
		return posicionEnElProyecto;
	}

	public int getTiempoDeEjecucion(){
		return tiempoDeEjecucion;
	}

	public int getErrores(){
		return errores;
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

	public abstract String trabajar();

	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nTiempo de ejecucion del programa:"+getTiempoDeEjecucion()+"\nErrores:"+getErrores();
	}

}
class TesterDesarrollador extends Tester{
	public TesterDesarrollador(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto,int tiempoDeEjecucion,int errores){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo,posicionEnElProyecto,tiempoDeEjecucion,errores);
	}
	public String trabajar(){
		return "Checando el codigo intentando encontrar los errores";
	}

}
class TesterUsuario extends Tester{
	public TesterUsuario(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto,int tiempoDeEjecucion,int errores){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo,posicionEnElProyecto,tiempoDeEjecucion,errores);
	}
	public String trabajar(){
		return "Probando el codigo para poder encontrar errores al momento de utilizar el programa";
	}

}