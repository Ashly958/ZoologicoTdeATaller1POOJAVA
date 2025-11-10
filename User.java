/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class User {
    public String name;
    private int id;
    private String password;
    
    public User(String name, int id, String password){
        this.name = name;
        this.id = id;
        this.password = password;
    }
    
    // Solo get porque en el Main se crean de forma manual los objetos.
    
    public String getNombre(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public String getPassword(){
        return password;
    }
    
    // Metodos
    public void leerRegistroPropio(){
    }
    
    public void logear(){
    }
        
}
