package Pronosticos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    
    public static void conexionBD(){
        try {
            ConexionBD conn = new ConexionBD();
            Connection conexion = conn.getConnection();
            ResultSet rs = SelectPronosticos(conexion);

            
        }catch (Exception e) {System.out.println("Error!"+ e);}
    }
    public static ResultSet SelectPronosticos(Connection con){
        ResultSet rs = null;
        try{
            String Selectquery = "select * from pronosticos";
            Statement st = con.createStatement();
            return rs = st.executeQuery(Selectquery);
        }catch(SQLException e){
            System.out.println("Error del método SelectTabla");
        }
        return rs;
    }
     
        
    public static void main(String[] args) {
        conexionBD();
}
}