package elementosEnVenta.alimentos;

/**
*Se agrega otra clase al subpaquete, la cual es bebida y es la especializacion de la clase Alimento.
*/

public class Bebida extends Alimento{
    private String tipoDeBebida;
    private float volumenDeBebida;
    private String sabor;
    
    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public Bebida(double precio, String formaDeConserva, int unidadesporPaquete, String tipoDeBebida, float volumenDeBebida,String sabor){
        super(precio, formaDeConserva, unidadesporPaquete);
        this.tipoDeBebida=tipoDeBebida;
        this.volumenDeBebida=volumenDeBebida;
        this.sabor=sabor;
    }

    /**
    *Se definen los getter y setter para poder obtener y modificar valores en la clase Catalogo, 
    */


    public String getTipoDeBebida() {
        return tipoDeBebida;
    }

    public void setTipoDeBebida(String tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }

    public float getVolumenDeBebida() {
        return volumenDeBebida;
    }

    public void setVolumenDeBebida(float volumenDeBebida) {
        this.volumenDeBebida = volumenDeBebida;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */

    public String toString(){
        String a=super.toString();
        return "\n"+getTipoDeBebida()+"-"+getSabor()+"\n"+a+"\nVolumen de bebida: "+getVolumenDeBebida()+" ml.";
    }
}