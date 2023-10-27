/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Profesor {

    private String nombre;                  // Almacena el nombre del profesor
    private String especialidadMagica;      // Almacena la especialidad mágica del profesor
//costructor 

    public Profesor(String nombre, String especialidadMagica) {
        this.nombre = nombre;
        this.especialidadMagica = especialidadMagica;
    }
// Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidadMagica() {
        return especialidadMagica;
    }

    public void setEspecialidadMagica(String especialidadMagica) {
        this.especialidadMagica = especialidadMagica;
    }
// Override 
    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", especialidadMagica=" + especialidadMagica + "]";
    }
}
