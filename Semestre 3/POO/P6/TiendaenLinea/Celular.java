package elementosEnVenta.electronicos;

/**
*Se agrega otra clase al subpaquete, la cual es Celular y es la especializacion de la clase Electronico.
*/
     
public class Celular extends Electronico{
    
    private int memoria;
    private double camara;
    private double bateria;
    private String sistemaOperativo;

    /**
    *Se crean los atributos y se definen como privados, y se crea el metodo constructor, para la subclase, pero en este caso se debe de ejecutar el constructor de
    *la superclase con los parametros que tenga indicados, de lo contrario el metodo para la subclase no funcionara.
    */

    public Celular(double precio, String color, String modelo, String marca, double pantalla, int memoria, double camara, double bateria, String sistemaOperativo) {
        super(precio, color, modelo, marca, pantalla);
        this.memoria = memoria;
        this.camara = camara;
        this.bateria = bateria;
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
    *Se definen los getter y setter para poder obtener y modificar valores en la clase Catalogo, 
    */

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getCamara() {
        return camara;
    }

    public void setCamara(double camara) {
        this.camara = camara;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
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
        return a+"\nMemoria: "+getMemoria()+" GB"+"\nCamara: "+getCamara()+" MP"+"\nBateria: "+getBateria()+" mAh"+"\nSistema operativo: "+getSistemaOperativo();
    }
}
