package eda.proyecto2;

public class Parametros {
    public String nombreArchivo;
    public double resolucion;
    public double CentroX;
    public double CentroY;

    public Parametros(String nombreArchivo, double resolucion, double CentroX,
            double CentroY) {
        this.nombreArchivo = nombreArchivo;
        this.resolucion = resolucion;
        this.CentroX = CentroX;
        this.CentroY = CentroY;
    }
}
