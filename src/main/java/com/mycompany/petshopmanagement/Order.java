package com.mycompany.petshopmanagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Order extends State{
    String order_id;
    Customer customer;
    int total;
    
    
    Order(String s, String id, Customer c, int t){
        super(s);
        order_id = id;
        customer = c;
        total = t;
    }
        
}
