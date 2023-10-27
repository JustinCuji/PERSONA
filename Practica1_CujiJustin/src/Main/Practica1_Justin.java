package Main;

import Vista.Vista;
import controlador.Controlador;

public class Practica1_Justin {
	 public static void main(String[] args) {
	        Vista vista = new Vista();  // Crea un objeto de la clase Vista para la interfaz de usuario
	        Controlador controlador = new Controlador(vista);  // Crea un objeto de la clase Controlador y le pasa la Vista

	        controlador.ejecutar();  // Inicia la ejecución del programa a través del Controlador
	    }
}
