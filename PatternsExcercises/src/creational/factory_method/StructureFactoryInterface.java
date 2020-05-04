/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

import java.util.Collection;

/**
 *
 * Interfaz StructureFactoryInterface que se encarga de que caulquier nuevo 
 * fabricante cumpla con las condiciones (metodos) que posea y con ello evitar 
 * metodos o implementaciones erroneas.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public interface StructureFactoryInterface {
    
    public abstract <T> T createStructure(int option) throws StructureException;
    
}
