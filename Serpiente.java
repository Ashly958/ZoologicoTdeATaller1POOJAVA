/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Serpiente extends Reptil{
    public boolean venenosa;
    public double longitud;
    public String color;
    
    public Serpiente(String clasificacion, int edad, double peso, double altura, String habitat, String alimentacion, String reproduccion, String especie, String tipoSangre, boolean venenosa, double longitud, String color){
        super(clasificacion, edad, peso, altura, habitat, alimentacion, reproduccion, especie, tipoSangre);
        this.venenosa = false;
        this.longitud = longitud;
        this.color = color;
    }
    
    // getters
    public boolean getVenenosa() {
        return venenosa;
    }
    
    public double getLongitud() {
        return longitud;
    }
    
    public String getColor() {
        return color;
    }
    
    // Metodos heredados desde la clase padre Reptil
    @Override
    public void desplazamiento(){
        System.out.println("La serpiente se esta desplazando...");
    }
    
    @Override
    public void cazar(){
        System.out.println("La serpiente esta cazando...");
    }
    
    @Override
    public void defenza(){
        System.out.println("La serpiente se esta defendiendo...");
    }
    
    @Override
    public void mudarPiel(){
        System.out.println("La serpiente esta mudando de piel...");
    }
    
    @Override
    public void regularTemperatura(){
        System.out.println("La serpiente esta regulando su temperatura...");
    }
    
    //Metodos 
    public void atacar(){
        System.out.println("La serpiente esta atacando...");
    }
    
}
