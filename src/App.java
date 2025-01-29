import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runMapExample() {
        new Mapa();
        System.out.println();
    }
    
    private static void runEmpleadoExample() {
        System.out.println("*****EJERCICIO DE EMPLEADOS******");
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();
        empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Junior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Miguel", "Senior"));
    
        empleadoContoller.displayEmpleados();
        empleadoContoller.displayEmpleadosSoloNombres();
        empleadoContoller.displayLlaves();
        empleadoContoller.displayEmpleadosSinSet();
    }

    /* 
    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
        */
}
