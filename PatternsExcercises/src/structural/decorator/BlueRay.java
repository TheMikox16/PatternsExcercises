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
public class BlueRay extends ComputadoraDecorator {

    private final double precio = 15000;
    private final String descripcion = "Blue Ray";

    public BlueRay(Vendible vendible) {
        super(vendible);
    }

    @Override
    public String getDescripcion() {
        return (getVendible().getDescripcion() + " , " + descripcion);
    }

    @Override
    public double getPrecio() {
        return (getVendible().getPrecio() + precio);
    }
}
