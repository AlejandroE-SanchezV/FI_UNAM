package elementosEnVenta;

/**
*Se añade la calse Catalogo al paquete de ElementosEnVenta en la cual se tendran como miembros a los distintos productos que se pueden vender, estos como arreglos
*y posteriormente se creal el metodo, catalogo que invoca a los metodos de impresion de los productos, donde la impresion, es por medio de un for que 
*recorre la el arreglo y lo va imprimiendo, al mismo tiempo se definen los objetos de cada clase, celular, tv, bebida, playera, cada uno de los productos
*se inicializa. Ademas se manda a llamar el toString, que es sobreescrito en cada clase. 
*/

import elementosEnVenta.electronicos.*;
import elementosEnVenta.alimentos.*;
import elementosEnVenta.prendasDeVestir.*;

public class Catalogo{
    Celular celulares[] = new Celular[3];
    Computadora computadoras[] = new Computadora[3];
    TV televisiones[] = new TV[3];
    CorteDeCarne cortes[] = new CorteDeCarne[3];
    Fruta frutas[] = new Fruta[3];
    Bebida bebidas[] = new Bebida[3];
    Pantalon pantalones[] = new Pantalon[3];
    Playera playeras[] = new Playera[3];
    Calzado calzados[] = new Calzado[3];

    /**
    *Se invocan los metodos de impresion de los datos de cada producto.
    */
    
    public Catalogo(){
        celularesIniciales();
        computadorasIniciales();
        televisionesIniciales();
        cortesIniciales();
        frutasIniciales();
        bebidasIniciales();
        pantalonesIniciales();
        playerasIniciales();
        calzadosIniciales();
    }
    /**
    *Se crean los objetos de cada clase, tipo de producto, y se inicializan por medio del constructor.
    */
    
    private void celularesIniciales(){
        celulares[0] = new Celular(2769.00,"Negro","A01","Samsung",6.2,2,13,4000.00,"Android");
        celulares[1] = new Celular(4599.00,"Azul","Mate 20","Huawei",6.3,4,24,370,"Android");
        celulares[2] = new Celular(4199.00,"Gris","Redmi Note 9","Xiaomi",6.53,4,30,520,"Android");
    }

    /**
    *Se crea la impresion del tipo de producto por medio de un for, y por medio del toString, que esta modificado en la clase correspondiente al producto
    */

    public void celularesDisponibles(){
        int i=1;
        for (Celular producto:celulares){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void computadorasIniciales(){
        computadoras[0] = new Computadora(30000.00,"Plata","SF514-54T-72XL","HP",14,"Laptop",8,1000,"Intel Core i7","Windows");
        computadoras[1] = new Computadora(29999,"Gris espacial","MacBook Pro 13","Apple",13,"Portatil",8,256,"Core i5","macOS");
        computadoras[2] = new Computadora(13399,"Negro","A340","Lenovo",21.5,"Computadora de escritorio",4,1000,"Core i3","Windows");
    }

    public void computadorasDisponibles(){
        int i=1;
        for (Computadora producto:computadoras){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void televisionesIniciales(){
        televisiones[0] = new TV(13500.00,"Negro","TV-MEX","TCL",65,"Smart TV","4K","LED");
        televisiones[1] = new TV(15000.00,"Arena","TV-Thin Q","LG",65,"Smart TV","Ultra 4k","QLED");
        televisiones[2] = new TV(16000.00,"Plata","TV-ADT","Hisense",70,"Smart TV","Ultra 4k","LED");
    }

    public void televisionesDisponibles(){
        int i=1;
        for (TV producto:televisiones){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void cortesIniciales(){
        cortes[0] = new CorteDeCarne(209.00,"Congelado",1,200,"T-Bone","Res");
        cortes[1] = new CorteDeCarne(124.00,"Refrigeracion",4,80.5,"Filete","Pollo");
        cortes[2] = new CorteDeCarne(280.00,"Congelado",8,55.0,"Hamburguesa","Res");
    }

    public void cortesDisponibles(){
        int i=1;
        for (CorteDeCarne producto:cortes){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void frutasIniciales(){
        frutas[0] = new Fruta(40,"Lugar fresco y seco",6,"Platano",80,"Mexico");
        frutas[1] = new Fruta(50,"Lugar freso y seco",1,"Sandia",485,"EUA");
        frutas[2] = new Fruta(45,"Lugar fresco y seco",8,"Naranja",60,"Mexico");
    }

    public void frutasDisponibles(){
        int i=1;
        for (Fruta producto:frutas){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void bebidasIniciales(){
        bebidas[0] = new Bebida(70,"Lugar fresco o refrigeracion",10,"Jugo",500,"Uva");
        bebidas[1] = new Bebida(60,"Lugar fresco o refrigeracion",8,"Refresco",600,"Cola");
        bebidas[2] = new Bebida(150,"Lugar oscuro",1,"Vino",900,"Tinto");
    }

    public void bebidasDisponibles(){
        int i=1;
        for (Bebida producto:bebidas){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void pantalonesIniciales(){
        pantalones[0] = new Pantalon(359,"Mediana (36-38)","Azul","Caballero","Jeans","Skinny");
        pantalones[1] = new Pantalon(359,"Mediana (32-34)","Azul","Dama","Jeans","Skinny");
        pantalones[2] = new Pantalon(200,"Chica (22-24)","Negro","Niños","Jogger","Slim");
    }

    public void pantalonesDisponibles(){
        int i=1;
        for (Pantalon producto:pantalones){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void playerasIniciales(){
        playeras[0] = new Playera(100,"Grande","Verde","Caballeros","Polo","Polo","Poliester");
        playeras[1] = new Playera(150,"Mediana","Blanco","Dama","Manga Larga","Redondo","Algodon");
        playeras[2] = new Playera(120,"Chica","Roja","Niños","Manga Corta","V","Algodon");
    }

    public void playerasDisponibles(){
        int i=1;
        for (Playera producto:playeras){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }

    private void calzadosIniciales(){
        calzados[0] = new Calzado(899,"26 cm.","Negro","Caballero","Zapatos","Refil","Cuero");
        calzados[1] = new Calzado(999,"24 cm","Azul","Dama","Tenis","Nike","Goma");
        calzados[2] = new Calzado(750,"23 cm","Blanco","Niños","Tenis","Adidas","Goma");
    }

    public void calzadosDisponibles(){
        int i=1;
        for (Calzado producto:calzados){
            System.out.println("\n"+i+")"+producto.toString());
            i+=1;
        }
    }
}