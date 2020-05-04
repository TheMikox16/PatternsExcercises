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
 * clase que es un algoritmo que implementa la clase SortingIntrerface,
 * implementa el metodo y se le hacen las variaciones necesarias para que el
 * metodo cumpla su funcion, en este caso el algoritmo cumple la funcion de
 * ordenar los trabajadores Apellido y de forma ascendente.
 *
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class SortAscendingLastName implements SortingInterface {

    private ComparatorName comparator = new ComparatorName();

    @Override
    public String sort(TreeSet lista) {
        String s = "";
        TreeSet temp = new TreeSet(comparator);
        Iterator iterator = lista.iterator();
        while (iterator.hasNext()) {
            temp.add(iterator.next());
        }
        lista = temp;
        iterator = temp.iterator();
        while (iterator.hasNext()) {
            s += iterator.next() + "\n";
        }
        return s;
    }

    private class ComparatorName implements Comparator<Worker> {

        @Override
        public int compare(Worker o1, Worker o2) {
            if (o1.getLastName().compareTo(o2.getLastName()) != 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else if (o1.getSecondLastName().compareTo(o2.getSecondLastName()) != 0) {
                return o1.getSecondLastName().compareTo(o2.getSecondLastName());
            } else if (o1.getName().compareTo(o2.getName()) != 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getSecondName().compareTo(o2.getSecondName());
        }
    }

}
