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
public interface StructureFactoryInterface {
    
    public abstract <T> T createStructure(int option) throws StructureException;
    
}
