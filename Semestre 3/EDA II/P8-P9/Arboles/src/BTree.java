import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BTree{
    int m;
    BNode root;
    
    /**
     * Constructor que indica la cantidad de referencias y las coloca en la clase del nodo, ademas de agregar un nodo a la raiz
     * @param m 
     */
    public BTree( int m ){
        this.m = m;
        root = new BNode();//Indica que es una hoja
        root.setM(m);
    }
    
    /**
     *Se añade una clave al nodo, pero se verifica que esta no se encuentre en el arbol, en caso contrario añade al arbol, mientras la cantidad de
     *referencias lo permitan
     * @param n 
     */
    public void add( int n ){
        if( find(n) ){
            System.out.println("La clave ya existe en el árbol.");
        }
        else{
            BNode hoja = leafNode( root, n ); 
            addToNode( hoja, n);
        }
    }
    
    /**
     * Busca el valor dentro de la lista de keys  y por medio de la lista de nodos se busca por medio de los hijos
     * @param value
     * @return 
     */
    public boolean find(int value){
        if(root.child.isEmpty()==true && root.key.isEmpty()==true){//Verifica en caso de insertar el primer valor
            return false;
        }
        return find(value,root);//Busca el valor en los nodos, ya que el arbol no esta vacio
    }
    /**
     * Va a tomar el valor de la raiz, para comenzar a buscar por medio de la lista de los nodos que constiene la referencia de los hijos 
     * @param v
     * @param n
     * @return 
     */
    private boolean find(int v,BNode n){
        if(n==null){
            return false;
        }
        int i;
        if( n.getKey(0) > v ) //Si el valor del primer padre es mayor, regresa el hijo de la izquierda que es menor y busca de nuevo
            return find(v,n.getChild(0));
        
        for(i=0;i<n.key.size()-1;i++){//Si dentro del nodo se encuentra el valor se regresa un true
            if(n.getKey(i)==v){ 
                return true;
            }
            if(n.getKey(i)<v && n.getKey(i+1)>v){//Si el valor del nodo se encuentra intermedio se regresa el izquierdo que es menor para buscar el nodo
                return find(v,n.getChild(i+1));
            }
        }
        if(n.getKey(i)==v){ //Si el ultimo nodo tiene el valor buscado se regresa un true
            return true;
        }
        else{
            if( n.getKey(i) < v)
                return find(v,n.getChild(i+1));//Envia donde estan los nodes mayores al padre
            else
                return find(v,n.getChild(i));//Envia donde estan los nodos menores al padre
        }
        
    }
    
    /**
     * Se busca el nodo donde se va a insertar el valor
     * @param nodo
     * @param n
     * @return 
     */
    private BNode leafNode( BNode nodo, int n ){
        if( nodo.leaf ){
            return nodo;
        }
        else{
            int i = 0;
            for(; i < nodo.key.size() ; i++ ){//verifica sobre el nodo si el valor es mayor o menor para saber el nodo hijo donde se tendra que buscar 
                if( n < nodo.getKey(i) ){     //donde va el valor
                    i++;
                    break;
                }
            }
            if( n < nodo.getKey(i-1) )//Comprueba la posicion del nodo hijo
                i--;
            
            return leafNode( nodo.getChild(i), n );
            
        }
    }
    /**
     * Agrega un nodo en base a la cantidad de los datos, verificando que la cantidad de la lista sea menor a que se establecio como limite
     * en caso de la hoja este llena lleva a cabo la division
     * @param nodo
     * @param n 
     */
    private void addToNode( BNode nodo, int n ){
        if( nodo.key.size() < m - 1 )  {
            System.out.println("nodo key size:"+nodo.key.size());
            insert( nodo, n );
        }
        else  
            divisionCelular( nodo, n ); //Sobrepasa la cantidad maxima de elementos en los nodos
    }
    
    /**
     * Agrega el valor del nodo en la posicion que le corresponde, en caso del primer valor en la lista, se coloca en la posicion cero, y en los otros
     * casos donde ya existen elementos dentro de la lista se verifica que esten ordenados para asignar la posicion
     * @param nodo
     * @param n 
     */
    private void insert( BNode nodo, int n ){
        int i = 0;
        while( i < nodo.key.size()  && n > nodo.getKey(i) ){
            i++;
        }   
        nodo.key.add(i, n);//Lo agrega en el la lista de las keys que contienen los valores
    }
    
    /**
     * 
     * @param nodo
     * @param n 
     */
    private void divisionCelular( BNode nodo, int n ){
         
        int h = (m-1)/2;    //Indica el minimo de datos que debe contener cada nodo
        if( m % 2 != 0){
            insert(nodo,n); //Para la cantidad de referencias fuera impar en ese caso inserta el nodo, para poder verificar cual sería el termino medio
        }
        int medio = nodo.key.get(h); //Ya teniendo los valores en la misma cantidad para poder verificar el mediano
            
        ArrayList<Integer> key1 = new ArrayList( nodo.key.subList( 0, h ) ); //Crea una sublista de los terminos de la izquierda a la derecha
        ArrayList<Integer> key2 = new ArrayList( nodo.key.subList( h + 1 , 2*h + 1) ); //La otra subparte de la lista original de los valores
        ArrayList<BNode> child1 = new ArrayList(); //Listas para señalar a los hijos
        ArrayList<BNode> child2 = new ArrayList();
        
        if( nodo == root ){ //Primer caso donde el nodo que se va a partir es la raiz
            
            BNode nuevoNodo1 = new BNode(); //Crea dos nuevas hojas para los valores de las sublistas
            BNode nuevoNodo2 = new BNode();
            nuevoNodo1.leaf = nuevoNodo2.leaf = nodo.leaf; //True todos
            
            nuevoNodo1.setKeys(key1);//Coloca las sublistas en los nodos hijos
            nuevoNodo2.setKeys(key2);
            nodo.key.clear();
            nodo.key.add(medio);//Coloca el nuevo padre
            
            if( m % 2 == 0 ){//Se verifica en cual de los nodos hijos se tendra que colocar el valor que no cabía en la hoja\referencias pares
                if( n < medio )
                    insert(nuevoNodo1, n);
                else
                    insert(nuevoNodo2, n);
            }
             
            if( !nodo.leaf ){//Funcion que considera que la raiz se lleno y se va a dividir - intermedio
                if( m % 2 != 0 ){ //Para las referencias que son impares
                    child1 = new ArrayList( nodo.child.subList( 0, h+1 ) );
                    child2 = new ArrayList( nodo.child.subList( h+1, m+1 ) );//Porque se agrega el valor al anterior se colocar (m+1)
                }
                else{// Para las pares
                    if( n < medio ){
                        child1 = new ArrayList( nodo.child.subList( 0, h+2 ) );//Se toma el mas dos por que la division quiebra hacia abajo
                        child2 = new ArrayList( nodo.child.subList( h+2, m+1 ) );
                    }
                    if( n > medio ){
                        child1 = new ArrayList( nodo.child.subList( 0, h+1 ) );
                        child2 = new ArrayList( nodo.child.subList( h+1, m+1 ) );
                    }  
                }
                
                nuevoNodo1.setChildren( child1 );//Se colocan los hijos de los subNodos que surgen de la division de la raiz
                nuevoNodo2.setChildren( child2 );
                for( BNode i : nuevoNodo1.child )//A cada hijo se le coloca su padre
                    i.parent = nuevoNodo1;
                for( BNode i : nuevoNodo2.child )
                    i.parent = nuevoNodo2;
                
            }
            //Para el caso de la raiz del primer nodo se  tendría que pasar directo aca, 
            nodo.child.clear();
            nodo.child.add(nuevoNodo1);//Indica los hijos añadiendolos a la lista que nodos, donde se tienen las referencias a sus hijos
            nodo.child.add(nuevoNodo2);
            nuevoNodo1.parent = nuevoNodo2.parent = root;//Se les indica a los hijos quien es su padre
            nodo.leaf = false; //el nodo ya no es raiz, para la siguiente iteracion
                        
        }
        else{//En caso de que no sea raiz, es decir un nodo intermedio o una hoja
            
            BNode nuevoNodo = new BNode();
            nuevoNodo.leaf = nodo.leaf; //false o true en base a si es hoja o intermedio
            nuevoNodo.parent = nodo.parent;// Se identifica al padre de padres 

            int childIndex = nodo.getChildIndex();//Regresa el valor si encuentra al padre dentro de la lista de nodos
            
            nodo.setKeys(key1);//Se asignan los valoresde las sublistas
            nuevoNodo.setKeys(key2);
            
            if( m % 2 == 0 ){//Se verifica en cual de los nodos hijos se tendra que colocar el valor que no cabía en la hoja\referencias pares
                if( n < medio )
                    insert(nodo, n);
                else
                    insert(nuevoNodo, n);
            }
            
            if( !nodo.leaf ){//Funcion que considera que la no hoja se lleno y se va a dividir
                if( m % 2 != 0 ){
                    child1 = new ArrayList( nodo.child.subList( 0, h+1 ) );
                    child2 = new ArrayList( nodo.child.subList( h+1, m+1 ) );
                }
                else{
                    if( n < medio ){
                        child1 = new ArrayList(nodo.child.subList( 0, h+2 ));
                        child2 = new ArrayList(nodo.child.subList( h+2, m+1 ));
                    }
                    if( n > medio ){
                        child1 = new ArrayList( nodo.child.subList( 0, h+1 ) );
                        child2 = new ArrayList( nodo.child.subList( h+1, m+1 ) );
                    }   
                }
                //Se repite el proceso anterior teniendo en cuenta que se trata de nodos hojas o de nodos intermedios
                nodo.setChildren( child1 );
                nuevoNodo.setChildren( child2 );
                for( BNode i : nodo.child )
                    i.parent = nodo;
                for( BNode i : nuevoNodo.child )
                    i.parent = nuevoNodo;
            } 
            
            //Se toman las consideraciones con respecto a que es un nodo intermedio y el padre necesita estar consciente de su hijo nuevo y del
            nodo.parent.child.add( childIndex + 1, nuevoNodo );
            //Regresa a añadir al padre el valor y si este se llena se repite el proceso
            addToNode( nodo.parent, medio );
            
            
        }
        
    }
    /**
     * Este metodo se implementa para visitar todos los nodos e imprimir el arbol
     */
    public void mostrarArbol(){
        if(root.child.isEmpty()==true && root.key.isEmpty()==true){
            System.out.println("No hay elementos aun");
            return ;
        }
        Queue<BNode> nodos = new LinkedList<>();
        nodos.add(root);
        BNode parent=null;
        while( !nodos.isEmpty() ){
            BNode v = nodos.poll();
            if(v.parent==null){
                System.out.print("Nodo Raiz: ");
            }
            if(parent!=v.parent){
                System.out.print("\n\n\nNodo Padre: ");
                v.parent.mostrarLlaves();
                parent=v.parent;
                System.out.print("\n\t\tNodos:");
            }
            System.out.print("\n\t\t");
            v.mostrarLlaves();
            
            for( int i = 0 ; i < v.child.size() ; i ++ )
                nodos.add( v.child.get(i) );//Agrega todos los nodos hijos, de tal forma que se añaden a la cola y despues se imprimen los valores
        }
        System.out.println("\n");
    }
    
}
