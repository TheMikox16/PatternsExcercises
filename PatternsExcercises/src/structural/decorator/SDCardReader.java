/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator;

/**
 *
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class SDCardReader extends ComputerDecorator {

    private final double price = 10000;
    private final String description = "LectorTarjetasSD";

    public SDCardReader(Sellable sellable) {
        super(sellable);
    }

    @Override
    public String getDescription() {
        return (getSellable().getDescription() + " , " + description);
    }

    @Override
    public double getPrice() {
        return (getSellable().getPrice() + price);
    }
}
