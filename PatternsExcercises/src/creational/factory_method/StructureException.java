/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factory_method;

/**
 *
 * Clase StructureException que permite desplegar un error personalizado
 * en caso de que la instancia solicitada no pueda ser creada
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class StructureException extends Exception {

    public StructureException(String msg) {
        super(msg);
    }
    
}
