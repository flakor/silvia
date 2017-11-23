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
public class Colecciones {
    
    public static void main(String[] args){
    ArrayList<String> lista = new ArrayList<String>();
    
    lista.add("Elemento 1");
    lista.add("Elemento 2");
    lista.add("Elemento 3");
    lista.add("Elemento 4");
    lista.add("Elemento 5");
    lista.add("Elemento 6");
    int x = lista.size();
        System.out.println("CAntidad de elementos"+x);
        Iterator<String> xx = lista.iterator();
        while(xx.hasNext())
        {
            String elemento = xx.next();
            System.out.println(elemento);
        
        }    
  
 }
}
