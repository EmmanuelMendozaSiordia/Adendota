/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuel
 */
public class mysql {
    private static String db = "Contactos";
    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost/"+db;
    private static Connection Conn;
    
    public static Connection getConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conn = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e); 
        }
        return Conn;
    }
}
