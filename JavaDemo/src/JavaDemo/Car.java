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
public class Car extends MotorisedVehicle implements IVehicle {
    
     @Override
     public void Drive(){
         
     }
     @Override
    public void turnLeft(){
        
    }
     @Override
    public  void brake(){
       System.out.println("The brake of the car is running good") ;
    }
    public static void main(String args[]){
        Car C=new Car();
        C.brake();
    }
}
