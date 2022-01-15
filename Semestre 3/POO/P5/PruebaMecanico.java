import java.util.Scanner;
import java.util.Random;
/**
 * Modelado y mantenimiento de un automóvil 
 * Autores:
 * Dávila Ortega Jesús Eduardo - No. Cuenta: 317199860
 * Díaz Hernández Marcos Bryan - No. Cuenta: 317027253
 * Pareja Avila Emiliano - No. Cuenta: 317081345
 * Vazquez Zavala Oliver Alexis - No. Cuenta: 317202263
 */

/**
 * Clase principal donde se realiza la prueba de un objeto de la clase Mecanico que interactua con un objeto de la clase Auto.
 */
public class PruebaMecanico {
    /**
     * Método main en el cual se despliega un menú con las opciones para que el usuario seleccione entre
     * ir de paseo en el auto, llevar el auto al mecánico o imprimir el estado del auto.
     */
    public static void main(String args[]){
        Auto auto = new Auto();
        auto.inicializar();
        Mecanico mec = new Mecanico();
        int opc;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("***Menu Auto***\n1)Ir de paseo en auto\n2)Llevar el auto al mecanico\n3)Imprimir el estado del auto\n4)Salir");
            opc=sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Run Run Run");
                    auto.setcomp(auto.getcomp()-1);
                    auto.setllantas(auto.getllantas()-5);
                    auto.motor.setcilindros(auto.motor.getcilindros()-5);
                    auto.motor.setengranajes(auto.motor.getengranajes()-5);
                    auto.motor.setvalvulas(auto.motor.getvalvulas()-5);
                    auto.motor.setculata(auto.motor.getculata()-2);
                    auto.frenado.setbalatas(auto.frenado.getbalatas()-3);
                    auto.frenado.setbirlos(auto.frenado.getbirlos()-2);
                    auto.frenado.setlineas(auto.frenado.getlineas()-2);
                    auto.frenado.setresortes(auto.frenado.getresortes()-3);
                    break;
                case 2:
                    mec.reparar(auto);
                    break;
                case 3:
                    auto.imprimirestadoauto();
                    break;
            }
        }while(opc>0&&opc<=3);
    }
    
    
}
/**
 * Clase Mecanico que interactua con un objeto de la clase Auto,
 * revisando su motor, sistema de frenado, llantas y la computadora del auto.
 */
