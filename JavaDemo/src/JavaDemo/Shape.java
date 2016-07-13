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
public abstract  class Shape {
   public abstract void CalculateArea(double radius);
  
  public void Shape(){
      System.out.println("calling Shape constructor");
  }
    public void setColour(String color){
        String col=color;
        System.out.println("The colour of the shape is "+col);
    }
}


