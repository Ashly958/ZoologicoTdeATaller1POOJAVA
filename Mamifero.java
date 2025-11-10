/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Mamifero extends Animal{
    public String tipoSangre;
    public String reproduccion;
    
    // Constructor. no se pone el atributo reproduccion, se pone directamente el valor que heredaran por defecto las clase hijas.
    public Mamifero(String clasificacion, int edad, double peso, double altura, String habitat, String alimentacion, String especie, String Reproduccion, String tipoSangre){
        super(clasificacion, edad, peso, altura, habitat, alimentacion, "sexual", especie);
        this.reproduccion = "sexual";
        this.tipoSangre = "caliente";
    }
    
    // Getters
    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getTipoReproduccion() {
        return reproduccion;
    }
    
    // Metodos heredados de la clase padre Animal
    @Override
    public void emitirSonido(){
        System.out.println("El mamifero esta emitiendo sonido...");
    }
    
    @Override
    public void comer(){
        System.out.println("El mamifero esta comiendo...");
    }
    
    @Override
    public void jugar(){
        System.out.println("El mamifero esta jugando...");
    }
    
    // Metodos
    public void desplazamiento(){
    }
    
    public void cazar(){
    }
}
