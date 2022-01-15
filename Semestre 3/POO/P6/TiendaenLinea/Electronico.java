package elementosEnVenta.electronicos;

/**
*Se añade un subpaquete, con la clase Electronico, que es la clase general para los productos que son electronicos.
*/

public class Electronico{
    
    private double precio;
    private String color;
    private String modelo;
    private String marca;
    private double pantalla;

    /**
    *Se definen los atributos de cada alimento de forma general, con acceso privado, y se crea el constructor que va a modificar y asignar un valor a los 
    *atributos de la clase.
    */

    public Electronico(double precio, String color, String modelo, String marca, double pantalla) {
        this.precio = precio;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.pantalla = pantalla;
    }

    /**
    *Se definen los getter y setter para poder obtener y modificar valores en la clase Catalogo, 
    */

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto
    */

    public String toString(){
        return getMarca()+"-"+getModelo()+"\n\nPrecio: $"+getPrecio()+"\nColor: "+getColor()+"\nPantalla: "+getPantalla()+"''";
    }
}

