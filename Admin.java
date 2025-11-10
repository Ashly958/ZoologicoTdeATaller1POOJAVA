/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Admin extends User{
    
    public Admin(String name, int id, String password){
        super(name, id, password);
    }
    
    //no hay get porque los hereda de User.
    
    // Metodos sobreescritos de clase padre User
    @Override
    public void leerRegistroPropio(){
        System.out.println("Leyendo registro de admin...");
        return;
    }
    
    @Override
    public void logear(){
        System.out.println("Administrador " + name + " logeado.");
        return;
    }
    
    
    // Metodos
    public void registrarAnimales(){
        System.out.println("Registrando animal...");
        System.out.println("El registro del animal fue exitoso...");
        return;
    }
    
    public void clasificarAnimales(){
        System.out.println("Clasificando animal...");
        System.out.println("La clasificacion de los animales fue exitosa...");
        return;
    }
    
    public void gestionarCuidadores(){
        System.out.println("Mostrando informacion de los cuidadores...");
        return;
    }
    
    public void editarInfoAnimales(){
        System.out.println("Editando informacion de los animales...");
        return;
    }
    
    public void eliminarAnimales(){
        System.out.println("Eliminando animal...");
        return;
    }
    
}
