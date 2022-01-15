package elementosEnVenta.alimentos;

/**
*Se agrega otra clase al subpaquete, la cual es CorteDeCarne y es la especializacion de la clase Alimento.
*/

public class CorteDeCarne extends Alimento{
    private double pesoPorcion;
    private String tipoDeCorte;
    private String animal;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public CorteDeCarne(double precio, String formaDeConserva, int unidadesporPaquete, double pesoPorcion, String tipoDeCorte, String animal) {
        super(precio, formaDeConserva, unidadesporPaquete);
        this.pesoPorcion = pesoPorcion;
        this.tipoDeCorte = tipoDeCorte;
        this.animal = animal;
    }

    /**
    *Se definen los getter y setter para poder obtener y modificar valores en la clase Catalogo, 
    */
    
    public double getPesoPorcion() {
        return pesoPorcion;
    }

    public void setPesoPorcion(double pesoPorcion) {
        this.pesoPorcion = pesoPorcion;
    }

    public String getTipoDeCorte() {
        return tipoDeCorte;
    }

    public void setTipoDeCorte(String tipoDeCorte) {
        this.tipoDeCorte = tipoDeCorte;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */

    public String toString(){
        String a=super.toString();
        return "\n"+getTipoDeCorte()+"-"+getAnimal()+"\n"+a+"\nPeso por porcion: "+getPesoPorcion()+" g. ";
    }
}