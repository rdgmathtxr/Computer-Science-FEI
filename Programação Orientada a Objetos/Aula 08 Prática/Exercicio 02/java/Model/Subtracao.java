/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Matheus
 */
public class Subtracao implements Calculo{

    @Override
    public double calcula(double num1, double num2) {
        return num1-num2;
    }
    
}
