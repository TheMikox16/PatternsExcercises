/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Teacher implements Cloneable{
    
    private String id;
    private String fullName;
    private String degree;

    public Teacher() {
    }

    public Teacher(String id, String fullName, String degree) {
        this.id = id;
        this.fullName = fullName;
        this.degree = degree;
    }
    
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDegree() {
        return degree;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Profesor:\nCedula:" + id + "\nNombre: " + fullName + "\nGrado Academico: " + degree;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
