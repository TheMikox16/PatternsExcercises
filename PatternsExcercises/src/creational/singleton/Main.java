/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton;

/**
 *
 * Clase Main que prueba el patron Singleton
 * mediante diversos llamados y datos creados.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Main {
    
    public static void main(String[] args){
        
        QueueSingleton queue = QueueSingleton.getQueue();
        queue.enqueue("Hola");
        System.out.println("Scando elementos de la cola:");        
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        queue.enqueue(2);
        System.out.println(queue.peek());
        
    }
    
}
