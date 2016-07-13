/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sailesh
 */
public class CollectionDemo {

   
  public List getcountries(String C1,String C2,String C3,String C4,String C5){
       List countrylist=new ArrayList();
       countrylist.add(C1);
       countrylist.add(C2);
       countrylist.add(C3);
       countrylist.add(C4);
       countrylist.add(C5);
       
       return countrylist;
  }
  
  public List AddNumbers(){
      List Numberlist=new ArrayList();
      
     for(int i=1;i<=10;i++){
         Numberlist.add(i);
        }
      return Numberlist;
  }
  
  public List AddmoreNumbers(List A){
      
      List addToNumberlist=A;
      
      for(int i=11;i<=15;i++){
          addToNumberlist.add(i);
      }
      return addToNumberlist;
  }
  
  public static void main(String args[]){
      
      CollectionDemo C =new CollectionDemo();
      List Countrylist=C.getcountries("India", "USA", "India", "Brazil", "Australia");
      System.out.println(Countrylist);
      List NumberList=C.AddNumbers();
      System.out.println(NumberList);
      System.out.println(C.AddmoreNumbers(NumberList));
      
      
  }
}
