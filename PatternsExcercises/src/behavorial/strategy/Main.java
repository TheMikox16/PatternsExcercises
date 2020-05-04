/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.strategy;

import behavorial.strategy.Worker;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortWorker sw = new SortWorker();
        sw.setSorter(new SortAscendingLastName());
        sw.add(new Worker("Jose", "Pablo", "Vasquez", "Araya", "1", 3923));
        sw.add(new Worker("Luis", "Antonio", "Solis", "Guevara", "2", 293392));
        sw.add(new Worker("Michael", "Jackson", "Avila", "Garza", "5", 239829));
        sw.add(new Worker("Juan", "Carlos", "Ulate", "Arce", "4", 12093));
        
        System.out.println("Lista por nombres:\n" + sw.sortList());
        sw.setSorter(new SortAscendingID());
        System.out.println("Lista por identificacion:\n" + sw.sortList());
        sw.setSorter(new SortDescendingSalary());
        System.out.println("Lista por salario descendiente:\n" + sw.sortList());
    }
    
}
