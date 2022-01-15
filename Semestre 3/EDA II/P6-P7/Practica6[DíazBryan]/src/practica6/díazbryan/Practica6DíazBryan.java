package practica6.díazbryan;

import java.util.Scanner;

public class Practica6DíazBryan {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige el modo de implementacion \n1)Listas de adyacencias \n2)Matrices de adyacencia \n3)Primer implementacion");
        int opcion=entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Grafos Dirigidos \nInserta la cantidad de nodos");
                int valor1=entrada.nextInt();
                int nodoDestino,nodo,aristas;
                Graph graph = new Graph(valor1);
        
                for(int i=0;i<valor1;i++){
                    System.out.println("Inserta la cantidad de aristas para el nodo de valor:"+i);
                    aristas=entrada.nextInt();
                    for(int j=0;j<aristas;j++){
                        System.out.println("Inserta el valor del nodo a donde llega["+(j+1)+"]");
                        nodoDestino=entrada.nextInt();
                        graph.addEdge(i,nodoDestino);
                    }
                }
                graph.printGraph(graph);
                break;
                
            case 2:
                System.out.println("Grafos Dirigidos \nInserta la cantidad de nodos");
                int valor2=entrada.nextInt();
                Graph nuevo=new Graph(valor2);
                nuevo.matrizAdyacencia(valor2);
                break;
            
            case 3:
                System.out.println("Default");
                int v=5;
                Graph graph1 = new Graph(v);
                graph1.addEdge2(0, 1);
                graph1.addEdge2(0, 4);
                graph1.addEdge2(1, 2);
                graph1.addEdge2(1, 3);
                graph1.addEdge2(1, 4);
                graph1.addEdge2(2, 3);
                graph1.addEdge2(3, 4);
                graph1.printGraph(graph1);
                break;
                
            default:
                break;
                
        }
    }
}
