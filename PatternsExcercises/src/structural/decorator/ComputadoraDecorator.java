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
public abstract class ComputadoraDecorator implements Vendible {

    private final Vendible vendible;

    public ComputadoraDecorator(Vendible vendible) {
        this.vendible = vendible;
    }

    public Vendible getVendible() {
        return vendible;
    }
}
