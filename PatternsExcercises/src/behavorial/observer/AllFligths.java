/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

import java.util.Date;
import java.util.Iterator;

/**
 *
 * Clase AllFligth que se encarga de administrar todos los vuelos sin importar
 * su tipo y de actualizar a los mismos segun sea el caso. Esto aporta al patron
 * su funcion escencial que es hacer cambios en las diferentes listas al efectuar
 * algun tipo de cambio en un aspecto especifico.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class AllFligths extends Observer{
    
    public AllFligths(FligthObservable fligth) {
        this.fligth = fligth;
    }

    @Override
    public void update(String number, boolean origin, String airline, int gateNumber, String hour) {
        this.fligth.setAirline(airline);
        this.fligth.setGateNumber(gateNumber);
        this.fligth.setHour(hour);
        this.fligth.setNumber(number);
        this.fligth.setOrigin(origin);
    }

    @Override
    public void delete() {
    }
    
    @Override
    public void print() {
        System.out.println(this.fligth.toString() + "\n\n");
    }
    
}
