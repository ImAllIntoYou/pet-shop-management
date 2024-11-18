/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Customer extends User implements SearchFunctionality {
    private String contact;

    public Customer(String name, String contact, String status) {
        super(name, status);  // Calls the constructor of User to set name and status
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void browseProducts() {
        System.out.println(name + " is browsing products.");
    }

    public void placeOrder() {
        System.out.println(name + " is placing an order.");
    }

    public void viewOrderHistory() {
        System.out.println(name + " is viewing order history.");
    }

    public void cancelOrder() {
        System.out.println(name + " is cancelling an order.");
    }

    @Override
    public void searchFunctionality() {
        System.out.println(name + " is using search functionality.");
    }
}

