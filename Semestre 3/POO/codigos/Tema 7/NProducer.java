import java.util.*;
public class NProducer implements Runnable{    
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
    	while ( messages.size() >= MAXQUEUE )            
    		try {                
    			wait();            
    		} catch( InterruptedException e ) { }
		messages.add( new java.util.Date().toString() );        
		notifyAll();    
    }
    
    public synchronized String getMessage(  ){       
    	while ( messages.size() == 0 ){
            System.out.println("La cola de mensajes esta vacia!!!");         
    		try {                
    			notifyAll();                
    			wait();            
    		} catch( InterruptedException e ) { }
        }
        System.out.println("Cantidad de mensajes: " + messages.size());        
		String message = (String)messages.remove(0);        
		notifyAll();        
		return message;    
    } 
} 