package Modelo;  // En este package se encuentra la clase ESTUDIANTE

public class Estudiante {
	private String nombre;               // Nombre del estudiante
    private int edad;                    // Edad del estudiante
    private String identificacionMagica; // Identificación mágica del estudiante
  
 // Constructor 
    public Estudiante(String nombre, int edad, String identificacionMagica) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacionMagica = identificacionMagica;
    }
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacionMagica() {
        return identificacionMagica;
    }

    public void setIdentificacionMagica(String identificacionMagica) {
        this.identificacionMagica = identificacionMagica;
    }
    // Override 
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", identificacionMagica=" + identificacionMagica + "]";
    }
}
