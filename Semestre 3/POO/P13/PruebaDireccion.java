import java.net.*;
public class PruebaDireccion {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress direccion = InetAddress.getLocalHost();
        /**
        *Al ser un patron de diseño FactoryMethod, no se tiene un constructor, y es por eso 
        *que la creación del objeto direccion, no necesita de uno,
        *si no que se crea a partir de un método de la clase InetAdress
        *llamado getLocalHost, que devolverá como parámetro un objeto de la clase InetAdress
        *que en este caso será la configuración de la red desde donde estamos ejecutando 
        *el código
        */
        System.out.println(direccion);
        /**
        *Se imprime a pantalla la configuración de red 
        */

        direccion = InetAddress.getByName("www.ingenieria.unam.mx");
        /**
        *Se devuelve la dirección de red IP donde está alojada la página de la Facultad de Ingeniería
        */
        System.out.println(direccion);
        /**
        *Se imprime la dirección IP donde se encuentra alojada el servidor que contiene la dirección
        *URL de la facultad
        */

        InetAddress dirLista[] = InetAddress.getAllByName("www.facebook.com");
        /**
        *El método getAllByName, devuelve una arreglo de objetos de la clase InetAdress, los cuales son
        *direcciones IP de los servidores en los que se encuentran alojados los servicios proporcionados
        *por la página www.facebook.com
        */
        for(InetAddress ia : dirLista){
            System.out.println(ia);
        }
        /**
        *Se imprime a pantalla las diferentes direcciones IP en los que se encuentran almacenados
        *los servicios que proporciona Facebook
        */
    }
}