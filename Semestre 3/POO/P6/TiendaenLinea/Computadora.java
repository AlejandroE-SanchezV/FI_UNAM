package elementosEnVenta.electronicos;

/**
*Se agrega otra clase al subpaquete, la cual es Computadora y es la especializacion de la clase Electronico.
*/

public class Computadora extends Electronico{

    private String tipo;
    private int memoria;
    private int discoDuro;
    private String procesador;
    private String sistemaOperativo;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public Computadora(double precio, String color, String modelo, String marca, double pantalla, String tipo, int memoria, int discoDuro, String procesador, String sistemaOperativo) {
        super(precio, color, modelo, marca, pantalla);
        this.tipo=tipo;
        this.memoria = memoria;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
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

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
    *Se sobreescribe el toString, para cuando sea necesario la impresion de las caracteristicas del producto y se añade el toString de la clase
    *super para la impresion del metodo, de acuerdo a como se definio en la clase padre.
    */
    
    public String toString(){
        String a=super.toString();
        return a+"\nTipo: "+getTipo()+"\nMemoria: "+getMemoria()+" GB"+"\nProcesador: "+getProcesador()+"GB"+"\nSistema operativo: "+getSistemaOperativo();
    }
}