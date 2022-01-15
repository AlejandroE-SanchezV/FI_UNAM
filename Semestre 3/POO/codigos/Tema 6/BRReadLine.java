
import java.io.*;
class BRReadLine { 
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)); 
        String str;
        System.out.println("Escriba varias lineas de texto."); 
        System.out.println("Escriba 'stop' para salir."); 
        do { 
            str = br.readLine();
            System.out.println(str); 
        } while(!str.equals("stop"));
    }
}
