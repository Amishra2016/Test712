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
public class Train implements IVehicle,IPublicTransport{
    
     @Override
     public void Drive(){
         
     }
          @Override
    public void turnLeft(){
        System.out.println("The train is turning left");
    }
         @Override
    public void brake(){
        
    }
         @Override
    public void getNumberofPeople(){
        
    }
    public static void main(String args[]){
        Train T =new Train();
        T.turnLeft();
    }
}
