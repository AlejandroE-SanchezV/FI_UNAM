package cursosjava;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
	public static void main (String [] args){
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?serverTimezone=UTC","root","admin");
			System.out.println("Conexión con la BD establecida");

		}catch (SQLException e){
			System.out.println("Error al realizar la conexión con mysql");
		}catch (Exception e){
			System.out.println("Error:\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
