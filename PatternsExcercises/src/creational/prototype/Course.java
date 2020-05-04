/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Clase Course que contiene los datos de un curso. 
 * Extiende a clonable para poder realizar clonaciones
 * profundas, compliendo con el Prototype
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Course implements Cloneable{
    
    private String name;
    private String initial;
    private int credits;
    private Teacher teacher;
    private List<Student> list = new LinkedList<>();

    public Course() {
    }

    public Course(String name, String initial, int credits, Teacher teacher) {
        this.name = name;
        this.initial = initial;
        this.credits = credits;
        this.teacher = teacher;
    }
    
    public String getName() {
        return name;
    }

    public String getInitial() {
        return initial;
    }

    public int getCredits() {
        return credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Curso:" + "\nNombre: " + name + "\nSigla: " + initial + 
                "\nCreditos: " + credits + "\nProfesor: " + teacher.toString() 
                + "\nLista Estudiantes: \n" + print();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        List<Student> temp = new LinkedList<>();
        Iterator iterator = this.list.iterator();
        while(iterator.hasNext()){
            Student temp2 = (Student) iterator.next();
            temp.add((Student) temp2.clone());
        }
        Course temp3 = new Course(this.name, this.initial, this.credits, (Teacher) this.teacher.clone());
        temp3.setList(temp);
        return temp3;
    }
    
    public void add(Student student){
        list.add(student);
    }
    
    public boolean delete(Student student){
        return list.remove(student);
    }
    
    public Student search(int n){
        return list.get(n);
    }
    
    private String print(){
        String s = "";
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            s += iterator.next().toString() + "\n";
        }
        return s;
    }
    
    public int hash(){
        return list.hashCode();
    }
    
}
