/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Reptil extends Animal{
    public String TipoSangre;
    public String reproduccion;
    
    public Reptil(String clasificacion, int edad, double peso, double altura, String habitat, String alimentacion, String reproduccion, String especie, String tipoSangre){
        super(clasificacion, edad, peso, altura, habitat, alimentacion, "huevos", especie);
        this.TipoSangre = "fria";
        this.reproduccion = "huevos";
    }
    
    // getters
    public String getTipoSangre() {
        return TipoSangre;
    }
    
    public String getReproduccion() {
        return reproduccion;
    }
    
    // Metodos heredados de la clase padre Animal
    @Override
    public void emitirSonido(){
        System.out.println("El reptil esta emitiendo sonido...");
    }
    
    @Override
    public void comer(){
        System.out.println("El reptil esta comiendo...");
    }
    
    @Override
    public void jugar(){
        System.out.println("El reptil esta jugando...");
    }
    
    // Metodos
    public void desplazamiento(){
    }
    
    public void cazar(){
    }
    
    public void defenza(){
    }
    
    public void mudarPiel(){
    }
    
    public void regularTemperatura(){
    }

}
