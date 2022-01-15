package eda.proyecto2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Renderizado implements Runnable {
    private int ancho = 3840; //1920
    private int alto = 2160; //1080
    private int maxIteraciones;
    private double radio = 2;
    private double divergencia = radio * radio;
    private int xOffset = -(ancho - 1)/2;
    private int yOffset = (alto - 1)/2;
    private int negro = 0;
    private Parametros[] par;
    private Colores color;
    
    public Renderizado(Parametros[] imgs, Colores color, 
            int maxIteraciones) {
        par = imgs;
        this.color = color;
        this.maxIteraciones = maxIteraciones;
    }

    @Override
    public void run() {
        int iteracion, punto;
        double a, b, a1, x, y;
        int[] paleta = new int[maxIteraciones];
        // Obtener los colores de la paleta
        for (int i = 0; i < maxIteraciones; i++) {
            paleta[i] = color.getColor(i);
            //System.out.println("Color ["+i+"] = "+paleta[i]);
        }

        for (Parametros actual : par){
            BufferedImage img = new BufferedImage(ancho, alto,BufferedImage.TYPE_INT_RGB);
            File archivo = new File(actual.nombreArchivo+".png"); 

            //Para cada pixel
            for (int r = 0; r < alto; r++)
            {
                for (int c = 0; c < ancho; c++)
                {
                    // Calcula el punto que representa el pixel
                    x = actual.CentroX + (xOffset + c)
                            / actual.resolucion;
                    y = actual.CentroY + (yOffset - r)
                            / actual.resolucion;

                    iteracion = 0;
                    a = x;
                    b = y;

                    while (a*a + b*b <= divergencia && iteracion < maxIteraciones)
                    {
                        // Calcular el valor (si diverge o no)
                        a1 = a;          //para no perder el valor de a
                        a = a*a - b*b + x; // (a^2) - (b^2) + x
                        b = 2*a1*b + y; //2ab + y
                        iteracion ++;
                    }

                    // Si diverge, negro; sino, color de la paleta
                    if (iteracion == maxIteraciones)
                        punto = negro;
                    else {
                        punto = paleta[iteracion];
                    }
                    //Pinta en las coordenadas alto y ancho el color de punto
                    img.setRGB(c, r, punto);
                }
            }
            //Crea la imagen
            try {
                ImageIO.write(img, "png", archivo);
            }
            catch (IOException e) {
                System.out.println("Error al crear la imagen");
            }
        }
    }
}