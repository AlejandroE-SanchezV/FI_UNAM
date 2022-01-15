
public class Empleados{
	private String nombre;
	private String areaDeTrabajo;
	private int sueldo;
	private int horasDeTrabajo;

	public Empleados(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo){
		this.nombre=nombre;
		this.areaDeTrabajo=areaDeTrabajo;
		this.sueldo=sueldo;
		this.horasDeTrabajo=horasDeTrabajo;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public void setAreaDeTrabajo(String posicion){
		this.areaDeTrabajo=areaDeTrabajo;
	}

	public void setSueldo(int sueldo){
		if(sueldo>0)
			this.sueldo=sueldo;
	}

	public void setHorasDeTrabajo(int horasDeTrabajo){
		if(horasDeTrabajo>0)
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
		return "Trabajando el proyecto de Ingenieria";
	}

	public String toString(){
		return "Nombre del trabajador:"+getNombre()+"\nArea de trabajo:"+getAreaDeTrabajo()+"\nSueldo:"+getSueldo()+"\nHoras de trabajo:"+getHorasDeTrabajo();
	}


}



