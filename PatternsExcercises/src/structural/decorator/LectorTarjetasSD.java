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
public class LectorTarjetasSD extends ComputadoraDecorator {

    private final double precio = 10000;
    private final String descripcion = "LectorTarjetasSD";

    public LectorTarjetasSD(Vendible vendible) {
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
