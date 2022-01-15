class MiExcepcion extends Exception {
    
    private String detalle;

    MiExcepcion(String msg) {
        super(msg);
        //detalle = msg;
    }

    MiExcepcion(int a) {
        //this(String.valueOf(a));
        detalle = String.valueOf(a);
    }

    public String toString() {
        return "MiExcepcion[" + detalle + "]";
    }
}
    
class DemoExcepcion {
    static void metodo(int a) throws MiExcepcion {
        System.out.println("Ejecutando metodo(" + a + ")");
        if(a > 10)
            //throw new MiExcepcion(String.valueOf(a));
            throw new MiExcepcion(a);
        System.out.println("Salida normal");
    }
    public static void main(String args[]) {
        try {
            metodo(1);
            metodo(20);
        } catch (MiExcepcion e) {
            System.out.println("MiExcepcion atrapada " + e);
        }
    }
}