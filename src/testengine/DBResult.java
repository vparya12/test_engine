/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testengine;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Er. Ved Prakash Arya
 */
public class DBResult {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public DBResult(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "");
            st = con.createStatement();
            
        } catch (Exception ex) {
            Logger.getLogger(DBResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