class Mecanico{
    void reparar(Auto auto){
        System.out.println("Hola, gracias por venir al taller, vamos a revisar tu auto\nRevisando el motor del auto");
        analisismotor(auto);
        System.out.println("Revisando el sistema de frenado del auto");
        analisisfrenado(auto);
        System.out.println("Revisando las llantas del auto");
        analisisllantas(auto);
        System.out.println("Revisando computadora del carro");
        analisiscomp(auto);
        System.out.println("Revisión y reparación terminada, Vuelva pronto");
    }
    /**
     * Método de la clase Mecanico para analizar el estado del motor, revisando cilindros, valvulas, engranajes
     * y la culata del motor del automovil.
     * @param auto Automóvil a examinar motor.
     */
    void analisismotor(Auto auto){
        if(auto.motor.getcilindros()<65){
            System.out.println("Fallas en los cilindros del motor\nReparando los cilindros del motor");
            auto.motor.setcilindros(100);
        }
        else
            System.out.println("Cilindros del motor en buen estado");
        if(auto.motor.getvalvulas()<65){
            System.out.println("Fallas en las valvulas del motor\nReparando las valvulas del motor");
            auto.motor.setvalvulas(100);
        }
        else
            System.out.println("Valvulas del motor en buen estado");
        if(auto.motor.getengranajes()<65){
            System.out.println("Fallas en los engranajes del motor\nReparando los engranajes del motor");
            auto.motor.setengranajes(100);
        }
        else
            System.out.println("Engranajes del motor en buen estado");
        if(auto.motor.getculata()<65){
            System.out.println("Fallas en la culata del motor\nReparando la culata del motor");
            auto.motor.setculata(100);
        }
        else
            System.out.println("Culata del motor en buen estado");
    }
    /**
     * Método de la clase Mecanico para el analisis del sistema de frenado, revisando las balatas, birlos, lineas
     * y resortes del sistema de frenado del automovil.
     * @param auto Automóvil a examinar sistema de frenado.
     */
    void analisisfrenado(Auto auto){
        if(auto.frenado.getbalatas()<65){
            System.out.println("Fallas en las balatas del sistema de frenado\nReparando las balatas del sistema de frenado");
            auto.frenado.setbalatas(100);
        }
        else
            System.out.println("Balatas del sistema de frenado en buen estado");
        if(auto.frenado.getbirlos()<65){
            System.out.println("Fallas en los birlos del sistema de frenado\nReparando los birlos del sistema de frenado");
            auto.frenado.setbirlos(100);
        }
        else
            System.out.println("Birlos del sistema de frenado en buen estado");
        if(auto.frenado.getlineas()<65){
            System.out.println("Fallas en las lineas del sistema de frenado\nReparando las lineas del sistema de frenado");
            auto.frenado.setlineas(100);
        }
        else
            System.out.println("Lineas del sistema de frenado en buen estado");
        if(auto.frenado.getresortes()<65){
            System.out.println("Fallas en los resortes del sistema de frenado\nReparando los resortes del sistema de frenado");
            auto.frenado.setresortes(100);
        }
        else
            System.out.println("Resortes del sistema de frenado en buen estado");
    }
    /**
     * Método de la clase Mecanico para el analisis de la computadora del auto.
     * @param auto Automóvil a examinar computadora.
     */
    void analisiscomp(Auto auto){
        if(auto.getcomp()<65){
            System.out.println("Fallas en la computadora del carro\nReparando la computadora del carro");
            auto.setcomp(100);
        }
        else
            System.out.println("Computadora en buen estado");
    }
    /**
     * Método de la clase Mecanico para el analisis de las llantas del automovil
     * @param auto Automóvil a examinar sus llantas.  
     */
    void analisisllantas(Auto auto){
        if(auto.getllantas()<65){
            System.out.println("Las llantas del carro están en muy mal estado\nCambiando las llantas");
            auto.setllantas(100);
        }
        else
            System.out.println("Llantas en buen estado");
    }
}
/**
 * Clase Auto para modelar un automóvil como un objeto compuesto por motor, un sistema de frenado, 
 * llantas y una computadora. 
 */
class Auto{
    Motor motor=new Motor();
    Sfrenado frenado=new Sfrenado();
    private static int estadollantas;
    private static int estadocomp;
    /**
     * Método setter para el estado de las llantas del automóvil
     * @param estadollantas indica el estado de las llantas del automóvil
     */
    void setllantas(int estadollantas){
        this.estadollantas=estadollantas;
    }
    /**
     * Método setter para el estado de la computadora del automóvil
     * @param estadocomp indica el estado de la computadora del automóvil.
     */
    void setcomp(int estadocomp){
        this.estadocomp=estadocomp;
    }
    /**
     * Método getter para el estado de las llantas del automóvil
     */
    int getllantas(){
        return estadollantas;
    }
    /**
     * Método getter para el estado de la computadora del automóvil
     */
    int getcomp(){
        return estadocomp;
    }
    /**
     * Método para inicializar los valores de la clase Auto y las clases
     * compuestas Motor y Sfrenado.
     */
    void inicializar(){
        Random r = new Random();
        setcomp(r.nextInt(100));
        setllantas(r.nextInt(100));
        motor.setcilindros(r.nextInt(100));
        motor.setculata(r.nextInt(100));
        motor.setengranajes(r.nextInt(100));
        motor.setvalvulas(r.nextInt(100));
        frenado.setbalatas(r.nextInt(100));
        frenado.setbirlos(r.nextInt(100));
        frenado.setlineas(r.nextInt(100));
        frenado.setresortes(r.nextInt(100));
    }
    /**
     * Método para mostrar el estado actual del automóvil.
     */
    void imprimirestadoauto(){
        System.out.println("Estado Motor del auto: \nValvulas: " + motor.getvalvulas() + "\nEngranajes: " +motor.getengranajes() + "\nCilindros: " + motor.getcilindros() + "\nCulata: " +motor.getculata());
        System.out.println("Estado Sistema de Frenado del auto: \nBalatas "+frenado.getbalatas()+"\nBirlos: "+frenado.getbirlos()+"\nLineas: "+frenado.getlineas()+"\nResortes: "+frenado.getresortes());
        System.out.println("Estado Llantas del auto: " + getllantas());
        System.out.println("Estado de la computadora del auto: "+getcomp());
    }
}
/**
 * Clase Motor encargada de modelar el motor del automóvil.
 */
