/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Pet extends Item {
    private String species;
    private String breed;
    private static int petCounter = 1;

    public Pet(String name, String species, String breed, double price, String status) {
        super(name, price, status);
        this.species = species;
        this.breed = breed;
        this.id = generateId("P", petCounter++); // Generates unique ID, e.g., "P001"
    }

    public String getSpecies() {
        return species;
    }

    public String getBreed() {
        return breed;
    } 
    
    public String getStatus() {
        return status;
    }
    
    public void sellPet() {
        status = "Sold";
        System.out.println(name + " has been sold.");
    }
}

