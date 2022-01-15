

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

	public String trabajar(){
		return super.trabajar()+"Trabajando en el diseño del proyecto";
	}

	public String toString(){
		return super.toString()+"\nPosicion en el proyecto:"+getPosicionEnElProyecto()+"\nInterfaz:"+getInterfaz()+"\nArquitectura:"+getArquitectura();
	}

}