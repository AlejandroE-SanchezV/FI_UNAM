import java.awt.Color; //Clase que permite el manejo de los colores de acuero a un rango de valores y al RGB 
import java.io.File; //Clase que permite el manejo de los archivos.
import java.awt.image.BufferedImage; // Clase que permite el modelado de imagenes
import javax.imageio.ImageIO; // Clase que permite la escritura o creacion de imagenes

public class MandelbrotColor {
    public static void main(String[] args) throws Exception {
        //La siguiente seccion permite medir el tiempo de procesamiento de todo el programa
        long inicio,fin,tiempo=0,itir=0;
        double cambio=0;
        inicio = System.currentTimeMillis();
        int width = 1920, height = 1080, max = 1000; //Original 1000
        while(true){
            //Creacion del objeto que necesita las dimensiones de la imagen y el tipo de imagen
            BufferedImage imagen = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); //Imagen de 8 bits con RGB dentro de pixeles
        
            //Se llenan el arreglo con los colores 
            int negro = 0;
            int[] colors = new int[max];
            for (int i = 0; i<max; i++) {
                colors[i] = Color.HSBtoRGB(i/256f, 1, i/(i+8f));//Metodo que convierte los componentes del color del HSB model al modelo RGB(Hue, Saturation, Brightness) 
                //System.out.println("Color:["+i+"] ="+colors[i]);
            }

            //For para llenar cada uno de los pixeles
            for (int fila = 0; fila < height; fila++) {
                for (int columna = 0; columna < width; columna++) {
                    double reales = ((columna - width/2)*4.0/width)/cambio; //Parte real
                    double imaginario = ((fila - height/2)*4.0/width)/cambio;
                    double x = 0.0, y = 0.0;
                    double r2;
                    int iteracion = 0;
                    while (x*x+y*y <4 && iteracion < max) { //<4 Dentro del radio de que se asigne
                        double x_nuevo = x*x-y*y+reales;
                        y = 2*x*y+imaginario;
                        x = x_nuevo;
                        iteracion++;
                    }
                    if (iteracion < max){
                        imagen.setRGB(columna, fila, colors[iteracion]);
                    }
                    else{
                        imagen.setRGB(columna,fila, negro);
                    }
                }
            }
            ImageIO.write(imagen, "png", new File("mandelbrot"+itir+".png"));
            itir++;
            if(itir==8){
                break;
            }
            cambio+=0.1;
        }

        fin = System.currentTimeMillis();
        System.out.println("Inicio:"+ inicio +"\nFinal:" + fin);
    }
}