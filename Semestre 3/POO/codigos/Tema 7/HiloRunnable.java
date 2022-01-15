class NewThread implements Runnable { 
    Thread t;
    NewThread(int cont) {  
        t = new Thread(this, "Hilo de ejemplo " + cont); 
        t.start(); 
    }
 
    public void run(){
        System.out.println("Hilo hijo: " + t);
    }

}
class ThreadDemo { 
    public static void main(String args[]) { 
        //new NewThread(); 
        try { 
            System.out.println("Hilo principal"); 
            for(int i = 5; i > 0; i--) { 
                new NewThread(i); 
                Thread.sleep(1000); 
            } 
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido.");
        } 
        System.out.println("Finalizando hilo principal.");
    }
}  
    