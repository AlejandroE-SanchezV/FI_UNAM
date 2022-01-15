

public class LiderDeProyecto extends Empleados{
	private String posicionEnElProyecto;
	private String nombreProyecto;
	private int miembrosProyecto;

	public LiderDeProyecto(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto,String nombreProyecto, int miembrosProyecto){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo);
		this.posicionEnElProyecto=posicionEnElProyecto;
		this.nombreProyecto=nombreProyecto;
		this.miembrosProyecto=miembrosProyecto;
	}

	public void setNombreProyecto(String nombreProyecto){
		this.nombreProyecto=nombreProyecto;
	}

	public void setPosicionEnElProyecto( String posicionEnElProyecto){
		this.posicionEnElProyecto=posicionEnElProyecto;
	}

	public void setMiembrosProyecto(int miembrosProyecto){
		if(miembrosProyecto>0)
			this.miembrosProyecto=miembrosProyecto;
	}

	public String getPosicionEnElProyecto(){
		return posicionEnElProyecto;
	}

	public String getNombreProyecto(){
		return nombreProyecto;
	}

	public int getMiembrosProyecto(){
		return miembrosProyecto;
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
		return "Trabajando en el liderazgo del proyecto";
	}

	public String toString(){
		return super.toString()+"\nNombre del proyecto:"+getNombreProyecto()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nCantidad de miembros del equipo:"+getMiembrosProyecto();
	}

}