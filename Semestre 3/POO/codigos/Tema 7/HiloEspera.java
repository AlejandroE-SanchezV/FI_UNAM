class NuevoHilo implements Runnable { 
    String nombre; 
    Thread t;
    NuevoHilo(String nombreHilo) { 
        nombre = nombreHilo; 
        t = new Thread(this, nombre); 
        System.out.println("Nuevo hilo: " + t); 
        t.start();
    }
    // This is the entry point for thread. 
    public void run() { 
        try { 
            for(int i = 5; i > 0; i--) { 
                System.out.println(nombre + ": " + i); 
                Thread.sleep(1000);
                System.out.println("Hilo " + nombre + " estado: " + t.getState()); 
            } 
        } catch (InterruptedException e) { 
            System.out.println(nombre + " interrumpido."); 
        } 
        System.out.println(nombre + " terminando."); 
    }
}
class DemoJoinAlive { 
    public static void main(String args[]) { 
        NuevoHilo ob1 = new NuevoHilo("Uno"); 
        NuevoHilo ob2 = new NuevoHilo("Dos"); 
        NuevoHilo ob3 = new NuevoHilo("Tres");
        System.out.println("Hilo Uno esta vivo!!: " + ob1.t.isAlive());
        System.out.println("Hilo Uno estado: " + ob1.t.getState()); 
        System.out.println("Hilo Dos esta vivo!!: " + ob2.t.isAlive()); 
        System.out.println("Hilo Dos estado: " + ob2.t.getState());
        System.out.println("Hilo Tres esta vivo!!: " + ob3.t.isAlive());
        System.out.println("Hilo Tres estado: " + ob3.t.getState()); 

        try { 
            System.out.println("Esperando que los hilos terminen."); 
            ob1.t.join(); 
            ob2.t.join(); 
            ob3.t.join(); 
        } catch (InterruptedException e) { 
            System.out.println("Hilo principal interrumpido"); 
        }
        System.out.println("Hilo Uno esta vivo!!: " + ob1.t.isAlive());
        System.out.println("Hilo Uno estado: " + ob1.t.getState());  
        System.out.println("Hilo Dos esta vivo!!: " + ob2.t.isAlive());
        System.out.println("Hilo Dos estado: " + ob2.t.getState());  
        System.out.println("Hilo Tres esta vivo!!: " + ob3.t.isAlive());
        System.out.println("Hilo Tres estado: " + ob3.t.getState()); 
        System.out.println("Hilo principal terminado.");
    }
}
