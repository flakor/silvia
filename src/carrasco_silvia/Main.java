/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrasco_silvia;

import javax.swing.text.StyledEditorKit;
import java.util.*;
import java.io.*;

/**
 *
 * @author chkdsk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
              //Debo traer el Scanner para poder utilizar el ingreso de los datos de tipo numerico
        Scanner teclado = new Scanner(System.in);
        //Creo el objeto isr de tipo inputstreamreader para el uso de un objeto nuevo
        //llamado br de tipo bufferreader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //defino mis variables a utilizar y las inicializo.
        // Creacion del objeto semillas que guarda una lista de semillas
        //Semillas semillas = new Semillas();
        
        int numero =0;
        String nombre = " ";
       int cantidad = 0; 
      ArrayList<Semilla> arraylist=new ArrayList<Semilla>(); 
        do {
              
              
               System.out.println("MENU INGESE NUMERO COLECCION DE SEMILLAS o listar semillas");
                System.out.println("	1	.-	Arboretum Bernardo Beckar");
                System.out.println("	2	.-	Cactarium");
                System.out.println("	3	.-	Colecci�n de Cactus Ex�ticos y Plantas Crasas en Macetero");
                 System.out.println("	4	.-	Listar Semillas");
                   System.out.println("	5	.-	Salir");
                System.out.println("Ingrese un número");
                
                numero = teclado.nextInt(); 
            if (numero>0 && numero <6){
                
                  if(numero==1){
                   System.out.println("INGESE NOMBRE SEMILLAS Arboretum");
                  nombre= br.readLine();
                    System.out.println("INGESE CANTIDAD SEMILLAS Arboretum");
                  cantidad= teclado.nextInt();
                   Semilla semilla1=new Semilla(nombre, cantidad, 500);
                   arraylist.add(semilla1);
                     System.out.println("Presione una tecla para continuar...");
                   System.in.read();
                  }
                   if(numero==2){
                   System.out.println("INGESE NOMBRE SEMILLAS Cactarium");
                  nombre= br.readLine();
                    System.out.println("INGESE CANTIDAD SEMILLAS Cactarium");
                  cantidad= teclado.nextInt();
                   Semilla semilla1=new Semilla(nombre, cantidad, 500);
                   arraylist.add(semilla1);
                     System.out.println("Presione una tecla para continuar...");
                   System.in.read();
                  }
                    if(numero==3){
                   System.out.println("INGESE NOMBRE SEMILLAS rasas en Macetero");
                  nombre= br.readLine();
                    System.out.println("INGESE CANTIDAD SEMILLAS rasas en Macetero");
                  cantidad= teclado.nextInt();
                   Semilla semilla1=new Semilla(nombre, cantidad, 500);
                   arraylist.add(semilla1);
                    System.out.println("Presione una tecla para continuar...");
                   System.in.read();
                  }
                
                  if(numero==4){
                       System.out.println("LISTA DE SEMILLAS");
                      Iterator<Semilla> itr=arraylist.iterator();
                    while(itr.hasNext()){
                          Semilla semilla=(Semilla)itr.next();
                              System.out.println(semilla.getNombre());
                          }
                      System.out.println("Presione una tecla para continuar...");
                      System.in.read();

                  }
                     if(numero==5){
                  System.out.println("HASTA PRONTO....:D");
                  cantidad = 5;
                  }
                 
               
            }else 
            {
                System.out.println("El número ingresado no cumple condición");
            } 
         }while (cantidad>5);
           

     
        
        }
        

    }
    
 
    

