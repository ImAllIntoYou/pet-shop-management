/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Pet;
import Model.Product;

/**
 *
 * @author ADMIN
 */
public class ItemController {
    public static void addDog(Pet dog){
        String query = "insert into dogs(name, species, breed, price, status) values ('"+
                        dog.getName()+"','"+dog.getSpecies()+"','"+dog.getBreed()+"','"+
                        dog.getPrice()+"','"+dog.getStatus()+"')";
        dbops.updateQuery(query, "");
    }
    public static void addCat(Pet cat){
        String query = "insert into cats(name, species, breed, price, status) values ('"+
                        cat.getName()+"','"+cat.getSpecies()+"','"+cat.getBreed()+"','"+
                        cat.getPrice()+"','"+cat.getStatus()+"')";
        dbops.updateQuery(query, "");
    }
    
    public static void addProduct(Product product){
        String query = "insert into products(name, price, stock, status) values ('"+
                        product.getName()+"','"+product.getPrice()+"','"+
                        product.getStock()+"','"+product.getStatus()+"')";
        dbops.updateQuery(query, "");
    }
}
