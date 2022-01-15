import java.io.*;
class CopiaArchivo { 
    public static void main(String args[]) throws IOException { 
        int i; 
        FileInputStream fin; 
        FileOutputStream fout;
        
        try { 
            try { 
                fin = new FileInputStream(args[0]); 
            } catch(FileNotFoundException e) { 
                System.out.println("Error no se encontro el archivo"); 
                return; 
            }

            try { 
                fout = new FileOutputStream(args[1], true); 
            } catch(FileNotFoundException e) { 
                System.out.println("No fue posible abrir el archivo"); 
                return; 
            } 
        } catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("java CopiaArchivo Archivo Copia"); 
            return; 
        }

        try { 
                do { 
                    i = fin.read(); 
                    if(i != -1) fout.write(i); 
                } while(i != -1); 
            } catch(IOException e) { 
                System.out.println("Error"); 
            }
            
            fin.close(); fout.close();
        }
    }