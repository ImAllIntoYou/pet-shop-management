/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.*;

public class connectdbs {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop?useSSL=false","root","123456");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            System.err.print("Error during Connection");
            return null;
        }
    }
}

