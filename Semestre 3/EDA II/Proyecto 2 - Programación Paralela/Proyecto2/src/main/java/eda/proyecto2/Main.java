package eda.proyecto2;

public class Main {

    public static void main(String[] args) {
        int numThreads = 2;
        Thread[] threads = new Thread[numThreads];
        int imgThread = 2;
        String nombreArchivo = "2threads_2img";
        int contador = 1;
        int resolucion = 10000;
        int resbackup = resolucion;
        int resAum = 50000;
        //Centro de la imagen
        double CentroX = 0.36;
        double CentroY = -0.645;
        int maxIteraciones = 1000;
        
       //Inicio contador tiempo 
        long inicio = System.currentTimeMillis(); 
        
        Colores color = new Colores(maxIteraciones); 

        for (int a = 0; a < numThreads; a++) {
            //Crea un arreglo para cada hilo
            Parametros[] par = new Parametros[imgThread];
            for (int b = 0; b < imgThread; b++) {
                //Crea el parámetro y se lo asigna al lugar en el arreglo
                par[b] = new Parametros(nombreArchivo + String.valueOf(contador),
                        resolucion, CentroX, CentroY);
                contador++;
                resolucion += resAum;
            }
            //Crea un nuevo hilo con el arreglo como parámetro
            threads[a] = new Thread(new Renderizado(par, color,
                    maxIteraciones));
        }
        
        //start para iniciar
        for (Thread t : threads) {
            t.start();
        }

        //join para acabar
        for (Thread t : threads) {
            try {
                t.join();
            }
            catch (InterruptedException e) {}
        }
        
        long fin = System.currentTimeMillis(); 
        System.out.println("N. threads: "+numThreads+"\t Imgs por thread: "+ imgThread);
        System.out.println("Resolución inicial: "+resbackup+" resAum: "+resAum);
        System.out.println("Máximo de iteraciones: "+maxIteraciones);
        System.out.println("Inicio: "+inicio+"\nFin: "+ fin+"\nTiempo: "+(fin-inicio));
    }

}