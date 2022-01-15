import java.io.File;
import java.io.IOException;
public class Archivos {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:/Users/Lizeth/Documents/20202/poo/tema6/File");
        File f2 = new File("archivo.txt");
        File f3 = new File(f1, "archivo2.txt");
        System.out.println("\nObjeto f1:");
        System.out.println(f1.getName());
        System.out.println("El objeto f1 "+(f1.isAbsolute() ? "contiene": "no contiene") +" una ruta absoluta");
        System.out.println(f1.getAbsolutePath());
        System.out.println("f1 "+(f1.isDirectory()? "Es": "No") + " una carpeta");
        System.out.println("Creando directorio: " + f1.mkdirs());

        System.out.println("\n");
        System.out.println("\nObjeto f2:");
        System.out.println(f2.getName());
        System.out.println(f2.exists());
        System.out.println("f2 "+(f2.isFile()? "Es": "No") + " un archivo");
        System.out.println(f2.getPath());
        System.out.println("f2 "+(f2.canWrite()? "Se": "No se") + " puede escribir");
        System.out.println("f2 "+(f2.canRead()? "Se": "No se") + " puede leer");
        System.out.println("f2 pesa: " + f2.length());
        System.out.println("Creando archivo:" + f2.createNewFile());

        System.out.println("\n");
        System.out.println("\nObjeto f3:");
        System.out.println("f3 "+ (f3.exists()? "existe":"no existe"));
        System.out.println("Creando archivo: " + f3.createNewFile());
        
    }
}