import java.util.ArrayList;

public class BNode {
    static int m; //Numero de las referencias
    ArrayList<Integer> key; //Guarda los valores de cada nodo 
    ArrayList<BNode> child; //Guarda la referencia de los nodos hijos, en el caso de la raiz, sin hijos este atributo no tiene nada
    BNode parent; //Padre del nodo - para poder insertar y eliminar
    boolean leaf; //Indica si es una hoja
    
    /**
     * Metodo constructor del nodo por default
     */
    public BNode() {
        key = new ArrayList();
        child = new ArrayList();
        leaf = true;
        parent = null;
    }
    
    /**
     * Metodo que regresa el valor que se encuantra en la posicion que se indica
     * @param i
     * @return 
     */
    public int getKey( int i ){
        return this.key.get(i);
    }
    
    /**
     * Regresa el hijo del nodo en la posicion que se indica
     * @param i
     * @return 
     */
    public BNode getChild( int i ){
        try{
            this.child.get(i);
        }catch(Exception e){
            return null;
        }
        return this.child.get(i);
    }
    
    /**
     * Coloca el valor de las referencias
     * @param m 
     */
    public void setM( int m ){
        this.m = m;
    }
    
    /**
     * Recibe la sublista para colocarla como el nodo hoja
     * @param list 
     */
    public void setKeys( ArrayList<Integer> list ){
        this.key = list;
    }
    
    /**
     * Coloca la lista con un hijo
     * @param list 
     */
    public void setChildren( ArrayList<BNode> list  ){
        this.child = list;
    }
    
    /**
     * Indica si el nodo tiene padres o no, y considerando el nodo que se envia, tendría que tener un padre, de acuerdo a lo que estuve viendo,
     * pero no se niega la posiblidad de que no se tenga uno
     * @return 
     */
    public int getChildIndex(){
        if( parent == null ){
            return -1;
        }
        else{
            BNode padre = parent;
            for( int i = 0 ; i < padre.child.size() ; i++ ){
                if( padre.child.get(i) == this )
                    return i;
            }     
            return -1;
        }
    }
    
    /**
     * Muestra los valores que se tengan en el nodo que llama el metodo y en la lista de valores
     */
    public void mostrarLlaves(){
        for( int i = 0 ; i < key.size() ; i++ )
            System.out.print( key.get(i) + " " );
    }
   
    
    
    
}
