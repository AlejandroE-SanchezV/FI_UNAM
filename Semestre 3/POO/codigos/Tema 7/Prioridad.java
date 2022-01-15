class Clicker implements Runnable { 
    long click; 
    Thread t; 
    //volatile se utiliza para garantizar que la variable
    //ejecutando sea evaluada en cada ejecución del ciclo
    private volatile boolean ejecutando = true;
    public Clicker(int p) { 
        t = new Thread(this); 
        t.setPriority(p); 
    }
    public void run() { 
        while (ejecutando) { 
            click++; 
        } 
    }
    public void stop() { 
        ejecutando = false; 
    }
    public void start() { 
        t.start(); 
    }
}
class HiLoPri { 
    public static void main(String args[]) { 
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY); 
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2); 
        //Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
        Clicker norm = new Clicker(Thread.NORM_PRIORITY);
        Clicker max = new Clicker(Thread.MAX_PRIORITY);
        Clicker min = new Clicker(Thread.MIN_PRIORITY);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);

        System.out.println("Prioridad de max: " + max.t.getPriority());
        System.out.println("Prioridad de hi: " + hi.t.getPriority());
        System.out.println("Prioridad de norm: " + norm.t.getPriority());
        System.out.println("Prioridad de lo: " + lo.t.getPriority());
        System.out.println("Prioridad de min: " + min.t.getPriority());

        lo.start(); 
        hi.start(); 
        norm.start();
        max.start();
        min.start();
        try { 
            Thread.sleep(10000); 
        } catch (InterruptedException e) { 
            System.out.println("Hilo principal interrumpido."); 
        }
        lo.stop(); 
        hi.stop();
        norm.stop();
        max.stop();
        min.stop();

        try { 
            hi.t.join(); 
            lo.t.join(); 
            norm.t.join();
            max.t.join();
            min.t.join();
        } catch (InterruptedException e) { 
            System.out.println("InterruptedException atrapada"); 
        }
        System.out.println("Hilo de minima prioridad: " + min.click);
        System.out.println("Hilo de baja prioridad: " + lo.click);
        System.out.println("Hilo de prioridad normal: " + norm.click); 
        System.out.println("Hilo de alta prioridad: " + hi.click);
        System.out.println("Hilo de mas alta prioridad: " + max.click);
    }
}