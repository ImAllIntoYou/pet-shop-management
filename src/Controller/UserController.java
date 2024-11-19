/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Employee;

/**
 *
 * @author ADMIN
 */
public class UserController {
    public static void addEmployee(Employee emp){
        String query = "insert into employee(name, role, status) values ('"+
                        emp.getName()+"','"+emp.getRole()+"','"+emp.getStatus()+"')";
        dbops.updateQuery(query, "");
    }
    
    public static void deleteEmployee(Employee emp){
        String query = "delete from employee where name='" + emp.getName() +"'";
        dbops.updateQuery(query, "");
    }
}
