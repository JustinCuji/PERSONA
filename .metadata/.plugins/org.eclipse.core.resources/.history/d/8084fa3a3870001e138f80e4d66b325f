/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;  // Paquete de controlador

import Modelo.Asignatura;  // Importa la clase Asignatura desde el paquete Modelo
import Modelo.Estudiante;  // Importa la clase Estudiante desde el paquete Modelo
import Modelo.Profesor;    // Importa la clase Profesor desde el paquete Modelo
import Vista.Vista;        // Importa la clase Vista desde el paquete Vista


public class Controlador {

    private Vista vista;  // Objeto de la clase Vista para gestionar la interfaz con el usuario

    /**
     * Constructor del Controlador.
     *
     * @param vista La Vista que se utilizará para interactuar con el usuario.
     */
    public Controlador(Vista vista) {
        this.vista = vista;
    }

    /**
     * Método principal de ejecución del Controlador.
     *
     * Permite al usuario ingresar información sobre Estudiante, Profesor y
     * Asignatura, y muestra la información de estos objetos utilizando el
     * método toString() en la Vista.
     */
    public void ejecutar() {
        Estudiante estudiante = vista.ingresarEstudiante();   // Permite al usuario ingresar datos de Estudiante
        Profesor profesor = vista.ingresarProfesor();         // Permite al usuario ingresar datos de Profesor
        Asignatura asignatura = vista.ingresarAsignatura();   // Permite al usuario ingresar datos de Asignatura

        vista.mostrarInformacion("Información del Estudiante: " + estudiante.toString());  // Muestra información de Estudiante
        vista.mostrarInformacion("Información del Profesor: " + profesor.toString());    // Muestra información de Profesor
        vista.mostrarInformacion("Información de la Asignatura: " + asignatura.toString());  // Muestra información de Asignatura

        vista.cerrarScanner();  // Cierra el objeto Scanner en la Vista
    }
}
