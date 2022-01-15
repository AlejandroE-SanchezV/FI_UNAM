
package practica4_.díaz.bryan;

import java.util.LinkedList;
import java.util.List;

public class BusquedaBinaria {
    static List<Automovil> listaRegresoModelo =new LinkedList<>();
    static List<Automovil> listaRegresoNombre =new LinkedList<>();
    
     
    static boolean busquedaBooleana(List<Integer> lista,int inicio,int fin, int valor){
        boolean regreso=false;
        if(fin>=inicio){
            int medio=(inicio+fin)/2;
            int busca=lista.get(medio);
            if(busca==valor){
                return true;
            }
            if(busca>valor){
                return busquedaBooleana(lista,inicio,medio-1,valor);
            }else{
                return busquedaBooleana(lista,medio+1,fin,valor);
            }
        }
        return regreso;
    }
    
    
    static int busquedaVeces(List<Integer> lista,int inicio,int fin, int valor,int contador){
        if(fin>=inicio){
            int medio=(inicio+fin)/2;
            int busca=lista.get(medio);
            if(busca==valor){
                contador+=1;
            }
            if(busca>valor){
                return busquedaVeces(lista,inicio,medio-1,valor,contador);
            }else{
                return busquedaVeces(lista,medio+1,fin,valor,contador);
            }
        }
        return contador;
    }
    
    static List<Automovil> busquedaModelo(List<Automovil> lista,int inicio,int fin, int valor){
        if(fin>=inicio){
            int medio=(inicio+fin)/2;
            int busca=lista.get(medio).modelo;
            if(busca==valor){
                listaRegresoModelo.add(lista.get(medio));
            }
            if(busca>valor){
                return busquedaModelo(lista,inicio,medio-1,valor);
            }else{
                return busquedaModelo(lista,medio+1,fin,valor);
            }
        }
        return listaRegresoModelo;
    }
    
    static List<Automovil> busquedaNombre(List<Automovil> lista,int inicio,int fin, String valor){
        if(fin>=inicio){
            int medio=(inicio+fin)/2;
            char a=lista.get(medio).nombre.charAt(0);
            char c=lista.get(medio).nombre.charAt(1);
            char b=valor.charAt(0);
            char d=valor.charAt(1);
            if(a==b && c==d){
                listaRegresoNombre.add(lista.get(medio));
            }
            if(a>b){
                return busquedaNombre(lista,inicio,medio-1,valor);
            }else{
                return busquedaNombre(lista,medio+1,fin,valor);
            }
        }
        return listaRegresoNombre;
    }
}