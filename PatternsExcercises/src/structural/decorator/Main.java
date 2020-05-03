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
public class Main {

    public static void main(String[] args) {
        
        Vendible computadora1 = new Computadora(100000, "Dell");
        computadora1 = new BlueRay(computadora1);
        computadora1 = new CamaraWeb(computadora1);
        System.out.println("Computadora" + computadora1.getDescripcion() + "\n Precio:" + computadora1.getPrecio());
       
        Vendible computadora2 = new Computadora(80000, "HP");
        computadora2 = new LectorHuellaDigital(computadora2);
        computadora2 = new LectorTarjetasSD(computadora2);
        System.out.println("Computadora" + computadora2.getDescripcion() + "\n Precio:" + computadora2.getPrecio());
    }
}
