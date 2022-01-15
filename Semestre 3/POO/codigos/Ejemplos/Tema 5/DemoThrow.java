public class DemoThrow {
    static void demo(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException npe){
            System.out.println("Excepcion atrapada en el metodo demo()");
            throw npe;
        }
    }
    public static void main(String[] args) {
      try{
        demo();
      }catch(NullPointerException npe){
        System.out.println("Excepcion atrapada de nuevo en main()");
        System.out.println("\t" + npe);
        System.out.println("Mensaje pasado como parametro a la excepción" + npe.getMessage());
      }
    }
}