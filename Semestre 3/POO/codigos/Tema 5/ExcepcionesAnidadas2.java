
class ExcepcionesAnidadas2 {
    static void metodoConTry(int a) {
        try {
            if(a==1) a = a/(a-a);
            if(a==2) {
                int c[] = { 1 };
                c[42] = 99;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice de arreglo fuera de rango: " + e);
        }
    }
    public static void main(String args[]) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            metodoConTry(a);
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}