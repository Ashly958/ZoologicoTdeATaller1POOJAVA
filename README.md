# **Sistema de registro de animales en zoológico 🦍**

## Descripción 
Este ejercicio se creó principalmente para poner en practica los conceptos de polimorfismo, herencia sobreescritura de métodos 💻.
Este sistema busca simular el registro de los animales de un zoologico 🐆.

# **Requisitos para ejecutar el codigo 📋**
- Java JDK 17 o superior  
- IDE recomendado: IntelliJ IDEA o NetBeans  
- Sistema operativo: Windows, Linux o macOS

# **USO 👩🏻‍💻**
1. Clona este repositorio  
2. Abre el proyecto en tu IDE  
3. Ejecuta la clase `Main.java`

## **Estructura de los archivos 📂**
```
├── Source Packages/
│     ├── Usuario.java ← Clase base (superclase)
│     ├── Admin.java ← Hereda de Usuario
│     ├── Cuidador.java ← Hereda de Usuario
│     ├── Animal.java ← Clase base (superclase)
|     ├── Mamifero.java ← Hereda de Animal
|     ├── Leon.java ← Hereda de Mamifero
|     ├── Mono.java ← Hereda de Mamifero
|     ├── Reptil.java ← Hereda de Animal
|     ├── Serpiente.java ← Hereda de Reptil
|     ├── TotugaMarina.java ← Hereda de Reptil
│     └── Main.java ← Clase principal (main)
```

## Ejemplo de ejecución 🖥️
```
___________________________________________________________________
______________________________ USER1 _____________________________________
Usuario 1 Nombre: Ashly
Usuario 1 Id: 958
_______________________________ ADMIN 1 ____________________________________
Administrador 1 Nombre: ASHLY
Administrador 1 Id: 9580
Leyendo registro de admin...
Administrador ASHLY logeado.
Registrando animal...
El registro del animal fue exitoso...
Clasificando animal...
La clasificacion de los animales fue exitosa...
Mostrando informacion de los cuidadores...
Editando informacion de los animales...
Eliminando animal...
____________________________ CUIDADOR 1 _______________________________________
Cuidador 1 Nombre: Patricia
Cuidador 1 Id: 981
Leyendo registro de cuidador...
Cuidador Patricia logeado.
Inspeccionando zoologico...
gestionando animales...
Mostrando registro de animal...
Actualizando estado...
```

# **Autor 🌸💻**
Desarrollado por Ashly Nicole  
Ingeniería de Software – 2025
