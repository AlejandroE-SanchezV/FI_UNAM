package elementosEnVenta.prendasDeVestir;

/**
*Se añade un subpaquete, con la clase PrendaDeVestir, que es la clase general para los productos que son para vestir.
*/

public class PrendaDeVestir{
    private double precio;
    private String talla;
    private String color;
    private String departamento;

    /**
    *Se definen los atributos de cada alimento de forma general, con acceso privado, y se crea el constructor que va a modificar y asignar un valor a los 
    *atributos de la clase.
    */
    
    public PrendaDeVestir(double precio, String talla, String color, String departamento){
        this.precio=precio;
        this.talla=talla;
        this.color=color;
        this.departamento=departamento;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto
    */

    public String toString(){
        return "-"+getDepartamento()+"\n\nPrecio: $"+getPrecio()+"\nTalla: "+getTalla()+"\nColor: "+getColor();
    }
}