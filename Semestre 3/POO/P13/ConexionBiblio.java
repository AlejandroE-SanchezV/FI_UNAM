import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
*Metodo que regresa la conexion que se haya establecido, si no hay ninguna se crea una instancia de esta.
*en caso de que existe se regresa la conexion y en caso de que no se crea una conexion, 
*de igual forma los la contecion es estatica para que pueda ser compartida entre varios usuarios.
*/
class ConexionBiblio{
  private Properties datosCon;
  Connection conexion;
  private static ConexionBiblio con;

  public static ConexionBiblio getCon(){
    if(con == null){
      con = new ConexionBiblio();
    }
    return con;
  }

  /**
  *Metodo para la conexion entre el programa y la base de datos.
  *Mediante cada una de las propiedades se inicializan para poder indicar el uso de base de datos en MySQL
  *Para establecer la conexion mediante sockets, y poder guardar los registro mediante flujo de bytes 
  *La primer excepcion corresponde a la apertura del archivo de donde se leen las claves 
  *La segunda excepcion se maneja en caso de que no se pueda conectar con la base de datos
  *Singleton: El metodo constructor es privado, debido a que es recomendable el tener una unica instancia en el sistema,
  *ya que permite el reutilizar la misma instancia, y que sea compartida.
  */
  private ConexionBiblio(){
    String conexionStr = "";
    try{
      datosCon = new Properties();
      InputStream dc = new FileInputStream("Config.properties");
      datosCon.load(dc);
      String driver = datosCon.getProperty("driver");
      String host = datosCon.getProperty("host");
      String puerto = datosCon.getProperty("puerto");
      String usuario = datosCon.getProperty("usuarioBD");
      String contra = datosCon.getProperty("contraUsrBD");

      conexionStr = "jdbc:" + driver + "://" + host + ":" + puerto + "?serverTimezone=UTC";

      conexion = DriverManager.getConnection(conexionStr, usuario, contra);

    }
    catch(IOException ioe){
      System.out.println("Error: No fue posible abrir el archivo de conexión");
      ioe.printStackTrace();
    }
    catch(SQLException se){
      while (se != null){
        System.out.println("SQLState: " + se.getSQLState());
        System.out.println("Mensaje: " + se.getMessage());
        System.out.println("Codigo: " + se.getErrorCode());
        se.getNextException();
        System.out.println(" -------------------------------------- ");
      }
    }
  }

  /**
  *En este metodo permite el seleccionar registro de la base de datos, e interpretar los datos de la base.
  *El metodo devuelve el registro seleccionado.
  *Vista: permite el acceso a los datos por medio de la devolucion de los registros.
  */
  public ResultSet seleccionar(String query, String bd) throws SQLException{
      ResultSet rs = null;
  
      Statement stm = conexion.createStatement();
      stm.executeQuery("use " + bd);
      rs = stm.executeQuery(query);
      
      return rs;
  }

  /**
  *El metodo permite modificar o agregar contenido a la base de datos. 
  *Donde se regresa un entero para poder verificar que se realizo correctamente la operacion de insertar o modificar.
  *Controlador: Notifica a los metodos de vista que se ha realizado una modificacion o insercion en la base de datos.
  */
  public int insertarOActualizar(String query, String bd) throws SQLException{
      int rs = 0;

      Statement stm = conexion.createStatement();
      stm.executeQuery("use " + bd);
      rs = stm.executeUpdate(query);

      return rs;
  }

}
