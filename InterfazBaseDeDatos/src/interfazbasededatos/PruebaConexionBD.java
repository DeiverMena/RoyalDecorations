package interfazbasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author edwarddaniel
 */
public class PruebaConexionBD {

   private static Connection conn;
   private static final String driver = "com.mysql.jdbc.Driver";
   private static final String user = "root"; //usuario de tu onexion BD
   private static final String password = ""; //contraseña de tu conexion BD
   private static final String url = "jdbc:mysql://localhost:3306/royaldecorations"; //aqui el nombre con el que se importó la BD en mysql workbench
   
   
   public PruebaConexionBD(){
       conn= null;
       try {
           Class.forName(driver);
           conn=(Connection) DriverManager.getConnection(url,user,password);
           if(conn != null){
               System.out.println("Conexion establecida...");
           }
       
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Error al conectar"+e);
       }
       
  
   }
      public Connection getConnection(){
           return conn;
       }
      
      
      public void desconectar(){
          conn = null;
          if(conn== null){
              System.out.println("Conexion terminada");
          }
      }

}