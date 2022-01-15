
package practica5.díazmarcos;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



class Encadenamiento {
    
    /**
     * Este es mi metodo favorito, porque recibe una HashTable, con valor correspondiente a una lista, y de esta manera en cada una
     * de la llaves que se le asignan de [0,14], se van agregando una lista y con eso resolvi el ejercicio, se que no es lo que se
     * pide pero pense en que la HashTable sería mas efectiva y mas sencilla de implementar.
     * @param lista 
     */
    static void integrar(Map<Integer,List<Integer>> lista){
        for(int i=0;i<15;i++){
            List<Integer> valor =new LinkedList<>();
            lista.put(i, valor);
        }
    }
    /**
     * En este caso es casi lo mismo que la funcion de HashModulo, pero solo se tiene la llamada a un metodo que ayuda a
     * agregar los valores.
     * @param lista 
     */
    static void agregar(Map<Integer,List<Integer>> lista){
        Scanner valores = new Scanner(System.in);
        System.out.println("Inserta el valor:");
        int valor = valores.nextInt();
        int posicion=HashModulo.hash(valor);
        System.out.println("La posicion es:"+(posicion+1));
        colocar(lista,posicion,valor);
        imprimir2(lista);
    }
    
    /**
     * En este caso es la mas importante, porque primero se crea una lista que recibe el valor de la posicion que se indica, es decir,
     * la llave, y a esta lista se le agrega el valor que corresponde a la posicion, y se vuelve a insertar esta lista en la posicion
     * que corresponde a la llave, entonces solo se van creando referencias que obtienen la lista-valor, y como esta referencia va
     * gurdando los valores anteriores, pues se le añade el nuevo valor y se regresa. 
     * @param lista
     * @param posicion
     * @param valor 
     */
    
    static void colocar(Map<Integer,List<Integer>> lista,int posicion, int valor){
        List<Integer> agregar =new LinkedList<>();
        agregar=lista.get(posicion);
        agregar.add(valor);
        lista.put(posicion, agregar);
    }
    
    /**
     * Aqui solamente se obtiene la lista de cada key, y despues se manda a imprimir la lista.
     * @param lista 
     */
    static void imprimir2(Map<Integer,List<Integer>> lista){
        for(int i=0;i<15;i++){
            List<Integer> imprimir = new LinkedList<>();
            imprimir=lista.get(i);
            for(int j=0;j<imprimir.size();j++){
                Integer valor=imprimir.get(j);
                System.out.println("Lista["+(i+1)+"]:Valor["+(j+1)+"]:"+valor);
            }
        }
    }
}
