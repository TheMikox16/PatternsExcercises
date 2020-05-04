/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * Clase FligthObservable que contiene todos los datos de un vuelo ademas de 
 * gestionar todos los observadores (que funcionaran como pantalla) de un 
 * determinado vuelo. El patron es evidente cuando al crear un nuevo vuelo o
 * este se modifica e les notifica a un numero de observadores dicho cambio.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class FligthObservable implements Observable{
    
    private ArrayList<Observer> observers = new ArrayList<>();
    private String number;
    private boolean origin;
    private String airline;
    private int gateNumber;
    private String hour;

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public String getNumber() {
        return number;
    }

    public boolean isOrigin() {
        return origin;
    }

    public String getAirline() {
        return airline;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public String getHour() {
        return hour;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOrigin(boolean origin) {
        this.origin = origin;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
    
    @Override
    public void add(Observer observer){
        observers.add(observer);
    }
    
    @Override
    public void notifyAllObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(number, origin, airline, gateNumber, hour);
        }
    }
   
    @Override
    public void delete(Observer observer){
        observers.remove(observer);
    }
    
    public void setAll(String number, boolean origin, String airline, int gateNumber, String hour){
        this.airline = airline;
        this.gateNumber = gateNumber;
        this.hour = hour;
        this.number = number;
        this.origin = origin;
        notifyAllObservers();
    }
    
    @Override
    public String toString() {
        return "\nVuelo:\nNúmero: " + number + "\nTipo: " + ((origin) ? "Origen" : "Salida")
                + "\nAerolinea: " + airline + "\nNúmero de puerta: " + gateNumber 
                + "\nHora: " + hour;
    }
    
    public void print(FligthObservable... fligths){
        for(FligthObservable fligth: fligths){
            Iterator iterator = fligth.observers.iterator();
            while(iterator.hasNext()){
                Observer temp;
                if((temp = (Observer) iterator.next()) instanceof AllFligths){
                    AllFligths t = (AllFligths) temp;
                    t.print();
                } 
            }
        }
    }
    
    public void printOrigins(FligthObservable... fligths){
        for(FligthObservable fligth: fligths){
            Iterator iterator = fligth.observers.iterator();
            while(iterator.hasNext()){
                Observer temp;
                if((temp = (Observer) iterator.next()) instanceof Origin){
                    Origin t = (Origin) temp;
                    t.print();
                } 
            }
        }
    }
    
    public void printDestinies(FligthObservable... fligths){
        for(FligthObservable fligth: fligths){
            Iterator iterator = fligth.observers.iterator();
            while(iterator.hasNext()){
                Observer temp;
                if((temp = (Observer) iterator.next()) instanceof Destiny){
                    Destiny t = (Destiny) temp;
                    t.print();
                } 
            }
        }
    }
    
}
