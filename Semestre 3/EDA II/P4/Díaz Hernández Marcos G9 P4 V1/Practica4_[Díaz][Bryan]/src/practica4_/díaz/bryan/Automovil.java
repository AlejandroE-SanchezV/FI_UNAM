
package practica4_.díaz.bryan;

public class Automovil {
    int placa;
    String nombre;
    int modelo;
    String encendido;
    
    public Automovil(int placa, String nombre,int modelo, String encendido){
        this.placa=placa;
        this.nombre=nombre;
        this.modelo=modelo;
        this.encendido=encendido;
    }
    
    void cambiodeplaca(){
        System.out.println("A su auto se le modificaran las placas por el cambio de modelo");
        placa=12323421;
        nombre="Nissan 2020";
        modelo=23;
    }
    
    void pruebasestado(){
        System.out.println("Su automovil tiene las siguientes caracteristicas");
        encendido="si";
        placa=3434132;
        modelo=23;
        System.out.println("El estado es el siguiente:"+encendido+"placa:"+placa+"modelo:"+modelo);
    } 
    
    public String toString(){
        return "modelo:"+modelo+" nombre:"+nombre+" placa:"+placa+" encendido:"+encendido;
    }
}
