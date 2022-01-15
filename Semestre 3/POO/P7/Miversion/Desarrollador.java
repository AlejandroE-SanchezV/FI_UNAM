

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

	public String trabajar(){
		return super.trabajar()+"Trabajando en el codigo del proyecto";
	}

	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nParadigma del programa:"+getParadigma()+"\nComplejidad del programa:"+getComplejidad();
	}

}