/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.strategy;

import java.util.TreeSet;

/**
 *Interfaz que hereda a los a los algoritmos el metodo que se desea utiliza.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public interface SortingInterface {
    public String sort(TreeSet<Worker> lista);
}