/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Queu<T> extends Structure{
    
    public Queu(Queue<T> list){
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
