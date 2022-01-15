public class Medico extends PersonalMedico{
	private String especialidad;

	public Medico(int numeroEmpleado, String nombre, String areaDeTrabajo, String especialidad){
		super(numeroEmpleado, nombre, areaDeTrabajo);
		this.especialidad = especialidad;
	}

	public int getNumeroEmpleado(){
		int num = super.getNumeroEmpleado() + 2;
		return num;
	}

	public void setEspecialidad(String especialidad){
		this.especialidad = especialidad;
	}

	public String getEspecialidad(){
		return especialidad;
	}

	public String trabajar(){

		return super.trabajar() + ". Atendiendo a los pacientes de " + getAreaDeTrabajo();
	}	

	public String toString(){
		return "Nombre: " + this.getNombre() + "\nNumero de empleado: " + this.getNumeroEmpleado() +
		"\nArea de trabajo: " + this.getAreaDeTrabajo() + "\nEspecialidad: " + this.getEspecialidad(); 
	}
}

class PruebaMedico{
	public static void main(String[] args) {
		Medico m = new Medico(1234, "Juan Perez", "Pediatria", "Pediatria");

		/*m.setNombre("Juan Perez");
		m.setNumeroEmpleado(1234);
		m.setAreaDeTrabajo("Pediatria");
		m.setEspecialidad("Pediatria");
		//m.especialidad = "Gastroenterologia";*/
		System.out.println(m.trabajar());

		System.out.println("Nombre del medico: " + m.getNombre());
		System.out.println("Numero de empleado: " + m.getNumeroEmpleado());
		System.out.println("Area de trabajo: " + m.getAreaDeTrabajo());
		System.out.println("Especialidad: " + m.getEspecialidad());

		System.out.println("\n");

		if(m instanceof Medico) System.out.println(m.getNombre() + " es un medico");
		if(m instanceof PersonalMedico) System.out.println(m.getNombre() + " es parte del personal medico");
		if(m instanceof Object) System.out.println(m.getNombre() + " es una instancia de Object");

		System.out.println(m);
	}
}