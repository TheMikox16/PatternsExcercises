/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator;

/**
 * Clase Main que realiza las pruebas y llamdos El pátrón Strategy, ayuda a
 * aumentar las capacidades de los objetos o aumentar caracteristicas sin
 * modificar el código base.
 *
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
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
