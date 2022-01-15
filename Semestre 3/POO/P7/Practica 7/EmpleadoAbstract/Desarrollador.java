

public class Desarrollador extends Empleados{
	private String posicionEnElProyecto;
	private String paradigma;
	private String complejidad;

	public Desarrollador(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo,String posicionEnElProyecto,String complejidad, String paradigma){
		super(nombre,areaDeTrabajo,sueldo,horasDeTrabajo);
		this.posicionEnElProyecto=posicionEnElProyecto;
		this.paradigma=paradigma;
		this.complejidad=complejidad;
	}

	public void setPosicionEnElProyecto( String posicionEnElProyecto){
		this.posicionEnElProyecto=posicionEnElProyecto;
	}

	public void setParadigma(String paradigma){
		this.paradigma=paradigma;
	}

	public void setComplejidad(String complejidad){
		this.complejidad=complejidad;
	}

	public String getPosicionEnElProyecto(){
		return posicionEnElProyecto;
	}

	public String getParadigma(){
		return paradigma;
	}

	public String getComplejidad(){
		return complejidad;
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
		return "Trabajando en el codigo del proyecto";
	}

	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nParadigma del programa:"+getParadigma()+"\nComplejidad del programa:"+getComplejidad();
	}

}