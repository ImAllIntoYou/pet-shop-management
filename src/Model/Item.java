/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public abstract class Item {
    protected String id;
    protected String name;
    protected double price;
    protected String status;

    public Item(String name, double price, String status) {
        this.name = name;
        this.price = price;
        this.status = status;
    }
    
    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }    
    
    protected String generateId(String prefix, int counter) {
        return String.format("%s%03d", prefix, counter);
    }
    
    public void updatePrice(double newPrice) {
        price = newPrice;
        System.out.println("Price updated to: $" + price);
    }

    public void checkAvailability() {
        System.out.println("Status: " + status);
    }
}

