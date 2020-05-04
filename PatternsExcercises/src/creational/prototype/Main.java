/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;


/**
 *
 * Clase Main que prueba el patron Prototype.
 * 
 * Este patron permite que se puedan crear una instancia
 * igual a otra (clon, no el mismo) lo que permite manejar
 * de forma eficiente una copia de un objeto y modificarla
 * para no tener que crear la misma desde 0.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Main {
    
    public static void main(String[] args) {
        try{
            CourseList list = new CourseList();

            Course course1 = new Course();
            course1.setCredits(4);
            course1.setInitial("IF-3000");
            course1.setName("Programacion II");
            course1.setTeacher(new Teacher("C-2100380","Denis González Herrera", "Mci"));

            course1.add(new Student("ncw219324", "B92695", "Miguel Angel Egoavil Mathison", 5));
            course1.add(new Student("1249u3nds", "B93803", "Pablo", 3));

            list.add(course1);

            System.out.println("Original:\n");
            System.out.println("Lista:\n" + list.print());


            CourseList list2 = (CourseList) list.clone();
            
            System.out.println("DESPUES DE COPIA:\n\nLista 1 :\n" + list.print());
            System.out.println("Lista 2 (COPIA DE 1):\n" + list2.print());
            
            Course course2 = (Course) list.search(0).clone();
        
            course2.setName("Algoritmos y estructura de datos");
            
            System.out.println("Comparación punteros, ¿iguales?: " + (list == list2)
            + "\nHashCode lista 1: " + list.hash() + "  Lista 2: " + list2.hash() + "\n");
            
            Student student1 = (Student) list.search(0).search(0).clone();
            
            list.search(0).delete(list.search(0).search(0));
            
            student1.setFullName("Sean Campos Siles");
            
            course2.add(student1);
            course2.getTeacher().setFullName("Alberto Ramírez Molina");
            
            list2.add(course2);
            
            System.out.println("Lista 1 EDITADA:\n" + list.print());
            System.out.println("Lista 2 (COPIA EDITADA DE 1):\n" + list2.print());
            
        }catch(CloneNotSupportedException ex){
            System.out.println(ex.getCause());
        }
    }
    
}
