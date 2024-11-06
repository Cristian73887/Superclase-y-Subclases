/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author crist
 */
public class Circulo extends Formas {
    double radio;

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Círculo.");
    }

    public void calcularRadio() {
        System.out.println("Calculando el radio del Círculo: " + radio);
    }

}
