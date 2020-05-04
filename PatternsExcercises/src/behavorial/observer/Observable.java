/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

/**
 *
 * Interfaz Obseverbable que se encarga de que cualquier nuevo objeto pueda
 * cumplir con los reuisitos para gestionar una lista de observadores.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public interface Observable {
    
    public abstract void add(Observer observer);
    
    public abstract void delete(Observer observer);
    
    public abstract void notifyAllObservers();
    
}
