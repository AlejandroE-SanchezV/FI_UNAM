//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Vector;
import java.util.Scanner;

public class Biblioteca{	
	//static int id_editorial;
	//static int id_autor;

	Vector<Editorial> editoriales;
	Vector<Autor> autores;
	Vector<Libro> libros;
	Hashtable<String, LibroBiblioteca> librosBiblioteca;

	Biblioteca(){
		editoriales = new Vector<Editorial>();
		autores = new Vector<Autor>();
		libros = new Vector<Libro>();
		librosBiblioteca = new Hashtable<String, LibroBiblioteca>();
	}

	int agregarLibroBiblio(){
		Libro l = new Libro();
		Scanner sc = new Scanner(System.in);
		Editorial ed = null;
		Autor aut;
		String elemento;

		System.out.println("Ingrese el nombre de la editorial que publico el libro");

		if(editoriales.isEmpty()){
			System.out.println("Ingrese el nombre de la nueva editorial:");
			elemento = sc.nextLine();
			System.out.println(elemento);
			ed = new Editorial(elemento);
			editoriales.add(ed);
		}else{
			int i = 0;
			for(Editorial e : editoriales){
				System.out.println(String.valueOf(i + 1)+" "+e.getNombre());
				i++;
			}
			System.out.println("Elije la editorial que publico el libro, si no existe teclee 0");
			int indice = sc.nextInt();
			if(indice == 0){
				System.out.println("Ingrese el nombre de la nueva editorial:");
				ed.setNombre(sc.nextLine());
				editoriales.add(ed);
			}
			else ed = editoriales.get(indice-1);
		}

		l.setEditorial(ed);

		if(!autores.isEmpty()){
			System.out.println("No vacio");
			int i = 0;
			for(Autor a : autores){
				System.out.println(String.valueOf(i + 1)+" "+a.getNombre()+" "+ a.getAPaterno()+" "+a.getAMaterno());
				i++;
			}
			System.out.println("Elije el autor que publico el libro, si no existe teclee 0");
			int indice = sc.nextInt();
			if(indice == 0){
				System.out.println("Ingrese los datos del nuevo autor:");
				aut = new Autor();
				System.out.println("Ingrese el nombre del autor:");
				elemento = sc.nextLine();
				aut.setNombre(elemento);
				System.out.println("Ingrese el apellido del autor:");
				elemento = sc.nextLine();
				aut.setAPaterno(elemento);
				autores.add(aut);
			}else{
				aut = autores.get(indice-1);
			}
		}else{
			System.out.println("Vacio");
			System.out.println("Ingrese los datos del nuevo autor:");
			aut = new Autor();
			System.out.println("Ingrese el nombre del autor:");
			elemento = sc.nextLine();
			aut.setNombre(elemento);
			System.out.println("Ingrese el apellido del autor:");
			elemento = sc.nextLine();
			aut.setAPaterno(elemento);
			autores.add(aut);
		}

		l.setAutor(aut);

		System.out.println("Ingrese el nombre del libro:");
		elemento = sc.nextLine();
		l.setNombre(elemento);

		System.out.println("Ingrese la fecha de publicacion:");
		elemento = sc.nextLine();
		l.setFechaPublicacion(elemento);

		libros.add(l);

		return libros.indexOf(l);
	}

	void agregarLibrosBiblio(int numEjemplares){
		int indiceLibro = 0;
		if(libros.isEmpty()){
			indiceLibro = agregarLibroBiblio();
		}else{
			for(Libro l : libros){
				System.out.println("Nombre: "+l.getNombre()+"\n Fecha de publicacion: "+l.getFechaPublicacion()+"\n Autor: "+l.getAutor());
			}
		}
	}

	public static void main(String[] args) {
		int op = 1;
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Biblioteca b = new Biblioteca();

		while(op == 1){
			System.out.println("Elija una opcion:");
			System.out.println("1 Agregar libros nuevos a la biblioteca");
			System.out.println("2 Ingresar una entrada nueva al catalogo de libros");
			opcion = sc.nextInt();

			switch(opcion){
				case 1:
					System.out.println("Proporcione el numero de libros que agregara al registro");
					int num = sc.nextInt();
					b.agregarLibrosBiblio(num);
					break;
				case 2:
					b.agregarLibroBiblio();
					break;
			}

			System.out.println("Para continuar teclee 1, presione cualquier tecla para salir...");
			op = sc.nextInt();
			System.out.println(op);
		}
	}

}