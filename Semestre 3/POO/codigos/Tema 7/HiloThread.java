class NewThread extends Thread {
    NewThread(int cont) {  
        super("Hilo de ejemplo " + cont); 
        System.out.println("Hilo hijo: " + this);
        start(); 
    }   
}

class PruebaHilo { 
    public static void main(String args[]) {  
        try { 
            System.out.println("Main Thread "); 
            Thread.sleep(1000);
            for(int i = 6; i > 0; i--) { 
                new NewThread(i);
            } 
        } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted."); 
        } 
        System.out.println("Main thread exiting.");
    }
    }