package Modelo;

public class Asignatura {
	private String nombre;          // Nombre de la Asignatura
    private String codigoEspecial;  // Código especial de la Asignatura
    
 //Contructor 
    public Asignatura(String nombre, String codigoEspecial) {
        this.nombre = nombre;
        this.codigoEspecial = codigoEspecial;
    }
    
    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEspecial() {
        return codigoEspecial;
    }

    public void setCodigoEspecial(String codigoEspecial) {
        this.codigoEspecial = codigoEspecial;
    }

    
// Override 
    @Override
    public String toString() {
        return "Asignatura [nombre=" + nombre + ", codigoEspecial=" + codigoEspecial + "]";
    }
}
