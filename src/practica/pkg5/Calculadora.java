/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg5;

/**
 *
 * @author manel
 */
public class Calculadora implements ICalculadora {
        @Override
    public int suma(int x, int y) {
        return x+y;

    }

    @Override
    public int resta(int x, int y) {
        return x-y;

    }

    @Override
    public int multplicacion(int x, int y) {
        return x*y;

    }

    @Override
    public int division(int x, int y) {
        return x/y;

    }
}