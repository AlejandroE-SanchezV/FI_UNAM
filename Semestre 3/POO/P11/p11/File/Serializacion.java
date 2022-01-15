import java.io.*;
public class Serializacion { 
    public static void main(String args[]) {
    // Serializacion 
        try { 
            MiClase obj1 = new MiClase("Hola", -7, 2.7e10); 
            System.out.println("objeto1: " + obj1); 
            FileOutputStream fos = new FileOutputStream("serial"); 
            ObjectOutputStream oos = new ObjectOutputStream(fos); 
            oos.writeObject(obj1); 
            oos.flush(); 
            oos.close(); 
        } catch(IOException e) { 
            System.out.println("Ocurrio una excepcion serializando: " + e); 
            System.exit(0); 
        }
        // Deserializacion 
        try { 
            MiClase obj2; 
            FileInputStream fis = new FileInputStream("serial"); 
            ObjectInputStream ois = new ObjectInputStream(fis); 
            obj2 = (MiClase)ois.readObject(); 
            ois.close(); 
            System.out.println("objeto2: " + obj2); 
        } catch(Exception e) { 
            System.out.println("Ocurrio una excepcion deserializando: " + e); 
            System.exit(0); 
        }
    }
}
class MiClase implements Serializable { 
    String s; 
    int i; 
    double d; 
    public MiClase(String s, int i, double d) { 
        this.s = s; 
        this.i = i; 
        this.d = d; 
    } 
    
    public String toString() { 
        return "s=" + s + "; i=" + i + "; d=" + d; 
    } 
}
