/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.strategy;

/**
 *
 * @author Usuario
 */
public class Worker implements Comparable<Worker>{
   private String name;
   private String secondName;
   private String lastName;
   private String secondLastName;
   private String id;
   private int salary;

    public Worker() {
    }

    public Worker(String name, String secondName, String lastName, String secondLastName, String id, int salary) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondNombre) {
        this.secondName = secondNombre;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmpleado:\nNombre: " + name + "\nSegundo Nombre: " + secondName + "\nApellido: " + lastName 
                + "\nSegundo Apellido: " + secondLastName + "\nIdentificacion: " + id 
                + "\nSalario: " + salary;
    }

    @Override
    public int compareTo(Worker o) {
        return o.getName().compareTo(this.name);
    }
    
}
