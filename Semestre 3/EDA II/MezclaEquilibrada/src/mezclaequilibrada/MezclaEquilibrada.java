/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mezclaequilibrada;

import java.util.Scanner;

import java.io.File;

public class MezclaEquilibrada {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Ordenamiento part =new Ordenamiento();//clase para crear los bloques, ordenar y leer archivos 
        int a=0;//contador de apoyo para escribir los elementos 
        
        String direccion, nombre;
        System.out.println("Escribe la direccion en la cual se ecnuentra el archivo");
        System.out.println("Recuerda que sebe estar completa o si no el programa fallara, ademas de que se debe colocar doble ciagonal cuando lleve una digonal");
        System.out.println("Ejemplo de como escribir la direccion donde se encuentra el archivo:");
        System.out.println("C:\\Users\\gabri\\OneDrive\\Escritorio\\EDA");
        direccion =sn.nextLine();
        System.out.println("Ingresa el nombre del archivo a ordenar no se te olvide agregar la extencion .txt al nombre del archivo");
        nombre= sn.nextLine();
        File F0 = new File(direccion,nombre);
        part.partiendo(F0, direccion);
        
        
        
        
        
    }
    
   
}
