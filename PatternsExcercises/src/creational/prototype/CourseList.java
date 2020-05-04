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
 * Clase CourseList que sirve como gestor de la lista de curso.
 * Es la primera clase que hace clone() y que realiza llamados
 * a otros, permitiendo realizar copias profundas.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class CourseList implements Cloneable{
    
    private List<Course> list = new LinkedList<>();

    public CourseList() {
    }

    public List<Course> getList() {
        return list;
    }
    
    public void add(Course course){
        list.add(course);
    }
    
    public boolean delete(Course course){
        return list.remove(course);
    }
    
    public String print(){
        String s = "";
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            s += iterator.next().toString() + "\n";
        }
        return s;
    }
    
    public Course search(int n){
        return list.get(n);
    }
    
    public int hash(){
        return list.hashCode();
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        CourseList temp = new CourseList();
        Iterator iterator = this.list.iterator();
        while(iterator.hasNext()){
            Course course = (Course) iterator.next();
            temp.add((Course) course.clone());
        }
        return temp;
    }
    
}
