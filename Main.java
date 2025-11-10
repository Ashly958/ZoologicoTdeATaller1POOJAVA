/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author ashly
 */
public class Main {
        public static void main(String[] args) {
            // Creacion de objetos
            User user1 = new User("Ashly", 958, "ashly958");
            
            Admin admin1 = new Admin("ASHLY", 9580, "Nicole958");
            
            Cuidador cuidador1 = new Cuidador("Patricia", 981, "Patri981");
            
            Animal animal1 = new Animal("animal", 0, 0.0, 0.0, "habitat", "alimentacion", "reproduccion", "especie");
            
            Mamifero mamifero1 = new Mamifero("mamifero", 0, 0.0, 0.0, "habitat", "alimentacion", "sexual", "especie", "caliente");
            
            Reptil reptil1 = new Reptil("reptil", 0, 0.0, 0.0, "habitat", "alimentacion", "huevos", "especie", "Fria");
            
            Leon leon1 = new Leon("Mamifero", 8, 190.5, 1.3, "Sabana", "Carnivoro", "caliente", "Sexual", "Leon africano", "Denso", "Alta", "Africa", true);

            Mono mono1 = new Mono("Mamifero", 4, 35.2, 0.9, "Selva", "Sexual", "Mono", "caliente", "Frugivoro",  "Capuchino", "Excelente para trepar");

            Serpiente serpiente1 = new Serpiente("Reptil", 2, 15.0, 0.5, "Desierto","Carnivoro", "Ovipara", "Serpiente", "Fria", true, 2.3, "Verde");

            TortugaMarina tortuga1 = new TortugaMarina("Reptil", 50, 200.0, 1.0, "Oceano", "Omnivoro", "Ovipara", "Tortuga marina", "Fria", 20.5, "Verde", 100.0);
            
            // Ejecucion de los metodos
            System.out.println("___________________________________________________________________");
            System.out.println("______________________________ USER1 _____________________________________");
            System.out.println("Usuario 1 Nombre: "+user1.getNombre());
            System.out.println("Usuario 1 Id: "+user1.getId());
            //System.out.println("Usuario 1 Password: "+user1.getPassword());
            System.out.println("_______________________________ ADMIN 1 ____________________________________");
            System.out.println("Administrador 1 Nombre: "+admin1.getNombre());
            System.out.println("Administrador 1 Id: "+admin1.getId());
            admin1.leerRegistroPropio();
            admin1.logear();
            admin1.registrarAnimales();
            admin1.clasificarAnimales();
            admin1.gestionarCuidadores();
            admin1.editarInfoAnimales();
            admin1.eliminarAnimales();
            System.out.println("____________________________ CUIDADOR 1 _______________________________________");
            System.out.println("Cuidador 1 Nombre: "+cuidador1.getNombre());
            System.out.println("Cuidador 1 Id: "+cuidador1.getId());
            cuidador1.leerRegistroPropio();
            cuidador1.logear();
            cuidador1.inspeccionar();
            cuidador1.gestionarAnimales();
            cuidador1.leerRegistroAnimales();
            cuidador1.actualizarEstado();
            System.out.println("_______________________________ ANIMAL 1 ____________________________________");
            System.out.println("Clasificacon: "+animal1.getClasificacion());
            System.out.println("Edad: "+animal1.getEdad());
            System.out.println("Peso: "+animal1.getPeso());
            System.out.println("Altura: "+animal1.getAltura());
            System.out.println("Habitat: "+animal1.getHabitat());
            System.out.println("Alimentacion: "+animal1.getAlimentacion());
            System.out.println("Reproduccion: "+animal1.getReproduccion());
            System.out.println("Especie: "+animal1.getEspecie());
            System.out.println("______________________________ MAMIFERO 1 _____________________________________");
            System.out.println("Clasificacon: "+mamifero1.getClasificacion());
            System.out.println("Edad: "+mamifero1.getEdad());
            System.out.println("Peso: "+mamifero1.getPeso());
            System.out.println("Altura: "+mamifero1.getAltura());
            System.out.println("Habitat: "+mamifero1.getHabitat());
            System.out.println("Alimentacion: "+mamifero1.getAlimentacion());
            System.out.println("Reproduccion: "+mamifero1.getReproduccion());
            System.out.println("Especie: "+mamifero1.getEspecie());
            System.out.println("Tipo de sangre: "+mamifero1.getTipoSangre());
            System.out.println("Reproduccion: "+mamifero1.getTipoReproduccion());
            mamifero1.emitirSonido();
            mamifero1.comer();
            mamifero1.jugar();
            System.out.println("______________________________ LEON 1 _____________________________________");
            System.out.println("Clasificacon: "+leon1.getClasificacion());
            System.out.println("Edad: "+leon1.getEdad());
            System.out.println("Peso: "+leon1.getPeso());
            System.out.println("Altura: "+leon1.getAltura());
            System.out.println("Habitat: "+leon1.getHabitat());
            System.out.println("Alimentacion: "+leon1.getAlimentacion());
            System.out.println("Reproduccion: "+leon1.getReproduccion());
            System.out.println("Especie: "+leon1.getEspecie());
            System.out.println("Tipo de sangre: "+leon1.getTipoSangre());
            System.out.println("Reproduccion: "+leon1.getTipoReproduccion());
            System.out.println("Pelaje: "+leon1.getPelaje());
            System.out.println("Fuerza: "+leon1.getFuerza());
            System.out.println("Territorio: "+leon1.getTerritorio());
            System.out.println("Lider Manada: "+leon1.getLiderManada());
            leon1.desplazamiento();
            leon1.cazar();
            leon1.atacar();
            leon1.rugir();
            leon1.defenderManada();
            leon1.descansando();
            System.out.println("_______________________________ MONO 1 ____________________________________");
            System.out.println("Clasificacon: "+mono1.getClasificacion());
            System.out.println("Edad: "+mono1.getEdad());
            System.out.println("Peso: "+mono1.getPeso());
            System.out.println("Altura: "+mono1.getAltura());
            System.out.println("Habitat: "+mono1.getHabitat());
            System.out.println("Alimentacion: "+mono1.getAlimentacion());
            System.out.println("Reproduccion: "+mono1.getReproduccion());
            System.out.println("Especie: "+mono1.getEspecie());
            System.out.println("Tipo de sangre: "+mono1.getTipoSangre());
            System.out.println("Reproduccion: "+mono1.getTipoReproduccion());
            System.out.println("Tipo de mono: "+mono1.getTipoMono());
            System.out.println("Habilidad para trepar: "+mono1.getHabilidadTrepar());
            mono1.desplazamiento();
            mono1.cazar();
            mono1.trepar();
            mono1.chillar();
            mono1.buscarComida();
            System.out.println("______________________________ REPTIL 1 _____________________________________");
            System.out.println("Clasificacon: "+reptil1.getClasificacion());
            System.out.println("Edad: "+reptil1.getEdad());
            System.out.println("Peso: "+reptil1.getPeso());
            System.out.println("Altura: "+reptil1.getAltura());
            System.out.println("Habitat: "+reptil1.getHabitat());
            System.out.println("Alimentacion: "+reptil1.getAlimentacion());
            System.out.println("Reproduccion: "+reptil1.getReproduccion());
            System.out.println("Especie: "+reptil1.getEspecie());
            System.out.println("Tipo de sangre: "+reptil1.getTipoSangre());
            reptil1.emitirSonido();
            reptil1.comer();
            reptil1.jugar();
            System.out.println("______________________________ SERPIENTE 1 _____________________________________");
            System.out.println("Clasificacon: "+serpiente1.getClasificacion());
            System.out.println("Edad: "+serpiente1.getEdad());
            System.out.println("Peso: "+serpiente1.getPeso());
            System.out.println("Altura: "+serpiente1.getAltura());
            System.out.println("Habitat: "+serpiente1.getHabitat());
            System.out.println("Alimentacion: "+serpiente1.getAlimentacion());
            System.out.println("Reproduccion: "+serpiente1.getReproduccion());
            System.out.println("Especie: "+serpiente1.getEspecie());
            System.out.println("Tipo de sangre: "+serpiente1.getTipoSangre());
            System.out.println("Venenosa: "+serpiente1.getVenenosa());
            System.out.println("Longitud: "+serpiente1.getLongitud());
            System.out.println("Color: "+serpiente1.getColor());
            serpiente1.emitirSonido();
            serpiente1.comer();
            serpiente1.jugar();
            serpiente1.desplazamiento();
            serpiente1.cazar();
            serpiente1.defenza();
            serpiente1.mudarPiel();
            serpiente1.regularTemperatura();
            serpiente1.atacar();
            System.out.println("____________________________ TORTUGA MARINA 1 _______________________________________");
            System.out.println("Clasificacon: "+tortuga1.getClasificacion());
            System.out.println("Edad: "+tortuga1.getEdad());
            System.out.println("Peso: "+tortuga1.getPeso());
            System.out.println("Altura: "+tortuga1.getAltura());
            System.out.println("Habitat: "+tortuga1.getHabitat());
            System.out.println("Alimentacion: "+tortuga1.getAlimentacion());
            System.out.println("Reproduccion: "+tortuga1.getReproduccion());
            System.out.println("Especie: "+tortuga1.getEspecie());
            System.out.println("Tipo de sangre: "+tortuga1.getTipoSangre());
            System.out.println("Velocidad de Nado: "+tortuga1.getVelocidadNado());
            System.out.println("Color: "+tortuga1.getColor());
            System.out.println("Profundidad maxima: "+tortuga1.getProfundidadMaxima());
            tortuga1.emitirSonido();
            tortuga1.comer();
            tortuga1.jugar();
            tortuga1.desplazamiento();
            tortuga1.cazar();
            tortuga1.defenza();
            tortuga1.mudarPiel();
            tortuga1.regularTemperatura();
            tortuga1.ponerHuevos();
            tortuga1.esconderse();
            tortuga1.alimentarse();
            tortuga1.migrar();
            System.out.println("___________________________________________________________________");
        }
}
