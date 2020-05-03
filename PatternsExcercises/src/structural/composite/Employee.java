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
public class Employee implements AbstractSub{
    
    private String id;
    private String name;
    private Indentation identation;

    public Employee(String name, String id, Indentation indentation) {
        this.id = id;
        this.name = name;
        this.identation = indentation;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cedula: " + id + ", Nombre: " + name;
    }

    @Override
    public String ls() {
        return identation.getIndentation() + "Nombre: " + name 
                + ", Cedula: " + id + "\n";
    }

}
