class Caja {
    double ancho; 
    double alto; 
    double profundidad;

    /*double ancho; 
    private double alto; 
    private double profundidad;*/ 

// calcula y devuelve el volumen de la caja 
    double volumen() { 
        return ancho * alto * profundidad; 
    } 
// inicializa las dimensiones de la caja
    void setDim(double w, double h, double d) { 
        ancho = w;
        alto = h; 
        profundidad = d;
    }
//constructor
    Caja(){}
    /*Caja(double w, double h, double d) { 
        ancho = w;
        alto = h; 
        profundidad = d;
    }*/
    Caja(double ancho, double alto, double profundidad) { 
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    } 
}

class CajaConPeso extends Caja{
    double peso;

    //CajaConPeso(){}

    CajaConPeso(double w, double h, double d, double p){
        //super(w, h, d); //Esta invocación del metodo constructor de la superclase debe aparecer primero.
        super.alto = h;
        super.ancho = w;
        super.profundidad = d;
        this.peso = p;
    }
}

class PruebaCaja { 
    public static void main(String args[]) { 
        /*Caja miCaja1 = new Caja(); 
        Caja miCaja2 = new Caja();

        //System.out.println(miCaja1.ancho);

        
        
        // inicializar caja
        miCaja1.setDim(10, 20, 15); 
        miCaja2.setDim(3, 6, 9);
        
        Caja miCaja3 = new Caja(10, 20, 30);

        // obtener el volumen de la primera caja 
        vol = miCaja1.volumen(); 
        System.out.println("El volume es " + vol);
        
        // obtener el volumen de la segunda caja 
        vol = miCaja2.volumen(); 
        System.out.println("El volume es " + vol); 

        vol = miCaja3.volumen(); 
        System.out.println("El volume es " + vol);
        */
        double vol;

        CajaConPeso cp = new CajaConPeso(10, 20, 5, 19);
        vol = cp.volumen();
        System.out.println("El volume es " + vol);

        cp.ancho = 2;
        System.out.println("cp.ancho: " + cp.ancho);
    } 
}