package elementosEnVenta.prendasDeVestir;

/**
*Se agrega otra clase al subpaquete, la cual es Calzado y es la especializacion de la clase PrendaDeVestir.
*/

public class Calzado extends PrendaDeVestir{
    private String tipo;
    private String marca;
    private String suela;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public Calzado(double precio, String talla, String color, String departamento, String tipo, String marca, String suela) {
        super(precio, talla, color, departamento);
        this.tipo = tipo;
        this.marca = marca;
        this.suela = suela;
    }

    /**
    *Se definen los getter y setter para poder obtener y modificar valores en la clase Catalogo, 
    */


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */

    public String toString(){
        String a = super.toString();
        return "\n"+getTipo()+a+"\nMarca: "+getMarca()+"\nSuela: "+getSuela();
    }
}