/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDemo;

/**
 *
 * @author Sagar
 */
public class AbstractDemo {
    public static void main(String args[]){
        Circle C=new Circle();
        C.Shape();
        Square S=new Square();
        C.setColour("Red");
        C.CalculateArea(5.25);
        S.setColour("Pink");
        S.CalculateArea(3.5);
    }
    
}
