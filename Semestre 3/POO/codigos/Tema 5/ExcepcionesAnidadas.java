class ExcepcionesAnidadas {
    public static void main(String args[]) {
        try {
            int a = args.length;
            try {
                int b = 42 / a;
                System.out.println("a = " + a); 
                if(a==1) a = a/(a-a); 
                if(a==2) {
                    int c[] = { 1 };
                    c[42] = 99;
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice de arreglo fuera de rango: " + e);
            }
        } catch(ArithmeticException e) {
            System.out.println("Division entre 0: " + e);
        }
    }
}