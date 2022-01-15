package usuarios;

/**
*Se añade la clase usuarioNormal al paquete de usuarios, y se comienza implementar sus metodos.
*/

import java.util.Scanner;

public class UsuarioNormal{
    private String nombre;
    private String mail;
    private int numero;

    /**
    *Se crea la clase con los atributos privados, y  posteriormente se define el metodo constructor. 
    */

    public UsuarioNormal(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre=teclado.nextLine();
        System.out.print("Ingrese su correo electronico: ");
        mail=teclado.nextLine();
        System.out.print("Ingrese su correo numero telefonico: ");
        numero=teclado.nextInt();
    }     
}