

public class Tester extends Empleados{
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

	public String trabajar(){
		return super.trabajar()+"Trabajando en las pruebas del proyecto";
	}

	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nTiempo de ejecucion del programa:"+getTiempoDeEjecucion()+"\nErrores:"+getErrores();
	}

}