package formasDeEntrega;
import java.util.Scanner;

/**
*Se añade una clase al paquete de formasDeEntrega, la cual es en tienda.
*/

public class EnTienda{
    private String sucursal;
    private int dia;
    private int mes;
    private double hora;

    /**
    *Se definen los atributos como privados, para la sucursal, y se crea el metodo constructor de la clase, para la asignacion de atributos.
    */
    public EnTienda(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIngrese la sucursal a recoger: ");
        sucursal=teclado.nextLine();
        System.out.print("Ingrese el dia a recoger: ");
        dia=teclado.nextInt();
        System.out.print("Ingrese el mes a recoger(numerico): ");
        mes=teclado.nextInt();
        System.out.print("Ingrese la hora a recoger(ej. 13.30): ");
        hora=teclado.nextDouble();
    }
}