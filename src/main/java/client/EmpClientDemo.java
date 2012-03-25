package client;

import java.util.Iterator;
import java.util.List;

import common.dao.EmpleadoInterface;
import common.entities.Empleado;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpClientDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/rmi-client-context.xml");
        EmpleadoInterface employee = (EmpleadoInterface) ctx.getBean("empleadoService");
        employee.addEmpleado(new Empleado("Carlos Gutierrez", "Av. Belgrano 1363"));
        employee.addEmpleado(new Empleado("Marina Canes", "Las Heras 2114 PB"));
        List<Empleado> empleados = employee.getEmpleados();
        System.out.println("Cantidad Total de empleados: " + empleados.size());
        Iterator<Empleado> it = empleados.iterator();
        while (it.hasNext()) {
            Empleado emp = (Empleado) it.next();
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("Dirección: " + emp.getDireccion());
        }
    }
}
