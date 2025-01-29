package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;


    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    /*
     * Ingresar el empleado donde la clave sea el id
     * @param Empleado a ingresar al mapa
     * @return False si no ingreso porque ya existe
     *         True si ingreso correctamente
     */

    public boolean addEmpleado(Empleado empleado){
        if(empleados.containsKey(empleado.getId()))
            return false;
        
        empleados.put(empleado.getId(), empleado);
        return true;
    }

    /*
     * Buscar un empleado por su id
     * @param int id a ingresar al mapa
     * @return Empleado segun id
     */

    public Empleado getEmpleadoById(int id){
        return empleados.get(id);
    }

    public void displayEmpleados(){
        System.out.println("Empleados con llaves");
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey() +  " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres(){
        System.out.println("Nombres de empleados: ");
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey() +  " - " + empleadoEntry.getValue().getName());
        }
    }

    public void displayLlaves(){
        System.out.println("Llaves:");
        for(Integer empleadoEntry : empleados.keySet()){
            System.out.println(empleadoEntry);
        }
    }

    public void displayEmpleadosSinSet(){
        System.out.println("Empleados sin llaves:");
        for(Empleado empleadoEntry : empleados.values()){
            System.out.println(empleadoEntry);
        }
    }
}