import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarBD {
	public static void main (String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del usuario");
		String nombre = teclado.nextLine();
		System.out.println("Ingrese el apellido paterno del usuario");
		String apaterno = teclado.nextLine();
		System.out.println("Ingrese el apellido materno del usuario");
		String amaterno = teclado.nextLine();
		System.out.println("Ingrese la contraseña del usuario");
		String contra = teclado.nextLine();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?serverTimezone=UTC","root","admin");
			System.out.println("ConexiOn con la BD establecida");
			// Se crea una instancia del tipo declaraciOn
			Statement stmt = con.createStatement();
		    stmt.executeQuery("use biblioteca");//Se indica qué base de datos de usará
		    
		    int res = stmt.executeUpdate("INSERT INTO usuario VALUES(1,'"+ nombre +"','" + apaterno + "','"+ amaterno + "','"+ contra+"',0)");
			
			if (res == 1){
				System.out.println("Registro insertado");
			} else {
				System.out.println("Registro no insertado");
			}
		}catch (SQLException e){
			System.out.println("Error al realizar la inserciOn en mysql");
			while (e != null){
				System.out.println("SQLState: " + e.getSQLState());
				System.out.println("Mensaje: " + e.getMessage());
				System.out.println("COdigo: " + e.getErrorCode());
				e.getNextException();
				System.out.println(" -------------------------------------- ");
			}
		}catch (Exception e){
			System.out.println("Error:\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
