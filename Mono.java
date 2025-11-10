/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Mono extends Mamifero{
    public String tipoMono;
    public String habilidadTrepar;
    
    public Mono (String clasificacion, int edad, double peso, double altura, String habitat, String alimentacion, String reproduccion, String especie, String tipoSangre, String  tipoMono, String habilidadTrepar){
        super(clasificacion, edad, peso, altura, habitat, alimentacion, reproduccion, especie, tipoSangre);
        this.tipoMono = tipoMono;
        this.habilidadTrepar = habilidadTrepar;
    }
    
    // getters
    public String getTipoMono() {
        return tipoMono;
    }
    
    public String getHabilidadTrepar() {
        return habilidadTrepar;
    }
    
    // Metodos heredados desde la clase padre Mamifero
    @Override
    public void desplazamiento(){
        System.out.println("El mono se esta desplazando...");
    }
    
    @Override
    public void cazar(){
        System.out.println("El mono esta cazando...");
    }
    
    // Metodos
    public void trepar(){
        System.out.println("El mono se esta trepando...");
    }
    
    public void chillar(){
        System.out.println("El mono esta chillando...");
    }
    
    public void buscarComida(){
        System.out.println("El mono esta buscando comida...");
    }
}
