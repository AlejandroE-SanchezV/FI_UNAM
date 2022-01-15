
public class Nomina{

	/**
	*El metodo recibe como parametros un objeto de tipo empleado y define a que subclase pertenece y en base a esto asigna el salario.
	*/

	public void pagar(Empleados empleado){
		if(empleado instanceof Administrador){
			int pago=2500;
			int pagoT=pago*empleado.getHorasDeTrabajo();
			empleado.setSueldo(pagoT);
		}
		if(empleado instanceof LiderDeProyecto){
			int pago=2000;
			int pagoT=pago*empleado.getHorasDeTrabajo();
			empleado.setSueldo(pagoT);
		} 
		if(empleado instanceof Desarrollador){
			int pago=1000;
			int pagoT=pago*empleado.getHorasDeTrabajo();
			empleado.setSueldo(pagoT);
		}
		if(empleado instanceof Disenador){
			int pago=800;
			int pagoT=pago*empleado.getHorasDeTrabajo();
			empleado.setSueldo(pagoT);
		}
		if(empleado instanceof Tester){
			int pago=700;
			int pagoT=pago*empleado.getHorasDeTrabajo();
			empleado.setSueldo(pagoT);
		}
	}
}