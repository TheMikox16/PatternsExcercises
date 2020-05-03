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
 * @author Miguel Angel Egoavil Mathison
 */
public interface AbstractBuilder {
    
    public abstract void buildProject();
    
    public abstract void buildName(String name);
    
    public abstract void buildManager(Employee manager);
    
    public abstract void buildWeeks(int weeks);
    
    public abstract void builDate(TreeSet<Date> dates);
    
    public abstract Project getProject() throws ProjectException;
    
}
