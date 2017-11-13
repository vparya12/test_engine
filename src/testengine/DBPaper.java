/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testengine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Er. Ved Prakash Arya
 */
public class DBPaper {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public  DBPaper(){
       // JOptionPane.showMessageDialog(null, sub);
        try {
            Class.forName("com.mysql.jdbc.Driver");
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/question","root","");
            // con = DriverManager.getConnection("jdbc:odbc:demo");
            st = con.createStatement();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Error:"+ex,"Error Box",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void setData(String query){
        String vquery =query;
        try{
            st.executeUpdate(vquery);
            JOptionPane.showMessageDialog(null,"One Question Is Added!");
            con.close();
        }catch(Exception ex){
            System.out.println("Error:"+ex);
        }
        
    }
    public void getData(String subject){
        String query = "Select *  from "+subject;
        try{
            rs= st.executeQuery(query);
            while(rs.next()){
                
            }
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
                
        }
   
    
}
