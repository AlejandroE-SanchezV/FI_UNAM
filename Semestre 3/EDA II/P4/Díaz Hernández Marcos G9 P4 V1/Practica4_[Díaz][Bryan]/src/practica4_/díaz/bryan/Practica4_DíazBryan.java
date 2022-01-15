
package practica4_.díaz.bryan;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Practica4_DíazBryan{
	public static void main(String[] args){
	List<Integer> lista1= new LinkedList<>();
        Scanner busqueda = new Scanner(System.in);

	lista1.add(15);
	lista1.add(10);
	lista1.add(20);
	lista1.add(25);
	lista1.add(30);
	lista1.add(5);
	lista1.add(80);

	System.out.println("Estado 1:");
	imprimirLista(lista1);
	System.out.println("***");

	lista1.add(2,300);
	lista1.add(4,500);
	lista1.add(5,700);

	System.out.println("Estado 2");
	imprimirLista(lista1);
	System.out.println("***");

	lista1.set(1,14);
	lista1.set(2,16);
	lista1.set(7,18);

	System.out.println("Estado 3");
	imprimirLista(lista1);
	System.out.println("***");

	List<Integer> lista2,lista3;
	lista2=lista1.subList(2,4);
	lista3=lista1.subList(2,4);
	imprimirLista(lista2);
	System.out.println("***");
	imprimirLista(lista3);
	System.out.println(lista1.equals(lista2));
        
        System.out.println("Eliminar elementos");
        lista1.remove(1);
        lista1.remove(2);
        lista1.remove(3);
        
        System.out.println("Estado 4");
        imprimirLista(lista1);
        
        System.out.println("Verificar si esta vacia");
        lista1.isEmpty();
        
        System.out.println("Buscar un elemento");
        int a=lista1.indexOf(15);
        int b=lista1.indexOf(80);
        System.out.println("Posicion de 15:"+a+"\nde 80:"+b);
        
        System.out.println("Ejercicio 2\n-------Inciso a------");
        List<Integer> listaE2= new LinkedList<>();
        BusquedaLineal.entrada(listaE2);
        
        System.out.println("Inserta el valor a buscar");
        int valor1 = busqueda.nextInt();
        boolean regreso=BusquedaLineal.busquedaBooleana(listaE2,valor1);
        System.out.println("El valor se encuentra:"+regreso);
        
        System.out.println("-----Inciso b-----");
        System.out.println("Inserta el valor a buscar");
        int valor2 = busqueda.nextInt();
        int regreso1 = BusquedaLineal.busquedaIndice(listaE2, valor2);
        System.out.println("El valor se encuentra en el indice:"+(regreso1+1));
        
        System.out.println("------inciso c-----");
        System.out.println("Inserta el valor a buscar");
        int valor3 = busqueda.nextInt();
        int regreso2 = BusquedaLineal.busquedaAparicion(listaE2, valor3);
        System.out.println("El valor se encuentra:"+regreso2+" veces");
        
        
        System.out.println("\nEjercicio 3\n----inciso a----");
        System.out.println("Se ordena la lista");
        Collections.sort(listaE2);
        System.out.println("Inserta el valor a buscar");
        int valor4 = busqueda.nextInt();
        boolean regreso3 = BusquedaBinaria.busquedaBooleana(listaE2,0,listaE2.size()-1,valor4);
        System.out.println("El valor se encuentra:"+regreso3);
        
        System.out.println("------Inciso b----");
        System.out.println("Inserta el valor a buscar");
        int valor5 = busqueda.nextInt();
        int regreso4 = BusquedaBinaria.busquedaVeces(listaE2,0,listaE2.size()-1,valor5,0);
        System.out.println("El valor se encuentra:"+regreso4+" veces");
        
        System.out.println("Ejercicio 4");
        List<Automovil> listaAutos =new LinkedList<>();
        List<Automovil> regresoLista =new LinkedList<>();
        Automovil numero1 = new Automovil(123,"Nissan",2010,"no");
        Automovil numero2 = new Automovil(433,"BMW",2018,"no");
        Automovil numero3 = new Automovil(193,"Ford",2019,"no");
        Automovil numero4 = new Automovil(370,"Mercedes",2020,"no");
        Automovil numero5 = new Automovil(435,"Mustang",2021,"no");
        
        listaAutos.add(numero1);
        listaAutos.add(numero2);
        listaAutos.add(numero3);
        listaAutos.add(numero4);
        listaAutos.add(numero5);
        imprimirListaA(listaAutos);
        
        System.out.println("------BusquedaLineal----- \nBuscarPorModelo");
        System.out.println("Inserta el valor de modelo que deseas buscar:");
        int modelo1 = busqueda.nextInt();
        regresoLista = BusquedaLineal.busquedaAparicionAutomovilModelo(listaAutos,modelo1);
        imprimirListaA(regresoLista);
        
        
        System.out.println("BuscarPorNombre \nInserta el valor de nombre que deseas buscar:");
        String nombre1 = busqueda.next();
        regresoLista = BusquedaLineal.busquedaAparicionAutomovilNombre(listaAutos,nombre1);
        imprimirListaA(regresoLista);
        
        System.out.println("-------BusquedaBinaria----- \nBuscarPorModelo");
        System.out.println("Inserta el valor de modelo que deseas buscar:");
        int modelo2 = busqueda.nextInt();
        regresoLista = BusquedaBinaria.busquedaModelo(listaAutos,0,listaAutos.size()-1,modelo2);
        imprimirListaA(regresoLista);
        
        
        System.out.println("BuscarPorNombre");
        System.out.println("Inserta el nombre que deseas buscar:");
        String nombre2 = busqueda.next();
        regresoLista = BusquedaBinaria.busquedaNombre(listaAutos,0,listaAutos.size()-1,nombre2);
        imprimirListaA(regresoLista);
        
	}

	public static void imprimirLista(List<Integer> listaPrint){
            for(Integer var:listaPrint){
		System.out.println(var);
            }
	}
        
        public static void imprimirListaA(List<Automovil> lista){
            for(int i=0;i<lista.size();i++){
                System.out.println(lista.get(i));
            }
        }
}