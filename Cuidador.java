/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Cuidador extends User{
    
    public Cuidador(String name, int id, String password){
        super(name, id, password);
    }
    
    //no hay get porque los hereda de User.
    
    // Metodos sobreescritos de clase padre User
    @Override
    public void leerRegistroPropio(){
        System.out.println("Leyendo registro de cuidador...");
    }
    
    @Override
    public void logear(){
        System.out.println("Cuidador " + name + " logeado.");
    }
    
    // Metodos
    public void inspeccionar(){
        System.out.println("Inspeccionando zoologico...");
    }
    
    public void gestionarAnimales(){
        System.out.println("gestionando animales...");
    }
    
    public void leerRegistroAnimales(){
        System.out.println("Mostrando registro de animal...");
    }
    
    public void actualizarEstado(){
        System.out.println("Actualizando estado...");
    }
}
