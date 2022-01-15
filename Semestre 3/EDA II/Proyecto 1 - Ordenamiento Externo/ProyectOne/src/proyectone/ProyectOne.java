
package proyectone;

import java.util.*;


public class ProyectOne {
       
    public static void main(String[] args){
        Scanner nombre= new Scanner (System.in);
        System.out.println("Inserta el nombre de tu carpeta usuario");
        String usuario=nombre.next();
        System.out.println("Inserta el nombre de tu archivo:");
        String archivoNombre=nombre.next();
        String direccionL="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\"+archivoNombre+".txt";
        String direccionE1="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F1.txt";
        String direccionE2="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F2.txt";
        String direccionE0="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F0.txt";
        String direccionE3="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\F3.txt";
        String todas="C:\\Users\\"+usuario+"\\Desktop\\Prueba\\";
        Polifase polifaseUno= new Polifase(todas,direccionL);
        
        System.out.println("Inserta la opcion \n1)Nombre\n2)Apellidos");
        
        int opcion=nombre.nextInt();
        switch(opcion){
            case 1:
                polifaseUno.polifaseNombre();
                polifaseUno.polifaseParteDos(1,todas);
                break;
                
            case 2:
                polifaseUno.polifaseApellido();
                polifaseUno.polifaseParteDos(2,todas);
                break;
                
            default:
                break;
        }   
    }
}
