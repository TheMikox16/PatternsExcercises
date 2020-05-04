/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

/**
 *
 * Clase Student que contiene todos los datos de un estudiante.
 * Extiende a clonable para poder realizar clonaciones
 * profundas, compliendo con el Prototype.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Student implements Cloneable{
    
    private String id;
    private String collegeId;
    private String fullName;
    private int scolarship;

    public Student() {
    }
    
    public Student(String id, String collegeId, String fullName, int scolarship) {
        this.id = id;
        this.collegeId = collegeId;
        this.fullName = fullName;
        this.scolarship = scolarship;
    }
    
    public String getId() {
        return id;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getScolarship() {
        return scolarship;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setScolarship(int scolarship) {
        this.scolarship = scolarship;
    }

    @Override
    public String toString() {
        return "Cedula: " + id + "\n Carne: " + collegeId 
                + "\nNombre: " + fullName + "\nBeca: " + scolarship;
    }
    
    public Object clone() throws CloneNotSupportedException{
        return new Student(this.id, this.collegeId, this.fullName, this.scolarship);
    }
    
}
