/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshopmanagement;

/**
 *
 * @author Admin
 */
public class Customer extends Human {
    String contact;
    
    // name, contace, status
    Customer(String n, String c, String s){
        super(n, s);
        contact = c;
    }
}
