public class Alumno{
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private double promedio;
	private int semestre;

	public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno){
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		promedio = 0;
		semestre = 0;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setApellidoP(String apellidoPaterno){
		this.apellidoPaterno=apellidoPaterno;
	}

	public  void setPromedio(double promedio){
		this.promedio=promedio;
	}

	public void setSemestre(int semestre){
		this.semestre=semestre;
	}

	public String getNombre(){
		return nombre;
	}

	public double getPromedio(){
		return promedio;
	}

	public int getSemestre(){
		return semestre;
	}

	public String getApellidoP(){
		return apellidoPaterno;
	}
}

class PruebaAlumno{
	public static void main(String[] args){
		Alumno juanP = new Alumno();
		juanP.setNombre("Juan");
		juanP.setApellidoP("Perez");
		juanP.setPromedio(8.78);
		juanP.setSemestre(3);

		System.out.println("Nombre:"+ juanP.getNombre());
		System.out.println("Apellido Paterno:" + juanP.getApellidoP());
		System.out.println("Promedio:" + juanP.getPromedio());
		System.out.println("Semestre:" + juanP.getSemestre());
	}
}