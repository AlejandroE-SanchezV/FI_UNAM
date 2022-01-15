package elementosEnVenta.alimentos;

/**
*Se agrega otra clase al subpaquete, la cual es fruta y es la especializacion de la clase Alimento.
*/

public class Fruta extends Alimento{
    private String tipo;
    private double pesoPorcion;
    private String paisDeProcedencia;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */
    
    public Fruta(double precio, String formaDeConserva, int unidadesporPaquete, String tipo, double pesoPorcion, String paisDeProcedencia){
        super(precio, formaDeConserva, unidadesporPaquete);
        this.tipo=tipo;
        this.pesoPorcion=pesoPorcion;
        this.paisDeProcedencia=paisDeProcedencia;
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

    public double getPesoPorcion() {
        return pesoPorcion;
    }

    public void setPesoPorcion(double pesoPorcion) {
        this.pesoPorcion = pesoPorcion;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public void setPaisDeProcedencia(String paisDeProcedencia) {
        this.paisDeProcedencia = paisDeProcedencia;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */

    public String toString(){
        String a=super.toString();
        return "\n"+getTipo()+"\n"+a+"\nPeso por porcion: "+getPesoPorcion()+" g."+"\nPais de procedencia: "+getPaisDeProcedencia();

    }
}