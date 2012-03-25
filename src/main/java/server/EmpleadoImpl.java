package server;

import common.dao.EmpleadoInterface;
import common.entities.Empleado;

import java.util.ArrayList;
import java.util.List;



public class EmpleadoImpl implements EmpleadoInterface {

    private List<Empleado> empleados = new ArrayList<Empleado>();

    public void addEmpleado(Empleado empleado) {
        System.out.println("Recibiendo empleado");
        System.out.println(empleado);
        empleados.add(empleado);
    }

    public void removeEmpleado(Empleado empleado) {
        System.out.println("Eliminando empleado");
        System.out.println(empleado);
        empleados.remove(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
