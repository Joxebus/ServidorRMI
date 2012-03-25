package common.entities;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private String direccion;

    public Empleado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String toString(){
        return "Nombre: "+this.nombre+"\nDirección: "+this.direccion;
    }

}

