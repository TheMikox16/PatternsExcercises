/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Project {
    
    private String name;
    private Employee manager;
    private int weeks;
    private TreeSet<Date> list;

    public Project() {
    }

    public Project(String name, Employee manager, int weeks) {
        this.name = name;
        this.manager = manager;
        this.weeks = weeks;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public int getWeeks() {
        return weeks;
    }

    public TreeSet<Date> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public void setList(TreeSet<Date> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Proyecto:\nNombre:" + name + "\nEncargado:\n" + manager.toString() 
                + "\nTiempo en semanas: " + weeks + "\nLista de fechas:\n" + print();
    }
    
    private String print(){
        String s = "";
        SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yy - hh:mm");
        Iterator<Date> iterator = list.iterator();
        while(iterator.hasNext()){
            s += simple.format(iterator.next()) + "\n";
        }
        return s;
    }
    
    public void add(Date date){
        list.add(date);
    }
    
    public void delete(Date date){
        list.remove(date);
    }
    
}
