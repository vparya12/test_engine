/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testengine;

import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Er. Ved Prakash Arya
 */
public class DBConnect {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public  DBConnect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","");
            // con = DriverManager.getConnection("jdbc:odbc:demo");
            st = con.createStatement();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"Error:"+ex,"Error Box",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int getData(int getroll, String getpass ){
        
        int value=0;
       
        try {
            String query = "Select * from students where Roll="+getroll+" and Password='"+getpass+"'";
           
            rs= st.executeQuery(query);
            while(rs.next()){
             value= rs.getInt("Roll");
              }
            
        }
        catch (Exception e) {
        }
        finally{    
                   try{ rs.close();
                    st.close();
                   }catch(Exception ex){
                   }
                   
                    return value;
            
        }
      
    }
   public String getAdminData(String getID, String getpass ){
        String value=null;
        try {
            String query = "Select * from admin where ID='"+getID+"' and Password='"+getpass+"'";
            rs= st.executeQuery(query);
           
            while(rs.next()){
               
               value= rs.getString("ID");
                
              
            }
           
        } 
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error:"+e);
        }
        finally{
                    
           try{ rs.close();
                    st.close();
                   }
           catch(Exception ex){
           }
            return value;
        }
      
    }
}
