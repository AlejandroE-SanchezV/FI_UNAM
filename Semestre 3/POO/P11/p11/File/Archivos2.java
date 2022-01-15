import java.io.File;

//Ejercicio de practica.
public class Archivos2 {
    public static void main(String[] args) {
        File f1 = new File("C:/Users/Lizeth/Documents/20202/poo/tema6/File/archivo.txt");
        File f2 = new File("archivo2.txt");
        File f3 = new File("archivo3.txt");

        if(f1.renameTo(f2)) System.out.println("Archivo renombrado");
        else System.out.println("El archivo no pudo ser renombrado");

        if(f3.delete()) System.out.println("El archivo ha sido borrado");
        else System.out.println("No fue posible borrar el archivo");
    }
}