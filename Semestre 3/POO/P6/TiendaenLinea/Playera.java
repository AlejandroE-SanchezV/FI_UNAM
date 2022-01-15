package elementosEnVenta.prendasDeVestir;

/**
*Se agrega otra clase al subpaquete, la cual es Playera y es la especializacion de la clase PrendaDeVestir.
*/

public class Playera extends PrendaDeVestir{
    private String tipo;
    private String cuello;
    private String material;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public Playera(double precio, String talla, String color, String departamento, String tipo, String cuello, String material) {
        super(precio, talla, color, departamento);
        this.tipo = tipo;
        this.cuello = cuello;
        this.material = material;
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

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */

    public String toString(){
        String a = super.toString();
        return "\nPlayera "+getTipo()+a+"\nCuello: "+getCuello()+"\nMaterial: "+getMaterial();
    }
}