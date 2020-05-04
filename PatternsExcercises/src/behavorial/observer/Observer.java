/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;

import java.util.Date;

/**
 *
 * Interfaz Observer que se encarga de regular los requisitos de los observadores
 * y todos los metodos que deban implementar para manejar de forma segura el 
 * proceso de observacion y actualizacion.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public abstract class Observer {
    
    protected FligthObservable fligth;
    
    public abstract void update(String number, boolean origin, String airline, int gateNumber, String hour);
    
    public abstract void delete();
    
    public abstract void print();
    
}
