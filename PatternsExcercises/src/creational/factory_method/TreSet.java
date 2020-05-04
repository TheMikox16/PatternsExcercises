/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * Clase StreSet (llamada asi para evitar problemas con colecciones) que es una
 * de las 3 instancias posibles para el manejo de datos, en este caso 
 * tratandose de una lista ordenada, la cual es manejada mediante un arbol. 
 * Permite demostrar el diferente funcionamiento de cada instancia.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class TreSet<T> extends Structure{

    public TreSet(TreeSet<T> list) {
        super(list);
    }
    
    @Override
    public void add(Object element) {
        super.getList().add(element);
    }

    @Override
    public void delete(Object element) {
        super.getList().remove(element);
    }

    @Override
    public String print() {
        String s = "";
        Iterator<T> iterator = super.getList().iterator();
        while(iterator.hasNext()){
            s += iterator.next() + "\n";
        }
        return s;
    }
    
}
