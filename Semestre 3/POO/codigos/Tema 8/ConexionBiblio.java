import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class ConexionBiblio{
  private Properties datosCon;
  Connection conexion;
  private static final ConexionBiblio con = new ConexionBiblio();

  public static ConexionBiblio getCon(){
    /*if(con == null){
      ConexionBiblio aux = new ConexionBiblio();
      con = aux;
    }*/
    return con;
  }


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


  public ResultSet seleccionar(String query, String bd) throws SQLException{
      ResultSet rs = null;
  
      Statement stm = conexion.createStatement();
      stm.executeQuery("use " + bd);
      rs = stm.executeQuery(query);
      
      return rs;
  }


  public int insertarOActualizar(String query, String bd) throws SQLException{
      int rs = 0;

      Statement stm = conexion.createStatement();
      stm.executeQuery("use " + bd);
      rs = stm.executeUpdate(query);

      return rs;
  }

  /*public ResultSet seleccionar(String query, String bd){
    ResultSet rs = null;
    try{
      Statement stm = conexion.createStatement();
      stm.executeQuery("use " + bd);
      rs = stm.executeQuery(query);
      return rs;
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
    return rs;
  }


  public int insertarOActualizar(String query, String bd){
    int rs = 0;
    try{
      Statement stm = conexion.createStatement();
      stm.executeQuery("use " + bd);
      rs = stm.executeUpdate(query);
      return rs;
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
    return rs;
  }*/

}
