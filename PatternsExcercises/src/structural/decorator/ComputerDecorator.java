/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator;

/**
 *
 * @author Usuario
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
