package Clases;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {

   Connection cn;
  
   //crear un constructor de tipo público
   public Connection conexion(){
 
   try {
       
         Class.forName("com.mysql.jdbc.Driver");
         
         cn=DriverManager.getConnection("jdbc:mysql://localhost/proyectofinal", "root","");
         
         System.out.println("Conectado");
    } catch (Exception e) {

          System.err.println(e.getMessage());
    }

     return cn;

  }

}