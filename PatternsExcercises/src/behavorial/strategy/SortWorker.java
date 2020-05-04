/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.strategy;

import java.util.TreeSet;

/**
 *Esta clase recibe el tipo de ordenamiento de tipo SortingInterface que se desea realizar mediante el setSorter, lo iguala a una variable
 *  de de este mismo tipo SortingInterface y lo realiza cuando se le solicita ordenarlo, en este caso
 * con el metodo sortList, esto permite que con la variable se realice el algoritmo
 * que se desea.
 * 
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class SortWorker {
        
    private TreeSet<Worker> list = new TreeSet<>();
    private SortingInterface sorter = null;

    public SortingInterface getSorter() {
        return sorter;
    }

    public void setSorter(SortingInterface sorter) {
        this.sorter = sorter;
    }

    public String sortList() {
        return sorter.sort(list);
    }
    
    public TreeSet getList() {
        return list;
    }

    public void setList(TreeSet<Worker> newList) {
        list = newList;
    }

    public void add(Worker element) {
        list.add(element);
    }

    public void remove(Worker element) {
        list.remove(element);
    }
}
