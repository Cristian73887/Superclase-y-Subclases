/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author crist
 */
public class Formas {
     String color;

    public void dibujar() {
        System.out.println("Dibujando una forma.");
    }

    public void establecerColor(String color) {
        this.color = color;
        System.out.println("Color establecido a: " + color);
    }

}
