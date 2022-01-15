

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

	public String trabajar(){
		return super.trabajar()+"Trabajando en el liderazgo del proyecto";
	}

	public String toString(){
		return super.toString()+"\nNombre del proyecto:"+getNombreProyecto()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nCantidad de miembros del equipo:"+getMiembrosProyecto();
	}

}