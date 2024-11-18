/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Employee extends User implements SearchFunctionality {
    private String role;

    public Employee(String name, String role, String status) {
        super(name, status); // Calls the constructor of User to set name and status
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void assistCustomers() {
        System.out.println(name + " is assisting customers.");
    }

    public void processOrders() {
        System.out.println(name + " is processing orders.");
    }

    public void updateInventory() {
        System.out.println(name + " is updating inventory.");
    }

    public void confirmCancelledOrder() {
        System.out.println(name + " is confirming a cancelled order.");
    }

    @Override
    public void searchFunctionality() {
        System.out.println(name + " is using search functionality.");
    }
    
    // Search by product name
    public void searchFunctionality(String itemName) {
        System.out.println(name + " is searching for item by name: " + itemName);
    }

    // Search by product ID
    public void searchFunctionality(int itemId) {
        System.out.println(name + " is searching for item by ID: " + itemId);
    }
}

