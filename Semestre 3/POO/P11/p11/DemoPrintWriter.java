import java.io.*;
public class DemoPrintWriter { 
    public static void main(String args[]) { 
        PrintWriter pw = new PrintWriter(System.out, true); 
        pw.println("Imprimiendo una cadena"); 
        int i = -7; 
        pw.println(i); 
        double d = 4.5e-7; 
        pw.println(d); 
    } 
}
