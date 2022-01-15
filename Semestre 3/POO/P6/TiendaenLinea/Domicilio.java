package formasDeEntrega;
import java.util.Scanner;

/**
*Se añade una clase al paquete de formasDeEntrega, la cual es en domicilio.
*/

public class Domicilio{
    private int cp;
    private String estado;
    private String alcaldia;
    private String colonia;
    private String calle;
    private int numeroDeCasa;
    private int numeroDeTarjeta;
    private int cv;

    /**
    *Se definen los atributos como privados, para la sucursal, y se crea el metodo constructor de la clase, para la asignacion de atributos.
    */
    public Domicilio(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIngrese su Codigo postal: ");
        cp=teclado.nextInt();
        System.out.print("Ingrese su estado: ");
        estado=teclado.next();
        System.out.print("Ingrese su alcaldia: ");
        alcaldia=teclado.next();
        System.out.print("Ingrese su colonia: ");
        colonia=teclado.next();
        System.out.print("Ingrese su calle: ");
        calle=teclado.next();
        System.out.print("Ingrese su numero de hogar: ");
        numeroDeCasa=teclado.nextInt();
        System.out.print("Ingrese su numero de tarjeta: ");
        numeroDeTarjeta=teclado.nextInt();
        System.out.print("Ingrese el cv de su tarjeta: ");
        cv=teclado.nextInt();
    }

    /**
    *Se definen los metodos getters y setters para la obtencion y la modificacion de los atributos de la clase, debido a que el metodo Main, los va
    a requerir
    */

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia = alcaldia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(int numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}