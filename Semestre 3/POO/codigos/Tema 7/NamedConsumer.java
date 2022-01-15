public class NamedConsumer implements Runnable {    
	NProducer producer;    
	String name;
    NamedConsumer(String name, NProducer producer) {        
    	this.producer = producer;        
    	this.name = name;    
    }
    public void run(  ) {        
    	while ( true ) {            
			String message = producer.getMessage();            
    		System.out.println(name + " got message: " + message);            
    		try {                
    			Thread.sleep( 2000 );            
    		} catch ( InterruptedException e ) { }        
    	}
    }

    public static void main(String args[]) {        
    	NProducer producer = new NProducer();        
		Thread t = new Thread( producer );
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());

        NamedConsumer consumer = new NamedConsumer( "One", producer );        
        new Thread( consumer ).start();        
        consumer = new NamedConsumer( "Two", producer );        
        new Thread( consumer ).start();    
    } 
}     