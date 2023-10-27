package Vista;

import java.util.Scanner;

import Modelo.Asignatura;
import Modelo.Estudiante;
import Modelo.Profesor;

public class Vista {
	 private Scanner scanner;  // Objeto Scanner para entrada de datos

     //  Constructor de la clase Vista.
     
    public Vista() {
        scanner = new Scanner(System.in);
    }
// Método para permitir al usuario ingresar información sobre un Estudiante. 
    public Estudiante ingresarEstudiante() {
        System.out.print("Nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad del estudiante: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Identificación mágica del estudiante: ");
        String identificacionMagica = scanner.nextLine();

        return new Estudiante(nombre, edad, identificacionMagica);
    }
// Método para permitir al usuario ingresar información sobre un Profesor.
     
    public Profesor ingresarProfesor() {
        System.out.print("Nombre del profesor: ");
        String nombre = scanner.nextLine();
        System.out.print("Especialidad mágica del profesor: ");
        String especialidadMagica = scanner.nextLine();

        return new Profesor(nombre, especialidadMagica);
    }
//Método para permitir al usuario ingresar información sobre una Asignatura.
    public Asignatura ingresarAsignatura() {
        System.out.print("Nombre de la asignatura: ");
        String nombre = scanner.nextLine();
        System.out.print("Código especial de la asignatura: ");
        String codigoEspecial = scanner.nextLine();

        return new Asignatura(nombre, codigoEspecial);
    }
 // informacion La información que se mostrará en la consola.
    public void mostrarInformacion(String informacion) {
        System.out.println(informacion);
    }
//Método para cerrar el objeto Scanner.
    public void cerrarScanner() {
        scanner.close();
    }
//informacion La información que se mostrará en la consola.
    public void mostrarInformación(String informacion) {
         System.out.println(informacion);
    }
}
