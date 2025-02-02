
import java.util.Scanner;
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
        runEjerccios();
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
 
    private static void runEjerccios() {
        System.out.println("*****EJERCICIO DE ANAGRAMAS******");
        Ejercicios ejercicios = new Ejercicios();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la primera palabra: ");
        String str1 = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String str2 = scanner.nextLine();

        System.out.println(Ejercicios.areAnagrams(str1, str2));  
        
        System.out.println("*****EJERCICIO DE SUMATORIA******");
        System.out.println("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.println("Ingrese el objetivo: ");
        int objetivo = scanner.nextInt();
        ejercicios.sumatoriaDeDos(nums, objetivo);

        scanner.close();
    }
}
