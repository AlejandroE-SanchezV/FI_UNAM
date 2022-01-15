
import java.util.Scanner;

public class Pruebas {
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        ArbolBin arbol;
        ArbolBin arbolNewA = null;
        ArbolBinBusq arbolB;
        int contador=0;
        int opcionA;
        do{
            System.out.println("Inserta con que tipo de arbol quieres trabajar: \n1)Arboles \n2)Arboles Binarios de busqueda \n3)Arboles B \n4)Expresion \n5)Salir ");
            opcionA=entrada.nextInt();
            switch(opcionA){
                case 1:
                    int opcionZ;
                    arbol = new ArbolBin();
                    do{
                        System.out.println("Inserta las opciones para tu arbol: \n1)Agregar Nodo \n2)Eliminar nodo \n3)Imprimir Arbol");
                        System.out.println("4)Notacion Prefija \n5)Notacion Inorden \n6)Notacion Postfija \n7)Salir");
                        opcionZ=entrada.nextInt();
                        
                        switch(opcionZ){
                            case 1:
                                System.out.println("Inserta el valor del nodo:");
                                int dato = entrada.nextInt();
                                Nodo colocar =arbol.agregarNodo(dato);
                                if(colocar==null){
                                    break;
                                }else{
                                    System.out.println("Insertar: \n0)Izquierda \n1)Derecha ");
                                    System.out.println("VALOR DEL PADRE:"+colocar.valor);
                                    int ladoB=entrada.nextInt();
                                    if(ladoB==0){
                                        Nodo nodoB= new Nodo(dato,colocar,'a');
                                        arbol.add(colocar,nodoB,ladoB);
                                    }
                                    if(ladoB==1){
                                        Nodo nodoB= new Nodo(dato,colocar,'a');
                                        arbol.add(colocar,nodoB,ladoB);
                                    }
                                }    
                                break;
                                       
                            case 2:
                                System.out.println("Inserta el valor de nodo a eliminar:");
                                int valorE=entrada.nextInt();
                                arbolNewA =arbol.eliminacionNodo(valorE);
                                contador+=1;
                                break;
                                       
                            case 3:
                                if(contador>0){
                                    System.out.println("Imprime tras eliminar");
                                    arbolNewA.breadthFrist();
                                }else{
                                    System.out.println("Imprime antes de eliminar");
                                    arbol.breadthFrist();
                                }
                                break;
                                       
                            case 4:
                                if(contador>0){
                                    arbolNewA.preOrden(arbolNewA.root);
                                }else{
                                    arbol.preOrden(arbol.root);
                                }
                                break;
                                       
                            case 5:
                                if(contador>0){
                                    arbolNewA.inOrden(arbolNewA.root);
                                }else{
                                    
                                    arbol.inOrden(arbol.root);
                                }
                                break;
                                       
                            case 6:
                                if(contador>0){
                                    arbolNewA.postOrden(arbolNewA.root);
                                }else{
                                    arbol.postOrden(arbol.root);
                                }
                                break;
                                       
                            default:
                                opcionZ=7;
                                break;
                               } 
                    }while(opcionZ<7);
                        break;
                        
                case 2:
                    arbolB = new ArbolBinBusq();
                    System.out.println("Arbol:Binario de busqueda");
                    int opcionX=0;
                    do{
                        System.out.println("Inserta las opciones para tu arbol: \n1)Agregar Nodo \n2)Eliminar nodo \n3)Buscar");
                        System.out.println("4)Imprimir BFS \n5)Salir");
                        opcionX=entrada.nextInt();
                        switch(opcionX){
                            case 1:
                                System.out.println("Inserta el valor del nodo:");
                                int valor = entrada.nextInt();
                                arbolB.agregarNodoBusq(valor);
                                break;
                                
                            case 2:
                                System.out.println("Inserta el valor del nodo:");
                                int eliminar = entrada.nextInt();
                                arbolB.eliminarNodo(eliminar);
                                break;
                                
                            case 3:
                                System.out.println("Inserta el valor del nodo:");
                                int buscar = entrada.nextInt();
                                int regreso = arbolB.buscarNodo(buscar);
                                if(regreso==0){
                                   System.out.println("El valor no existe en el arbol"); 
                                }else{
                                   System.out.println("El valor existe en el arbol"); 
                                }
                                break;
                                
                            case 4:
                                System.out.println("Arbol");
                                arbolB.breadthFrist();
                                break;
                                
                            default:
                                opcionX=5;
                        }
                    }while(opcionX<5);
                    
                    break;
                    
                case 3:
                    BTree arbolBN=null;
                    int opcionM;
                    do{
                        System.out.println("Inserta las opciones para tu arbol: \n1)Crear \n2)Agregar Nodo \n3)Buscar \n4)Imprimir Arbol");
                        System.out.println("5)Salir");
                        opcionM=entrada.nextInt();
                        switch(opcionM){
                            case 1:
                                System.out.println("Inserta la cantidad de referencias:");
                                int refer = entrada.nextInt();
                                arbolBN = new BTree(refer);
                                break;
                                
                            case 2:
                                System.out.println("Inserta el valor:");
                                int insert = entrada.nextInt();
                                arbolBN.add(insert);
                                break;
                                
                            case 3:
                                System.out.println("Inserta el valor del nodo a buscar");
                                int busca = entrada.nextInt();
                                boolean regreso = arbolBN.find(busca);
                                if(regreso){
                                   System.out.println("El valor si se encuentra del del arbol"); 
                                }else{
                                   System.out.println("El valor no se encuentra en del arbol"); 
                                }
                                break;
                                
                            case 4:
                                System.out.println("Imprime el arbol");
                                arbolBN.mostrarArbol();
                                break;
                                
                            default:
                                opcionM=5;
                                break;
                        }
                    }while(opcionM<5);
                    break;
                    
                case 4:
                    ArbolBinExp exp = new ArbolBinExp();
                    int opcionE;
                    do{
                        System.out.println("Inserta las opciones para tu arbol: \n1)Agregar \n2)Salir");
                        opcionE=entrada.nextInt();
                        switch(opcionE){
                            case 1:
                                System.out.println("Inserta la cantidad de caracteres de tu operacion:");
                                String entradaA = entrada.next();
                                
                                break;
                                
                            default:
                                opcionE=2;
                                break;
                        }
                    }while(opcionE<2);
                    break;
                    
                default:
                    opcionA=5;
                    break;
                
            }
        }while(opcionA<5);    
    }
}
