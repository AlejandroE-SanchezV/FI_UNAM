import java.net.*;
public class PruebaDireccion {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress direccion = InetAddress.getLocalHost();
        System.out.println(direccion);

        direccion = InetAddress.getByName("www.ingenieria.unam.mx");
        System.out.println(direccion);

        InetAddress dirLista[] = InetAddress.getAllByName("www.facebook.com");
        for(InetAddress ia : dirLista){
            System.out.println(ia);
        }
    }
}