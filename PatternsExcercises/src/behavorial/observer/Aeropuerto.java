/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavorial.observer;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class Aeropuerto {
    private List<Vuelos> listaVuelos = new ArrayList<Vuelos>();
    private List<Dispositivos> listaDispositivos = new ArrayList<Dispositivos>();
    
    public Vuelos getVuelo(int n){
        return listaVuelos.get(n);
    }
    
    public void setVuelo(Vuelos v){
        listaVuelos.add(v);
        mensajePantallas();
    }
    
    
    public void agregarPantalla(Dispositivos dispositivos){
        listaDispositivos.add(dispositivos);
    }
    
    public void mensajePantallas(){
        for(Dispositivos dispositivos : listaDispositivos){
            dispositivos.actualizarPantallas();
        }
        
    }
}
