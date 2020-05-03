/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class StructureFactory implements StructureFactoryInterface{
    
    @Override
    public <T> T createStructure(int option) throws StructureException{
        switch(option){
            case 0:
                return (T) new Stck(new Stack<T>());
            case 1:
                Queue<T> list = new LinkedList<>();
                return (T) new Queu(list);
            case 2:
                return (T) new TreSet(new TreeSet<T>());
            default:
                throw new StructureException("Error al crear");
        }
    }
    
}
