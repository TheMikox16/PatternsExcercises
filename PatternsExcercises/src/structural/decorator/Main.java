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
        
        Sellable computer1 = new Computer(100000, "Dell");
        computer1 = new BluRay(computer1);
        computer1 = new WebCam(computer1);
        System.out.println("Computadora" + computer1.getDescription() + "\n Precio:" + computer1.getPrice());
       
        Sellable computer2 = new Computer(80000, "HP");
        computer2 = new DigitalFingerprintReader(computer2);
        computer2 = new SDCardReader(computer2);
        System.out.println("Computadora" + computer2.getDescription() + "\n Precio:" + computer2.getPrice());
    }
}
