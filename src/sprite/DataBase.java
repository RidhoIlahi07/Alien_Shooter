/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ridho
 */
public class DataBase {
    public static Connection con;
    public static Statement stat;
    public static ResultSet res;
    public static Connection connect(){
        try{
            String url="jdbc:mysql://localhost/alien_shooter";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stat = con.createStatement();
        }catch(Exception e){
            System.err.println("Koneksi gagal "+ e.getMessage());
        }
        return con;
    }
    public Statement getState(){
        return stat;
    }
    
}
