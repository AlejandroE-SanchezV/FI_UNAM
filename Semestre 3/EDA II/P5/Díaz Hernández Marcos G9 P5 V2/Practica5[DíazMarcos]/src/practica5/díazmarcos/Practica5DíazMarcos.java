
package practica5.díazmarcos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Practica5DíazMarcos { 

    static public void hash(List<Integer> lista){
        Scanner entrada = new Scanner(System.in);
        int opcion;
            do{
               System.out.println("Submenu de Hash");
               System.out.println("Inserte el valor de la opcion");
               System.out.println("1)Agregar elementos \n2)Imprimir la lista \n3)Buscar elementos \n4)Salir");
               opcion=entrada.nextInt();
               
               switch(opcion){
                   case 1:
                       HashModulo.agregar(lista);
                    break;
                    
                   case 2:
                       HashModulo.imprimir(lista);
                    break;
                    
                   case 3:
                       System.out.println("Inserta el valor a buscar");
                       int busqueda=entrada.nextInt();
                       HashModulo.buscar(lista,busqueda); 
                    break;
                    
                   default:
                    opcion=4;
                    break;
               }
               
            }while(opcion<4);
}
    
    static public void encadenamiento(Map<Integer,List<Integer>> lista){
        Scanner entrada = new Scanner(System.in);
        int opcion;
            do{
               System.out.println("Submenu de Encadenamiento");
               System.out.println("Inserte el valor de la opcion");
               System.out.println("1)Agregar elementos \n2)Imprimir la lista \n3)Salir");
               opcion=entrada.nextInt();
               
               switch(opcion){
                   case 1:
                       Encadenamiento.agregar(lista);
                    break;
                    
                   case 2:
                       Encadenamiento.imprimir2(lista);
                    break;
                    
                   default:
                    opcion=3;
                    break;
               }
               
            }while(opcion<3);
}
    
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int opcion;
            do{
               System.out.println("Submenu de Encadenamiento");
               System.out.println("Inserte el valor de la opcion");
               System.out.println("1)Manejar Tablas Hash \n2)Funcion Hash Por Modulo \n3)Encadenamiento \n4)Salir");
               opcion=entrada.nextInt();
               
               switch(opcion){
                   case 1:
                        Map<Integer,String> miTablita = new HashMap<>();
                        Map<Integer,String> miTablitaNueva = new HashMap<>();

                        miTablita.put(315395330,"Diana");
                        miTablita.put(354642856,"Andres");
                        miTablita.put(394387343,"Ivan");
                        miTablita.put(345923473,"Lynda");
                        miTablita.put(335794283,"Karina");
                        miTablita.put(315334436,"Armando");
                        System.out.println("Se añanaden elementos a las HashTable");
                        
                        int longitud=miTablita.size();
                        System.out.println("Longitud:"+longitud);
                        
                        System.out.println("Buscar un elemento");
                        if(miTablita.containsKey(315395330)){
                            System.out.println("Si existe");
                        }else{
                            System.out.println("No existe");
                        }
                        
                        System.out.println("Buscar un elemento");
                        if(miTablita.containsValue("Armando")){
                            System.out.println("Si existe");
                        }else{
                            System.out.println("No existe");
                        }
                        
                        System.out.println("Comparando tablas");
                         if(miTablita.equals(miTablitaNueva)){
                             System.out.println("Son iguales");
                         }else{
                             System.out.println("No son iguales");
                         }

                         miTablitaNueva=miTablita; 
                         
                         System.out.println("Comparando tablas");
                         if(miTablita.equals(miTablitaNueva)){
                             System.out.println("Son iguales");
                         }else{
                             System.out.println("No son iguales");
                         }
                         
                         System.out.println("Obteniendo valores de la tabla");
                         String valor=miTablitaNueva.get(345923473);
                         System.out.println("Alumna:"+valor);
                         String valor1=miTablita.get(335794283);
                         System.out.println("Alumna:"+valor1);
                         
                         System.out.println("Eliminando valores de la tabla");
                         if(miTablita.remove(335794283,"Karina")){
                             System.out.println("Se elimino");
                         }else{
                             System.out.println("No son iguales");
                         }
                         
                         String regreso=miTablita.remove(345923473);
                         System.out.println("Alumna expulsada:"+regreso);
                         
                         System.out.println("Buscando valores en la tabla");
                         String valor2=miTablitaNueva.get(345923473);
                         System.out.println("Alumna:"+valor2);
                         String valor3=miTablita.get(335794283);
                         System.out.println("Alumna:"+valor3);

                         int longitud1=miTablita.size();
                         System.out.println("Longitud:"+longitud1);
                    break;
                    
                   case 2:
                       System.out.println("Ejercicio 2");
                       List<Integer> listaBusqueda = new ArrayList<>();
                       HashModulo.entrada(listaBusqueda);
                       hash(listaBusqueda);
                    break;
                   
                   case 3:
                       System.out.println("Ejercicio 3");
                       Map<Integer,List<Integer>> tablita = new HashMap<>();
                       Encadenamiento.integrar(tablita);
                       encadenamiento(tablita);
                       break;
                       
                   default:
                    opcion=4;
                    break;
               }
               
            }while(opcion<4);
    }
}
