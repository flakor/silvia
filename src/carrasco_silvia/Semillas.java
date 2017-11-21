/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrasco_silvia;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chkdsk
 */
public class Semillas {
    ArrayList<Semilla>  semillas = new ArrayList<Semilla>();
    
    
    Semilla semilla = new Semilla();
    
    public void agregar(Semilla objSemilla){
     semillas.add(semilla);
        
    }
    public int totalSemillas(){
        
        return semillas.size();
    }

 public void imprimirTodos(){
     for (int i = 0; i < this.totalSemillas(); i++) {
         
       semilla = (Semilla)semillas.get(0);
       System.out.println("ID: "+semilla.getCodigo());
         System.out.println("Nombre: "+semilla.getNombre());
         System.out.println("Precio : "+semilla.getPrecio());
     }
 }
}
