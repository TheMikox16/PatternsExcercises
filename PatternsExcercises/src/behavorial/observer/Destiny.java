/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

import java.util.Date;

/**
 *
 * Clase Destiny que se encarga de administrar todos los vuelos destino
 * y de actualizar a los mismos segun sea el caso, cambiandolos a Origin 
 * (origen). Esto aporta al patron su funcion escencial que es hacer cambios 
 * en las diferentes listas al efectuar algun tipo de cambio en un aspecto 
 * especifico.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Destiny extends Observer{

    public Destiny(FligthObservable fligth) {
        this.fligth = fligth;
    }

    @Override
    public void update(String number, boolean origin, String airline, int gateNumber, String hour) {
        this.fligth.setAirline(airline);
        this.fligth.setGateNumber(gateNumber);
        this.fligth.setHour(hour);
        this.fligth.setNumber(number);
        this.fligth.setOrigin(origin);
        if(origin){
            this.fligth.add(new Origin(fligth));
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
            if(this.fligth.isOrigin()){
                System.out.println("Actualizado como origen: " + this.fligth.toString() + "\n\n");
            }else{
                System.out.println("Destino: " + this.fligth.toString() + "\n\n");
            }
        }
    }
}
