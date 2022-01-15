//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Vector;
import java.util.Scanner;

class Biblioteca{
	public void listarLibros() throws SQLException{
		ResultSet rs;
		String query = "select libro.id_libro, libro.nombre, editorial.nombre, autor.nombre, autor.apaterno from libro inner join editorial on editorial.id_editorial = libro.editorial inner join libro_autor on libro.id_libro = libro_autor.libro_id inner join autor on autor.id_autor = libro_autor.autor_id order by libro.nombre";
		ConexionBiblio cb = ConexionBiblio.getCon(); 

		rs = cb.seleccionar(query, "biblioteca");
		while(rs.next()){
			System.out.println(rs.getInt("id_libro") + "\t" + rs.getString("libro.nombre"));
			System.out.println("\t" + rs.getString("editorial.nombre"));
			System.out.println("\t" + rs.getString("autor.nombre") + " " +rs.getString("apaterno"));
		}
	}

	public Editorial agregarEditorial() throws SQLException{
		Editorial e = new Editorial();
		ConexionBiblio cb = ConexionBiblio.getCon();
		Scanner ent = new Scanner(System.in);

		System.out.println("Ingrese el nombre de la editorial:");
		String nombre = ent.nextLine();
		e.setNombre(nombre);

		String query = "insert into editorial(nombre) values('" + nombre +"')";

		int insertar = cb.insertarOActualizar(query, "biblioteca");
		if(insertar != 0){
			query = "select id_editorial from editorial where nombre = '" + nombre + "'";
			ResultSet rs = cb.seleccionar(query, "biblioteca");
			if(rs.next()){
				int editorial = rs.getInt("id_editorial");
				e.setIdEditorial(editorial);
			}
		}

		return e;
	}

	public Autor agregarAutor() throws SQLException{
		Autor a = new Autor();
		String aux = "";

		ConexionBiblio cb = ConexionBiblio.getCon();
		Scanner ent = new Scanner(System.in);

		System.out.println("Ingrese el nombre del autor:");
		aux = ent.nextLine();
		a.setNombre(aux);

		System.out.println("Ingrese el apellido paterno del autor:");
		aux = ent.nextLine();
		a.setAPaterno(aux);

		System.out.println("Ingrese el apellido materno del autor:");
		aux = ent.nextLine();
		a.setAMaterno(aux);

		String query = "insert into autor(nombre, apaterno, amaterno) values('" + a.getNombre() +"', '" + a.getAPaterno() +"', '" + a.getAMaterno() +"')";

		int insertar = cb.insertarOActualizar(query, "biblioteca");
		System.out.println(insertar);

		if(insertar != 0){
			query = "select id_autor from autor where nombre = '" + a.getNombre() + "' and apaterno = '" + a.getAPaterno() +"' and amaterno = '" + a.getAMaterno() + "'";
			ResultSet rs = cb.seleccionar(query, "biblioteca");
			if(rs.next()){
				int autor = rs.getInt("id_autor");
				a.setIdAutor(autor);
			}
		}

		return a;
	}

	public Libro agregarLibroCatalogo() throws SQLException{
		Libro l = new Libro();
		ConexionBiblio cb = ConexionBiblio.getCon();
		Scanner ent = new Scanner(System.in);
		ResultSet rs = null;
		int editorial = 0;
		int autor = 0;
		int numColumnas = 0;
		String query = "";

		query = "select * from editorial";
		rs = cb.seleccionar(query, "biblioteca");
		System.out.println("Elija la editorial que publico el libro a registrar, si no se encuentra en la lista, presione 0");
		
		while(rs.next()){
			System.out.println(rs.getInt("id_editorial") + "\t" + rs.getString("nombre"));
		}
		
		editorial = ent.nextInt();
		ent.nextLine();
		if(editorial == 0) {
			Editorial e = agregarEditorial();
			editorial = e.getIdEditorial();
			l.setEditorial(e);
		}
		
		query = "select * from autor";
		rs = cb.seleccionar(query, "biblioteca");
		System.out.println("Elija el autor que publico libro a registrar, si no se encuentra en la lista, presione 0");
		
		while(rs.next()){
			System.out.println(rs.getInt("id_autor") + "\t" + rs.getString("nombre") + " " + rs.getString("apaterno"));
		}
		
		autor = ent.nextInt();
		ent.nextLine();
		if(autor == 0){
			Autor a = agregarAutor();
			autor = a.getIdAutor();
			System.out.println(autor);
			l.setAutor(a);
		}
		
		System.out.println("Ingrese el nombre del libro:");
		String nombre = ent.nextLine();
		l.setNombre(nombre);
		System.out.println("Ingrese la fecha de publicacion:");
		String fecha = ent.nextLine();
		l.setFechaPublicacion(fecha);
		query = "insert into libro(nombre, editorial, fecha_pub) values ('"+nombre+"', "+ editorial +", "+ fecha +")";
		
		numColumnas = cb.insertarOActualizar(query, "biblioteca");

		query = "select id_libro from libro where nombre = '" + nombre + "'";

		rs = cb.seleccionar(query, "biblioteca");

		if(rs.next()){
			int id_libro = rs.getInt("id_libro");
			l.setIdLibro(id_libro);
		}

		if(l.getIdLibro() != 0){
			query = "insert into libro_autor(libro_id, autor_id) values (" + l.getIdLibro() + ", " + autor + ")";
			numColumnas = cb.insertarOActualizar(query, "biblioteca");
		}

		return l;
	}

	public void agregarLibrosBiblioteca() throws SQLException{
		int numLibros = 0;
		int libro = 0;
		Scanner ent = new Scanner(System.in);
		ConexionBiblio cb = ConexionBiblio.getCon();

		System.out.println("Seleccione el titulo del (de los) libro(s) que registrara, si no encuentra el titulo presione 0:");

		listarLibros();

		libro = ent.nextInt();
		ent.nextLine();

		if(libro == 0){
			Libro l = agregarLibroCatalogo(); 
			libro = l.getIdLibro();
		}

		System.out.println("Ingrese el numero de libros que agregara a la biblioteca");
		numLibros = ent.nextInt();
		ent.nextLine();

		System.out.println("Ingrese la ubicacion en la que se encontraran los libros");
		String ubicacion = ent.nextLine();

		String query = "insert into libro_biblio(ubicacion, libro_id) values('" + ubicacion + "', " + libro + ")";
		for(int i = 0; i<numLibros; i++){
			int rs = cb.insertarOActualizar(query, "biblioteca");
			if(rs == 0) System.out.println("No fue posible insertar el registro.");
		}
	}

	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		Scanner s = new Scanner(System.in);
		int opcion = 0;
		int rs = 0;
		do{
			System.out.println("1.- Listar libros");
			System.out.println("2.- Agregar un libro al catalogo");
			System.out.println("3.- Agregar libros al registro de la biblioteca");
			System.out.println("0.- Salir");
			System.out.println("Elija una opcion: ");
			opcion = s.nextInt();
			s.nextLine();
			try{
				switch(opcion){
					case 1:
						b.listarLibros();
						break;
	
					case 2:
						Libro l = b.agregarLibroCatalogo();
						break;
	
					case 3:
						b.agregarLibrosBiblioteca();
						break;
				}
			}catch(SQLException se){
				System.out.println(" -------------------------------------- ");
				System.out.println("SQLState: " + se.getSQLState());
				System.out.println("Mensaje: " + se.getMessage());
				System.out.println("Codigo: " + se.getErrorCode());
				se.getNextException();
				System.out.println(" -------------------------------------- ");
			}
		}while(opcion != 0);
	}
}
