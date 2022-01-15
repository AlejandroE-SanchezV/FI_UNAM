
import java.util.*;

public class ArbolBinExp extends ArbolBin{
    static int contador=0;
    public ArbolBinExp(){
        super();
    }
    
    public ArbolBinExp(int val,char operacion){
        super(val, operacion);
    }
    
    public ArbolBinExp(Nodo root){
        super(root);
    }
} 
