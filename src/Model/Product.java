/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Product extends Item {
    private int stock;
    private static int productCounter = 1;

    public Product(String name, double price, int stock, String status) {
        super(name, price, status);
        this.stock = stock;
        this.id = generateId("PD", productCounter++); // Generates unique ID, e.g., "PD001"
    }

    public void addToInventory(int amount) {
        stock += amount;
        System.out.println(amount + " units added to inventory.");
    }

    public void updateStock(int amount) {
        stock += amount;
        System.out.println("Stock updated to: " + stock);
    }

    public void checkStock() {
        System.out.println("Current stock: " + stock);
    }
   
    public int getStock() {
        return stock;
    }
    
    public String getStatus() {
        return status;
    }
}

