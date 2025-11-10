/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Animal {
    public String clasificacion;
    public int edad;
    public double peso;
    public double altura;
    public String habitat;
    public String alimentacion;
    public String reproduccion;
    public String especie;
    
    // Constructor
    public Animal(String clasificacion, int edad, double peso, double altura, String habitat, String alimentacion, String reproduccion, String especie){
        this.clasificacion = clasificacion;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.especie = especie;
    }
    
    // Getters
    public String getClasificacion() {
        return clasificacion;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public String getEspecie() {
        return especie;
    }
    
    // Metodos
    public void emitirSonido(){
    }
    
    public void comer(){
    }
    
    public void jugar(){
    }
    
}
