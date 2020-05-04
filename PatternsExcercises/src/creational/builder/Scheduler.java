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
 * Clase Scheduler que hace todos los llamados para counstruir cada parametro
 * de un Proyecto(Project). Esto hace mas estructurado el codigo ya que se
 * evita sobrecargar el main. En el Patron Builder, se encarga de gestionar
 * las llamadas a los constructores de atributos (builders).
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
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
