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
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble l= new ListaDoble();
        System.out.println("Insertar datos");
        l.insertarinicio(new Persona(51850, "Juan","ingeniero"));
        l.insertarinicio(new Persona(15646, "Alberto","Docente"));
        l.insertarinicio(new Persona(48545, "Camilo","Biologo"));
        l.insertarinicio(new Persona(621984, "Hugo","Alcalde"));
        l.insertarinicio(new Persona(79846, "Julian","Agroecologo"));
        l.insertarinicio(new Persona(65498, "Santiago","Motero"));
        l.insertarinicio(new Persona(654654, "Maria","Psicologa"));
        System.out.println(l.MostarInicioUltimo());
//        l.EliminarInicio();
//        System.out.println("ELIMINAR DESDE EL INCIO");
//        System.out.println(l.MostarInicioUltimo());
//        
        l.InsertarEnMedio("Hugo", new Persona(51850, "Juan","ingeniero"));
        l.MostarInicioUltimo();
    }
    
}
