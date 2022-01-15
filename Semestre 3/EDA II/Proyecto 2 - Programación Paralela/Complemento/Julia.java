import java.awt.Color; 
import java.io.File; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import java.io.IOException;

public class Julia{

  public static void main(String[] args){
    int width = 1920, height = 1080, max = 300, zoom=1;
    BufferedImage imagen = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    int negro = 0;

    int[] colors = new int[max];

    for (int i = 0; i<max; i++) {
      colors[i] = Color.HSBtoRGB(i/256f, 1, i/(i+8f));
    }

    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        double zx = 1.5 * (x - width / 2) / (0.5 * zoom * width) ;
        double zy = (y - height / 2) / (0.5 * zoom * height);
        float i = max;
        while (zx * zx + zy * zy < 4 && i > 0) {
                    double tmp = zx * zx - zy * zy -0.7;
                    zy = 2.0 * zx * zy + 0.27015;
                    zx = tmp;
                    i--;
                }
                int c = Color.HSBtoRGB((max/ i) % 1, 1, i > 0 ? 1 : 0);
                imagen.setRGB(x, y, c);
            }
        }
    try{
      ImageIO.write(imagen, "png", new File("Julia.png"));
    }catch(IOException e){
      System.out.println("Error 38");    
    }
  }
}
