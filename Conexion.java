import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    
    public static Connection conectar(){
        Connection cn =null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            cn =DriverManager.getConnection("jdbc:mysql://localhost:3320/visual","Luis","73702971");
            
        }catch(Exception e){
            System.out.println("error");
        }
        return cn;
    }
    
}
