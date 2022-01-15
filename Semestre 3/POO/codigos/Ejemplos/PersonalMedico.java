public class PersonalMedico{
	private int numeroEmpleado;
	private String nombre;
	private String areaDeTrabajo;

	public PersonalMedico(int numeroEmpleado, String nombre, String areaDeTrabajo){
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.areaDeTrabajo = areaDeTrabajo;
	}

	public void setNumeroEmpleado(int numeroEmpleado){
		this.numeroEmpleado = numeroEmpleado;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setAreaDeTrabajo(String areaDeTrabajo){
		this.areaDeTrabajo = areaDeTrabajo;
	}

	public int getNumeroEmpleado(){
		return numeroEmpleado;
	}

	public String getNombre(){
		return nombre;
	}

	public String getAreaDeTrabajo(){
		return areaDeTrabajo;
	}

	public String trabajar(){
		return "Trabajando en un hospital";
	}
}