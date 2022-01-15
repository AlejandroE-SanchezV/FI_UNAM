package elementosEnVenta.electronicos;

/**
*Se agrega otra clase al subpaquete, la cual es TV y es la especializacion de la clase Electronico.
*/

public class TV extends Electronico{
    private String tipo;
    private String resolucion;
    private String tecnologiaDePantalla;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public TV(double precio, String color, String modelo, String marca, double pantalla, String tipo, String resolucion, String tecnologiaDePantalla) {
        super(precio, color, modelo, marca, pantalla);
        this.tipo = tipo;
        this.resolucion = resolucion;
        this.tecnologiaDePantalla = tecnologiaDePantalla;
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

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTecnologiaDePantalla() {
        return tecnologiaDePantalla;
    }

    public void setTecnologiaDePantalla(String tecnologiaDePantalla) {
        this.tecnologiaDePantalla = tecnologiaDePantalla;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */
    
    public String toString(){
        String a=super.toString();
        return a+"\nTipo: "+getTipo()+"\nResolucion: "+getResolucion()+"\nTamaño de pantalla: "+getTecnologiaDePantalla();
    }
}