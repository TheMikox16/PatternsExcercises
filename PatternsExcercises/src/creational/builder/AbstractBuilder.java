/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.util.TreeSet;
import java.util.Date;

/**
 *
 * Interfaz AbstractBuilder que se encarga de asegurar que constructor(builder)
 * de un determinado objeto implemente dichos metodos y para asegurarse de que
 * los mismos esten implementados al manejar el mismo por medio de una variable 
 * que lo instancie en el main.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public interface AbstractBuilder {
    
    public abstract void buildProject();
    
    public abstract void buildName(String name);
    
    public abstract void buildManager(Employee manager);
    
    public abstract void buildWeeks(int weeks);
    
    public abstract void builDate(TreeSet<Date> dates);
    
    public abstract Project getProject() throws ProjectException;
    
}
