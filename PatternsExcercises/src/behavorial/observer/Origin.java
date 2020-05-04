/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

import java.util.Date;

/**
 *
 * Clase Origin que se encarga de administrar todos los vuelos origen
 * y de actualizar a los mismos segun sea el caso, cambiandolos a Destiny 
 * (destino). Esto aporta al patron su funcion escencial que es hacer cambios 
 * en las diferentes listas al efectuar algun tipo de cambio en un aspecto 
 * especifico.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Origin extends Observer{
    
    public Origin(FligthObservable fligth){
        this.fligth = fligth;
    }

    @Override
    public void update(String number, boolean origin, String airline, int gateNumber, String hour) {
        this.fligth.setAirline(airline);
        this.fligth.setGateNumber(gateNumber);
        this.fligth.setHour(hour);
        this.fligth.setNumber(number);
        this.fligth.setOrigin(origin);
        if(!origin){
            this.fligth.add(new Destiny(this.fligth));
            print();
            delete();
        }
    }

    @Override
    public void delete() {
        this.fligth.delete(this);
        this.fligth = null;
    }

    @Override
    public void print() {
        if(this.fligth != null){
            if(!this.fligth.isOrigin()){
                System.out.println("Actualizado como Destino: " + this.fligth.toString() + "\n\n");
            }else{
                System.out.println("Origen: " + this.fligth.toString() + "\n\n");
            }
        }
    }
    
    
    
}
