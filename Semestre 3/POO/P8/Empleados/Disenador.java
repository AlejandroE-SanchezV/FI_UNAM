

public class Disenador extends Empleados{
	private String posicionEnElProyecto;
	private String arquitectura;
	private String interfaz;

	public Disenador(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto,String arquitectura,String interfaz){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo);
		this.posicionEnElProyecto=posicionEnElProyecto;
		this.arquitectura=arquitectura;
		this.interfaz=interfaz;
	}

	public void setPosicionEnElProyecto(String posicionEnElProyecto){
		this.posicionEnElProyecto=posicionEnElProyecto;
	}

	public void setArquitectura(String arquitectura){
		this.arquitectura=arquitectura;
	}

	public void setInterfaz(String interfaz){
		this.interfaz=interfaz;
	}


	public String getPosicionEnElProyecto(){
		return posicionEnElProyecto;
	}

	public String getArquitectura(){
		return arquitectura;
	}

	public String getInterfaz(){
		return interfaz;
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

	public String trabajar(){
		return "Trabajando en el diseño del proyecto";
	}

	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nInterfaz:"+getInterfaz()+"\nArquitectura:"+getArquitectura();
	}

}