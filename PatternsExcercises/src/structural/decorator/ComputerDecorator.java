/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator;

/**
 *Clase Abstracta cuyo objetivo es implementar la interfaz sellable y necesita un constructor que reciva 
 * reciba cualquier immplementacion del tipo de la interfaz, esta se iguala a la variable final de esta clase abstracta,
 * para asi extender clases para aumentar las necesidades del código sin tener que modificar el código base
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public abstract class ComputerDecorator implements Sellable {

    private final Sellable sellable;

    public ComputerDecorator(Sellable sellable) {
        this.sellable = sellable;
    }

    public Sellable getSellable() {
        return sellable;
    }
}
