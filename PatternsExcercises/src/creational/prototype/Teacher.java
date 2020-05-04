/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

/**
 * Clase Teacher que contiene los datos de el profesor
 * Extiende a clonable para poder realizar clonaciones
 * profundas, compliendo con el Prototype
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
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
        return new Teacher(this.id, this.fullName, this.degree);
    }
    
}
