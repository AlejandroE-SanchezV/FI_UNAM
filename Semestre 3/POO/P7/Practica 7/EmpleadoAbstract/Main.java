
import java.util.Scanner;

/**
*Se crea la clase principal, donde se prueban las clases, en el metodo principal se colocar un menu para poder
*visualizar los atributos de cada objeto: desarrollador, diseñadores, y con una segunda opcion para poder modificar
*el salario que gana cada trabajador.
*Autores: 
*Dávila Ortega Jesús Eduardo - No. Cuenta: 317199860
*Díaz Hernández Marcos Bryan - No. Cuenta: 317027253
*Pareja Avila Emiliano - No. Cuenta: 317081345
*Vazquez Zavala Oliver Alexis - No. Cuenta: 317202263
*/

public class Main{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("----Menu de la organizacion----");
		System.out.println("--Vamos a agregar miembros al proyecto--");
		System.out.println("Inserta el nombre del administrador:");
		String nombre=entrada.next();
		System.out.println("Inserta el area de trabajo del administrador:");
		entrada.nextLine();
		String area=entrada.next();
		System.out.println("Salario del administrador:");
        entrada.nextLine();
		int salario=entrada.nextInt();
		System.out.println("Horas de trabajo del administrador");
		int horas=entrada.nextInt();
		int opcion,opcionDos,opcionTres;
		Administrador administrador = new Administrador(nombre,area,salario,horas,"Administrador");
		do{
			System.out.println("\n1)Verificar a cada empleado \n2)Pagar a empleado\n3)Salir");
			opcion=entrada.nextInt();
			switch(opcion){
				case 1:
					do{
						System.out.println("\nTrabajadores:");
						System.out.println("1)Administrador \n2)liderDeProyecto \n3)Desarrollador \n4)Disenador \n5)Testers \n6)Salir");
						opcionDos=entrada.nextInt();
						switch(opcionDos){
							case 1:
								System.out.println(administrador.toString());
								System.out.println("");
								break;

							case 2:
								administrador.lider();
								System.out.println("");
								break;

							case 3:
								administrador.desarrollador();
								System.out.println("");
								break;

							case 4:
								administrador.disenador();
								System.out.println("");
								break;

							case 5:
								administrador.tester();
								System.out.println("");
								break;

							default:
								opcionDos=6;
								break;
						}

					}while(opcionDos<6);
					break;

				case 2:
					do{
						System.out.println("Asignar sueldos:");
						System.out.println("1)Administrador \n2)liderDeProyecto \n3)Desarrollador \n4)Disenador \n5)Testers \n6)Salir");
						opcionTres=entrada.nextInt();
						switch(opcionTres){

							case 1:
								administrador.pagarAdministrador(administrador);
								break;
								
							case 2:
								administrador.pagarLider();
								break;

							case 3:
								administrador.pagarDesarrollador();
								break;

							case 4:
								administrador.pagarDisenador();
								break;

							case 5:
								administrador.pagarTester();
								break;

							default:
								opcionTres=6;
								break;
						}

					}while(opcionTres<6);
					break;

				default:
					opcion=3;
					break;
			}
		}while(opcion<3);
	}

}