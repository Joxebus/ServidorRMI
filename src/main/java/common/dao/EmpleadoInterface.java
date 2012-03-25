package common.dao;

import java.util.List;

import common.entities.Empleado;

public interface EmpleadoInterface {

    public void addEmpleado(Empleado empleado);

    public void removeEmpleado(Empleado empleado);

    public List<Empleado> getEmpleados();

}

