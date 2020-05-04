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
 * clase que es un algoritmo que implementa la clase SortingIntrerface,
 * implementa el metodo y se le hacen las variaciones necesarias para que el
 * metodo cumpla su funcion, en este caso el algoritmo cumple la funcion de
 * ordenar los trabajadores por ID y de forma ascendente.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
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
