class NuevoHilo implements Runnable { 
    String nombre; 
    Thread t;
    NuevoHilo(String nombreHilo) { 
        nombre = nombreHilo; 
        t = new Thread(this, nombre); 
        System.out.println("Nuevo hilo: " + t); 
        t.start(); 
    }

    public void run() { 
        try { 
            for(int i = 5; i > 0; i--) { 
                System.out.println(nombre + ": " + i); 
                Thread.sleep(500); 
            } 
        } catch (InterruptedException e) { 
            System.out.println(nombre + "Interrumpido"); 
        } 
        System.out.println(nombre + " saliendo."); 
    }
}
class MultiThreadDemo { 
    public static void main(String args[]) { 
        new NuevoHilo("Uno"); 
        new NuevoHilo("Dos"); 
        new NuevoHilo("Tres");
        try { // wait for other threads to end 
            Thread.sleep(5000); 
        } catch (InterruptedException e) { 
            System.out.println("Hilo principal interrumpido"); 
        }
        System.out.println("Hilo principal terminado.");
    }
}
            