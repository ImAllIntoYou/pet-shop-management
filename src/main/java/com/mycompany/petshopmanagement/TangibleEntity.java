/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshopmanagement;

/**
 *
 * @author Admin
 */
public class TangibleEntity extends State{
    String name;
    
    TangibleEntity(String n, String s){
        super(s);
        name = n;
    }
}
