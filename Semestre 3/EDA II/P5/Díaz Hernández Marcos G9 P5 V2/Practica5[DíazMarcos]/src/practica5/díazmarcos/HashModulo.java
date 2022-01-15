
package practica5.díazmarcos;

import java.util.Scanner;
import java.util.List;

public class HashModulo {
    
    /**
     * Comienza inicializando los valores a null, se usa un wrapper para poder asignar el valor.
     * @param lista 
     */
    static void entrada(List<Integer> lista){
        for(int i=0;i<15;i++){
            lista.add(i,null);
        }
    }
    
    /**
     * Se obtiene la posicion por hash, y posteriormente se verifica la posicion con la colision y al final se añade a la lista
     * @param lista se envia la lista que almacena los valores
     */
    static void agregar(List<Integer> lista){
        Scanner valores = new Scanner(System.in);
        System.out.println("Inserta el valor:");
        int valor = valores.nextInt();
        int posicion=hash(valor);
        int posicionfinal=colision(lista,posicion);
        System.out.println("La posicion es:"+(posicionfinal+1));
        lista.add(posicionfinal,valor);
    }
    
    
    static void imprimir(List<Integer> lista){
        for(int i=0;i<15;i++){
            Integer valor=lista.get(i);
            System.out.println("Valor["+(i+1)+"]:"+valor);
        }
    }
    
    /**
     * Se busca el valor y se tiene que usar un wrapper para poder obtener el null en caso de que no se encuentre el valor.
     * @param list
     * @param valor el valor buscado
     */

    
    static void buscar(List<Integer> list, int valor){
        int posicion=hash(valor);
        if(valor==list.get(posicion))
        System.out.println("La posicion del valor es:"+(posicion+1));
    }
    
    /**
     * Se busca la posicion y se prioriza que el valor este entre [0,14],y sea positivo. 
     * @param valor
     * @return 
     */
    public static int hash(int valor){
        if(valor<0){
            valor=valor*-1;
        }
        
        valor=valor%13;
        
        if(valor>-1 && valor<15){
             return valor;
        }else{
          return hash(valor);
        }
    }
    
    /**
     * Se utiliza un wrapper para poder verificar que la posicion este vacia y  si es el caso se regresa la posicion, en caso
     * contrario se buscan las posiciones que esten vacias y  si se llega al final de la lista, se reincia el contador  para
     * empezar a buscar desde la primer posicion.
     * @param lista
     * @param posicion
     * @return 
     */
    
    static int colision(List<Integer> lista, int posicion){
        Integer compara=lista.get(posicion);
        if(compara==null){
            return posicion;
        }else{
            while(compara!=null){
                posicion+=1;
                compara=lista.get(posicion);
                if(posicion==14 && compara!=null){
                    posicion=0;
                }
            }
            return posicion;
        } 
    }
    
}
