package Modelo;

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
