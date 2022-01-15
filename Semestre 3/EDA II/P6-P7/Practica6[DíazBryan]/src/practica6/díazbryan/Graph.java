
package practica6.díazbryan;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph{
    int v;
    LinkedList<Integer> adjArray[];
    int nodo;
    int nodoDestino;
    
    /**
     * Metodo constructor de las listas de adyacencia
     * @param v Indica la cantidad de nodos.
     */
    Graph(int v){
        this.v=v;
        adjArray=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjArray[i]=new LinkedList();
        }
    }
    
    /**
     * Añade vertices a la lista de adyacencia para los grafos dirigidos
     * @param v Indica el nodo/posicion
     * @param w Valor adyacente al nodo
     */
    void addEdge(int v,int w){
        adjArray[v].add(w); 
    }
    
    /**
     * Añade vertices a la lista de adyacencia para los grafos no dirigidos
     * @param v Indica el nodo/posicion
     * @param w Valor adyacente al nodo
     */
    void addEdge2(int v,int w){
        adjArray[v].add(w); 
        adjArray[w].add(v);
    }
    
    /**
     * Imprime la representacion de la lista de adyacencia, de un grafo no dirigido y dirigido
     * @param graph Manda el grafo a imprimir
     */
    
    void printGraph(Graph graph){
        for(int v=0;v<graph.v;v++){
            System.out.println("Lista de adyacencia del vertice:"+v);
            System.out.println(v);
            for(Integer node: graph.adjArray[v]){
                System.out.print("->"+node);
            }
            System.out.println("\n");
        }
    }
    
    /**
     * Este metodo crea el arreglo donde se guardaran los valores de la lista de adyacencia, por lo que de igual forma se inicializa, y se crea el proceso
     * de la asignacion de los valores correspondientes a la representacion de un grafo dirigido.
     * @param v Es la cantidad de nodos.
     */
    
    void matrizAdyacencia(int v){
        Scanner entrada=new Scanner(System.in);
        v=v+1;
        int[][] arreglo=new int[v][v];
        arreglo[0][0]=0;
        for(int i=0;i<v-1;i++){
            System.out.println("Inserta el valor del nodo["+(i+1)+"]");
            nodo=entrada.nextInt();
            arreglo[0][i+1]=nodo;
            arreglo[i+1][0]=nodo;
        }
        int valores,i=0;
        for(int z=1;z<v;z++){
            System.out.println("Inserta la cantidad de nodos a donde llega el nodo["+z+"]");
            valores=entrada.nextInt();
            i++;
            for(int j=0;j<valores;j++){
                System.out.println("Inserta el valor del nodo a donde llega["+(j+1)+"]");
                nodoDestino=entrada.nextInt();
                for(i=i;i<v;i++){
                    for(int k=1;k<v;k++){
                        if(arreglo[0][k]==nodoDestino){
                            arreglo[i][k]=1;
                            imprimirMatriz(v,arreglo);
                            break;
                        }
                    }
                    break;
                }
            }
        }
       
        imprimirMatriz(v,arreglo);
    }
    
    /**
     * Este metodo se describe solo, pero imprime un arreglo bidimensional.
     * @param v es la cantidad de nodos
     * @param arreglo es el arreglo que se va a imprimir
     */
    
    void imprimirMatriz(int v, int [][] arreglo){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                 System.out.print(arreglo[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
}
