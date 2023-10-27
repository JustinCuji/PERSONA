
package ups.edu.ec.practica1_justin;  

import Controlador.Controlador;  // Importa la clase Controlador desde el paquete Controlador
import Vista.Vista;  // Importa la clase Vista desde el paquete Vista


public class Practica1_Justin {

    public static void main(String[] args) {
        Vista vista = new Vista();  // Crea un objeto de la clase Vista para la interfaz de usuario
        Controlador controlador = new Controlador(vista);  // Crea un objeto de la clase Controlador y le pasa la Vista

        controlador.ejecutar();  // Inicia la ejecución del programa a través del Controlador
    }
}


