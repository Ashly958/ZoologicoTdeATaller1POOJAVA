/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */

public class Leon extends Mamifero{
    public String pelaje;
    public String fuerza;
    public String territorio;
    public boolean liderManada;
    
    public Leon(String clasificacion, int edad, double peso, double altura, String habitat, String alimentacion, String reproduccion, String especie, String tipoSangre, String pelaje, String fuerza, String territorio, boolean liderManada){
        super(clasificacion, edad, peso, altura, habitat, alimentacion, reproduccion, especie, tipoSangre);
        this.pelaje = pelaje;
        this.fuerza = fuerza;
        this.territorio = territorio;
        this.liderManada = liderManada;
    }
    
    // getters
    public String getPelaje() {
        return pelaje;
    }

    public String getFuerza() {
        return fuerza;
    }

    public String getTerritorio() {
        return territorio;
    }

    public boolean getLiderManada() {
        return liderManada;
    }
    
    // Metodos heredados desde la clase padre Mamifero
    @Override
    public void desplazamiento(){
        System.out.println("El leon se esta desplazando...");
    }
    
    @Override
    public void cazar(){
        System.out.println("El leon esta cazando...");
    }

    // Metodos
    public void atacar(){
        System.out.println("El leon esta atacando...");
    }
    
    public void rugir(){
        System.out.println("El leon esta regiendo...");
    }
    
    public void defenderManada(){
        System.out.println("El leon esta defendiendo la manada...");
    }
    
    public void descansando(){
        System.out.println("El leon esta descansando...");
    }
    
}
