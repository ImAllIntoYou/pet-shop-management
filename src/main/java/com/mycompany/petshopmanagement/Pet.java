/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshopmanagement;

/**
 *
 * @author Admin
 */
public class Pet extends Item {
    String species;
    String breed;
    
    Pet(String n, String sp, String b, int p, String s){
        super(n, p, s);
        species = sp;
        breed = b;
    }
}
