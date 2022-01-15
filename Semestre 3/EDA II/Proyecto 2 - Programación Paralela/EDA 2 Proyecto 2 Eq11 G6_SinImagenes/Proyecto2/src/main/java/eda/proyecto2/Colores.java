package eda.proyecto2;

public class Colores{
    private int maxIteraciones;
    
    public Colores(int maxIteraciones){
        this.maxIteraciones = maxIteraciones;
    }
    
    public int getColor(int i) {
        // Esquema de colores
        int a = (int) (255 * ((double) i) / (maxIteraciones / 4));
        return 
                // Rojo y negros
                // ( (2*a<<16) );
                //Rosa y negro
                // ( (255 * (i/15)) << 16 | (255 * (i/15)) );
                // Rojo barra y negro
                // ((255 * (i/20)) << 16 | 0 | 0 );
                // Blanco y negro
                // ((255 * (i/10)) << 16 | (255 * (i/10)) << 8 | (255 * (i/10)) );
                // Azul, verde y negro
                // (65536 + i*256 + i/2+128);
                // Negro y rosa < degradado
                ( (0) | (2*a<<17) | (a<<4) | ((a*3)<<0) );
    }

}