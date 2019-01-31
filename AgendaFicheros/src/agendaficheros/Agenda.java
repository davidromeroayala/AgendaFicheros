/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaficheros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;

/**
 *
 * @author Juanfran
 */
public class Agenda {
    
    private String propietario;
    //private Contacto[] vAgenda;
    private ArrayList<Contacto> vAgenda;

    public Agenda(String nombre) {
        this.propietario = nombre;
        vAgenda = iodatos.Fichero.cargarDatos();
    }
    
    public void añadirContacto(Contacto contacto){
        vAgenda.add(contacto);
    }
    
    public void mostrarContacto (String nombre){
        for (Contacto c: vAgenda){
             if (nombre.equalsIgnoreCase(c.getNombre()))
                 System.out.println(c);
        }
    }
    
    
    public void mostrarTodo (){
        for (Contacto c: vAgenda){
            System.out.println(c);
        }
    }
    
    public void borrarContacto (String dato){
        /*for (Contacto contacto : vAgenda) {
            if (contacto.getNombre().equalsIgnoreCase(dato) || 
                contacto.getTelefono().equalsIgnoreCase(dato)){
                vAgenda.remove(contacto);
                
            }
        }*/
        for (int i = 0; i < vAgenda.size(); i++) {
            if (vAgenda.get(i).getNombre().equalsIgnoreCase(dato) || 
                vAgenda.get(i).getTelefono().equalsIgnoreCase(dato)){
                vAgenda.remove(i);
            }
        }
    }
    
    public void editarContacto (String dato){
       /* for (int i = 0; i < vAgenda.size(); i++) {
            if (vAgenda.get(i).getNombre().equalsIgnoreCase(dato) || 
                vAgenda.get(i).getTelefono().equalsIgnoreCase(dato)){
                Scanner leer = new Scanner(System.in); 
                System.out.println("Dime el nuevo nombre y telefono");
                vAgenda.get(i).setNombre(leer.nextLine());
                vAgenda.get(i).setTelefono(leer.nextLine());
            }
        }*/
       Iterator<Contacto>it=vAgenda.iterator();
       while(it.hasNext()){
           Contacto c=it.next();
            if (c.getNombre().equalsIgnoreCase(dato) || 
                c.getTelefono().equalsIgnoreCase(dato)){
                Scanner leer = new Scanner(System.in); 
                System.out.println("Dime el nuevo nombre y telefono");
                c.setNombre(leer.nextLine());
                c.setNombre(leer.nextLine());
                c.setTelefono(leer.nextLine());
            }
       }
           
            
    }
    
}
