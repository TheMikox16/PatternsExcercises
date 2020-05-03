/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.util.Date;
import java.util.TreeSet;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Scheduler {
    
    public Project createProject(AbstractBuilder builder, String name, 
            Employee manager, int weeks, TreeSet<Date> dates) throws ProjectException{
        if(builder == null){
            builder = new ProjectBuilder();
        }
        builder.buildProject();
        builder.buildName(name);
        builder.buildManager(manager);
        builder.buildWeeks(weeks);
        builder.builDate(dates);
        return builder.getProject();
    }
    
}
