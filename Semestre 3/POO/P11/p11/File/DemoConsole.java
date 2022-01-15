import java.io.*;
class DemoConsole { 
    public static void main(String args[]) { 
        String str; 
        Console con;
        con = System.console(); //Se crea un objeto de la consola que esta en la maquina virtual
        if(con == null) return; 
        str = con.readLine("Escribe una cadena: "); //Metodo de lectura del teclado por parte de la consola
        con.printf("Tu cadena es: %s\n", str); 

        /*El metodo readPassword regresa un arreglo de caracteres y el constructor del string pone los caracteres de cada localidad del arreglo juntos en una
        cadena*/
        String s = new String(con.readPassword("Escribe una contraseña: ")); //El metodo readPassword recibe una string del teclado pero al colocarla no se m
                                                                             //muestran los caracteres
        System.out.println("Contra:"+ s); //Imprime la cadena de la contraseña escrita 

        char []A = con.readPassword("Contraseña:"); //Como se regresa un arreglo de caracteres se puede recibir con un arreglo de caracteres
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]); //Se imprimen cada uno de los caracteres del arreglo
        }
        System.out.println("Contra:"+ A); //Se imprime el toString del arreglo
    }
}
        