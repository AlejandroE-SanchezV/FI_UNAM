
package practica4_.díaz.bryan;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BusquedaLineal{
    
    static void entrada(List<Integer> lista){
        Scanner entrada1 = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Inserta el valor["+(i+1)+"]:");
            int valor = entrada1.nextInt();
            lista.add(i,valor);
        }
    }
    
    static boolean busquedaBooleana(List<Integer> lista,int valorbuscado){
        boolean opcion=false;
        for(int i=0;i<lista.size();i++){
            int a=lista.get(i);
            if(a==valorbuscado){
                opcion=true;
            }
        }
        return opcion;
    }
    
    static int busquedaIndice(List<Integer> lista,int valorbuscado){
        int b=-1;
        for(int i=0;i<lista.size();i++){
            int a=lista.get(i);
            if(a==valorbuscado){
               b=i;
            }
        }
        return b;
    }
    
    static int busquedaAparicion(List<Integer> lista,int valorbuscado){
        int b=0;
        for(int i=0;i<lista.size();i++){
            int a=lista.get(i);
            if(a==valorbuscado){
               b+=1;
            }
        }
        return b;
    }
    
    static List<Automovil> busquedaAparicionAutomovilModelo(List<Automovil> lista,int valorbuscado){
        List<Automovil> listaRegreso =new LinkedList<>();
        for(int i=0;i<lista.size();i++){
            int a=lista.get(i).modelo;
            if(a==valorbuscado){
              listaRegreso.add(lista.get(i));
            }
        }
        return listaRegreso;
    }
    
      static List<Automovil> busquedaAparicionAutomovilNombre(List<Automovil> lista,String valorbuscado){
        List<Automovil> listaRegreso =new LinkedList<>();
        for(int i=0;i<lista.size();i++){
            String a=lista.get(i).nombre;
            if(a.equals(valorbuscado)){
               listaRegreso.add(lista.get(i));
            }
        }
        return listaRegreso;
    }
}
