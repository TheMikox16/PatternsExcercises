/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator;

/**
 *Interfaz sellable que se necesita para que el objeto reciba los metodos que se necesitan, tambien 
 * se utiliza para agregar mas objetos si es necesario mediante la decoracion, sin modificar el código base.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public interface Sellable {

    public String getDescription();

    public double getPrice();
}
