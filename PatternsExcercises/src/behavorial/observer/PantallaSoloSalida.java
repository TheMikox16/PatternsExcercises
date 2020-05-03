/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

/**
 *
 * @author Usuario
 */
public class PantallaSoloSalida extends Dispositivos {

    public PantallaSoloSalida(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
        this.aeropuerto.agregarPantalla(this);
    }

    @Override
    public void actualizarPantallas() {
        System.out.println("Vuelo:" + aeropuerto.getVuelo(0));
    }

}
