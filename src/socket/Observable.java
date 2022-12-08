/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package socket;

import frames.Observer;



/**
 *
 * @author Hugo Rivera
 */
public interface Observable {
    public void notificar();
    public void agregarObserver(Observer observer);
}
