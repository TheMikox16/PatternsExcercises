/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

import java.util.Date;

/**
 *
 * Clase Main que realiza las pruebas y llamdos
 * El patron Observer permite actualizar diferentes instancias de forma eficiente
 * y de manera automatica al hacerle un cambio a la misma, lo que permite mover
 * facilmente un dato de un apartado a otro y mejorando el despliegue del mismo.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Main {
    
    public static void main(String[] args){

        FligthObservable f1 = new FligthObservable();
        FligthObservable f2 = new FligthObservable();   
        FligthObservable f3 = new FligthObservable();   
        FligthObservable f4 = new FligthObservable();   
    
        f1.add(new Origin(f1));
        f1.add(new AllFligths(f1));
        
        f2.add(new Destiny(f2));
        f2.add(new AllFligths(f2));
        
        f3.add(new Origin(f3));
        f3.add(new AllFligths(f3));
        
        f4.add(new Destiny(f4));
        f4.add(new AllFligths(f4));
        
        f1.setAll("198310", false, "Gaviota Airlines", 10, "05:12");
        f2.setAll("23495", true, "Lopex Airlines", 12, "12:34");
        f3.setAll("134583", false, "Cigueña Airlines", 5, "13:52");
        f4.setAll("1340543", true, "Copa Airlines", 6, "18:47");
        
        System.out.println("Pantalla de vuelos:");
        f1.print(f1, f2, f3, f4);
        
        System.out.println("Pantalla de vuelos de destino:");
        f1.printDestinies(f1, f2, f3, f4);
        System.out.println("Pantalla de vuelos de origen:");
        f1.printOrigins(f1, f2, f3, f4);
        
    }
    
}
