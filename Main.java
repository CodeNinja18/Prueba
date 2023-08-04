import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main{
    public static void main(String[]args) throws SQLException{
        
        getVista();
        
    }
    public static void getVista() throws SQLException{
        String query ="select *from paciente";
        PreparedStatement stm =Conexion.conectar().prepareStatement(query);

        ResultSet res =stm.executeQuery();

        while(res.next()){
            System.out.println(res.getInt(1)+ " - "+res.getString(2)+ " - "+res.getString(3)+ " - "+res.getInt(4));
        }
        
    }
}
