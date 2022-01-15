package cursosjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeleccionarBD {
	public static void main (String [] args){
 	try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?serverTimezone=UTC","root","admin");
			System.out.println("ConexiOn con la BD establecida");
			// Se crea una instancia del tipo declaraciOn
			Statement stmt = con.createStatement();
			stmt.executeQuery("use biblioteca");//Se indica qué base de datos de usará
      		ResultSet rs = stmt.executeQuery("SELECT * FROM usuario;");
			System.out.println("ID\tUsuario\tContra");
      		while(rs.next()) {
					System.out.println(rs.getInt("id_usuario") + "\t" + rs.getString("nombre") + "\t"+ rs.getString("apaterno") + "\t" + rs.getString("contra"));
					if(rs.getInt("tipo") == 1)
						System.out.println("Administrador");
					System.out.println("\n\n");
			}
		}catch (SQLException e){
			System.out.println("Error al realizar la conexiOn con mysql");
		}catch (Exception e){
			System.out.println("Error:\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
