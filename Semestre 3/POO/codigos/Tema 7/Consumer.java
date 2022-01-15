//import java.util.*;

//public class Consumer implements Runnable {  
public class Consumer extends Thread {    
	Producer producer;

    Consumer( Producer producer ) {
            this.producer = producer;
    }

    public void run(  ) {
        while ( true ) {
                System.out.println(this.getName());
            	String message = producer.getMessage(  );
            	System.out.println("Got message: " + message);            
            	try {                
            		Thread.sleep( 2000 );            
            	} catch ( InterruptedException e ) { }
        }    
    }
    
    public static void main(String args[]) {
            Producer producer = new Producer();
            producer.setName("Productor");
            producer.start();
            //new Thread( producer, "Productor" ).start();
            Consumer consumer = new Consumer( producer );
            //new Thread( consumer, "Consumidor 1" ).start();   
            consumer.setName("Consumidor_1");
            consumer.start();
            Consumer consumer2 = new Consumer( producer );
            consumer2.setName("Consumidor_2");
            consumer2.start();
            //new Thread( consumer2, "Consumidor 2" ).start(); 
    } 
}
