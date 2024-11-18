/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Admin extends User implements SearchFunctionality {
    private String accessLevel;
    private String role = "Admin";

    public Admin(String name, String accessLevel, String status) {
        super(name, status);
        this.accessLevel = accessLevel;
    }

    public void manageUsers() {
        System.out.println(name + " is managing users.");
    }

    public void manageInventory() {
        System.out.println(name + " is managing inventory.");
    }

    public void viewReports() {
        System.out.println(name + " is viewing reports.");
    }

    @Override
    public void searchFunctionality() {
        System.out.println(name + " is using search functionality.");
    }
}

