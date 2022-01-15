package usuarios;

/**
*Se añade la clase administrador al paquete de usuarios, y se comienza implementar sus metodos.
*/

import java.util.Scanner;
/**
*Se crea la clase, y se añade como atributos privados el nombre y el numero de administrador.
*/
public class Administrador{
    private String nombre;
    private int numeroDeAdministrador;
    
    /**
    *Se crea el metodo constructor para poder definir las caracteristicas del objeto que se crea.
    */

    public Administrador() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre=teclado.nextLine();
        System.out.print("Ingrese su numero de administrador: ");
        numeroDeAdministrador=teclado.nextInt();
    }
     /**
     *Se definen los getters y setters de la clase, porque los atributos son privados.
     y seran requeridos en la ejecucion del Main
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeAdministrador() {
        return numeroDeAdministrador;
    }

    public void setNumeroDeAdministrador(int numeroDeAdministrador) {
        this.numeroDeAdministrador = numeroDeAdministrador;
    }
}
