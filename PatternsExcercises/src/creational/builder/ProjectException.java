/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 *
 * Clase ProjectException que permite tirar una excepcion personalizada
 * cuando se introduzca un dato erroneo al querer crear un Project.
 * Importante para interrumpir el proceso de creacion de un objeto y evitar
 * uso de memoria inecesario.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
class ProjectException extends Exception {

    public ProjectException(String msg) {
        super("No se puede crear el proyecto debido a: " + msg);
    }
    
}
