package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String customerName;
    private List<Item> items = new ArrayList<>(); // Updated to List<Item> for polymorphism
    private double totalAmount;
    private String status;

    public Order(String orderId, String customerName, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public void updateStatus(String newStatus) {
        status = newStatus;
        System.out.println("Order status updated to: " + status);
    }

    // Add a single Item (Product or Pet)
    public void addItem(Item item) {
        items.add(item);
        totalAmount += item.getPrice();
        System.out.println(item.getName() + " added to order. New total amount: $" + totalAmount);
    }

    // Add multiple Items (Products, Pets, etc.)
    public void addItem(List<Item> itemList) {
        for (Item item : itemList) {
            items.add(item);
            totalAmount += item.getPrice();
            System.out.println(item.getName() + " added to order.");
        }
        System.out.println("New total amount: $" + totalAmount);
    }

    public void viewOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customerName + ", Total: $" + totalAmount + ", Status: " + status);
        System.out.println("Items in this order:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }

    public void processPayment() {
        System.out.println("Processing payment for order " + orderId);
    }
}

