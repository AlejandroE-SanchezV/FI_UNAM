
public abstract class  Empleados{
	String nombre;
	String areaDeTrabajo;
	int sueldo;
	int horasDeTrabajo;

	/**
	*Metodo constructor concreto dentro de la clase abstracta
	*/

	public Empleados(String nombre,String areaDeTrabajo,int sueldo,int horasDeTrabajo){
		this.nombre=nombre;
		this.areaDeTrabajo=areaDeTrabajo;
		this.sueldo=sueldo;
		this.horasDeTrabajo=horasDeTrabajo;
	}


	/**
	*Metodos abstractos setters y getters para los atributos que se definen en esta clase, y al heredarse se definen para los metodos, 
	*/


	abstract void setNombre(String nombre);

	abstract void setAreaDeTrabajo(String areaDeTrabajo);

	abstract void setSueldo(int sueldo);

	abstract void setHorasDeTrabajo(int horasDeTrabajo);

	abstract String getNombre();

	abstract String getAreaDeTrabajo();

	abstract int getSueldo();

	abstract int getHorasDeTrabajo();

	abstract String trabajar();
	
	public String toString(){
		return "Nombre del trabajador:"+getNombre()+"\nArea de trabajo:"+getAreaDeTrabajo()+"\nSueldo:"+getSueldo()+"\nHoras de trabajo:"+getHorasDeTrabajo();
	}


}



