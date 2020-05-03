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
 * @author Miguel Angel Egoavil Mathison
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
