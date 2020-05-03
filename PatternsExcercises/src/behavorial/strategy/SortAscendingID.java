/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class SortAscendingID implements SortingInterface{

    private ComparatorID comparator = new ComparatorID();
    
    @Override
    public String sort(TreeSet lista) {
        String s = "";
        TreeSet temp = new TreeSet(comparator);
        Iterator iterator = lista.iterator();
        while(iterator.hasNext()){
            temp.add(iterator.next());
        }
        lista = temp;
        iterator = temp.iterator();
        while(iterator.hasNext()){
            s += iterator.next() + "\n";
        }
        return s;
    }

    private class ComparatorID implements Comparator<Worker>{

        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getId().compareTo(o2.getId());
        }
        
    }

    
}
