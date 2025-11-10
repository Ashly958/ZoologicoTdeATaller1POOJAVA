/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class TortugaMarina extends Reptil{
    public double velocidadNado;
    public String color;
    public double profundidadMaxima;
    
    public TortugaMarina(String clasificacion, int edad, double peso, double altura, String habitat, String alimentacion, String reproduccion, String especie, String tipoSangre, double velocidadNado, String color, double profundidadMaxima){
        super(clasificacion, edad, peso, altura, habitat, alimentacion, reproduccion, especie, tipoSangre);
        this.velocidadNado = velocidadNado;
        this.color = color;
        this.profundidadMaxima = profundidadMaxima;
    }
    
    // getters
    public double getVelocidadNado() {
        return velocidadNado;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getProfundidadMaxima() {
        return profundidadMaxima;
    }
   
    // Metodos heredados desde la clase padre Reptil
    @Override
    public void desplazamiento(){
        System.out.println("La tortuga marina se esta desplazando...");
    }
    
    @Override
    public void cazar(){
        System.out.println("La tortuga marina esta cazando...");
    }
    
    @Override
    public void defenza(){
        System.out.println("La tortuga marina se esta defendiendo...");
    }
    
    @Override
    public void mudarPiel(){
        System.out.println("La tortuga marina esta mudando de piel...");
    }
    
    @Override
    public void regularTemperatura(){
        System.out.println("La tortuga marina esta regulando su temperatura...");
    }
    
    //Metodos 
    public void ponerHuevos(){
        System.out.println("La tortuga marina esta poniendo huevos...");
    }
    
    public void esconderse(){
        System.out.println("La tortuga marina se escondio...");
    }
    
    public void alimentarse(){
        System.out.println("La tortuga marina se esta alimentando...");
    }
    
    public void migrar(){
        System.out.println("La tortuga marina tuvo que migrar...");
    }
}
