import java.util.LinkedList; 
  
public class ThreadExample { 
    
    
    /**
     * La clase permite que se creen las tareas en el primer hilo creador, y una vez ya no se pueden crear mas, se duerme al creador, y el consumidor
     * se despierta para resolver las tareas y cuando termina con las tareas se vuelve a dormir, para posteriormente despertar al creador y esto se repite
     * hasta el infinito ya que los while externos jamas se rompen, esto es posible por la sincronizacion.
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException { 
        // Object of a class that has both produce() 
        // and consume() methods 
        final PC pc = new PC(); 
  
        // Create producer thread 
        Thread t1 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                try
                { 
                    pc.produce(); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
        //La implementacon de la creacion del hilo, es algo que nunca habia visto, pero parece que se define por completo el hilo dentro de
        //la creacion del objeto
  
        // Create consumer thread 
        Thread t2 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                try
                { 
                    pc.consume(); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Start both threads 
        t1.start(); 
        t2.start(); 
  
        // t1 finishes before t2 
        t1.join(); 
        t2.join(); 
    } 
  
    // This class has a list, producer (adds items to list 
    // and consumber (removes items). 
    public static class PC 
    { 
        // Create a list shared by producer and consumer 
        // Size of list is 2. 
        LinkedList<Integer> list = new LinkedList<>(); 
        int capacity = 2; 
  
        // Function called by producer thread 
        public void produce() throws InterruptedException 
        { 
            int value = 0; 
            int termino=0;
            while (true) 
            { 
                
                synchronized (this) 
                { 
                    // producer thread waits while list 
                    // is full 
                    while (list.size()==capacity) 
                        wait(); //En la primer iteracion llena con dos elementos, despues manda la notificacion al hilo de consumir las tareas
  
                    System.out.println("Producer produced-"
                                                  + value); 
  
                    // to insert the jobs in the list 
                    list.add(value++); 
  
                    // notifies the consumer thread that 
                    // now it can start consuming 
                    notify(); 
                    termino++;
                    // makes the working of program easier 
                    // to  understand 
                    Thread.sleep(1000); 
                    if(termino==10){
                        break;
                    }
                }
            } 
        } 
  
        // Function called by consumer thread 
        public void consume() throws InterruptedException 
        { 
            int termino=0;
            while (true) 
            { 
               
                synchronized (this) 
                { 
                    // consumer thread waits while list 
                    // is empty 
                    while (list.size()==0) 
                        wait(); 
  
                    //to retrive the ifrst job in the list 
                    int val = list.removeFirst(); 
  
                    System.out.println("Consumer consumed-"
                                                    + val); 
  
                    // Wake up producer thread 
                    notify(); 
                    termino++;
                    // and sleep 
                    Thread.sleep(1000); 
                    if(termino==10){
                        break;
                    }
                } 
            } 
        } 
    } 
} 