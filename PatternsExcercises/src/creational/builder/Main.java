/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.util.Calendar;
import java.util.Date;
import java.util.TreeSet;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Main {
    
    public static void main(String[] args){
        Project project = null;
        AbstractBuilder builder = new ProjectBuilder();
        Scheduler scheduler = new Scheduler();
        
        
        try{
            System.out.println("Crear un Projecto con ProjectBuilder");
            project = scheduler.createProject(builder, "Videojuegos",
                    new Employee("Miguel Egoavil", "B92695"), 10, createDates(10));
            System.out.println("Proyecto creado exitosamente");
            System.out.println("Informacion de Proyecto:" +
                    project.toString() + "\n");
        }catch(ProjectException ex){
            System.out.println(ex.getMessage() + "\n");
        }
        
        //erroneos
        
        try{
            System.out.println("Crear otro Projecto con ProjectBuilder");
            project = scheduler.createProject(null, "Videojuegos",
                    new Employee("Miguel Egoavil", ""), 10, createDates(10));
            System.out.println("Proyecto creado exitosamente");
            System.out.println("Informacion de Proyecto:" +
                    project + "\n");
        }catch(ProjectException ex){
            System.out.println(ex.getMessage() + "\n");
        }
        
        try{
            System.out.println("Crear otro Projecto con ProjectBuilder");
            project = scheduler.createProject(null, "Videojuegos",
                    new Employee("Miguel Egoavil", "BFUe203"), -1, createDates(10));
            System.out.println("Proyecto creado exitosamente");
            System.out.println("Informacion de Proyecto:" +
                    project + "\n");
        }catch(ProjectException ex){
            System.out.println(ex.getMessage() + "\n");
        }
        
        try{
            System.out.println("Crear otro Projecto con ProjectBuilder");
            project = scheduler.createProject(null, "Videojuegos",
                    new Employee("Miguel Egoavil", "Biduwq39090"), 10, null);
            System.out.println("Proyecto creado exitosamente");
            System.out.println("Informacion de Proyecto:" +
                    project + "\n");
        }catch(ProjectException ex){
            System.out.println(ex.getMessage() + "\n");
        }
        
    }
    
    public static TreeSet createDates(int n){
        TreeSet<Date> group = new TreeSet<>();
        for (int i = 0; i < n; i++){
            group.add(createDate((int) Math.floor(Math.random()*(2020-2060+1)+2060),
                    (int)Math.floor(Math.random()*(1-12+1)+12), 
                    (int)Math.floor(Math.random()*(1-30+1)+30),
                    (int)Math.floor(Math.random()*(0-23+1)+23), 
                    (int) Math.floor(Math.random()*(0-60+1)+60)));
        }
        return group;
    }
    
    public static Date createDate(int year, int month, int day, int hour, int minute) {
        Calendar creator = Calendar.getInstance();
        creator.set(year, month, day, hour, minute);
        return creator.getTime();
    }
    
}
