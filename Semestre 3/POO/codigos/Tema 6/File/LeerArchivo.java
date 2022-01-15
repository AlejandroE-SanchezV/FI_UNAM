import java.io.*;
class LeerArchivo { 
    public static void main(String args[]) throws IOException { 
        int i; 
        FileInputStream fin;

        try { 
            fin = new FileInputStream(args[0]); 
        } catch(FileNotFoundException e) { 
            System.out.println("Archivo no encontrado"); 
            return; 
        } catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Ejecucion: java LeerArchivo nombreArchivo"); 
            return; 
        }

        do { 
            i = fin.read(); 
            if(i != -1) System.out.print((char) i); 
        } while(i != -1);
        fin.close();
    }
}
