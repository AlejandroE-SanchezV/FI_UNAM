import java.util.*;
//public class Producer implements Runnable{    
public class Producer extends Thread{ 
	static final int MAXQUEUE = 5;    
	private List messages = new ArrayList();
	
	public void run() {        
    	while ( true ) {            
    		putMessage();            
    		try {                
    			Thread.sleep( 1000 );            
    		} catch ( InterruptedException e ) { }        
    	}    
    }
    private synchronized void putMessage(  ){ 
        System.out.println(this.getName());       
    	while ( messages.size() >= MAXQUEUE )            
    		try {   
                System.out.println("La cola de mensajes ha excedido el tamaño permitido: " + messages.size());             
    			wait();            
    		} catch( InterruptedException e ) { }
		messages.add( new java.util.Date().toString() );        
		notify();    
    }
    
    public synchronized String getMessage(  ){  
        System.out.println(this.getName());      
    	while ( messages.size() == 0 )            
    		try { 
                System.out.println("La cola de mensajes esta vacia!!!");      
    			notifyAll();                
    			wait();            
    		} catch( InterruptedException e ) { }        
    		String message = (String)messages.remove(0);        
    		notifyAll();        
    		return message;    
    } 
} 