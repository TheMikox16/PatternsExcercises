/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * ClaseQueueSingleton que implementa el Patron Singleton.
 * El proposito de este patron es regular las instancias
 * que se puedan generar del mismo y controlarlas
 * mediante metodos eficientes que permitan el manejo
 * de la misma
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 * @param <T>
 */
public class QueueSingleton<T> {
   
    private static QueueSingleton instance;
    private final Queue<T> queue = new LinkedList<>();

    private QueueSingleton() {
    }

    public static QueueSingleton getQueue(){
        if(instance == null){
            instance = new QueueSingleton();
        }
        return instance;
    }
    
    public void enqueue(T object){
        queue.add(object);
    }
    
    public T dequeue(){
        return queue.poll();
    }
    
    public T peek(){
        return queue.peek();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
}
