/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDemo;

/**
 *
 * @author sailesh
 */
public class Square extends Shape {
    //@Override
    public void CalculateArea(double length){
        
       double Area = length *length;
       System.out.println("Area of the square is "+Area);
    }
    
    

}