/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ADMIN
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
public class dbops {
    public static void updateQuery (String query, String msg){
        try{
           Connection conn = connectdbs.getConnection();
           Statement st = conn.createStatement();
           st.executeUpdate(query);
           if(!msg.equals("")){
               JOptionPane.showMessageDialog(null, msg);
               
           }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public static ResultSet selectQuery(String query){
        try {
            Connection conn = connectdbs.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }   
    
}
    