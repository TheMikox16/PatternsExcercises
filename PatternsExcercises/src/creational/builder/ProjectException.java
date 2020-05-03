/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
class ProjectException extends Exception {

    public ProjectException(String msg) {
        super("No se puede crear el proyecto debido a: " + msg);
    }
    
}
