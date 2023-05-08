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
public class ListaDoble {

    Nodo inicio;
    Nodo ultimo;
    int tamano;

    ListaDoble(){
        this.inicio = null;
        this.ultimo = null;
        this.tamano = 0;

    }

    boolean Vacio() {
        return inicio == null;
    }

    void insertarinicio(Persona empleado) {
        if (Vacio()) {
            inicio = ultimo = new Nodo(empleado);
        } else {
            inicio = new Nodo(empleado, inicio, null);
            inicio.siguiente.anterior = inicio;

        }
        tamano++;
    }

    void insertarfinal(Persona empleado) {
        if (Vacio()) {
            inicio = ultimo = new Nodo(empleado);
        } else {
            ultimo = new Nodo(empleado, ultimo, null);
            ultimo.anterior.siguiente = ultimo;

        }
        tamano++;
    }
    //error esta aqui
   void InsertarEnMedio(String nombre, Persona empleado) {
        Nodo aux = inicio;
        
        while (aux !=null || !aux.empleado.nombre.equals(nombre)) {
            Nodo nuevo = new Nodo(empleado, aux.siguiente, null);
            nuevo.siguiente=aux.siguiente;
            aux.siguiente.anterior=nuevo;
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
            
        }tamano++;
   }
    void EliminarInicio(){
        Nodo aux= inicio;
    if(inicio==ultimo){
        inicio=ultimo=null;    
    }else{
    inicio=inicio.siguiente;
    inicio.anterior=null;
    aux=null;
    }
    tamano--;
    }
    void EliminarUltimo(){
        
    if(inicio==ultimo){
        inicio=ultimo=null;    
    }else{
    ultimo=ultimo.anterior;
    ultimo.siguiente=null;
    
    }
    tamano--;
    }
    
    
    
    String MostarInicioUltimo() {
        Nodo aux = inicio;
        String lista = "";
        while (aux != null) {
            lista += aux.empleado + "\n";
            aux = aux.siguiente;

        }
        return lista;
    }

    String MostarUltimoInicio() {
        Nodo aux = ultimo;
        String lista = "";
        while (aux != null) {
            lista += aux.empleado + "\n";
            aux = aux.anterior;

        }
        return lista;
    }
}
