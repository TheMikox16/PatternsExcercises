/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Department implements AbstractSub{
    
    private String name;
    private Employee manager;
    private ArrayList<Employee> employeeList;
    private ArrayList<AbstractSub> sublist;
    private Indentation indentation;

    public Department() {
    }

    public Department(String name, Employee manager, Indentation indentation) {
        this.name = name;
        this.manager = manager;
        this.indentation = indentation;
        sublist = new ArrayList<>();
        employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public ArrayList<AbstractSub> getSublist() {
        return sublist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setSublist(ArrayList<AbstractSub> sublist) {
        this.sublist = sublist;
    }

    public void setIndentation(Indentation indentation) {
        this.indentation = indentation;
    }
    
    public void add(AbstractSub sub){
        if(!sublist.contains(sub)){
            sublist.add(sub);
        }
    }
    
    public void delete(AbstractSub sub){
        sublist.remove(sub);
    }
    
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    
    public void deleteEmployee(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public String ls() {
        String s = indentation.getIndentation() + "Nombre: " + name + "\n"
                + indentation.getIndentation() + "Encargado:\n" + manager.ls() 
                + indentation.getIndentation() + "Lista de Empleados:\n" + print() + "\n";
        indentation.increaseIndentation();
        for (AbstractSub sub : sublist) {
            s += sub.ls();
        }
        indentation.decreaseIndentation();
        return s;
    }
    
    
    public int totalEmployees(){
        int n = 0;
        Iterator iterator = employeeList.iterator();
        while(iterator.hasNext()) {
            if(iterator.next() != null){
                n++;
            }
        }
        
        for(AbstractSub sub: sublist){
            Department temp = (Department) sub;
            n += temp.totalEmployees();
        }
        return n;
    }
    
    public String print(){
        String s = "";
        Iterator iterator = employeeList.iterator();
        while(iterator.hasNext()){
            Employee temp = (Employee) iterator.next();
            s += temp.ls();
        }
        return s;
    }
    
}
