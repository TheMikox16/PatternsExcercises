/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.strategy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class SortDescendingSalary implements SortingInterface{

    private ComparatorSalary comparator = new ComparatorSalary();
    
    @Override
    public String sort(TreeSet lista) {
        String s = "";
        TreeSet temp = new TreeSet(comparator);
        Iterator iterator = lista.iterator();
        while(iterator.hasNext()){
            temp.add(iterator.next());
        }
        iterator = temp.iterator();
        while(iterator.hasNext()){
            s += iterator.next() + "\n";
        }
        return s;
    }

    private class ComparatorSalary implements Comparator<Worker>{

        @Override
        public int compare(Worker o1, Worker o2) {
            return o2.getSalary() - o1.getSalary();
        }
        
    }
    
}
