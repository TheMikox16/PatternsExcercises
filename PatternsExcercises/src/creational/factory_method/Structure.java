/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

import java.util.Collection;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public abstract class Structure<T> {
    
    private Collection<T> list;

    public Structure() {
    }
    
    public Structure(Collection<T> list) {
        this.list = list;
    }

    public Collection<T> getList() {
        return list;
    }

    public void setList(Collection<T> list) {
        this.list = list;
    }
    
    public abstract void add(T element);
    
    public abstract void delete(T element);
    
    public abstract String print();
    
}
