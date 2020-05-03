/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

import java.util.Date;

/**
 *
 * @author Miguel Angel Egoavil Mathison
 */
public abstract class Observer {
    
    protected FligthObservable fligth;
    
    public abstract void update(String number, boolean origin, String airline, int gateNumber, String hour);
    
    public abstract void delete();
    
    public abstract void print();
    
}
