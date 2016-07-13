/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaDemo;
import java.io.* ;

/**
 *
 * @author sailesh
 */
public class InterviewPrep {
    
    public static void main(String args[]){
        
        try{
            Double x=1.0/0.0;
            System.out.println("print "+x);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the exception caught: "+e);
        };
    }
    
    
}
