/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Manager extends User implements SearchFunctionality {
    private String department;
    private String role = "Manager";

    public Manager(String name, String department, String status) {
        super(name, status);
        this.department = department;
    }

    public void managePet() {
        System.out.println(name + " is managing pets.");
    }
    
    public void manageProduct() {
        System.out.println(name + " is managing products.");
    }

    @Override
    public void searchFunctionality() {
        System.out.println(name + " is using search functionality.");
    }
}
