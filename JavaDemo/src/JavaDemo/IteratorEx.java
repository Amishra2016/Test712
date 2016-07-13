/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sailesh
 */
public class IteratorEx {
    
    public static void main(String args[]){
        
        GenericsEx Ex1=new GenericsEx();
        List<String> countrylist=Ex1.getCountrylist("India", "Australia", "Brazil", "England", "New Zealand");
        Iterator<String> It=countrylist.iterator();
        while(It.hasNext()){
        
            System.out.println(It.next());
    }
        
        Set<Integer> numlist=Ex1.AddNumbers();
        Iterator<Integer> It1=numlist.iterator();
        int sum=0;
        while(It1.hasNext()){
            sum=sum+It1.next();
        }
       
        System.out.println("Sum: "+sum);
    }
    
}
