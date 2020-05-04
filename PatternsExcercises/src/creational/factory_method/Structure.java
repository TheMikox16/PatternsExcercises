/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

import java.util.Collection;

/**
 *
 * Clase Abstracta Structure que es la calse padre de las 3 instancias posibles:
 * TreSet, Stck y Queu. La misma permite que cada instancia maneje los respectivos
 * metodos que corresponden (add, delete, print) ademas de que se encarga de manejar
 * las instancias como colecciones, evitando errores a la hora de asignarlos.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
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
