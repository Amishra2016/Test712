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
import java.lang.String;
import java.lang.System;
import java.util.*;
public class Animal {
    public static final double FAVNUM =1.321;
    private String Name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favoriteChar;
    private double speed;
    private float height;
    
    protected static int numberofAnimals=0;
    
    static Scanner userInput=new Scanner(System.in);
    
    public Animal(){
        numberofAnimals++;
        int Sum=5+1;
        System.out.println("5 + 1 = " + Sum);
        
        int Diff=5-1;
        System.out.println("5 - 1 = " + Diff);
        
        int Multiply=5*1;
        System.out.println("5 * 1 = " + Multiply);
        
        int Divide=5/1;
        System.out.println("5 / 1 = " + Divide);
        
        int Mod=5%3;
        System.out.println("5 % 3 = " + Mod);
        
        System.out.print("Enter the name: \n");
        
        
        int whichIsbigger=(50>30)?50:30;
        System.out.print("\n" +whichIsbigger);
        
        if (userInput.hasNextLine()){
            this.setName(userInput.nextLine());
        }
    }
        public String getName(){
            return Name;
        }
        public void setName(String Name){
            this.Name=Name;
        }
        
    

    public static void main(String[] args){
     Animal theAnimal=new Animal();
     Dog dog1=new Dog();
     
     
    System.out.println("name of the Animal is: \n" +theAnimal.Name);
    
    }
}

