/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Main {
    
    public static void main(String[] args){
        Indentation indentation = new Indentation();
        
        Employee emp1 = new Employee("Miguel Egoavil", "B92695", indentation);
        Employee emp2 = new Employee("Kevin Murillo", "NE9293", indentation);
        Employee emp3 = new Employee("Sean Campos Siles", "D320943", indentation);
        
        Department dep1 = new Department("DEP1", emp1, indentation);
        Department dep2 = new Department("DEP2", emp2, indentation);
        Department dep3 = new Department("DEP3", emp3, indentation);
        
        Employee emp4 = new Employee("Gustavo", "F92235", indentation);
        Employee emp5 = new Employee("Daniel", "IO9d345", indentation);
        Employee emp6 = new Employee("Carlos", "G32432", indentation);
        Employee emp7 = new Employee("Augusto", "Y290943", indentation);
        Employee emp8 = new Employee("Denis", "Pl2934", indentation);
        Employee emp9 = new Employee("Mangel", "W932034", indentation);
        
        dep1.addEmployee(emp1);
        dep1.addEmployee(emp4);
        dep1.addEmployee(emp6);
        
        dep2.addEmployee(emp2);
        dep2.addEmployee(emp5);
        dep2.addEmployee(emp8);
        
        dep3.addEmployee(emp3);
        dep3.addEmployee(emp7);
        dep3.addEmployee(emp9);
        
        dep1.add(dep2);
        dep2.add(dep3);
        
        System.out.println(dep1.ls());
        System.out.println("\n\n" + dep2.ls());
        
        System.out.println("Total empleados desde DEP1: " + dep1.totalEmployees());
        System.out.println("Total empleados desde DEP2: " + dep2.totalEmployees());
    }
    
}
