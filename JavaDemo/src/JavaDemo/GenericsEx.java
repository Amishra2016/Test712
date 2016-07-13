/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sailesh
 */
public class GenericsEx {
    
    public List<String> getCountrylist(String C1,String C2,String C3,String C4,String C5){
       
        List<String> countrylist=new ArrayList<String>();
        countrylist.add(C1);
        countrylist.add(C2);
        countrylist.add(C3);
        countrylist.add(C4);
        countrylist.add(C5);
        
        return countrylist;
    }
    
    public Set<Integer> AddNumbers(){
        
        Set<Integer> integerlist =new HashSet<Integer>();
        
        for(int i=1;i<=10;i++){
            integerlist.add(i);
        }
        return integerlist;
    }
    
   public static void main(String args[]){
       GenericsEx Ex=new GenericsEx();
      List countrylist=Ex.getCountrylist("India", "Australia", "Brazil", "England", "New Zealand");
      int length=countrylist.size();
      
      for(int i=0;i<length;i++){
          System.out.println(countrylist.get(i));
      }
      
        Set<Integer> numlist= Ex.AddNumbers();
       int numcount=numlist.size();
       Iterator iterator=numlist.iterator();
       int Sum=0;
     for(Integer a:numlist){
         Sum=Sum+a;
         
       }
       System.out.println("Sum: " +Sum);
       
       
   }
    
    
}
