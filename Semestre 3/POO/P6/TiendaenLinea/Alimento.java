package elementosEnVenta.alimentos;

/**
*Se añade un subpaquete, con la clase Alimento que es la clase general para los productos que son comestibles.
*/

public class Alimento{
    private double precio;
    private String formaDeConserva;
    private int unidadesporPaquete;

    /**
    *Se definen los atributos de cada alimento de forma general, con acceso privado, y se crea el constructor que va a modificar y asignar un valor a los 
    *atributos de la clase.
    */

    public Alimento(double precio, String formaDeConserva, int unidadesporPaquete) {
        this.precio = precio;
        this.formaDeConserva = formaDeConserva;
        this.unidadesporPaquete = unidadesporPaquete;
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

    public String getFormaDeConserva() {
        return formaDeConserva;
    }

    public void setFormaDeConserva(String formaDeConserva) {
        this.formaDeConserva = formaDeConserva;
    }

    public int getUnidadesPorPaquete() {
        return unidadesporPaquete;
    }

    public void setUnidadesPorPaquete(int unidadesporPaquete) {
        this.unidadesporPaquete = unidadesporPaquete;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto
    */

    public String toString(){
        return "\nPrecio: $"+getPrecio()+"\nUnidades por paquete: "+getUnidadesPorPaquete()+"\nForma de conserva: "+getFormaDeConserva();
    }
}