/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

/**
 *
 * @author estudiante
 */
public class Persona {
    int cc;
    String nombre;
    String empleado;
    
    Persona(int cc, String nombre, String empleado){
    this.cc=cc;
    this.empleado=empleado;
    this.nombre=nombre;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Persona{" + "cc=" + cc + ", nombre=" + nombre + ", empleado=" + empleado + '}';
    }
}
