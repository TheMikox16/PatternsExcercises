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
public class DigitalFingerprintReader extends ComputerDecorator{

    private final double price = 5000;
    private final String description = "LectorHuellaDigital";

    public DigitalFingerprintReader(Sellable sellable) {
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
