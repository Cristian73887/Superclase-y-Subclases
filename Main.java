/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Circulo circulo = new Circulo();
        System.out.print("Introduce el color para el Círculo: ");
        circulo.establecerColor(scanner.nextLine());
        System.out.print("Introduce el radio del Círculo: ");
        double radio = scanner.nextDouble();
        scanner.nextLine(); 
        circulo.dibujar();
        circulo.calcularRadio();

       
        Linea linea = new Linea();
        System.out.print("\nIntroduce el color para la Línea: ");
        linea.establecerColor(scanner.nextLine());
        System.out.print("Introduce el largo de la Línea: ");
        double largo = scanner.nextDouble();
        scanner.nextLine();
        linea.dibujar();

        
        Triangulo triangulo = new Triangulo();
        System.out.print("\nIntroduce el color para el Triángulo: ");
        triangulo.establecerColor(scanner.nextLine());
        System.out.print("Introduce el ángulo del Triángulo: ");
        double angulo = scanner.nextDouble();
        scanner.nextLine(); 
        triangulo.dibujar();
        triangulo.calcularArea();

        
        Cuadrado cuadrado = new Cuadrado();
        System.out.print("\nIntroduce el color para el Cuadrado: ");
        cuadrado.establecerColor(scanner.nextLine());
        System.out.print("Introduce el área del Cuadrado: ");
        double area = scanner.nextDouble();
        scanner.nextLine(); 
        cuadrado.dibujar();
        cuadrado.calcularArea();

        scanner.close();
    }
}
