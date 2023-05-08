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
public class Nodo {
    Nodo siguiente;
    Nodo anterior;
    Persona empleado;
   
    
    Nodo(Persona empleado){
    this.empleado=empleado;
    siguiente=anterior=null;
    }
    
    Nodo(Persona empleado, Nodo siguiente, Nodo anterior){
   this.empleado=empleado;
    this.siguiente=siguiente;
    this.anterior=anterior;
    
    }
}
