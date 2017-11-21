/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrasco_silvia;

import javax.swing.text.StyledEditorKit;
import java.util.*;

/**
 *
 * @author chkdsk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion del objeto semillas que guarda una lista de semillas
        Semillas semillas = new Semillas();
            
        Semilla semilla1 = new Semilla("Girasol", 1, 500);
        Semilla semilla2 = new Semilla("Rosa", 2, 250);
        Semilla semilla3 = new Semilla("Palto", 3, 1000);
        semillas.agregar(semilla1);
        semillas.agregar(semilla2);
        semillas.agregar(semilla3);
  
        System.out.println(semilla1.getNombre());
        semillas.imprimirTodos();
        
        }
        

    }
    
 
    

