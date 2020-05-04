/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite;

/**
 *
 * Clase Identation que tiene un proposito de acomodar las divisiones de manera 
 * que se puedan distinguir una division de otra sin dificultades. Este es una
 * clase opcional ya que su proposito es acomodar la salida de datos.
 * 
 * @author Miguel Angel Egoavil Mathison Carne: B92695
 * @author Jose Pablo Vásquez Araya Carne: B98315
 */
public class Indentation {

    private final StringBuffer sub;

    public Indentation() {
        sub = new StringBuffer();
    }

    public String getIndentation() {
        return sub.toString();
    }

    public void increaseIndentation() {
        sub.append("     ");
    }

    public void decreaseIndentation() {
        if (sub.length() >= 3) {
            sub.setLength(sub.length() - 3);
        }
    }
}
