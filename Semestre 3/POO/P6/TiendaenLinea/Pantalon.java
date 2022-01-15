package elementosEnVenta.prendasDeVestir;

/**
*Se agrega otra clase al subpaquete, la cual es Pantalon y es la especializacion de la clase PrendaDeVestir.
*/

public class Pantalon extends PrendaDeVestir{
    private String tipo;
    private String corte;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public Pantalon(double precio,String talla, String color, String departamento, String tipo, String corte) {
        super(precio, talla, color, departamento);
        this.tipo = tipo;
        this.corte = corte;
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

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */

    public String toString(){
        String a = super.toString();
        return "\nPantalon "+getTipo()+a+"\nCorte: "+getCorte();
    }
}