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
public class Circle extends Shape{
    
    
    //@Override
    public void CalculateArea(double radius){
        double area=3.14*radius*radius;
        System.out.println("Area of the circle is "+area);
        
    }
    
}
