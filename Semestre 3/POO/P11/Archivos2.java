import java.io.File;

//Ejercicio de practica.
public class Archivos2 {
    public static void main(String[] args) {
        File f1 = new File("C:/Users/Lizeth/Documents/20202/poo/tema6/File/archivo.txt");
        /**
        Se crea el archivo f1, que en su método constructor recibe una ruta absoluta
        */
        File f2 = new File("archivo2.txt");
        /**
        Se crea el archivo f2, que en su método constructor, recibe como parámetro el nombre del archivo,
        llamado archivo2,txt
        */
        File f3 = new File("archivo3.txt");
        /*
        Se crea el archivo f3, que en su método cocnstructor recibe como parámetro el nombre del archivo, 
        llamdo archivo3.txt
        */

        if(f1.renameTo(f2)) System.out.println("Archivo renombrado");
        /*
        Se llama al método renameTo() del archivo f1, que recibe como parámetro al archivo f2, y que 
        en caso de que f2 exista en la memoria f1, ahora se llamará como f2
        */
        else System.out.println("El archivo no pudo ser renombrado");


        if(f3.delete()) System.out.println("El archivo ha sido borrado");
        /*
        Se llama al método delete() del objeto File f3, que eliminará al archivo f3 en caso de que exista en memoria
        */
        else System.out.println("No fue posible borrar el archivo");
    }
}