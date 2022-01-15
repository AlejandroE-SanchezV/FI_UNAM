import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practica11 {
    public static void main(String[] args) throws IOException{
        File f1 = new File("C:/Users/Lizeth/Documents/20202/poo/tema6/File/Carpeta1");
        if(f1.mkdir()) System.out.println("La carpeta fue creada exitosamente");
        else System.out.println("No fue posible crear la carpeta");

        File f2 = new File(f1, "ArchivoPrueba.txt");

        if(f2.createNewFile()) System.out.println("Archivo creado");
        else System.out.println("No fue posible crear el archivo");

        FileOutputStream fout = new FileOutputStream(f2, true);

        String s = "Practica 11 de Programación orientada a objetos";

        byte buffer[] = s.getBytes();
        
        fout.write(buffer);
        fout.close();
        int i = 0;
        
        FileInputStream fin = new FileInputStream(f2);
        do{
            i = fin.read();
            if(i != -1) System.out.print((char)i);
        }while(i != -1);

        fin.close();
    }
}