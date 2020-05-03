/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public class Main {
    
    public static void main(String[] args){
        
        StructureFactory factory = new StructureFactory();
        try{
            Structure stack = factory.createStructure(0);
            Structure queue = factory.createStructure(1);
            Structure tree = factory.createStructure(2);
            
            stack.add("Hola");
            stack.add(1);
            stack.add('c');
            
            System.out.println("Stack:\n" + stack.print());
            stack.delete('c');
            System.out.println("Stack despues de borrar:\n" +stack.print());
            
            queue.add("Adios");
            queue.add(10013);
            queue.add('B');
            
            System.out.println("Queue:\n" + queue.print());
            queue.delete('B');
            System.out.println("Queue despues de borrar:\n" + queue.print());
            
            tree.add(2);
            tree.add(0);
            tree.add(1);
            tree.add(3);
            
            System.out.println("Lista ordenada:\n" + tree.print());
            tree.delete(2);
            System.out.println("Lista despues de borrar:\n" + tree.print());
            
            
        }catch(StructureException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
