/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshopmanagement;

/**
 *
 * @author Admin
 */
public class Product extends Item {
    int stock;
    
    Product(String n, int p, int stk, String s){
        super(n, p, s);
        stock = stk;
    }
}