class Motor{
    private int estadovalvulas;
    private int estadoengranajes;
    private int estadocilindros;
    private int estadoculata;
    /**
     * Método setter para el estado de las valvulas del motor
     * @param estadovalvulas indica el estado de las valvulas del motor.
     */
    void setvalvulas(int estadovalvulas){
        this.estadovalvulas=estadovalvulas;
    }
    /**
     * Método setter para el estado de los engranajes del motor
     * @param estadoengranajes indica el estado de los engranajes del motor.
     */
    void setengranajes(int estadoengranajes){
        this.estadoengranajes=estadoengranajes;
    }
    /**
     * Método setter para el estado de los cilindros del motor
     * @param estadocilindros indica el estado de los cilindros del motor.
     */
    void setcilindros(int estadocilindros){
        this.estadocilindros=estadocilindros;
    }
    /**
     * Método setter para el estado de la culata del motor
     * @param estadoculata indica el estado de la culata del motor.
     */
    void setculata(int estadoculata){
        this.estadoculata=estadoculata;
    }
    /**
     * Método getter para el estado de las valvulas del motor.
     */
    int getvalvulas(){
        return estadovalvulas;
    }
    /**
     * Método getter para el estado de los engranajes del motor.
     */
    int getengranajes(){
        return estadoengranajes;
    }
    /**
     * Método getter para el estado de los cilindros del motor.
     */
    int getcilindros(){
        return estadocilindros;
    }
    /**
     * Método getter para el estado de la culata del motor.
     */
    int getculata(){
        return estadoculata;
    }
    
}
/**
 * Clase Motor encargada de modelar el sistema de frenado del automóvil.
 */
class Sfrenado{
    private int estadolineas;
    private int estadobirlos;
    private int estadobalatas;
    private int estadoresortes;
    /**
     * Método setter para el estado de las lineas del sistema de frenado
     * @param estadolineas indica el estado de las lineas del sistema de frenado.
     */
    void setlineas(int estadolineas){
        this.estadolineas=estadolineas;
    }
    /**
     * Método setter para el estado de los birlos del sistema de frenado
     * @param estadobirlos Recibe el estado de los birlos del sistema de frenado.
     */
    void setbirlos(int estadobirlos){
        this.estadobirlos=estadobirlos;
    }
    /**
     * Método setter para el estado de las balatas del sistema de frenado
     * @param estadobalatas Recibe el estado de de las balatas del sistema de frenado.
     */
    void setbalatas(int estadobalatas){
        this.estadobalatas=estadobalatas;
    }
    /**
     * Método setter para el estado los resortes del sistema de frenado
     * @param estadoresortes Recibe el estado de de las balatas del sistema de frenado.
     */
    void setresortes(int estadoresortes){
        this.estadoresortes=estadoresortes;
    }
    /**
     * Método getter para el estado de las lineas del sistema de frenado.
     */
    int getlineas(){
       return estadolineas; 
    }
    /**
     * Método getter para el estado los birlos del sistema de frenado.
     */
    int getbirlos(){
       return estadobirlos; 
    }
    /**
     * Método getter para el estado las balatas del sistema de frenado.
     */
    int getbalatas(){
       return estadobalatas; 
    }
    /**
     * Método getter para el estado los resortes del sistema de frenado.
     */
    int getresortes(){
       return estadoresortes; 
    }
    
}